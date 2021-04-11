package cmps252;
//
//import java.io.IOException;
//import java.util.Map;
//
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//
//public class Program {
//
//	public static void main(String[] args) throws IOException {
//        Document doc = Jsoup.connect("https://www-banner.aub.edu.lb/catalog/schd_C.htm").get();
//        Elements TDs = doc.select("td");
//        System.out.println(TDs.size());
//        
//        int foundAt = 0;
//        for (int i = 0; i < TDs.size(); i++) {
//        	Element td = TDs.get(i);
//        	if(td.ownText().contains("C R N")) {
//        		foundAt = i;
//        		break;
//        	}	
//		}
//        
//        while (foundAt<=TDs.size()) {
//        	System.out.println(TDs.get(foundAt).text());
//        	System.out.println(TDs.get(foundAt+4).text());
//        	foundAt+=36;
//        }
//	}
//}