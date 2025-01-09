import java.util.Scanner;
      public class IT24104068Lab10Q1B{
         
    // Methode to determine the grade
       public static char determineGrade(int mark){
        if(mark>=75){
           return 'A';
        }
         else if(mark >=60){
           return 'B';
        }
         else if(mark >=50){
           return 'C';
        }
         else if (mark>=40){
           return 'D';
        }
         else {
           return 'F';
        }
      }
      public static void main(String[]args){

      //create a Scanner class object
       Scanner scanner=new Scanner(System.in);

       //input the marks
       System.out.print("Eneter the marks(0-100):");
       int mark=scanner.nextInt();
  
       //validate the mark using asserations
       assert mark >= 0 && mark <= 100 : "Invalid Mark";

       //Determine the grade 
       char grade = determineGrade(mark);

        //Verify the grade using asserations
        if (mark >= 75) {
        assert grade == 'A' : "Incorrect Grade Assigned";
        } else if (mark >= 60) {
        assert grade == 'B' : "Incorrect Grade Assigned";
        } else if (mark >= 50) {
        assert grade == 'C' : "Incorrect Grade Assigned";
        } else if (mark >= 40) {
        assert grade == 'D' : "Incorrect Grade Assigned";
        } else {
        assert grade == 'F' : "Incorrect Grade Assigned";
        }

        System.out.println("Mark is Validated.");
        System.out.println("The Grade for the Entered Mark is:" + grade);
    }
}
