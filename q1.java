package day11;

public class q1 {

	public static void main(String[] args) {

		
		Clanguage c1 = new Clanguage();
		c1.devloper();
		
		Cplusplus c2 = new Cplusplus();
		c2.devloper();
		
		Java c3 = new Java();
		c3.devloper();
	}
}
	
	class Clanguage{
		public void devloper() {
			System.out.println("Denis Ritchie");
		}
	}
	
	class Cplusplus{
		public void devloper() {
			System.out.println("Bjarne Stroustrup");
		}
	}
	
	class Java{
		public void devloper() {
			System.out.println("James Gosling");
		}
	}
	
	

