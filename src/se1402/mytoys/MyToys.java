/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1402.mytoys;

/**
 *
 * @author phamduchoang
 */
public class MyToys {

    public static String Xl(int n) {
        if (n==0) {
            return "NGU";
        }
        if (n>0&&n<=5) {
            return "TRUNGBINH";
        }if (n>5&&n<=10) {
            return "GIOI";
        }
        return "Please try again";
    }

}
