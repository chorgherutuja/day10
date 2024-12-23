package day11;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee salary =new employee();
		salary.Grosssalary (300000);
	}
}
	
	class employee {
		public void Grosssalary(int sal) {
			int gs;
			gs=sal*50/100;
			System.out.println("grosssalary of Employee " +gs);
		}
	}


