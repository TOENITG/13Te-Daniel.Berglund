
package inlamningsuppgift;

import java.util.Scanner;

public class Uppgift1 {

    public static void main(String[] args) {

          Scanner user_input = new Scanner(System.in);
         
      String förnamn;
      System.out.print("Vad heter du i förnamn?:");
      förnamn = user_input.next();
      
      String efternamn;
      System.out.print("I efternamn?:");
      efternamn = user_input.next();
      
      String namn;
      namn = förnamn + " " + efternamn;
      
        System.out.println("Hej " + namn);
      
      String personnummer;
      System.out.print("Vad har du för personnummer?:");
      personnummer = user_input.next();
      
      personnummer.substring(2,6);
      
      String adress;
      System.out.print("Vart bor du någonstans då?:");
      adress = user_input.next();
      
      
      System.out.print("Välkommen" + " " + namn + ". " + "När du fyller år" + " " + personnummer.substring(2,6) + " " + "kommer vi att komma till" + " " + adress + " " + "och gratulera dig!");
    
    }
    
}
