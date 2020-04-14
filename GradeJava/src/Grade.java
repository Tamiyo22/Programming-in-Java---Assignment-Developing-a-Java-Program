import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Grade {

    //helper function to print out project specifications
   public static void PrintSpecifications(){
       System.out.println("Create a Java project in IDE and begin the Project Program by developing a Java Method to print the programming specifications for the project.");
       System.out.println("                        ");
       System.out.println("Expand the Project Program and create Java code to input from the console (keyboard) the first quiz grade." +
                       " Use a loop to allow the user to continue to enter grades as long as they don't enter 999 to quit.");
       System.out.println("                        ");
       System.out.println("Expand the Project Program and create Java code to populate the array the student's quiz grades.");
       System.out.println(" The grade is added to a running total, and the count of grades entered is incremented. If the grade entered is the 10th grade,");
       System.out.println( " the grade is forced to 999 and the loop ends; otherwise the user enters another quiz grade. When the loop ends count holds the number of grades entered.");
       System.out.println("                        ");
       System.out.println("Expand the Project Program and create Java code use another loop to print all grades in the array.");
       System.out.println("                        ");
       System.out.println("Expand the Project Program and create Java code to compute the average quiz grade.");
       System.out.println("                        ");
       System.out.println("Expand the Project Program and create Java code to us decision logic to find out the letter grade of the average based on the following grading scale and" +
                                                       " print to the console.");
       System.out.println("                        ");
       System.out.println("A = 90-100");
               System.out.println("B = 80-89");
                       System.out.println("C = 70-79");
                               System.out.println("D = 60-69");
                                       System.out.println("F = 0-59");
       System.out.println("                        ");


   }
    //Write a program that allows a student to enter up to 10 test quiz scores, computes the average score and then displays the letter grade.
    //Instead of hard coding a value of 10 into my array. I went for a more dynamic route,
    // allowing the teacher to add as many scores as they wanted to
//function will ask the user for quiz grade
    //if user enters 999 break
    //if user enters value != to number break
    //return the number average
    //return the letter average
    //return the values of each quiz


public static void teacherInput() {
    Scanner scanner = new Scanner(System.in);


    int sum = 0;
    int count = 0;
    long average = 0;
    int grade = 0;
    ArrayList scores = new ArrayList();
    Object[] allScores;
    boolean flag = true;

    while (flag) {
        System.out.println("Enter students quiz grade, or enter 999 to stop");
        boolean adding = scanner.hasNextInt();

        if (adding) {
            grade = scanner.nextInt();
            if (grade != 999) {
                sum += grade;
                count++;
                scores.add(grade);
                average = Math.round((double) sum / (double) count);

            } else {
                flag = false;
            }

        }
        else {
            flag = false;

        }
        scanner.nextLine();
        }

        System.out.println("Average grade for the student is " + average);
        System.out.println("The letter grade for the student is " + letterGrade(average));
        allScores = scores.toArray();

        for (int i = 0; i < allScores.length; i++) {
            System.out.println("This student scored " + allScores[i] + " on quiz #" + (i+1));
        }

        scanner.close();

    }

//helper function to create letter grade
    public static String letterGrade(long grade){

       return  ((grade >= 90) && (grade <=100) ? "A" : (grade <= 89) && (grade >=80) ? "B" :
                (grade <= 79) && (grade >= 70) ? "C" : (grade <= 69) && (grade >= 60) ? "D" : "F");

    }



}




