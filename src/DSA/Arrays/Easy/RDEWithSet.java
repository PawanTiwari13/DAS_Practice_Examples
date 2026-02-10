/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA.Arrays.Easy;

import java.util.HashSet;

/**
 *
 * @author pt349
 */
public class RDEWithSet {

    public void removeDuplicate(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int integer : arr) {
            set.add(integer);
        }
        System.out.println(set);
    }

    public static void main(String[] args) {
        int arr[] = {9, 5, 1, 7, 3, 8, 2, 5, 4, 10, 6};
        RDEWithSet r = new RDEWithSet();
        r.removeDuplicate(arr);
    }

}
