/*
  Emmanuel idehen
       Java Programming  
       3/20/2018

Program:  This programs takes a users name,major, gender, semester grades and calculates the users 
semesters Gpa and overall Gpa .

design:
ask for name, sex, age, semester grades 
compute as result based on grades entered 
output result !

*/

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class GPA
{
    public static void main(String[] args) throws Exception
    {
        //Decimal Format
        DecimalFormat money = new DecimalFormat("0.0"); // Decimal Formatter
        //...................................
        DecimalFormat pricePattern = new DecimalFormat("0.0"); // Decimal Formatter

        // Declare Scanner object
        Scanner scan = new Scanner(System.in);
        //sex
        System.out.print("Enter your sex:  ");
        String sex = scan.nextLine();
        //Major
        System.out.print("Enter your major:  ");
        String major1 = scan.nextLine();
        //Name
        System.out.print("Enter your  name:  ");
        String name = scan.nextLine();
        //Age
        System.out.print("Enter the year you were born:  ");
        int yearborn = scan.nextInt();
        // calculate Age from current year!
        int age;
        int currentyear = 2018;
        age = currentyear - yearborn;
        //Gpa
        System.out.print("Enter your current  GPA:  ");
        double gpa = scan.nextDouble();
        //Grades endered
        //A's
        System.out.print("Enter how many A(s) you earned this semester: ");
        double gradeA = scan.nextDouble();
        //calculate A's
        double A; A = 4;
        double resultA; resultA = A * gradeA;
        //Calculate B's
        System.out.print("Enter how many B(s) you earned this semester: ");
        double gradeB = scan.nextDouble();
        double B; B = 3;
        double resultB; resultB = B * gradeB;
        //Calculate C
        System.out.print("Enter how many C(s) you earned this semester: ");
        double gradeC = scan.nextDouble();
        double C; C = 2;
        double resultC; resultC = C * gradeC;
        //Calculate D
        System.out.print("Enter how many D(s) you earned this semester: ");
        double gradeD = scan.nextDouble();
        double D; D = 1;
        double resultD; resultD = D * gradeD;
        //calculate F
        System.out.print("Enter how many F(s) you earned this semester: ");
        double gradeF = scan.nextDouble();
        double F;  F = 0;
        double resultF; resultF = F * gradeF;
        // Calculate and compute GPA

        double overrallGpa,semesterGpa;
        double allGradesAdded; allGradesAdded = gradeA + gradeB + gradeC + gradeD + gradeF;
        double allresults; allresults = resultA + resultB + resultC + resultD + resultF;


        semesterGpa = allresults / allGradesAdded;
        overrallGpa = (gpa +semesterGpa)/2;
        //Indent
        String indent = "  ";
        /*
        semester gpa = the results of each added divide by the all grades added
        currentgpa = semster gpa / 2 gives overall gpa


        */
        //outpute details
        System.out.println("............................................");
        System.out.printf("%18s %4s %-25s %n","Name:", indent , name );
        System.out.printf("%18s %4s %-25s %n","Sex:",indent , sex);
        System.out.printf("%18s %4s %-25s %n","Age:", indent, age);
        System.out.printf("%18s %4s %-25s %n","Major:",indent, major1);
        System.out.printf("%18s %4s %-25s %n","Overall GPA:", indent, money.format(overrallGpa));
        System.out.printf("%18s %4s %-25s %n","Semester GPA:", indent, money.format(semesterGpa));
        System.out.print("\n............................................");

    }



}
/*
Test cases
Enter your sex:  f
Enter your major:  computer scince
Enter your  name:  Jane Deo
Enter the year you were born:  1977
Enter your current  GPA:  3.234
Enter how many A(s) you earned this semester: 2
Enter how many B(s) you earned this semester: 2
Enter how many C(s) you earned this semester: 1
Enter how many D(s) you earned this semester: 1
Enter how many F(s) you earned this semester: 1
............................................
             Name:      Jane Deo
              Sex:      f
              Age:      41
            Major:      computer scince
      Overall GPA:      2.8
     Semester GPA:      2.4

............................................
..............................................
Enter your sex:  male
Enter your major:  computer science
Enter your  name:  emmanuel idehen
Enter the year you were born:  1999
Enter your current  GPA:  3.234
Enter how many A(s) you earned this semester: 2
Enter how many B(s) you earned this semester: 2
Enter how many C(s) you earned this semester: 1
Enter how many D(s) you earned this semester: 1
Enter how many F(s) you earned this semester: 1
............................................
             Name:      emmanuel idehen
              Sex:      male
              Age:      18
            Major:      computer science
      Overall GPA:      2.8
     Semester GPA:      2.4

............................................
......................................................................
Enter your sex:  female
Enter your major:  hellin
Enter your  name:  cassadra
Enter the year you were born:  1992
Enter your current  GPA:  2.33
Enter how many A(s) you earned this semester: 2
Enter how many B(s) you earned this semester: 2
Enter how many C(s) you earned this semester: 1
Enter how many D(s) you earned this semester: 1
Enter how many F(s) you earned this semester: 1
............................................
             Name:      cassadra
              Sex:      female
              Age:      25
            Major:      hellin
      Overall GPA:      2.4
     Semester GPA:      2.4

............................................
....................................................................

 */