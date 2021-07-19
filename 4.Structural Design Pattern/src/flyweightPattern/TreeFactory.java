package flyweightPattern;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

	public static Map<String, TreeType> treeTypes = new HashMap<>();

	public static TreeType getTreeType(String name, Color color, String otherTreeData) {
		TreeType treeType=treeTypes.get(name);
		if(treeType==null) {
			treeTypes.put(name,new TreeType(name,color,otherTreeData));
		}
		return treeType;
	}

}
