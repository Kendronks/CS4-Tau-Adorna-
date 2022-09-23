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
public class students {
    int age, hoursSleep;
    String name, favSubject, interest;
    double iq, height, weight;
    
    public void sleep(int time){
        hoursSleep = hoursSleep + time;
    }
    
    public void study(int hours){
        iq = iq+hours*0.25;
    }

    public void eat(int calories){
        weight = weight + calories*0.05;
        height = height + calories*0.001;
    }
    
}
