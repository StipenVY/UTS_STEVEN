/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lingkaran;

/**
 *
 * @author sanda
 */
public class Lingkaran {
    double phi = 3.141592;
    
    void hitungLuas(double r){
        double luas = phi * r * r;
        
        System.out.println("Luas lingkaran bilangan pecahan: " + luas);
        System.out.println("Luas lingkaran bilangan bulat: " + (int)luas);
        System.out.println("Luas lingkaran pembulatan: " + Math.round(luas));
    }
}
