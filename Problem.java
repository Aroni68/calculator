package hello;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		
		int case1;
		Scanner input=new Scanner(System.in);

		System.out.println("1. Addition  2. Substraction 3. Multiply  4. Division ");

		case1=input.nextInt();
		
		solution cont=new solution();
		
		if(case1==1)
		{
		cont.addition();	
		}
		else if(case1==2)
		{
		cont.substraction();	
		}
		else if(case1==3)
		{
		cont.multiply();	
		}
		else if(case1==4)
		{
			cont.division();
		}
		else
		{
		System.out.println("output will not be detected");	
		}

	}

}
