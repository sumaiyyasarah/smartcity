package project;
import.java.util.Scanner;
public class Smartcity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while(true) {
			System.out.println("Welcome to the Smartcity Project!please select an option:");
			System.out.println("1.Hotels");
			System.out.println("2.Transportation facilities");
			System.out.println("3.Air ticket booking");
			System.out.println("4.Shopping Details");
			System.out.println("5.City news");
			System.out.println("6.Exit");
		 choice = sc.nextInt();
		 switch(choice) {
		 case 1:
			 System.out.println("Hotels:Here are some recommended hotels in the city....");
			 break;
			 
			 case 2:
				 System.out.println("Transportation facilities: Here are some available transportation options...");
				 break;

			 
			 case 3:
				 System.out.println("Air tickets booking: Here are some airlines that fly to/from the city ...");
				 break;
			 
			 case 4:
				 System.out.println("Shopping details: Here are some popular shopping destination in the city ...");
				 break;
				 
			 case 5:
				 System.out.println("City news: Here are the latest news and events in the city ...");
				 break;
				 
				 
			 case 6:
				 System.out.println("Exiting smartcity project ...");
				 System.exit(0);
				 break;
				 
				 default:
					 System.out.println("Invalid choice.please try again..");
					 break;
					 
			 
			 
			 
		 }


			
			
			
			
			
		}
			}

		}
	}

}
