import java.util.Scanner;
public class IT24104068Lab10Q1A{
   public static void main(String[]args){

// create a scanner class object
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter the mark:");
    int mark= scanner.nextInt();

    assert (mark >=0&&mark<=100):"invalid mark";
    System.out.println("mark is validated");
  }
}

