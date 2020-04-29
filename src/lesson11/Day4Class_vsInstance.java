package lesson11;
	import java.io.*;
	import java.util.*;

	public class Day4Class_vsInstance {
		private int age;	
		  
		public Day4Class_vsInstance(int age2) {
			// TODO Auto-generated constructor stub
		}

		public void Person(int initialAge) {
	  		// Add some more code to run some checks on initialAge
			
			if(initialAge<0)
	          {
	              age=0;
	              System.out.println("Age is not valid, setting age to 0.");
	          }
	          else
	          age=initialAge;
			
		}

		public void amIOld() {
	  		// Write code determining if this person's age is old and print the correct statement:

			if(age<13){
		        System.out.println("You are young.");
		         }
		        else if(age >= 13 && age < 18){
		        System.out.println("You are a teenager.");
		         }
		            else if(age >= 18){
		        System.out.println("You are old.");
		          }
		}

		public void yearPasses() {
	  		// Increment this person's age.
			
			age=age+1;
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int T = sc.nextInt();
			for (int i = 0; i < T; i++) {
				int age = sc.nextInt();
				Day4Class_vsInstance p = new Day4Class_vsInstance(age);
				p.amIOld();
				for (int j = 0; j < 3; j++) {
					p.yearPasses();
				}
				p.amIOld();
				System.out.println();
	        }
			sc.close();
	    }
	}