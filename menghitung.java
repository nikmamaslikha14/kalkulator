/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANI
 */
public class menghitung {
     public static void main(String[] args){
        double Penambahan;
        double Pengurangan;
        double Perkalian;
        double Pembagian;

        kalkulator kalkulator = new kalkulator();
        Penambahan = kalkulator.getPenambahan(100,50);
        Pengurangan = kalkulator.getPengurangan(96,67);
        Perkalian = kalkulator.getPerkalian(30,70);
        Pembagian = kalkulator.getPembagian(456,2);
        System.out.println(" Maka Hasil penambahan Yaitu "+Penambahan);
        System.out.println(" Maka Hasil pengurangan Yaitu "+Pengurangan);
        System.out.println(" Maka Hasil perkalian Yaitu "+Perkalian);
        System.out.println(" Maka Hasil pembagian Yaitu "+Pembagian);

    }

}

