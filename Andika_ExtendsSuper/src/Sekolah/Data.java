/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sekolah;

/**
 *
 * @author Andika Dewa
 */
//extends class Main
public class Data extends Main{

    //Jenis variabel
    String nama;
    String kelas;
    int absen;

    void nama() {
        System.out.println("------------------");
        this.nama = "ANDIKA DEWA";
        System.out.println("Nama : " + nama);
    }

    void kelas() {
        System.out.println("------------------");
        this.kelas = "X";
        System.out.println("Kelas : " + kelas);
    }

    void absen() {
        System.out.println("------------------");
        this.absen = 6;
        System.out.println("Nomor Absen : " + absen);
        System.out.println("------------------");
    }
}
