/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

/**
 *
 * @author bowman
 */
public class Pgcd_Euclide {
    
    public static int pgcd(int a, int b) {
        int n=a;
        if (a<b) { a=b; b=n; }
        
        int quotien = Math.floorDiv(a, b);
        int reste = a%b;
        if (reste!=0) return pgcd(reste,b);
        return b;
    }
    
    public static void main(String[] args) {
        int p=pgcd(21,15);
        System.out.println("PGCD="+p);
    }
    
}
