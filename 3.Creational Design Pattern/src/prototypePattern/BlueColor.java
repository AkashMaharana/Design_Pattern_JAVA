package prototypePattern;

public class BlueColor extends Color {
	
	public BlueColor() {
		this.colorName="Blue";
	}

	@Override
	void addColor() {
		System.out.println("Blue Color Added");
	}

}
