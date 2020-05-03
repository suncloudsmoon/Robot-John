import java.util.Scanner;

class Simple_Robot {
	String name;
	int experience;

	void sayExperienceAndName() {
		System.out.println(name + " has " + experience + " years of experience!");
	}

	// random function works successfully
	int averageYearsofExperience(int random1) {
		random1 = (int) (Math.random() * 5); // an int function requires (int)
		return random1;
	}

	void rip() {
		System.out.println("I hope Robot " + name + " brought you some joy in your current moment!");
	}
}

class User_And_Robot_Algorithms {
	// keywords for the word Robot
	String robot, mechanical, humanoid, prosthetic, cybernetic, robotlike, sonar, unmanned, simulation, machinelike,
			automationlike, automation;

	void name1() {

		for (int i = 0; i < 5; i++) {
			int rand1 = (int) (Math.random() * 25);
			if (rand1 == 0) {
				char a = 'a';

				System.out.print(a);
			} else if (rand1 == 1) {
				char b = 'b';

				System.out.print(b);
			} else if (rand1 == 2) {
				char c = 'c';

				System.out.print(c);
			} else if (rand1 == 3) {
				char d = 'd';

				System.out.print(d);
			} else if (rand1 == 4) {
				char e = 'e';

				System.out.print(e);
			} else if (rand1 == 5) {
				char f = 'f';

				System.out.print(f);
			} else if (rand1 == 6) {
				char g = 'g';

				System.out.print(g);
			} else if (rand1 == 7) {
				char h = 'h';

				System.out.print(h);
			} else if (rand1 == 8) {
				char i1 = 'i';

				System.out.print(i1);
			} else if (rand1 == 9) {
				char j = 'j';

				System.out.print(j);
			} else if (rand1 == 10) {
				char k = 'k';

				System.out.print(k);
			} else if (rand1 == 11) {
				char l = 'l';

				System.out.print(l);
			} else if (rand1 == 12) {
				char m = 'm';

				System.out.print(m);
			} else if (rand1 == 13) {
				char n = 'n';

				System.out.print(n);
			} else if (rand1 == 14) {
				char o = 'o';

				System.out.print(o);
			} else if (rand1 == 15) {
				char p = 'p';

				System.out.print(p);
			} else if (rand1 == 16) {
				char q = 'q';

				System.out.print(q);
			} else if (rand1 == 17) {
				char r = 'r';

				System.out.print(r);
			} else if (rand1 == 18) {
				char s = 's';

				System.out.print(s);
			} else if (rand1 == 19) {
				char t = 't';

				System.out.print(t);
			} else if (rand1 == 20) {
				char u = 'u';

				System.out.print(u);
			} else if (rand1 == 21) {
				char v = 'v';

				System.out.print(v);
			} else if (rand1 == 22) {
				char w = 'w';

				System.out.print(w);
			} else if (rand1 == 23) {
				char x = 'x';

				System.out.print(x);
			} else if (rand1 == 24) {
				char y = 'y';

				System.out.print(y);
			} else if (rand1 == 25) {
				char z = 'z';

				System.out.print(z);
			} else {
				System.out.println("Unknown error occured!");
			}

		}
		 // robot = "Hi, my name is ";  Add something here to make things interesting

	}
}

public class Actions {

	public static void main(String[] args) {
		// First I am going to create a Robot in which it will say its name & experience
		User_And_Robot_Algorithms User101 = new User_And_Robot_Algorithms();
		
		
		System.out.print("Welcome to Robot OS, User ");
		User101.name1();
		
		
		for (int rand_user = 0; rand_user < 5; rand_user++) {
			int rand101 = (int) (Math.random()*9);
			System.out.print(rand101);
		}
		
		
		System.out.println("\nWelcome to a place where weird stuff happens?");
		System.out.println("Type if you want to continue or not y/n");
		Scanner Robot101 = new Scanner(System.in);
		String continue1 = Robot101.next();

		if (continue1.contentEquals("y")) {
			Simple_Robot John = new Simple_Robot();
			String great, lol, thanks, your_nice, I_hope_you_have_a_great_day, confirm, glad;
			// Potential greetings to be utilized in the future!

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

			// testing random functions so I can add it to make this app better
			boolean test1 = false;
			if (test1 == true) {
				int random = 0;
				System.out.println(John.averageYearsofExperience(random));
				// void means that it automatically prints the stored values in class

			}

		} else if (continue1.equals("n")) {
			System.out.println("What else do you want to do?");
			System.out.println("This page is a work in progress!");
		} else if (continue1.contentEquals("algorithm")) {
			// hidden algorithms
			User_And_Robot_Algorithms dog = new User_And_Robot_Algorithms();
			System.out.print("Random word: ");
			dog.name1();

		}

	}

}
