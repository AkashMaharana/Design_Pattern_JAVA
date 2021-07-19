package objectPool;

import java.util.Enumeration;
import java.util.Hashtable;

public abstract class ObjectPool<T> {
	
	private long expirationTime;
	
	private Hashtable<T,Long> locked;
	private Hashtable<T,Long> unlocked;
	
	public ObjectPool() {
		this.expirationTime=30000;
		this.locked=new Hashtable<>();
		this.unlocked=new Hashtable<>();
	}
	
	protected abstract T create();
	
	public abstract boolean validate(T t);
	
	public abstract void expire(T t);
	
	public synchronized T checkout() {
		long now=System.currentTimeMillis();
		T t;
		if(this.unlocked.size()>0) {
			Enumeration<T> unlockedKeys=unlocked.keys();
			while(unlockedKeys.hasMoreElements()) {
				t=unlockedKeys.nextElement();
				if((now-unlocked.get(t))>this.expirationTime) {
					unlocked.remove(t);
					expire(t);
					t=null;
				}
				else {
					if(validate(t)) {
						unlocked.remove(t);
						locked.put(t, now);
						return t;
					}
					else {
						unlocked.remove(t);
						expire(t);
						t=null;
					}
				}
			}
		}
		t=create();
		locked.put(t, now);
		return t;
	}
	
	public synchronized void checkIn(T t) {
		locked.remove(t);
		unlocked.put(t, System.currentTimeMillis());
		System.out.println("Connection Successful");
	}

}
