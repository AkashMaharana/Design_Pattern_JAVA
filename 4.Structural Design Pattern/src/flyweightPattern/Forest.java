package flyweightPattern;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Forest extends JFrame {

	private List<Tree> trees = new ArrayList<>();

	public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
		TreeType treeType = TreeFactory.getTreeType(name, color, otherTreeData);
		Tree tree = new Tree(x, y, treeType);
		trees.add(tree);
	}

	@Override
	public void paint(Graphics graphics) {
		for (Tree tree : trees) {
			try {
				tree.draw(graphics);
			} catch(NullPointerException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
