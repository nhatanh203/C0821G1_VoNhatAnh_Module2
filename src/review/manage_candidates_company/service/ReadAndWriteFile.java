package review.manage_candidates_company.service;

import review.manage_candidates_company.model.Candidate;
import review.manage_candidates_company.model.Experience;
import review.manage_candidates_company.model.Fresher;
import review.manage_candidates_company.model.Intern;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    private static List<Candidate> candidateList = new ArrayList<>();

    public List readExperience() {
        try {
            FileReader fileReader = new FileReader("src/experience.csv");
            BufferedReader bufferRd = new BufferedReader(fileReader);
            String line;
            while ((line = bufferRd.readLine()) != null) {
                String[] candidate = line.split(",");
                Candidate candidate1 = new Experience(Integer.parseInt(candidate[0]), candidate[1], candidate[2], Integer.parseInt(candidate[3]), candidate[4], Integer.parseInt(candidate[5]), candidate[6], Integer.parseInt(candidate[7]), candidate[8]);
                candidateList.add(candidate1);
            }
            bufferRd.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return candidateList;
    }

    public List readFresher() {
        try {
            FileReader fileReader = new FileReader("src/experience.csv");
            BufferedReader bufferRd = new BufferedReader(fileReader);
            String line;
            while ((line = bufferRd.readLine()) != null) {
                String[] candidate = line.split(",");
                Candidate candidate1 = new Fresher(Integer.parseInt(candidate[0]),candidate[1],candidate[2],Integer.parseInt(candidate[3]),candidate[4],Integer.parseInt(candidate[5]),candidate[6],candidate[7],candidate[8],candidate[9]);
                candidateList.add(candidate1);
            }
            bufferRd.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return candidateList;
    }

    public List readIntern () {
        try {
            FileReader fileReader = new FileReader("src/experience.csv");
            BufferedReader bufferRd = new BufferedReader(fileReader);
            String line;
            while ((line = bufferRd.readLine()) != null) {
                String[] candidate = line.split(",");
                Candidate candidate1 = new Intern(Integer.parseInt(candidate[0]),candidate[1],candidate[2],Integer.parseInt(candidate[3]),candidate[4],Integer.parseInt(candidate[5]),candidate[6],candidate[7],Integer.parseInt(candidate[8]),candidate[9]);
                candidateList.add(candidate1);
            }
            bufferRd.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return candidateList;
    }

    public void writeExperience(Candidate candidate) {
        try {
            FileWriter fileWriter = new FileWriter("/Users/vonhatanh/Documents/Module 2/src/experience.csv");
            BufferedWriter bufferedWr = new BufferedWriter(fileWriter);
            bufferedWr.write(candidate.toString());
            bufferedWr.newLine();
            bufferedWr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeFresher(Candidate candidate) {
        try {
            FileWriter fileWriter = new FileWriter("/Users/vonhatanh/Documents/Module 2/src/fresher.csv");
            BufferedWriter bufferedWr = new BufferedWriter(fileWriter);
            bufferedWr.write(candidate.toString());
            bufferedWr.newLine();
            bufferedWr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void writeIntern(Candidate candidate) {
        try {
            FileWriter fileWriter = new FileWriter("/Users/vonhatanh/Documents/Module 2/src/intern.csv");
            BufferedWriter bufferedWr = new BufferedWriter(fileWriter);
            bufferedWr.write(candidate.toString());
            bufferedWr.newLine();
            bufferedWr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
