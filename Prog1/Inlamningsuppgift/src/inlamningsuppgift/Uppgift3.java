package inlamningsuppgift;

import java.util.Scanner;

public class Uppgift3 {
    
    public static void main(String [] args) {
    
      Scanner user_input = new Scanner (System.in);   
     
      
      System.out.println("Dags att ha lite kul med tal!");
      
      System.out.println("Skriv två tal så ska jag addera de åt dig!");
      double number1 = Double.parseDouble(user_input.next());
      double number2 = Double.parseDouble(user_input.next());
      double answer1 = number1 + number2;
      System.out.println("Addition =" + " " + answer1);
      
      /* Jag har valt att använda metoden Double.parseDouble() för att på ett
      smidigt sätt omvandla talen som matas in till variabler. Det gör att jag
      kan använda talen vid operationer som addition, subtraktion, multiplikation
      och division.*/
      
      System.out.println("Skriv in ett tal så subtraherar jag svaret med det nya talet");
      double number3 = Double.parseDouble(user_input.next());
      double answer2 = answer1 - number3;
      System.out.println("Subtraktion =" + " " + answer2);
      
      /* Med hjälp av svaret från att addera de två valfria talen, så skriver man 
      in ännu ett tal. Svaret från additionen subtraheras sedan med det nya talet. */
      
      System.out.println("Mer? Skriv in ett till tal så multiplicerar jag ditt svar med det talet");
      double number4 = Double.parseDouble(user_input.next());
      double answer3 = answer2 * number4;
      System.out.println("Multiplikation =" + " " + answer3);
      
      /* Det nya svaret efter subtraktionen multiplicerats med ännu ett valfritt tal. */
      
      System.out.println("Lägg in ett sista tal så ska jag dividera ditt nuvarnde svar");
      double number5 = Double.parseDouble(user_input.next());
      double final_answer = answer3 / number5;
      System.out.println("Ditt slutgiltiga svar är =" + " " + final_answer);
      
      /* Det sista steget är att ta det återstående svaret och dividera det med 
      ännu ett tal som användaren själv väljer. Då får man sitt slutgiltiga svar.*/
              
}
}