package gradingsystem;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Gradingsystem{
    public static void main(String[] args) {
        // Welcome message
        JOptionPane.showMessageDialog(null, "Welcome to the Grading system", "Grade Calculator", JOptionPane.INFORMATION_MESSAGE);

        // Input number of students
        System.out.print("How many students do you want to enter grades for? ");
        Scanner input = new Scanner(System.in);
        String numStudentsStr = input.nextLine();
        int numStudents = Integer.parseInt(numStudentsStr);

        int[] marks = new int[numStudents];
        int aCount = 0, bCount = 0, cCount = 0, dCount = 0, fCount = 0;
        int passCount = 0, failCount = 0;

        // Input marks for each student
        for (int i = 0; i < numStudents; i++) {
            String markStr = JOptionPane.showInputDialog(null, "Enter mark for student " + (i + 1), "Enter Mark", JOptionPane.QUESTION_MESSAGE);
            marks[i] = Integer.parseInt(markStr);

            char grade = getGrade(marks[i]);
            JOptionPane.showMessageDialog(null, "Grade for student " + (i + 1) + ": " + grade, "Grade", JOptionPane.INFORMATION_MESSAGE);

            // Use a switch statement to update the grade counters
            switch (grade) {
                case 'A':
                    aCount++;
                    break;
                case 'B':
                    bCount++;
                    break;
                case 'C':
                    cCount++;
                    break;
                case 'D':
                    dCount++;
                    break;
                case 'F':
                    fCount++;
                    break;
            }

            // Use an if-else statement to update the pass and fail counters
            if (grade != 'F') {
                passCount++;
            } else {
                failCount++;
            }
        }

        // Display grade distribution
        String gradeDistribution = "Grade Distribution:\nA: " + aCount + "\nB: " + bCount + "\nC: " + cCount + "\nD: " + dCount + "\nF: " + fCount;
        JOptionPane.showMessageDialog(null, gradeDistribution, "Grade Distribution", JOptionPane.INFORMATION_MESSAGE);

        // Display results
        String results = "Results:\nNumber of students who passed: " + passCount + "\nNumber of students who failed: " + failCount;
        JOptionPane.showMessageDialog(null, results, "Results", JOptionPane.INFORMATION_MESSAGE);

        // Use an if-else statement to check for bonus
        if (passCount > failCount) {
            JOptionPane.showMessageDialog(null, "Congratulations, you get a bonus!", "Bonus", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Sorry, no bonus this time.", "No Bonus", JOptionPane.INFORMATION_MESSAGE);
        }

        // Ask to continue
        int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Continue?", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Let's start again!", "Continue", JOptionPane.INFORMATION_MESSAGE);
            main(args);
        } else {
            JOptionPane.showMessageDialog(null, "Goodbye! Thanks for using the Grading system.", "Goodbye", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //calculate the grade based on the mark
    private static char getGrade(int mark) {
        if (mark >= 85) {
            return 'A';
        } else if (mark >= 70) {
            return 'B';
        } else if (mark >= 55) {
            return 'C';
        } else if (mark >= 40) {
            return 'D';
        } else {
            return 'F';
        }
    }
}