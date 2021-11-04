package bai_20_structural_design_pattern.bai_tap.proxy_pattern;

public class FileDownloader implements Downloader{
    private String userAgent;

    public FileDownloader(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public void download(String url) {
        System.out.println("Downloading url : " + url + " - UserAgent :  " + userAgent );
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
}
