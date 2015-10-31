package dad;


import java.util.Scanner;


public class Menu {
 
 public String readLine() {
  
   Scanner scanner = new Scanner(System.in);
         String userChoice = scanner.nextLine();
  return userChoice;
  
 }
 
    public void menu() throws Exception {
       while(true){
        System.out.println("Podaj czy url czy txt ?");
            Match match= new Match();

         match.findLinks();
         System.out.println("wszystkie linki/liczba linkow/wybor linku/cale zrodlo"); 
         
        
               switch(readLine()){ 
               
               case "wszystkie linki":
               match.showLinks();
                   break;
               case "liczba linkow":
                  match.howManyLinks();
                   break;
               case "wybor linku":
            	   System.out.println("Jaki numer?");
                   Scanner scanner = new Scanner(System.in);
                   int numberOfLink = scanner.nextInt();
                   System.out.println(match.listOfLinks.get(numberOfLink - 1));
                   break;
               case "cale zrodlo":
                   match.showSource();
                  
                   

                   break;
           }

          
       }
            
    }
    }