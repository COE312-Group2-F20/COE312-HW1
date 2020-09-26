import java.lang.Math;

public class Dining_Hall extends Hogwarts implements General_functions {

	Dining_Hall() {
		character = "Dumbledore";
		obj1 = "Sorting hat";
		obj2 = "Food";
	}

	Dining_Hall(String ch, String ob1, String ob2) {
		super(ch, ob1, ob2);
	}

	@Override
	public void use(String ob) {
		// TODO Auto-generated method stub
		if (ob.equals("Sorting hat")) {
			int temp = (int) (Math.random() * ((4 - 1) + 1)) + 1;
			if (temp == 1)
				System.out.print("Gryffindor!\n\n>");
			else if (temp == 2)
				System.out.print("Hufflepuff!\n\n>");
			else if (temp == 3)
				System.out.print("Ravenclaw!\n\n>");
			else if (temp == 4)
				System.out.print("Slytherin!\n\n>");
		} else if (ob.equals("Food"))
			System.out.print("Eating food.\n\n>");
		else
			System.out.print("Object not available.Try another action.\n\n>");
	}

	@Override
	public void talk(String c) {
		// TODO Auto-generated method stub
		if (c.equals("Dumbledore"))
			System.out.print("Dubledore: Welcome to the dining hall! Interact with the sorting hat to be sorted into a house, then enjoy the food served in the hall.\n\n>");
		else
			System.out.print("This character is not in the room... Try another action!\n\n>");

	}

	@Override
	public void look() {
		// TODO Auto-generated method stub
		System.out.print(
				"\nThe dining hall is the biggest open area inside Hogwarts. Professor Dumbledore is in the hall to welcome new students.\n\n>");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("You have entered the Dining Room.");
	}

}
