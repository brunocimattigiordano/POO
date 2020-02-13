/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopoo01;

/**
 *
 * @author FATEC
 */
public class Student {
    private int ra;
    private String name;
    private String discipline;
    private double firstgrade;
    private double secondgrade;
    private double thirdgrade;
    private double average;

    void Student(String name, String discipline, int ra) {
        this.name=name;
        this.discipline=discipline;
        this.ra=ra;
        //generatera();
    }
    
    public void setfirstgrade(double grade){
        firstgrade=grade;
    }
    
    public void setsecondgrade (double grade){
        secondgrade=grade;
    }
    
    public void thirdgrade (double grade){
        thirdgrade=grade;
    }
    
    private void calculateaverage(){
       average=(firstgrade+secondgrade+thirdgrade)/3;
    }
    
    public double getaverage(){
        return average;
    }
    
    /*private void generatera(){
        
    }*/
}
