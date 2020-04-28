import java.util.Scanner;

class Simple_Robot {
	String name;
	int experience;

	void sayExperienceAndName() {
		System.out.println(name + " has " + experience + " years of experience!");
	}

	void rip() {
		System.out.println("I hope Robot " + name + " brought you some joy in your current moment!");
	}
}

public class Actions {

	public static void main(String[] args) {
		// First I am going to create a Robot in which it will say its name & experience
		System.out.println("Welcome to Robot OS");
		Scanner Robot101 = new Scanner(System.in);

		Simple_Robot John = new Simple_Robot();
		String great, lol, thanks, your_nice, I_hope_you_have_a_great_day, confirm, glad;

		System.out.println("Please enter the name of your new Robot: ");
		String robot_ask_name = Robot101.next();
		John.name = robot_ask_name;

		if (robot_ask_name != null) {
			System.out.println("That's a great name for your new Robot");
			System.out.println("Next, please enter the amount of experience that your Robot has: ");
			int experience_input = Robot101.nextInt();
			John.experience = experience_input;
			confirm = "Please confirm your input by typing true or false";
			System.out.println(confirm);
			Boolean true_or_false = Robot101.nextBoolean();

			if (true_or_false == true) {
				System.out.println("Thanks for putting your precious time into this feedback system!");
				glad = "We are glad!";
				System.out.println("\n" + glad);
				System.out.println("Do you want to see all your inputs? y/n");
				String output = Robot101.next();
				if (output.equals("y")) {
					John.sayExperienceAndName();
				} else if (output.equals("n")) {
					John.rip();
				} else {
					System.out.println("Command not recognized!");
				}
			}
		}

	}

}
