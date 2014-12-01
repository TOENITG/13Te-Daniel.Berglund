package inlamningsuppgift;

import java.util.Scanner;

public class Uppgift4 {
    
        static Scanner user_input = new Scanner(System.in);
        static int points = 0;
        
    static boolean Correct(String theanswer) {
        boolean value = true;
        String answer = user_input.nextLine(); 
         if(answer.equalsIgnoreCase(theanswer)) {
             System.out.println("Jomen visst");
              value = true;
               points++;
             
         }
         else {
             System.out.println("Nej du");
         }
    }    
    

         
    public static void main(String [] args) {
      
        
                   String answer1="c"  ;
                   String answer2="d"  ;
                   String answer3="a"  ;
                   String answer4="c"  ;
                   String answer5="b"  ;
                   String answer6="b"  ;
                   String answer7="a"  ;
                   String answer8="a"  ;
                   String answer9="d"  ;
                   String answer10="c"  ;        
                
    
   System.out.println("Dags för lite frågesport!");
   System.out.println("Svara med att skriva a,b,c eller d utifrån svarsalternativen");
    
   
    
   System.out.println("Fråga 1: Vad heter huvudstaden i Finland?");
   System.out.println("A:Köpenhamn B:Tallin C:Helsingfors D:Minsk");
     Correct(answer1);
   
   System.out.println("Fråga 2: Vad heter huvudstaden i Albanien?");
   System.out.println("A:Podgorica B:Skopje C:Valetta D:Tirana");
     Correct(answer2);
   
   System.out.println("Fråga 3: Vad heter huvudstaden i Kina?");
   System.out.println("A:Peking B:Tokyo C:Seoul D:Jakarta");
     Correct(answer3);
   
   System.out.println("Fråga 4: Vad heter huvudstaden i Kroatien?");
   System.out.println("A:Belgrad B:Bukarest C:Zagreb D:Sofia");
     Correct(answer4);  
   
   System.out.println("Fråga 5: Vad heter huvudstaden i Kazakstan?");
   System.out.println("A:Ulan Bator B:Astana C:Dusjanbe D:Bisjkek"); 
     Correct(answer5); 
   
   System.out.println("Fråga 6: Vad heter huvudstaden i Colombia?");
   System.out.println("A:San Salvador B:Bogota C:Montevideo D:Santiago");
     Correct(answer6);   
   
   System.out.println("Fråga 7: Vad heter huvudstaden i Marocko?");
   System.out.println("A:Rabat B:Tripoli C:Tunis D:Mogadishu");
     Correct(answer7);
     
   System.out.println("Fråga 8: Vad heter huvudstaden i Turkiet?");
   System.out.println("A:Ankara B:Reykjavik C:Bukarest D:Istanbul");  
     Correct(answer8);
    
   System.out.println("Fråga 9: Vad heter huvudstaden på Nya Zeeland?");
   System.out.println("A:Dublin B:Canberra C:Auckland D:Wellington");     
     Correct(answer9);
    
   System.out.println("Fråga 10: Vad heter huvudstaden i Grekland?");
   System.out.println("A:Ankara B:Istanbul C:Aten D:Rom");  
    
    Correct(answer10);
    
}    
}