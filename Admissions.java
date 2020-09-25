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

        String[] info = {satV, rankV, awardsV, residenceV, lastName};
        
    }





}