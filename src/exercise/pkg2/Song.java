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
    private String title;
    private String genre;
    
    public Song(String _title, String _genre){
        title = _title;
        genre = _genre;
    }
    
    public void PlaySong(){
        System.out.println(getTitle() + " is playing!");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
