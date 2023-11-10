/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package idamusdalifah;

import java.util.Scanner;

public class day33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jari-jari lingkaran: ");
        double radius = scanner.nextDouble();
        
        double area = Math.PI * radius * radius;
        
        System.out.println("Luas lingkaran: " + area);
    }
}

    

