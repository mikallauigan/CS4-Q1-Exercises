/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise.pkg1;

/**
 *
 * @author mika
 */
public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String title_1 = "The Invisible Life of Addie Larue by V.E. Schwab";
       String title_2 = "These Violent Delights by Chloe Gong";
       String title_3 = "Last Night at the Telegraph Club by Malinda Lo";
               
       int page_1 = 448;
       int page_2 = 496;
       int page_3 = 416;
       
       boolean genre_1 = true;
       boolean genre_2 = true;
       boolean genre_3 = false;
      
     System.out.println(
       "Book 1\n" + "Title: " + title_1 + "\n" + "Number of Pages: " + page_1 + "\n" + "Is fantasy one of the main genres?: " + genre_1 + "\n"   
     );
     
     System.out.println(
       "Book 2\n" + "Title: " + title_2 + "\n" + "Number of Pages: " + page_2 + "\n" + "Is fantasy one of the main genres?: " + genre_2 + "\n" 
     );
     
     System.out.println(
       "Book 3\n" + "Title: " + title_3 + "\n" + "Number of Pages: " + page_3 + "\n" + "Is fantasy one of the main genres?: " + genre_3 + "\n" 
     );
     
     int totalPages = page_1 + page_2 + page_3;
     boolean isItFantasy = genre_1 && genre_2 && genre_3;
     boolean longerThanWarAndPeace = totalPages > 1225;
     
     System.out.println(
     "Total number of pages: " + totalPages 
     );
     
     System.out.println(
     "Are they all fantasy?: " + isItFantasy
     );
     
     System.out.println(
     "Is the total number of pages more than the number of pages of War and Peace?: " + longerThanWarAndPeace      
     );
                     
    }
    
}
