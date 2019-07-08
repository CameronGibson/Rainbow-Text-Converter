/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colortexttest;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Cameron Gibson
 */
public class ColorTextTest {

    public static String myText;
    public static int counter, counterTwo;
    public char letter;
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static ArrayList<String> colorArray;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter text that you would like ot convert"
                + " to rainbow!\n");
        Scanner s = new Scanner(System.in);
        myText = s.nextLine();
        colorArray = new ArrayList<>();        
        loadArray(colorArray);
        char space = ' ';
        StringBuilder str = new StringBuilder();
        for (counter = 0; counter < myText.length(); counter++) {
            if (counter > myText.length()) {
                counter = 0;
            } else {
                if (counterTwo < colorArray.size()) {
                    char letter = myText.charAt(counter);
                    if (letter == space) {    
                        str.append(space);
                    } else {
                        String color = colorArray.get(counterTwo);
                        str.append(color + letter);
                        counterTwo++;
                    }
                } else {
                    counterTwo = 0;
                    char letter = myText.charAt(counter);
                    String color = colorArray.get(counterTwo);
                    str.append(color + letter);
                }
            }
        }
        String result = str.toString();
        System.out.println(result);  
    }
    public static ArrayList loadArray(ArrayList colorArray) {
        colorArray.add(RED);
        colorArray.add(GREEN);
        colorArray.add(YELLOW);
        colorArray.add(BLUE);
        colorArray.add(PURPLE);
        colorArray.add(CYAN);
        return colorArray;
    }
}
