import java.util.Scanner;

public class Integervalue {
public static void main(String[] args) {
	int num;
	
    System.out.println("Enter the integer: ");
    Scanner s = new Scanner(System.in);
    num = s.nextInt();
  
    System.out.println("Entered integer is: "
                       + num);
}
}
