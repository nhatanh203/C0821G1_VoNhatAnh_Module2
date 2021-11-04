package bai_20_structural_design_pattern.bai_tap.proxy_pattern;

public class Client {
    public static void main(String[] args) {
        Downloader downUrl = new FileDownloaderProxy();

        try{
            downUrl.download("https://github.com/codegym-vn/codegym-file-util");
            System.out.println("Successful download !");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
