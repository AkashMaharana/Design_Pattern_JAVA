package singletonPattern;

import java.io.Serializable;

public class ThreadSafeLazySingleton implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private static ThreadSafeLazySingleton singleton=null;
	
	private ThreadSafeLazySingleton() {
		
	}
	
	public static ThreadSafeLazySingleton getSingletonInstance() {
		if(singleton==null) {
			synchronized(ThreadSafeLazySingleton.class) {
				if(singleton==null) {
					singleton=new ThreadSafeLazySingleton();
					return singleton;
				}
				return singleton;
			}
		}
		return singleton;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Singleton can't be cloned");
	}
	
	protected Object readResolve() 
    { 
        return singleton; 
    }

}
