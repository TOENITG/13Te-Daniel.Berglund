package inlamningsuppgift;

import java.util.Scanner;
import java.util.Arrays;

public class Uppgift4 {

    static Scanner user_input = new Scanner(System.in);
    static int points = 0;

    static boolean Correct(String svaret) {
        boolean value = true;
        String svar = user_input.nextLine();

        if (svar.equalsIgnoreCase(svaret)) {
            System.out.println("Jomen visst");
            value = true;
            points++;

        } else {
            System.out.println("Nej du");
        }
        return false;
    }

    public static void main(String[] args) {

        /*Jag skapar strängar för varje rätt svar.*/
        String answer1 = "c";
        String answer2 = "d";
        String answer3 = "a";
        String answer4 = "c";
        String answer5 = "b";
        String answer6 = "b";
        String answer7 = "a";
        String answer8 = "a";
        String answer9 = "d";
        String answer10 = "c";

        /*För att göra det lättare för mig så skapar jag en sträng för det fyra
        första orden i varje fråga, eftersom att de är likadana för alla frågor.*/
        String start = "Vad heter huvudstaden i ";

        /*Här har jag skapat en array för varje fråga och eftersom att
        de fyra första orden i frågorna har deklarerats som en sträng
        så föränklar det skrivandet en hel del.*/
        String[] aryFråga = new String[10];
        aryFråga[0] = "Fråga 1: " + start + "Finland?";
        aryFråga[1] = "Fråga 2: " + start + "Albanien?";
        aryFråga[2] = "Fråga 3: " + start + "Kina?";
        aryFråga[3] = "Fråga 4: " + start + "Kroatien?";
        aryFråga[4] = "Fråga 5: " + start + "Kazakstan?";
        aryFråga[5] = "Fråga 6: " + start + "Colombia?";
        aryFråga[6] = "Fråga 7: " + start + "Marocko?";
        aryFråga[7] = "Fråga 8: " + start + "Turkiet?";
        aryFråga[8] = "Fråga 9: " + start + "Nya Zeeland?";
        aryFråga[9] = "Fråga 10: " + start + "Grekland?";

        /*Här har jag skapat en till aray för mina svarsalternativ.*/
        /**/
        String[] aryAlternativ = new String[10];
        aryAlternativ[0] = "A:Köpenhamn B:Tallin C:Helsingfors D:Minsk";
        aryAlternativ[1] = "A:Podgorica B:Skopje C:Valetta D:Tirana";
        aryAlternativ[2] = "A:Peking B:Tokyo C:Seoul D:Jakarta";
        aryAlternativ[3] = "A:Belgrad B:Bukarest C:Zagreb D:Sofia";
        aryAlternativ[4] = "A:Ulan Bator B:Astana C:Dusjanbe D:Bisjkek";
        aryAlternativ[5] = "A:San Salvador B:Bogota C:Montevideo D:Santiago";
        aryAlternativ[6] = "A:Rabat B:Tripoli C:Tunis D:Mogadishu";
        aryAlternativ[7] = "A:Ankara B:Reykjavik C:Bukarest D:Istanbul";
        aryAlternativ[8] = "A:Dublin B:Canberra C:Auckland D:Wellington";
        aryAlternativ[9] = "A:Ankara B:Istanbul C:Aten D:Rom";

        System.out.println("Dags för lite frågesport!");
        System.out.println("Svara med att skriva a,b,c eller d utifrån svarsalternativen");
        
        /*Med hjälp av arrays så skriver jag lätt in frågorna. Jag skriver
        även in strängarna på svaren med hjälp av "correct".*/
        System.out.println(aryFråga[0] + "\n" + aryAlternativ[0]);
        Correct(answer1);

        System.out.println(aryFråga[1] + "\n" + aryAlternativ[1]);
        Correct(answer2);

        System.out.println(aryFråga[2] + "\n" + aryAlternativ[2]);
        Correct(answer3);

        System.out.println(aryFråga[3] + "\n" + aryAlternativ[3]);
        Correct(answer4);

        System.out.println(aryFråga[4] + "\n" + aryAlternativ[4]);
        Correct(answer5);

        System.out.println(aryFråga[5] + "\n" + aryAlternativ[5]);
        Correct(answer6);

        System.out.println(aryFråga[6] + "\n" + aryAlternativ[6]);
        Correct(answer7);

        System.out.println(aryFråga[7] + "\n" + aryAlternativ[7]);
        Correct(answer8);

        System.out.println(aryFråga[8] + "\n" + aryAlternativ[8]);
        Correct(answer9);

        System.out.println(aryFråga[9] + "\n" + aryAlternativ[9]);
        Correct(answer10);
        
        System.out.println("Du fick " + points + "poäng.");
        
        /*Som en bonus för programmet så har jag bett programmet att skriva ut
        ett speciellt medelande beroende på hur många poäng man fick.*/
        if (points == 10) {
            System.out.println("Du är ecn riktig mästare! Du gör mig verkligen stolt!");
        }
        
        if (points == 6 || points == 7 || points == 8 || points == 9 ) {
            System.out.println("Du, det där var bra gjort!");
        }
        
        if (points == 3 || points == 4 || points == 5) {
            System.out.println("Det där får du ta och träna lite mer på!");
        }
        if (points < 2) {
            System.out.println("Stick härifrån!");
        }

    }
}
