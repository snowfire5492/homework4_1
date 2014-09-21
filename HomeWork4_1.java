package homework4_1;

/* 
 * Chapter No. 4    Excercise No. 1
 * File Name: HomeWork4_1.java
 * @author: Eric Schenck
 * Date: September 21, 2012
 * 
 * 
 * Problem Statement: Write a program that calculates and outputs the total 
 * number of calories burned for a 150-lb person who runs 6 MPH for 30 mins,
 * plays basketball for 30 mins, and then sleeps for 6 hours.Test for a 
 * 150-lb person and a 250-lb person, print screen both results. the weight of 
 * the people is input.
 * 
 * Formuals: Calories/Minute = 0.0175 * MET * Weight in Kilograms
 * One Kilogram is equal to 2.2 pounds.
 *
 * Overall plan:
 * 1.)ask the user to input the weight in pounds
 * 2.) Change pounds of weight into kilograms
 * 3.) perform three seperate equations to figure out the amount of 
 * calories burned per minute for each activity.
 * 4.) Perform three seperate equations to multiply the amount of calories
 * burned per minute per activity by the amount of time stated in the problem
 * for each individual activity
 * 5.) add the three calorie amounts to calculate the total amount of 
 * calories burned.
 * 6.) print out a statement with the amount of calories burned.
 *
 * 
 */
//import my DecimalFormat(Object) to format my answer later
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

//start of class HomeWork4_1
public class HomeWork4_1 {

    //setting the constants to their METS value.
    public static final int RUNNING = 10;
    public static final int BASKETBALL = 8;
    public static final int SLEEPING = 1;
    public static final double KILO = 2.2;
    public static final double NEW = 0.0175;

    //start of main  
    public static void main(String[] args) {

    //using the object JOptinPane and the method showInputDialog i am
        //getting the user input on the weight of the person.
    String userInput = JOptionPane.showInputDialog(null, "Please type in how "
            + "much the person weighs:\nEx. (150 or 250)");
    
    
    // converting the user input from a String to a Integer 
    int weight = Integer.parseInt(userInput);
        
    
        
        // changing pounds into kilograms
        double weightInKilo = weight / KILO;
        
        //calculate the amount of calories burned per minute while running 
        double firstSum = NEW * RUNNING * weightInKilo;
        
        
        
        //calculate the amount of calories burned per minute while playing
        //basketball.
        double secondSum = NEW * BASKETBALL * weightInKilo;
       
        
        
        //calculate the amount of calories burned per minute while sleeping
        double thirdSum = NEW * SLEEPING * weightInKilo; 
        
        
        
        //calcualte the amount of calories burned during 30 minutes of running
        double firstAnswer = firstSum * 30;
        
        
        
        //calculate the amount of calories burned during 30 minutes of playing
        //basketball
        double secondAnswer = secondSum * 30;
       
        
        //calculate the amount of calories burned during 6 hours of sleeping
        double thirdAnswer = thirdSum * 360;
        
        
        //adding those three calories sum's together, to produce the total 
        //amount of calories burned
        double finalAnswer = firstAnswer + secondAnswer + thirdAnswer;
       
        
        DecimalFormat df = new DecimalFormat("0.##");
       
        //making a string for my output
        String output;
            output = "The total amount of calories burned\n";
            output = output + "for a " + weight + "lb person is... \n";
            output = output + df.format(finalAnswer) + " calories\n";
            output = output + "Goodbye ";
            
                    
        //outputting the results using JOptionPane
        JOptionPane.showMessageDialog(null, output);
        
    }//end of main

}//end of class HomeWork4_1

