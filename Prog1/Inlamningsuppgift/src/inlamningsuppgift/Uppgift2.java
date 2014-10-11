package inlamningsuppgift;

import javax.swing.JOptionPane;

public class Uppgift2 {

    public static void main(String[] args) {
        
        String first_input;
        first_input = JOptionPane.showInputDialog("What?");
        
        System.out.println(first_input);
        
        String second_input;
        second_input = JOptionPane.showInputDialog("Anything else?");
        
        System.out.println(first_input + " " + second_input);
        
        String third_input;
        third_input = JOptionPane.showInputDialog("And?");
        
        System.out.println(first_input + " " + second_input + " " + third_input);
        
        String fourth_input;
        fourth_input = JOptionPane.showInputDialog("Anything else?");
        
        System.out.println(first_input + " " + second_input + " " + third_input + " " + fourth_input);
        
        String fifth_input;
        fifth_input = JOptionPane.showInputDialog("One last thing?");
        
        System.out.println(first_input + " " + second_input + " " + third_input + " " + fourth_input + " " + fifth_input);
 }
}    
