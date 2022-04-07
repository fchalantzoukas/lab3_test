package gr.upatras.lab1;

public class MyLab {

	public static void main(String[] args) {
		System.out.println("Hello");

		PersonLab p = new PersonLab();
		p.setFirstName("TestA");
		System.out.println("Hello " + p.getFirstName());
		System.out.println("test");

		for (int i = 0; i < 3; i++) {
			printMyPerson(i);

		}

	}

	/**
	 * My method
	 * 
	 * @param i
	 */
	private static void printMyPerson(int i) {

		String newName = "Person_" + i;
		PersonLab myPerson = new PersonLab();
		myPerson.setFirstName(newName);
		System.out.println("Hello " + myPerson.getFirstName());

	}

}
