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

    private String name;
    private int noOfPerformances = 0;
    private double earnings = 0;
    private Song favoriteSong;
    
    private static int totalPerformances = 0;
    
    public Singer(String _name, Song _favoriteSong){
        name = _name;
        favoriteSong = _favoriteSong;
    }
    
    public void performForAudience(int audienceMember){
        noOfPerformances++;
        setEarnings(getEarnings() + 100 * audienceMember);
        System.out.println(getName() + " performed for an audience of " + audienceMember + " people, and was able to earn " + getEarnings() + " dollars!"); 
    }
    
    public void performForAudience(int audienceMember, Singer newSinger){
        noOfPerformances += 2;
        setEarnings(getEarnings() + (100 * audienceMember)/2);
        newSinger.setEarnings(newSinger.getEarnings()+ (100 * audienceMember)/2);
        System.out.println(getName() + " and " + newSinger.getName() + " performed for an audience of " + audienceMember + " people, and were able to earn " + (100 * audienceMember)/2 + " dollars each!"); 
    }
    
    public void changeFavSong(Song newFavorite){
        setFavoriteSong(newFavorite);
        System.out.println(getName() + " has changed their favorite song to " + newFavorite.getTitle() + "! <3");
    }
    
    public String getName() {
        return name;
    }

    public int getNoOfPerformances() {
        return noOfPerformances;
    }

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

    public Song getFavoriteSong() {
        return favoriteSong;
    }

    public void setFavoriteSong(Song favoriteSong) {
        this.favoriteSong = favoriteSong;
    }
}
