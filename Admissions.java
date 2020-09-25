import java.util.*;
public class Admissions {
    public static void main(String[] args) {
        // 1 is Elite
        // 2+ is solid
        // No Nopes
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
        System.out.print("SAT SCORE: ");
        sat = scanner.nextInt();
        scanner.nextLine();
        satV = sat >= 1500 ? "Elite" : sat >= 1400 ? "Solid" : sat > 1200 ? "Acceptable" : "Nope";
        System.out.print("CLASS RANK: ");
        rank = scanner.nextInt();
        scanner.nextLine();

        rankV = rank > 95 ? "Elite" : rank > 90 ? "Solid" : rank > 85 ? "Acceptable" : "Nope";
        System.out.print("AWARDS: ");
        awards = scanner.nextInt();
        scanner.nextLine();

        awardsV = awards > 10 ? "Elite" : awards > 8 ? "Solid" : awards > 3 ? "Acceptable" : "Nope";
        System.out.print("STATE: ");
        residence = scanner.next();
        residenceV = residence.equals("Colorado") ? "Elite" : residence.equals("Florida") ? "Nope" : "Acceptable";
        System.out.print("LAST NAME: ");
        lastName = scanner.next();
        String lastNameV = lastName.equals("Padjen") ? "Elite" : "Acceptable";

        String[] values = {satV, rankV, awardsV, residenceV, lastNameV};
        results(values);
    }

    public static void results(String[] info) {
        for (int i = 0; i < info.length; i++) {
            if (info[i].equals("Nope")) {
                System.out.println("No you failed heck you. Unnaceptable scores.");
                return;
            }
        }
        if (info[4].equals("Elite")) {
            System.out.println("You're a padjen. Welcome!");
            return;
        }
        int solidCount = 2;
        for (int i = 0; i < info.length-1; i++) {
            if (info[i].equals("Elite")) {
                System.out.println("You made it in because you are elite!");
                return;
            } else if (info[i].equals("Solid")) {
                solidCount--;
                if (solidCount <= 0) {
                    System.out.println("You are solid in 2 skills. You made it!");
                    return;
                }
            }
        }
        System.out.println("You weren't too bad, but you didn't hit all of the requirements. You utter failure.");
        return;
    }






}