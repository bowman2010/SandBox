/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix01;

/**
 *
 * @author bowman
 */
public class Matrix01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MatrixException {
        Matrix m1 = new Matrix(2, 2);
        m1.setLC(1, 1,3);
        m1.setLC(1, 2, 8);
        m1.setLC(2, 1, 4);
        m1.setLC(2, 2, 1);
        
        Matrix m2 = new Matrix(2, 2);
        m2.setLC(1, 1,1);
        m2.setLC(1, 2, 0);
        m2.setLC(2, 1, 0);
        m2.setLC(2, 2, 1);
        
        Matrix m3 = m1.multiply(m2);
        
        m1.dump();
        System.out.println("");
        m2.dump();
        System.out.println("");
        m3.dump();
    }
    
}
