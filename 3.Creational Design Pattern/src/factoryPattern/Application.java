package factoryPattern;

public class Application {
	
	public static void main(String[] args) {
		Algorithm algorithm1=AlgorithmFactory.createAlgorithm(AlgorithmFactory.SHORTEST_PATH);
		algorithm1.solve();
		Algorithm algorithm2=AlgorithmFactory.createAlgorithm(AlgorithmFactory.MINIMUM_SPANNING_TREE);
		algorithm2.solve();
	}
 
}
