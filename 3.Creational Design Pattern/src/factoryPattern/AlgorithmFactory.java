package factoryPattern;

public class AlgorithmFactory {
	
	public static final int SHORTEST_PATH=0;
	public static final int MINIMUM_SPANNING_TREE=1;
	
	public static Algorithm createAlgorithm(int type) {
		switch(type) {
			case SHORTEST_PATH :
				return new ShortestPath();
			case MINIMUM_SPANNING_TREE :
				return new MinimumSpanningTree();
			default :
				return null;
		}
	}

}
