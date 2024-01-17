import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		SingleLinkedList sll= new SingleLinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Create SLL 2.Display SLL 3.Display no. of nodes "
				+ "4.Insertion at end 5.Deletion at end \n6.Insertion from front "
				+ "7. Deletion from front "
				+ "8.Search by CarModel "
				+ "9.Arrange books in desc as per price \n"
				+ "10.Insertion By position 11.Deletion By Position "
				+ "0.Exit");
		int ch;
		do {
			
			System.out.println("Enter Choice: ");
			ch= sc.nextInt();
			switch(ch) {
			case 1:	
					System.out.println("How many cars you want to add: ");
					int no = sc.nextInt();
					for(int i=1;i<=no;i++) {
					System.out.println("Enter  carId,  carOwnerName,  carModel, carPrice");
					System.out.println("Inserted: "+sll.insert(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble()));
					}
					break;
			case 2:
				  sll.display();
				  break;
			case 3:
				System.out.println("Total Nodes: "+sll.totalNodes()); 
				break;
			case 4:
				System.out.println("Enter  carId,  carOwnerName,  carModel, carPrice");
				System.out.println("Inserted: "+sll.insert(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble()));
				break;
			case 5: 
				System.out.println("Deleted : "+sll.delete());
				break;
			case 6: 
				System.out.println("Enter  carId,  carOwnerName,  carModel, carPrice");
				System.out.println("Inserted: "+sll.insertFromFront(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble()));
				break;
			case 7:
				System.out.println("Deletion: "+sll.deleteFromFront());
				break;
			case 8:
				System.out.println("Enter car Model");
				String model=sc.next();
				sll.findByModel(model);
				break;
			case 9:
				System.out.println("All Books by descending order: ");
				sll.sortCarByPrice();
				break;
			case 10:
				System.out.println("Enter position: ");
				int pos=sc.nextInt();
				System.out.println("Enter  carId,  carOwnerName,  carModel, carPrice");
				System.out.println("Inserted: "+sll.insertByPosition(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(),pos));
				break;
			case 11:
				System.out.println("Enter position: ");
				pos=sc.nextInt();
				System.out.println("Deletion: "+sll.deleteByPosition(pos));
				break;
			}
		}while(ch!=0);
		

	}

}


//10 car1 model1 456