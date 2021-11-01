package review.manage_candidates_company.controller;
import review.manage_candidates_company.service.CandidatesOfCompany;
import review.manage_candidates_company.service.ICandidates;

import java.util.Scanner;

public class MainCandidates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ICandidates candidates = new CandidatesOfCompany();
        int switchCs = 8;
        do{
            System.out.println("CANDIDATE MANAGEMENT SYSTEM");
            System.out.println("1. Experience");
            System.out.println("2. Fresher");
            System.out.println("3. Intern ");
            System.out.println("4. Search");
            System.out.println("5. Show Experience");
            System.out.println("6. Show Fresher");
            System.out.println("7. Show Intern");
            System.out.println("8. Exit");
            System.out.println(" (Please choose 1 to Create Experience Candidate, 2 to Create Fresher Candidate, 3 to Internship Candidate, 4 to Searching and 5 to Exit program).");
            System.out.print("Input here : ");
            switchCs = Integer.parseInt(scanner.nextLine());
            switch (switchCs) {
                case 1 : candidates.creatExperience();
                candidates.displayList();
                break;
                case 2 : candidates.creatFresher();
                candidates.displayList();
                break;
                case 3 : candidates.creatIntern();
                candidates.displayList();
                break;
                case 4 :
                break;
                case 5 :
                    ((CandidatesOfCompany) candidates).showExperienceCandidate();
                    break;
                case 6 :
                    ((CandidatesOfCompany) candidates).showFresherCandidate();
                    break;
                case 7 :
                    ((CandidatesOfCompany) candidates).showInternCandidate();
                    break;
                case 8 :
                    System.out.println("See you again !!! ");
                    break;
            }
        }while(switchCs != 8);
    }
}
