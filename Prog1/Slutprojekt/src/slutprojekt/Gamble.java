package slutprojekt;

import java.util.*;

public class Gamble {

    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);

        /*Jag skapar strängar för alla kortvalörer och kortvärden.*/
        String[] kortvalör = {"Hjärter", "Spader", "Ruter", "Klöver"};
        String[] kortvärde = {"Ess", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Knekt", "Dam", "Kung"};

        /*Jag har även valt att använda en budget för spelet så att man kan förlora.*/
        /*Jag valde att använda double så att budgeten kan ha decimaler.*/
        double budget = 100;

        /*Här har jag valt att skriva regler för spelet.*/
        System.out.println("Välkommen till 'Ryker pengarna, ryker du'");
        System.out.println("Regler:");
        System.out.println("Du kommer att få satsa pengar på vilket kort som kommer att dras.");
        System.out.println("Det innebär att du kan skriva 'Hjärter Kung' och så skriver programmet vilket kort som dras.");
        System.out.println("Om du gissar rätt på valör eller värde så får du hela din insats tillbaka, inklusive 50% av insatsen.");
        System.out.println("Får du full pot och gissar rätt på både valör och värde så får du hela insatsen tillbaka, dubblad.");
        System.out.println("Var dock försiktig, du har en begränsad startbudget på 100SEK.");
        System.out.println("Kom ihåg: Ryker pengarna, ryker du");

        /*Jag har skapat en while-loop som körs till budgeten är lika med 0*/
        /*I while-loopen sker själva satsandet på kortvalör, värde och insats*/
        while (budget > 0) {


            /* Vid själva satsandet så börjar programmet att fråga vilken valör man vill satsa på.*/
            System.out.println("Välj valör att satsa på. Hjärter, Spader, Ruter, Klöver.");
            String spelare_valör = user_input.nextLine();

            /*Sedan frågar programmet vilket värde kortet ska ha.*/
            System.out.println("Välj värde att satsa på. Ess,2-10, Knekt, Dam, Kung.");
            String spelare_värde = user_input.nextLine();

            /*Till sist frågar programmet hur mycket man ska satsa.*/
            System.out.println("Hur mycket vill du satsa?");
            String spelare_insats = user_input.nextLine();

            double insats = Double.parseDouble(spelare_insats);

            budget = budget - insats;

            Random slump_kort = new Random();
            String slump_valör = (kortvalör[slump_kort.nextInt(kortvalör.length)]);
            String slump_värde = (kortvärde[slump_kort.nextInt(kortvärde.length)]);

            System.out.println(slump_valör + " " + slump_värde);

            /*Här skapar jag en if-sats för den slumpmässiga valören på kortet.*/
            /*Är valören den samma som den man satsade på så får man 1,25*insatsen tillbaka.*/
            if (spelare_valör.equalsIgnoreCase(slump_valör)) {
                double valör_vinst = insats * 1.25;
                budget = budget + valör_vinst;
                System.out.println("Du gissade på rätt valör!");
            } else {
                System.out.println("Det var tyvärr fel valör");

                /*Här har jag skapat en till if-sats för det slumpmässiga värdet på kortet.*/
                /*Ifall det är samma värde som det man satsar på så får man 1,5*insatsen tillbaka.*/
                if (spelare_värde.equalsIgnoreCase(slump_värde)) {
                    double värde_vinst = insats * 1.5;
                    budget = budget + värde_vinst;
                    System.out.println("Du gissade rätt värde");
                } else {
                    System.out.println("Det var tyvärr fel värde");
                }

                /*Här skriver programmet in den nya budgeten efter satsningsprocessen.*/
                /*Om budgeten är högre än 0 så startas programmet om.*/
                System.out.println("Din budget är nu " + budget);

            }
        }
    }
}
