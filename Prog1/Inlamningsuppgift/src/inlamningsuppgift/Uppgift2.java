package inlamningsuppgift;

import javax.swing.JOptionPane;

public class Uppgift2 {

    public static void main(String[] args) {
        
        String first_input;
        first_input = JOptionPane.showInputDialog("What do you want?");
        
        /*Jag väljer att skapa en sträng för varje inmatning och ger dem namnen beroende på vilken ordning de ligger i */ 
        /*Jag valde även att använda JOptionPane för inmatningarna*/
        System.out.println(first_input);
        
        /*Sedan skrivs inmatningen ut*/
        
        String second_input;
        second_input = JOptionPane.showInputDialog("Anything else?");
        
        /*Frågorna som jag ställer vid inmatningara är ingenting som behöver läggas märke till*/
        
        System.out.println(first_input + " " + second_input);
        
        /*Efter varje inmatning så väljer jag att lägga på dem som resulterar i en lång text med alla inmatningar*/
        
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
