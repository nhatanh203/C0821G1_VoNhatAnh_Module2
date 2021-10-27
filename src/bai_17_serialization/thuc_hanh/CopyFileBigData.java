package bai_17_serialization.thuc_hanh;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyFileBigData {
    static void usingJavaFiles(File source, File dest) throws IOException {
//        sử dụng Files.copy() method để copy file
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void singStream(File source, File dest) throws IOException {
        InputStream ipStream = null;
        OutputStream opStream = null;
        try {
            ipStream = new FileInputStream(source);
            opStream = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = ipStream.read(buffer)) > 0) {
                opStream.write(buffer, 0, length);
            }
        } finally {
            ipStream.close();
            opStream.close();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Nhập đường dẫn file :");
        String sourcePath = in.nextLine();
        System.out.printf("Nhập đường dẫn file copy đến :");
        String destPath = in.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try {
            usingJavaFiles(sourceFile, destFile);
            //singStream(sourceFile, destFile);
            System.out.printf("Hoàn thành");
        } catch (IOException ioe) {
            System.out.printf("Không thể sao chép file");
            System.out.printf(ioe.getMessage());
        }
    }
}
