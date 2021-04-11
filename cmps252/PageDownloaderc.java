package cmps252;
import java.net.URL; 
import java.io.*;
import java.net.MalformedURLException; 
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.io.*; 
import java.net.MalformedURLException; 



public class PageDownloaderc implements PageDownloader{
	public void DownloadPage(String url, String fileName){
		{ 
	        try { 
	  
	            URL qq = new URL(url); 
	            BufferedReader readr =  
	              new BufferedReader(new InputStreamReader(qq.openStream())); 
	  
	            BufferedWriter writer =  
	              new BufferedWriter(new FileWriter(fileName)); 
	              
	            String line; 
	            while ((line = readr.readLine()) != null) { 
	                writer.write(line); 
	            } 
	  
	            readr.close(); 
	            writer.close(); 
	            System.out.println("Successfully Downloaded."); 
	        } 
	  
	        // Exceptions 
	        catch (MalformedURLException mue) { 
	            System.out.println("Malformed URL Exception raised"); 
	        } 
	        catch (IOException ie) { 
	            System.out.println("IOException raised"); 
	        } 
	    } 
	}
	public void main(String args[]) 
	        throws IOException 
	    { 
		for(char i='A';i<='Z';i++) {
			String url = "https://www-banner.aub.edu.lb/catalog/schd_"+i+".htm"; 
	        DownloadPage(url,i+".html"); 
		}
	} 
}
