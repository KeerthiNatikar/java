package datatype.javaprograms;

import java.util.Scanner;

public class Main {
	
	
	

	public static void main(String[] args) {
		
		
		
		
		//1.fisrt problem
		
		/*
		 * int rent=500,day=3; int time=19;
		 * 
		 * if(day==1 && time>22) { rent=rent+200; System.out.println(rent); }else
		 * if(day>2 && time>=22) { System.out.println(rent); } else { rent=rent+100;
		 * System.out.println(rent); }
		 */

		
		//2.greatest of three number
		
		/*
		 * int a=10,b=30,c=40; if(a>b) { System.out.println("a is greater"); }else
		 * if(b>c) { System.out.println("b is greater"); }else {
		 * System.out.println("c is greater"); }
		 */
                
		
		
		//3.prime number
		
		/*
		 * int num=6; int i=2,stop=25; boolean p=true;
		 * 
		 * for(i=2;i<num;i++) { if(num%i==0) { p=false; break; }
		 * 
		 * }if(p==true) { System.out.println("it is prime"); }else {
		 * System.out.println("not prime"); }
		 */

		
		
		
		//4.prime numbers between 2 numbers
		
		/*int start = 10;
		int num = 7, j = 2, stop = 20;
		boolean p = true;
		for (int i = start; i <= stop; i++) {
			p = false;
			for (j = 2; j < i; j++) 
			{
				if (i % j == 0) {
					p = true;
					break;
			}
		 
				}
			if (p == false)
			{
				System.out.println(i);
			}*/
		
		
		
		
		//5.multiples of a number
		
		/*int start=10;
		int stop=20;
		int count=0;
		for(int i=start;i<=stop;i++) {
			if(i%5==0) {
				count++;
				
			}
		}System.out.println(count);*/
		
		
		
		
		
		//6.sum of a numbers
		
		/*int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j--) {
				System.out.print("*");
			}System.out.println();
		}*/
		
		/*int num=256;
		 int sum=0;
		 while(num!=0)
		 {
			 int r=num%10;
			 sum=sum+r;
			 num=num/10;
		 }System.out.println(sum);*/
		
		
		
		
		//7.reverse of a number
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println(n);
		int sum=0;
	
		 while(n!=0)
		 {
			 int r=n%10;
			 sum=sum+r;
			 n=n/10;
	 }System.out.println(sum);*/
		
		
		
		
		
		//8.gcd of two numbers
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
				int rev=0;
		while(n!=0) {
			int r=n%10;
			rev=rev*10+r;;=/'[['
						n=n/10;
		}System.out.println(rev);*/
		
		
		/*int n1=5,n2=10;
		while(n2!=0) {
			int temp=n2;
			 n2=n1%n2;
			 n1=temp;
			
		}
	System.out.println(n1);*/
		      
		
		
		
	//9.palindrome between 2 numbers
		
	/*int start=10;
		int stop=100;
		int count=0;
		for(int i=start;i<=stop;i++) {
			int num=i;
			int rev=0;
			while(num!=0) {
				int r=num%10;
				rev=rev*10+r;
				num=num/10;
				
			}
			if(i==rev) {
				count++;
		}
		
			
		}System.out.println(count);*/
		
		
		//switch case
		/*Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		
		switch(n) {
		case 1:System.out.println("easy level task");
		break;
		
		case 2:System.out.println("intermediate level task");
		break;
		
		case 3:System.out.println("hard level task");
		break;
		default:
			System.out.println("not valid task");
		
		}*/
		
		//pattern
		/*int n=5;
		 for(int i=1;i<=n;i++) {
			 System.out.print("*");
			 int spaces=2*n-i;
			 for(int j=1;j<=spaces;j++) {
				 System.out.print(" ");
				 
			 }
			 for(int j=1;j<=n-i;j++) {
				 System.out.print("*");
			 }System.out.println();
		 }

		 for(int i=n;i>=1;i--) {
			 System.out.print("*");
			 int spaces=2*n-i;
			 for(int j=1;j<=spaces;j++) {
				 System.out.print(" ");
				 
			 }
			 for(int j=1;j<=n-i;j++) {
				 System.out.print("*");
			 }System.out.println();
			 
		 }*/
		
		//switch case
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the month name");
		String month=sc.nextLine();
		
		
		switch(month) {
		case "jan","march","may","july","august","october","december":System.out.println("31");
		break;
		case "apr","june","sep","nov":System.out.println("30");
        break;
		
        default:
			System.out.println("febraury");
		
		}*/
		
		//print like pyramid
		/*for(int i=0;i<10;i++) {
			if(i==5) {
				continue;
			}System.out.print(i+" ");

		}*/
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		for(int i=1;i<=50;i++) {
			if(age<=18) {
				System.out.println("invalid");
				break;
							}else if(age>18){
			System.out.println("valid");
			break;
							}

		}*/
		/*int n=5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<n-i+1;j++) {
				System.out.print(j);
			}System.out.println();
		}*/
		
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the gender");
		String gender=sc.nextLine();
		
		switch(gender) {
		case "m":
			System.out.println("Male");
			break;
		case "f":
			System.out.println("Female");
			break;
		default:
			System.out.println("unspecified gender");
			}*/
		
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		String alpha=sc.nextLine();
		
		switch(alpha) {
		case "a","e","i","o","u":
			System.out.println("vowels");
		default:
			System.out.println("consonants");
		}*/
		
		
		//to check number is odd or even using switch case
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
	
		
		switch(n%2) {
		case 0:
			System.out.println(n+" "+"is a even number");
			break;
		case 1:
			System.out.println(n+" "+"is a odd number");
			break;

		}*/
		
	  
     	
		
	}
		 
		}
	


