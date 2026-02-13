/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA.String.Easy;

/**
 *
 * @author pt349
 */
public class FirstNonRepeatingChar {

    public static void main(String[] args) {
        String s = "swiss";

        int[] freq = new int[256];

        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        // Find first non-repeating
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                System.out.println("First Non-Repeating Character: " + s.charAt(i));
                return;
            }
        }

        System.out.println("No non-repeating character found");
    }
}
