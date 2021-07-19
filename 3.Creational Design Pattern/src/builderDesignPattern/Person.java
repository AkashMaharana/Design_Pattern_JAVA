package builderDesignPattern;

public class Person {

	private int id;
	private String name;
	private String address;
	private String designation;

	public Person(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.address = builder.address;
		this.designation = builder.designation;
	}
	
	public static class Builder{
		private int id;
		private String name;
		private String address;
		private String designation;
		
		public Builder(int id,String name) {
			this.id=id;
			this.name=name;
		}
		
		public Builder setAddress(String address) {
			this.address=address;
			return this;
		}
		
		public Builder setDesignation(String designation) {
			this.designation=designation;
			return this;
		}
		
		public Person build() {
			return new Person(this);
		}
	}
	
	@Override
	public String toString() {
		return this.id+"-"+this.name+"-"+this.address+"-"+this.designation;
	}

}
