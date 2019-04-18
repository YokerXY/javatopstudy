package exercise17;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.UUID;
/**
 * 爬虫练习2
 * @author 许源
 * 2019.04.19
 */
public class JSoupDemo2 {
    public static void main(String[] args) throws Exception {
        File file;
        InputStream in;
        OutputStream out;
        String url = "http://www.netbian.com/1920x1080/";
        Connection connection = Jsoup.connect(url);
        Document document = connection.get();
        Element elementDiv = document.getElementById("srcPic");
        Elements elements = elementDiv.getElementsByClass("img-container");
        System.out.println(elements.size());
        for (Element e : elements){
            Element imgElement = e.child(0).child(1).child(0).child(0);
            UUID uuid = UUID.randomUUID();
            String imgName = uuid +".jpg";
            file = new File("D:\\download\\"+imgName);
            URL url1 = new URL(imgElement.attr("src"));
            URLConnection uc = url1.openConnection();
            in = uc.getInputStream();
            out =new FileOutputStream(file);
            int temp;
            byte[] buf = new byte[1024];
            while ((temp = in.read(buf))!=-1){
                out.write(buf,0,temp);
            }
            out.close();
            in.close();

        }




    }
}
