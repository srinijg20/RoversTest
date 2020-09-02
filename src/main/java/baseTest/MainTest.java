package baseTest;

public class MainTest extends Rover {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainTest rover = new MainTest();
		Integer N = Rover.N;
		Integer E = Rover.E;
		rover.setPosition(1, 2, N);
		rover.process("LMLMLMLM");
		rover.printPosition(); // prints 1 3 N
		System.out.println("########################");
		rover.setPosition(3, 3, E);
		rover.process("MMRMMRMRRM");
		rover.printPosition(); // prints 5 1 E
	}
}
