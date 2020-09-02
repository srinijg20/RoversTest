package stepDefinitions;

import java.util.List;

import baseTest.MainTest;
import baseTest.Rover;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RoverTest extends Rover {
	MainTest rover;

//	@Given("that the rover initial co ordinates are {int} and {int} and facing {int}")
//	public void that_the_rover_initial_co_ordinates_are_and_and_facing(Integer x, Integer y,
//			Integer z) {
//		rover = new MainTest();
//		// N = Rover.N;
//		// Integer E = Rover.E;
//		rover.setPosition(x, y, z);
//	}
	@Before
	public void roverInitialPosition() {
		rover = new MainTest();
		int x = 0;
		int y = 0;
		int dir = 1;
		System.out.println("The initial position of the rover is :");
		rover.setPosition(x, y, dir);
		rover.printPosition();
	}

	@Given("that the rover initial co ordinates")
	public void that_the_rover_initial_co_ordinates(DataTable dt) {
		List<List<Integer>> list = dt.asLists(Integer.class);
		// System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			Integer x = new Integer(list.get(i).get(0));
			Integer y = new Integer(list.get(i).get(1));
			Integer z = new Integer(list.get(i).get(2));
			rover.setPosition(x, y, z);
		}
	}

	@When("I move in {string} direction")
	public void i_move_in_direction(String string) {
		rover.process(string);
		System.out.println("Rovers position after moving in direction:" + string);
		rover.printPosition();
	}

	@Given("rover is at position {int} and {int} and facing {int}")
	public void rover_is_at_position_and_and_facing(Integer x, Integer y, Integer z) {
		rover = new MainTest();
		rover.setPosition(x, y, z);
	}

	@When("I move in the direction {string}")
	public void i_move_in_the_direction(String string) {
		rover.process(string);
		System.out.println("Rovers position after moving in direction :" + string);
		rover.printPosition();
	}
}
