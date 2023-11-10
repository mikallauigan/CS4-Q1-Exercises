/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise.pkg2;

/**
 *
 * @author mika
 */
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ToBeRead book1 = new ToBeRead("The Invisible Life of Addie Larue by V.E. Schwab",448,true);
        ToBeRead book2 = new ToBeRead("These Violent Delights by Chloe Gong",496,true);
        ToBeRead book3 = new ToBeRead("Last Night at the Telegraph Club by Malinda Lo",416,false);
        
        Song song1 = new Song("Bakit Nga Ba Mahal Kita by Roselle Nava","OPM");
        Song song2 = new Song ("Paper Rings by Taylor Swift","Pop");
        
        Singer singer1 = new Singer ("Faye Webster",song2);
        Singer singer2 = new Singer ("Taylor Swift",song1);
        singer1.performForAudience(12);
        singer1.changeFavSong(song2);
        singer2.performForAudience(12,singer1);
    }
    
    
}
