/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex3;

/**
 *
 * @author TAU
 */
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    
    public void performForAudience(int numPeople){
        noOfPerformances++;
        earnings = earnings + 100;
    }
}
