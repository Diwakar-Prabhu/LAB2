import java.util.*;
import java.lang.*;
class Lab2{
	
	public double divide(int a,int b){
		//System.out.println("Division is" + (a/b));
		double g =((double) a) / b;
		return g;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st value");
		int x = sc.nextInt();
		System.out.println("enter 2nd value");
		int y = sc.nextInt();
		Lab2 div = new Lab2();
		//System.out.println("Division is"+div.divide(x,y));

		Addition addition = new Addition();
		//System.out.println("Addition is"+addition.add(x,y));
		
		Multiply multi = new Multiply();
		//multi.mul(x,y);

		substraction sub = new substraction();
		//System.out.println("Substraction is"+sub.sub(x,y));
		System.out.println("Press 1 for Additon/n Press 2 for substraction/n press 3 for multiplication/n press 4 for division");
		int a=sc.nextInt();
		if (a==1) {
			System.out.println("Addition is"+addition.add(x,y));
		}
		else if (a==2) {
			System.out.println("Substraction is"+sub.sub(x,y));
		}
		else if (a==3) {
			multi.mul(x,y);
		}
		else if (a==4){
			System.out.println("Division is"+div.divide(x,y));
		}

		else{
			System.out.println("give a valid input");
		}


	}
}