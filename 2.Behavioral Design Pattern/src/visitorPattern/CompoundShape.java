package visitorPattern;

import java.util.List;
import java.util.ArrayList;

public class CompoundShape implements Shape {

	public int id;
	public List<Shape> children = new ArrayList<>();

	public CompoundShape(int id) {
		this.id = id;
	}

	@Override
	public void move(int x, int y) {
		// move shape
	}

	@Override
	public void draw() {
		// draw shape
	}

	public int getId() {
		return id;
	}

	@Override
	public String accept(Visitor visitor) {
		return visitor.visitCompoundGraphic(this);
	}

	public void add(Shape shape) {
		children.add(shape);
	}

}
