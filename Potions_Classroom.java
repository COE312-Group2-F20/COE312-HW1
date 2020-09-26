
public class Potions_Classroom extends Hogwarts implements General_functions {
	Potions_Classroom() {
		character = "Professor Snape";
		obj1 = "Cauldron";
		obj2 = "Potion";
	}

	Potions_Classroom(String c, String o1, String o2) {
		super(c, o1, o2);

	}

	@Override
	public void use(String ob) {
		// TODO Auto-generated method stub
		if (ob.equals("Cauldron"))
			System.out.print("You are now making Felix Felicis, the potion of luck.\n\n>");
		else if (ob.equals("Potion"))
			System.out.print("You can now drink the Felix Felicis potion.\n\n>");
		else
			System.out.print("Object not available. Try another action.\n\n>");

	}

	@Override
	public void talk(String c) {
		// TODO Auto-generated method stub
		if (c.equals("Professor Snape"))
			System.out.print(
					"Professor Snape: Welcome to the Potions Classroom! Today we will be learning how to make the Felix Felicis potion which is the potion of luck using a cauldron.\n\n>");
		else
			System.out.print("This character is not in the room... Try another action!\n\n>");
	}

	@Override
	public void look() {
		System.out.print(
				"\nPotions is one of the core subjects that first year students are required to study. Professor Snape is here to guide you through your first class!\n\n>");
		// TODO Auto-generated method stub

	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("You have entered the Potions Classroom.");

	}

}
