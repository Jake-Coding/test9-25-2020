import java.util.*;
public class Admissions {
    public static void main(String[] args) {
        // 1 is Elite
        // 2+ is solid
        // No Nopes

        //INITIALIZING VARS
        // variable = original variable value
        // variableV = rank corresponding with variable ("Elite", "Solid", etc.)
        Scanner scanner = new Scanner(System.in);

        int sat;
        String satV;

        int rank;
        String rankV;

        int awards;
        String awardsV;

        String residence;
        String residenceV;

        String lastName;
        String lastNameV;

        // SAT SCORE
        System.out.print("SAT SCORE: ");
        sat = scanner.nextInt();
        scanner.nextLine();
        satV = sat >= 1500 ? "Elite" : sat >= 1400 ? "Solid" : sat > 1200 ? "Acceptable" : "Nope";
        
        // CLASS RANK
        System.out.print("CLASS RANK: ");
        rank = scanner.nextInt();
        scanner.nextLine();
        rankV = rank > 95 ? "Elite" : rank > 90 ? "Solid" : rank > 85 ? "Acceptable" : "Nope";
       
        //AWARDS
        System.out.print("AWARDS: ");
        awards = scanner.nextInt();
        scanner.nextLine();
        awardsV = awards > 10 ? "Elite" : awards > 8 ? "Solid" : awards > 3 ? "Acceptable" : "Nope";
        
        // STATE
        System.out.print("STATE: ");
        residence = scanner.next();
        residenceV = residence.equals("Colorado") ? "Elite" : residence.equals("Florida") ? "Nope" : "Acceptable";
        
        // LAST NAME
        System.out.print("LAST NAME: ");
        lastName = scanner.next();
        lastNameV = lastName.equals("Padjen") ? "Elite" : "Acceptable";

        // COMPILE DATA
        String[] values = {satV, rankV, awardsV, residenceV, lastNameV};

        // RESULT FUNCTION
        System.out.print(results(values));


        // CLEANUP
        scanner.close();
    }

    public static String results(String[] info) {
        // check for "nope"s
        for (String rank : info) {
            if (rank.equals("Nope")) {
                return "No you failed heck you. Unnaceptable scores.";
            }
        }

        // check for name == padjen
        if (info[4].equals("Elite")) {
            return "You're a Padjen. Welcome!";
        }


        int solidCount = 2;

        for (String rank : info) {
            // check if elite
            if (rank.equals("Elite")) {
                return "You made it in because you are elite!";

            // check if solid
            } else if (rank.equals("Solid")) {
                solidCount--;
                if (solidCount <= 0) {
                    return "You are solid in 2 skills. You made it!";
                }

            }
        }

        // Catch-all
        return "You weren't too bad, but you didn't hit all of the requirements. You utter failure.";
    }
}