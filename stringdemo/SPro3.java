/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringdemo;

/**
 *
 * @author admin
 */
public class SPro3 {

    public static String capitalizeWord(String str) {
        String words[] = str.split("\\s");
        String capitalize = "";
        for (String w : words) {
            String first = w.substring(0,1);
            String afterfirst = w.substring(1);
            capitalize += first.toUpperCase() + afterfirst.toLowerCase();
        }
        return capitalize.trim();
    }

    public static void main(String[] args) {
        System.out.println(SPro3.capitalizeWord("mine name  is khan"));
        //System.out.println(SPro3.capitalizeWord("i am sonoo jaiswal"));
    }
}
