
package inlamningsuppgift;

import java.util.Scanner;

public class Uppgift1 {

    public static void main(String[] args) {

          Scanner user_input = new Scanner(System.in);
         
      String förnamn;
      System.out.print("Vad heter du i förnamn?:");
      förnamn = user_input.next();
      
      /* Programmet börjar med att fråga om namnet*/
      
      String efternamn;
      System.out.print("I efternamn?:");
      efternamn = user_input.next();
      
      String namn;
      namn = förnamn + " " + efternamn;
      
      /*Jag valde att skapa en ny sträng för efternamn + förnamn, vilket är hela namnet.*/
      
        System.out.println("Hej " + namn);
      
      String personnummer;
      System.out.print("Vad har du för personnummer?:");
      personnummer = user_input.next();
      
      personnummer.substring(2,6);
      
      /* Jag skapade en subbstring eftersom att endast födelsedatumet ska stå i slutet*/
      
      String adress;
      System.out.print("Vart bor du någonstans då?:");
      adress = user_input.next();
      
      
      System.out.print("Välkommen" + " " + namn + ". " + "När du fyller år" + " " + personnummer.substring(2,6) + " " + "kommer vi att komma till" + " " + adress + " " + "och gratulera dig!");
    
      /*Programmet avslutas med att skriva ut allt som man har skrivit in. Medelandet säger att ett bolgag kommer hem till dig och gratulera dig på din födelsedag*/ 
    }
    
}

// Bra!
// Programmet gör det som förväntas och det räcker gott.
// Dokumenteringen är alldeles tillräcklig.

// Vill du vara mer effektiv, så deklarera och använd dina variabler på samma ställe.
// Det blir mer Java-likt, men också något mer svärtolkat.
// Rad 33 är helt onödig, du tar ut en delsträng, men använder den inte. På rad 42 är koden i sätt rätta sammanhang.
