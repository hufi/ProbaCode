
public class College {

	public College() {
		//This creates a concrete instance of the NewStudent class...
		//... passing in values to the constructor of the NewStudent class
		NewStudent student1 = new NewStudent("Claire Byrne", 21);
		NewStudent student2 = new NewStudent("Phillip Dyre", 43);
		NewStudent student3 = new NewStudent("Mary Groves", 36);
		
		Lecturer lect1 = new Lecturer("Xiabin Yang", 45852);
		Lecturer lect2 = new Lecturer("Mary Regan", 767909);
	}

	public static void main(String[] args) {
		new College();
	}

}
