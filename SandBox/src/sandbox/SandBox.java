/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

import FvpLib.Utils;

/**
 *
 * @author bowman
 */

public class SandBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double val[] = {
            333.97872,
            1343.44,
            999999.1333342
       
        };
        
        for (int i=0; i<val.length; i++) {
            System.out.println(Utils.dotAligned(8, 3, val[i]));
        }  
    }
    
}
