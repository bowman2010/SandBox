/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bowman
 */
public class Matrix1 {
    public static ArrayList <String[]> matrice1;
    
    public static void main(String[] args) {
        inputMatrix(matrice1);
        displayMatrix(matrice1);
    }

    private static void inputMatrix(ArrayList<String[]> matrice) {
        Scanner kbd = new Scanner(System.in);
        ArrayList<String[]> mtx=new ArrayList<>();
        String s;
        System.out.println("Enter a matrix (finish by a end keyword");
        while (kbd.hasNextLine()) {
            s=kbd.nextLine();
            if (s.matches("\\^\\s*end")) break;
            mtx.add(s.split("\\s+"));
        }
        matrice=mtx;        
    }

    private static void displayMatrix(ArrayList<String[]> matrice1) {
        System.out.println(matrice1.toString());
    }

}
