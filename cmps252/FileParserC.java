package cmps252;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class FileParserC{

	public static Set<Course> ParseFile(String fileName) throws IOException{
        Set<Course> dd = new HashSet<Course>();
        File input = new File("C:/Users/pc/Desktop/Spring 19 20/CMPS 252/zip/A.txt");
        Document doc = Jsoup.parse(input,null);
        Elements TDs = doc.select("td");
        int foundAt = 0;
        for (int i = 0; i < TDs.size(); i++) {
        	Element td = TDs.get(i);
        	if(td.ownText().contains("C R N")) {
        		foundAt = i;
        		break;
        	}	
		}
        while (foundAt<=TDs.size()){
        	String keyt=TDs.get(foundAt+1).text()+TDs.get(foundAt+2).text();
        		CourseC addi= new CourseC();
            	addi.subject=TDs.get(foundAt+1).text();
            	addi.title=TDs.get(foundAt+4).text();
            	addi.code=TDs.get(foundAt+2).text();
            	addi.section=TDs.get(foundAt+3).text();
            	addi.credits=TDs.get(foundAt+5).text();
            	addi.term=TDs.get(foundAt-1).text();
          //  	addi.InstructorFirstName=TDs.get(foundAt+32).text();
          //  	addi.InstructorLastName=TDs.get(foundAt+33).text();
           // 	addi.BeginTime=TDs.get(foundAt+10).text();
            //	addi.EndTime=TDs.get(foundAt+11).text();
           // 	addi.Building=TDs.get(foundAt+12).text();
         //   	addi.Room=TDs.get(foundAt+13).text();
            	addi.crn=TDs.get(foundAt).text();
            // 	addi.days=TDs.get(foundAt+14).text()+TDs.get(foundAt+15).text()+TDs.get(foundAt+16).text()+TDs.get(foundAt+17).text()+TDs.get(foundAt+18).text();
            	addi.seatsavailable=TDs.get(foundAt+9).text();
            	addi.Aenrolment=TDs.get(foundAt+8).text();
            	dd.add(addi);
        	
        	foundAt+=36;

        }
		return dd;
	}
	public static void main(String[] args) throws IOException{
		Set<Course> a=ParseFile("C:\\Users\\pc\\Desktop\\Spring 19 20\\CMPS 252\\zip\\A.html");
		for (Iterator<Course> it = a.iterator(); it.hasNext(); ) {
	        Course f = it.next();
	        System.out.println(f.getCode());
	    }
	}

}
