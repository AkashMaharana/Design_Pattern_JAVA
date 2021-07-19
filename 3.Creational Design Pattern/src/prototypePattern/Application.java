package prototypePattern;

public class Application {
	
	public static void main(String[] args) {
		ColorStore.getColor("Green").addColor();
		ColorStore.getColor("Blue").addColor();
		ColorStore.getColor("Black").addColor();
	}

}
