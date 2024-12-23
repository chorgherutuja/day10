package day11;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		agemarks a = new agemarks();
		a.personalinfo( "Rutuja", 20);
		agemarks m=new agemarks();
		m.marks(30,40 ,50 );
		
	}

}

class agemarks{
	public void personalinfo(String name, int age){
		System.out.println("The name="+name+ " " +"age ="+age);
	}
	
	public void marks(int s1, int s2, int s3){
		int avg=s1+s2+s3/3;
		
		System.out.println("The total marks="+avg);
	}
}
