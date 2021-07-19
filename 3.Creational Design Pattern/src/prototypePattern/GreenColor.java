package prototypePattern;

public class GreenColor extends Color {
	
	public GreenColor() {
		this.colorName="Green";
	}

	@Override
	void addColor() {
		System.out.println("Green Color Added");
	}

}
