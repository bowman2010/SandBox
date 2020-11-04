/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

import java.util.HashMap;


/**
 *
 * @author bowman
 */
public class Morse {
    private static HashMap <String, String> MorseMap;

    
    public static void main(String[] args) {
        Morse m1 = new Morse();
        m1.encode("Hello How are you");
    }

    
    
    public Morse() {
        Morse.MorseMap = new HashMap <>();
        populateMap();
    }
    
    private void encode(String message) {
        String mcode; 
        
        String s = message.toLowerCase();
        for (int i=0; i<s.length(); i++) {
            String t = s.substring(i, i+1);
            mcode = MorseMap.get(t);
            System.out.print(mcode+"   ");
        }
        System.out.println("");
    }
    
    private void populateMap() {
        MorseMap.put(" ", "[__]");

        MorseMap.put("a", ".-");
        MorseMap.put("b", "-...");
        MorseMap.put("c", "-.-.");
        MorseMap.put("d", "-..");
        MorseMap.put("e", ".");
        MorseMap.put("f", "..-.");
        MorseMap.put("g", "--.");
        MorseMap.put("h", "....");
        MorseMap.put("i", "..");
        MorseMap.put("j", ".---");
        MorseMap.put("k", "-.-");
        MorseMap.put("l", ".-..");
        MorseMap.put("m", "--");
        MorseMap.put("n", "-.");
        MorseMap.put("o", "---");
        MorseMap.put("p", ".--.");
        MorseMap.put("q", "--.-");
        MorseMap.put("r", ".-.");
        MorseMap.put("s", "...");
        MorseMap.put("t", "-");
        MorseMap.put("u", "..-");
        MorseMap.put("v", "...-");
        MorseMap.put("w", ".--");
        MorseMap.put("x", "-..-");
        MorseMap.put("y", "-.--");
        MorseMap.put("", "");

        MorseMap.put("1", ".----");
        MorseMap.put("2", "..---");
        MorseMap.put("3", "...--");
        MorseMap.put("4", "....-");
        MorseMap.put("5", ".....");
        MorseMap.put("6", "-....");
        MorseMap.put("7", "--...");
        MorseMap.put("8", "---..");
        MorseMap.put("9", "----.");
        MorseMap.put("0", "-----");
        
        
    }

}
