/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise.pkg2;

/**
 *
 * @author mika
 */
public class Singer {
    String name;
    int noOfPerformances = 0;
    double earnings = 0;
    Song favoriteSong;
    
    public Singer(String _name, Song _favoriteSong){
        name = _name;
        favoriteSong = _favoriteSong;
    }
    
    public void performForAudience(int audienceMember){
        noOfPerformances++;
        earnings += 100 * audienceMember;
        System.out.println(name + " performed for an audience of " + audienceMember + " people, and was able to earn " + earnings + " dollars!"); 
    }
    
    public void changeFavSong(Song newFavorite){
        favoriteSong = newFavorite;
        System.out.println(name + " has changed their favorite song to " + newFavorite.title + "! <3");
    }
}
