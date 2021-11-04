package bai_20_structural_design_pattern.bai_tap.proxy_pattern;

import java.util.ArrayList;
import java.util.List;

public class FileDownloaderProxy implements Downloader{

    private Downloader fileDown = new FileDownloader("/Users/vonhatanh/Documents/Module 2/src");
    private static List<String> arrayFileDown;
    static{
        arrayFileDown = new ArrayList<>();
        arrayFileDown.add("https://github.com/codegym-vn/codegym-file-util");
    }
    @Override
    public void download(String url) {
        fileDown.download(url);
    }
}
