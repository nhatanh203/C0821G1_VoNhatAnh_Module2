package review.manage_candidates_company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidatesOfCompany implements ICandidates {
    Scanner scanner = new Scanner(System.in);
    public static List<Candidate> candidatesList = new ArrayList<>();

    static {
        candidatesList.add(new Fresher(2, "Tom", "Linh", 2003, "Sai Gon", 123456789, "abc@gmail", "498", "gioi", "Havaard"));
        candidatesList.add(new Intern(3, "Jerry", "Fresh", 2003, "Ha Noi", 123123, "xyz@gmail", "Nganh IT", 3, "S"));
        candidatesList.add(new Experience(1, "Nhat Anh", "Vo", 2003, "Quảng Bình", 123456789, "vonhatanh@gmail.com", 12, "VjpPro"));
    }

    @Override
    public void creatExperience() {
        System.out.println("Nhập id của ứng viên :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập first name của ứng viên :");
        String firstName = scanner.nextLine();
        System.out.println("Nhập last name của ứng viên :");
        String lastName = scanner.nextLine();
        System.out.println("Nhập địa chỉ của ứng viên :");
        String address = scanner.nextLine();
        int birthDay = CheckCandidate.checkYearDate();
        System.out.println("Nhập email của ứng viên : ");
        String email = scanner.nextLine();
        int phone = CheckCandidate.CheckPhone();
        int yearOfExp = CheckCandidate.checkYearOfExp();
        System.out.println("Nhập kĩ năng của ứng viên :");
        String personalSkill = scanner.nextLine();
        System.out.println("Bạn có muốn tiếp tục (Y/N) ");
        String choice = scanner.nextLine();
        if (choice.equals("Y")) {
            candidatesList.add(new Experience(id, firstName, lastName, birthDay, address, phone, email, yearOfExp, personalSkill));
            System.out.println("Hoàn thành !");
        } else {
            displayList();
        }
    }

    @Override
    public void creatFresher() {
        System.out.println("Nhập id của ứng viên :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập first name của ứng viên :");
        String firstName = scanner.nextLine();
        System.out.println("Nhập last name của ứng viên :");
        String lastName = scanner.nextLine();
        System.out.println("Nhập địa chỉ của ứng viên :");
        String address = scanner.nextLine();
        int birthDay = CheckCandidate.checkYearDate();
        System.out.println("Nhập email của ứng viên : ");
        String email = scanner.nextLine();
        int phone = CheckCandidate.CheckPhone();
        System.out.println("Nhập thời gian tốt nghiệp : ");
        String graduationTime = scanner.nextLine();
        System.out.println("Thứ hạng tốt nghiệp : ");
        String graduationRank = scanner.nextLine();
        System.out.println("Nhập trường đại học tốt nghiệp : ");
        String nameOfSchool = scanner.nextLine();
        System.out.println("Bạn có muốn tiếp tục (Y/N) ");
        String choice = scanner.nextLine();
        if (choice.equals("Y")) {
            candidatesList.add(new Fresher(id, firstName, lastName, birthDay, address, phone, email, graduationTime, graduationRank, nameOfSchool));
            System.out.println("Hoàn thành !");
        } else {
            displayList();
        }
    }

    @Override
    public void creatIntern() {
        System.out.println("Nhập id của ứng viên :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập first name của ứng viên :");
        String firstName = scanner.nextLine();
        System.out.println("Nhập last name của ứng viên :");
        String lastName = scanner.nextLine();
        System.out.println("Nhập địa chỉ của ứng viên :");
        String address = scanner.nextLine();
        int birthDay = CheckCandidate.checkYearDate();
        System.out.println("Nhập email của ứng viên : ");
        String email = scanner.nextLine();
        int phone = CheckCandidate.CheckPhone();
        System.out.println("Nhập ngành học : ");
        String majors = scanner.nextLine();
        System.out.println("Nhập số năm đã học ở trường : ");
        int studyingYears = scanner.nextInt();
        System.out.println("Nhập trường đang học : ");
        String nameOfSchool = scanner.nextLine();
        System.out.println("Bạn có muốn tiếp tục (Y/N) ");
        String choice = scanner.nextLine();
        if (choice.equals("Y")) {
            candidatesList.add(new Intern(id, firstName, lastName, birthDay, address, phone, email, majors, studyingYears, nameOfSchool));
            System.out.println("Hoàn thành !");
        } else {
            displayList();
        }
    }

    @Override
    public void searchCandidates() {

    }

    @Override
    public void displayList() {
        for (Candidate candidate : candidatesList) {
            System.out.println(candidate.toString());
        }
    }
}
