package review.manage_candidates_company;

import java.util.Scanner;

public class MainCandidates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ICandidates candidates = new CandidatesOfCompany();
        int switchCs = 5;
        do{
            System.out.println("CANDIDATE MANAGEMENT SYSTEM");
            System.out.println("1. Experience");
            System.out.println("2. Fresher");
            System.out.println("3. Intern ");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            System.out.println(" (Please choose 1 to Create Experience Candidate, 2 to Create Fresher Candidate, 3 to Internship Candidate, 4 to Searching and 5 to Exit program).");
            System.out.print("Input here : ");
            switchCs = Integer.parseInt(scanner.nextLine());
            switch (switchCs) {
                case 1 : candidates.creatExperience();
                break;
                case 2 : candidates.creatFresher();
                break;
                case 3 : candidates.creatIntern();
                break;
                case 4 :
                break;
                case 5 :
                    System.out.println("See you again !!! ");
                    break;
            }
        }while(switchCs != 5);
    }
}
