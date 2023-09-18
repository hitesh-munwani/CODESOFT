import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        System.out.println("\n\t=================Student Grade Calcultor====================\n");
        StudentGradeCalculator studentGradeCalculator=new StudentGradeCalculator();
        studentGradeCalculator.calculateMarks();
        System.out.println("\n\t=============================================================\n");
    }

   public void calculateMarks()
   {
       Scanner scanner=new Scanner(System.in);
       System.out.println("How many subjects do you want to calculate ?");
       int subjectCount=scanner.nextInt();
       int perSubjectMarks=100;
       float totalMarks=perSubjectMarks*subjectCount;       //total subject marks
       float obtainedMarks = 0f;
       float percentage;
       char grade;
       System.out.println("Enter "+subjectCount+" subject marks below.");
       for (int i=1;i<=subjectCount;i++)
       {
           System.out.print(i+")");
           obtainedMarks+= scanner.nextFloat();
       }
       percentage=(obtainedMarks/totalMarks)*100;    // average percentage of total marks

       if (percentage >= 90.0) {
           grade = 'A';
       } else if (percentage >= 80.0) {
           grade = 'B';
       } else if (percentage >= 70.0) {
           grade = 'C';
       } else if (percentage >= 60.0) {
           grade = 'D';
       } else {
           grade = 'F';
       }

       System.out.println("-----------------------------------------------------------------------");
       System.out.println("You obtained "+obtainedMarks+" total marks out of "+totalMarks+".");
       System.out.println("Average Percentage is "+percentage+"% .");
       System.out.println("Grade ==>" + grade);
       System.out.println("-----------------------------------------------------------------------");
   }
}
