/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.fptpolytechnic.java19318buoi3;

/**
 *
 * @author syn
 */
public class ToanTu3Ngoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int a = 1, b = 2 , c = 4, d = 5;
        // a > b là sai, thì b sẽ được trả về
        int kq1 = a > b ? a : b;
        // c < d là đúng, thì c sẽ được trả về
        int kq2 = c < d ? c : d;
        System.out.println(kq1);
        System.out.println(kq2);
    }
}
