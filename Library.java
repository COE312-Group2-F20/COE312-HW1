
public class Library extends Hogwarts implements General_functions {
	Library(String ch, String ob1, String ob2) {
		super(ch, ob1, ob2);
	}

	Library() {
		character = "Hermione";
		obj1 = "Book";
		obj2 = "Quill";
	}

	@Override
	public void use(String ob) {
		// TODO Auto-generated method stub
		if (ob.equals("Book"))
			System.out.print("You are now reading 'The Book of Potions'.\n\n>");
		else if (ob.equals("Quill"))
			System.out.print("You are now writing notes in your notebook.\n\n>");
		else
			System.out.print("Object not available. Try another action.\n\n>");

	}

	@Override
	public void talk(String c) {
		// TODO Auto-generated method stub
		if (c.equals("Hermione"))
			System.out.print(
					"Hermione: Welcome to the Library! You can choose any book to read from or choose a quill to write notes.\n\n>");
		else
			System.out.print("This character is not in the room... Try another action.\n\n>");
	}

	@Override
	public void look() {
		// TODO Auto-generated method stub
		System.out.print(
				"\nThe library is where students spend a lot of their time in the school library. Here comes Hermione to show you what you can do in the Library\n\n>");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("You have entered the library.");
	}

}
