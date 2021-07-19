package adapterPattern;

public class Application {

	public static void main(String[] args) {
		RoundHole roundHole = new RoundHole(5);
		RoundPeg roundPeg = new RoundPeg(5);
		if (roundHole.fits(roundPeg)) {
			System.out.println("Round Peg with radius " + roundPeg.getRadius()
					+ " will fit in Round Hole with radius " + roundHole.getRadius() + ".");
		}
		SquarePeg smaller=new SquarePeg(2);
		SquarePeg larger=new SquarePeg(20);
		SquarePegAdapter smallSquareAdapter=new SquarePegAdapter(smaller);
		SquarePegAdapter largeSquareAdapter=new SquarePegAdapter(larger);
		if(roundHole.fits(smallSquareAdapter)) {
			System.out.println("Square Peg with width " + smaller.getWidth()
			+ " will fit in Round Hole with radius " + roundHole.getRadius() + ".");
		}
		if(!roundHole.fits(largeSquareAdapter)) {
			System.out.println("Square Peg with width " + larger.getWidth()
			+ " will not fit in Round Hole with radius " + roundHole.getRadius() + ".");
		}
	}
}
