package bai_16_text_file.bai_tap.copy_file_text;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileText {
    private static final String SOURCE_FILE = "src/bai_16_text_file/bai_tap/copy_file_text/sourcefile.csv";
    private static final String TARGET_FILE = "src/bai_16_text_file/bai_tap/copy_file_text/targetfile.csv";

    public static String readFile(FileReader fr) throws IOException {
        int i;
        String csvSplit = "";
        while ((i = fr.read()) != -1) {
            csvSplit += (char) i;
        }
        fr.close();
        return csvSplit;
    }

    public static void writeFile(FileWriter fw, String content) {
        try {
            fw.write(content);
            fw.close();
            System.out.println("Mission Complete !");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        String csvSplit = "";
        try {
            csvSplit = readFile(new FileReader(SOURCE_FILE));
            System.out.println(csvSplit);
        } catch (IOException e) {
            System.out.println("File ERROR !!");
        }
        writeFile(new FileWriter(TARGET_FILE), csvSplit);
    }
}
