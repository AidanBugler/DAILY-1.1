import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Var
    Scanner input = new Scanner(System.in);
    String firstName;
    String lastName;
    char sectionChoice;
    int seatNumber;
    int ticketPrice = 83;
   
    // IMPUT SCREEN
    System.out.print("Enter First Name: ");
    firstName= input.nextLine();
    System.out.print("Enter Last name: ");
    lastName= input.nextLine();
    System.out.print("What section do you want to sit in? A,B,C,D: ");
    sectionChoice = input.next().charAt(0);
    System.out.print("What seat would you like to sit in? 1-200: ");
    seatNumber = input.nextInt();

    //OUTPUT SCREEN
    System.out.println("|-------------------------------|");
    System.out.println("| Name: "+firstName+" "+lastName);
    System.out.println("| Section: "+sectionChoice);
    System.out.println("| Seat: "+ seatNumber);
    System.out.println("| Price: $"+ticketPrice);
    System.out.println("|-------------------------------|");



  }
}