/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopoo01;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author FATEC
 */
public class ExercicioPOO01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int studentquantity=0;
        Scanner read=new Scanner(System.in);
        ArrayList<Student> students=new ArrayList<>();
        System.out.println("Mostra a maior e menor mediados alunos cadastrados");
        System.out.println("quantos alunos?");
        while(studentquantity<=0){
            try{
            studentquantity=Integer.parseInt(read.nextLine());
            }catch(Exception e){
                System.out.println("Digite um número válido");
            }
        }
        for(int i=0;i<studentquantity;i++){
            
        }
    }
    
}
