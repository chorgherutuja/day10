package day11;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Credit c = new Credit();
		c.Cal(568870);
		Debit d = new Debit();
		d.Cal(568870);
		Opening o = new Opening();
		o.Cal("rutuja", 20);
		
		

	}

}
class Credit{
	public void Cal(int amt) {
		int val=34670;
		System.out.println("the total amount in account "+val);
		int Total=val+amt;
		System.out.println("your credited amount "+Total);
	}
}

class Debit{
	public void Cal(int amt) {
		int val=34670;
		System.out.println("the total amount in account "+val);
		int Total=val-amt;
		System.out.println("your credited amount "+Total);
	}
}

class Opening{
	public void Cal(String name, int age) {
		System.out.println("the name and age  "+name +age);
		
		
	}
}



