package day11;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Circle c=new Circle();
		 c.Area1();
		 Triangle t= new Triangle();
		 t.Area2();
		 rectangle r=new rectangle();
		 r.Area3();
		 
	}

}

class Circle{
	public void Area1() {
		int radius=40;
		int Area= (int)3.14*radius*radius;
		System.out.println("Area of circle "+Area);
	}
}
class Triangle{
	public void Area2() {
		int b=30;
		int h=40;
		int Area2= (int)1.5*b*h;
		System.out.println("Area of Triangle "+Area2);
	}
}
class rectangle{
	public void Area3() {
		int l=30;
		int w=40;
		int Area3= (int)l*w;
		System.out.println("Area of Triangle "+Area3);
	}
}

