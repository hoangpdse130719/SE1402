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

    public static long cF(int n) {
        if (n < 0 || n > 15) {
            throw new IllegalArgumentException("Sorry, n must be >=0");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return cF(n - 1) * n;
        //phô diễn, tối ưu code = thuật toán đệ quy

//        long product = 1;
//        for (int i = 1; i <= n; i++) {
//            product *= i;
//        }
//        return product;
    }

}
