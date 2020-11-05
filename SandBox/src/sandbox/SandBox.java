/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

/*
 *
 * @author bowman
 */
public class SandBox {
    
    public static String frmtNumber(double n) {
        String s = String.format("%5.8f", n);
        StringBuilder sb=new StringBuilder(s);
        int i = sb.length()-1;
        while (sb.charAt(i)=='0') {
            sb.replace(i, i+1, " ");
            i--;
        }
        if (sb.charAt(i)=='.')
            sb.replace(i, i+1, " ");
            
        return sb.toString();
    }

    public static void main(String[] args) {
        double dblTotal = 2;
        System.out.println(frmtNumber(dblTotal) ); 
    }
    
}
