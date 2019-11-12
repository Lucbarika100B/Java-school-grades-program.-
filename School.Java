import java.util.Scanner;

public class School{


  public static void main(String args []) {

    /* this programm assume that the student has 6 subjects,
    that why we are creating an array of size 6.
    This can change as per the requirement of the project. */

    String firstName;
    String lastName;

    System.out.println("Enter your first name : ");
    System.out.println("Enter your last name : ");

    Scanner sc = new Scanner(System.in);

    lastName = sc.nextLine();
    firstName = sc.nextLine();

    int [] marks = new int[6];
    int i;
    float total = 0, avg;

    Scanner scan = new Scanner(System.in);


    for(i=0; i<6; i++){
      System.out.println("Please enter marks of subject" +(i+1)+ ":");
      marks[i] = scan.nextInt();
      total = total + marks [i];

    }
    scan.close();

    //Calculating average here

    avg = total / 6;
    System.out.print("The Student Grade is: ");
    if(avg>=80)
    {
        System.out.print("A");
    }

    else if(avg>=60 && avg<80)
    {
      System.out.print("B");
    }
    else if(avg>=40 && avg<60)
    {
      System.out.print("C");
    }
    else
    {

      System.out.print("D");

    }
  }
}
