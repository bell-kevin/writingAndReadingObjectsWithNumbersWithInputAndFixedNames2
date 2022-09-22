/** ****************************************************************************
 * NumberList.java
 * Kevin Bell
 *
 * The class manages an ArrayList of scores.
 **************************************************************************** */
package javaapplication9;

import java.util.*;
import java.io.*;
/**
 *
 * @author 4800590195
 */
public class NumberList implements Serializable {

    ArrayList<Double> scores = new ArrayList<>();

//******************************************************************************
    public NumberList(double[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            scores.add(numbers[i]);
        } // end for loop
    } // end constructor
//******************************************************************************

    public void display() {
        for (int i = 0; i < scores.size(); i++) {
            System.out.println(scores.get(i) + " ");
        } // end for loop
    } // end display method
//******************************************************************************

    public void removeScore(int index) {
        scores.remove(index);
    } // end removeScore method
//******************************************************************************

    public void addScore(double score) {
        scores.add(score);
    } // end addScore method
//******************************************************************************
     ArrayList<String> students = new ArrayList<>();

//******************************************************************************
    public NumberList(String[] names) {
        for (int i = 0; i < names.length; i++) {
            students.add(names[i]);
        } // end for loop
    } // end constructor
//******************************************************************************

    public void displayStudent() {
        for (int i = 0; i < students.size(); i++) {
            System.out.print(students.get(i) + " ");
        } // end for loop
        System.out.println();
    } // end display method
//******************************************************************************

    public void removeStudent(int index) {
        students.remove(index);
    } // end removeStudent method
//******************************************************************************

    public void addStudent(String name) {
        students.add(name);
    } // end removeStudent method
//******************************************************************************
} // end NumberList class