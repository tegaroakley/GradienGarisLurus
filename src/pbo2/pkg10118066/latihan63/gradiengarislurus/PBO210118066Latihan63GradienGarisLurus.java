/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan63.gradiengarislurus;

/**
 *
 * @author
 * NAMA    : Tegar Lucky'q Oakley
 * KELAS   : IF 2
 * NIM     : 10118066
 */
public class PBO210118066Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat koor = new Koordinat(2,10,5,7);
        Koordinat koor2 = new Koordinat(5, 1, 3, 12);
        System.out.println("Garis yang melalui titik (2,10) dan (5,7) memiliki gradien sebesar "+koor.hitungGradien());
        System.out.println("Garis yang melalui titik (5,1) dan (3,12) memiliki gradien sebesar "+koor2.hitungGradien());
                
    }
    
}
