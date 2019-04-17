package exercise17;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/**
 * 爬虫练习
 * @author 许源
 * 2019.04.18
 */
public class JSoupDemo1 {
    public static void main(String[] args) throws Exception {
        //指定目标链接
        String url = "http://news.ifeng.com/";
        //建立与目标页面链接
        Connection connection = Jsoup.connect(url);
        Document document =connection.get();
        Elements elements = document.getElementsByClass("news-stream-newsStream-news-item-infor");
        System.out.println(elements.size());
        for (Element element:elements){
            Element link  =element.child(0).child(0);
            //得到文字内容
            String titleString = link.text();
            System.out.println(titleString);

        }
    }
}
