/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise.pkg2;

/**
 *
 * @author mika
 */
public class Song {
    String title;
    String genre;
    
    public Song(String _title, String _genre){
        title = _title;
        genre = _genre;
    }
    
    public void PlaySong(){
        System.out.println(title + " is playing!");
    }
}
