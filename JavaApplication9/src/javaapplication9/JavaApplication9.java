/** ****************************************************************************
 * writingAndReadingObjectsWithNumbers.java
 * Kevin Bell
 *
 * The program writes objects to a file, and reads objects from a file.
 **************************************************************************** */
package javaapplication9;
import java.io.*;
import java.util.*;
/**
 *
 * @author 4800590195
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   System.out.println("Objects in Files by Kevin Bell with numbers \n");
        Scanner computerKeyboardInput = new Scanner(System.in);
        double score;
        double[] numbers;
        numbers = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter test score: ");
            score = computerKeyboardInput.nextDouble();
            numbers[i] = score;
        } // end for loop
        NumberList numberList = new NumberList(numbers);
        String fileName = "scoresOnly.txt";
        try (ObjectOutputStream fileOut // write object
                = new ObjectOutputStream(new FileOutputStream(fileName))) {
            fileOut.writeObject(numberList);
            fileOut.reset();
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } // end try/catch, and close fileOut automatically
        System.out.println("Data written to file");
        try (ObjectInputStream fileIn = new ObjectInputStream( // read object
                new FileInputStream(fileName))) {
            while (true) {
                numberList = (NumberList) fileIn.readObject();
                numberList.display();
            } // end while loop
        } catch (EOFException e) { // terminates infinite while loop
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } // end try/catch, and close fileOut automatically
        
        
        System.out.println("");
        System.out.println("Chapter 16 Objects in Files by Kevin Bell \n");
        String[] names = {"Caleb", "Izumi", "Mary", "Usha"};
        NumberList studentList = new NumberList(names);
        System.out.println("List 1: ");
        studentList.displayStudent();
        fileName = "ThreeLists.txt";
        try (ObjectOutputStream fileOut // write object
                = new ObjectOutputStream(new FileOutputStream(fileName))) {
            fileOut.writeObject(studentList);
            fileOut.reset();
            studentList.addStudent("Anna");
            studentList.addStudent("James");
            studentList.addStudent("Noah");
            fileOut.writeObject(studentList);
            fileOut.reset();
            System.out.println("List 2: added some names");
            studentList.displayStudent();
            studentList.removeStudent(1);
            studentList.removeStudent(2);
            fileOut.writeObject(studentList);
            fileOut.reset();
            System.out.println("List 3: removed some names");
            studentList.displayStudent();
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } // end try/catch, and close fileOut automatically
        try (ObjectInputStream fileIn = new ObjectInputStream( // read object
                new FileInputStream(fileName))) {
            System.out.println("");
            System.out.println("Results of reading objects from file: ");
            while (true) {
                studentList = (NumberList) fileIn.readObject();
                studentList.displayStudent();
            } // end while loop
        } catch (EOFException e) { // terminates infinite while loop
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } // end try/catch, and close fileOut automatically
    } // end main method
} // end writingAndReadingObjectsWithNumbers class