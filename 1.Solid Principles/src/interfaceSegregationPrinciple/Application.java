package interfaceSegregationPrinciple;

public class Application {
	
	public static void main(String[] args) {
		Tree binaryTree=new BinaryTree();
		BalanceTree balancedTree=new BalanceBinaryTree();
		binaryTree.findMax();
		balancedTree.leftRotation();
	}

}
