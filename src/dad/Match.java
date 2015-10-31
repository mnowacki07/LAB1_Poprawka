package dad;

import java.io.BufferedReader;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match {
 List<String> listOfLinks = new ArrayList<String>();
String text;
String pageSource = null;
 public void findLinks() throws Exception {

  WebReader reader = new WebReader();
  TxtReader txt =new TxtReader();
  Menu menu = new Menu();
 
  
  BufferedReader buffer = null;
  
  switch (menu.readLine()) {
  case "url": 
	  System.out.println("Podaj adres url np. http://www.wp.pl"); 
	 
	 
   buffer = reader.webBuffer();
            break;
  case "txt":
   buffer = txt.txtBuffer();
   break;
  }
   
  

  while ((text = buffer.readLine()) != null) {

   Pattern p = Pattern.compile("href=\"(.*?)\"");
   Matcher m = p.matcher(text);
   pageSource += text + "\n";
   while (m.find()) {
    String group = m.group(1);
    listOfLinks.add(group);
   }
  }
  
 } 
 
 public void showLinks(){ 
	 for (int i = 0; i < listOfLinks.size(); i++)
			System.out.println(listOfLinks.get(i));
 }
 public void howManyLinks(){ 
	 System.out.println(listOfLinks.size());
 }  
 
 public void showSource(){ 
	 System.out.println(pageSource);
 }
 

 
 
}