package dad;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;



public class WebReader {
 
 public BufferedReader webBuffer() throws Exception {


 Menu menu=new Menu();
  
final URL url = new URL(menu.readLine());
  final URLConnection urlConnection = url.openConnection();
   BufferedReader in = new BufferedReader(new InputStreamReader(
    urlConnection.getInputStream()));

  return in;

 }

 
}