/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.regx;

import java.util.Scanner;

//class MyRegex{
//  String pattern ="^[a-zA-Z0-9._]+@[a-zA-Z0-9.]+\\.[a-zA-Z]{2,4}$";
//}
class MyRegex{
//  String pattern ="^[7-9]{1}+[0-9]{9}$";
   String pattern="^((25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])$";
  
  
}

public class VaildEmail {
    public static void main(String[] args) {
//  String sa="Pawan";
  
        MyRegex r=new MyRegex();
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                String s=sc.next();
//          sa.charAt(0)
System.out.println(s.matches(r.pattern));
            }
        }
    }
    
}
