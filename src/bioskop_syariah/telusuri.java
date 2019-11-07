/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioskop_syariah;

/**
 *
 * @author ASUS
 */


public class telusuri {

    int k0 = 1;
    int k1 = 1;
    int k2 = 1;

    int l0 = 0;
    int l1 = 0;
    int l2 = 0;

    int p0 = 0;
    int p1 = 0;
    int p2 = 0;
    
    int nomor = 0;
    HasingApp thehash = new HasingApp();
    
    public int buatnomor(String film, int key, int size, int kategori) {
        switch (film) {
            case "A":
                if (key == 0) {
                    if (k0 == size + 1) {
//     System.out.println("kursi pada bioskop 0 full!");
                    } else {
                        nomor = key + k0 * kategori;
                        k0++;
                    }
                } else if (key == 1) {
                    if (l0 == size) {
//System.out.println("kursi pada bioskop 0 full!");
                    } else {
                        nomor = key + l0 * kategori;
                        l0++;
                    }
                } else if (key == 2) {
                    if (p0 == size) {
//System.out.println("kursi pada bioskop 0 full!");
                    } else {
                        nomor = key + p0 * kategori;
                        p0++;
                    }
                }
                break;
            case "B":
                if (key == 0) {
                    if (k1 == size + 1) {
// System.out.println("kursi pada bioskop 1 full!");
                    } else {
                        nomor = key + k1 * kategori;
                        k1++;
                    }
                } else if (key == 1) {
                    if (l1 == size) {
//  System.out.println("kursi pada bioskop 1 full!");
                    } else {
                        nomor = key + l1 * kategori;
                        l1++;
                    }
                } else if (key == 2) {
                    if (p1 == size) {
                        //System.out.println("kursi pada bioskop 1 full!");
                    } else {
                        nomor = key + p1 * kategori;
                        p1++;
                    }
                }
                break;

            case "C":
                if (key == 0) {
                    if (k2 == size + 1) {
//  System.out.println("kursi pada bioskop 2 full!");
                    } else {
                        nomor = key + k2 * kategori;
                        k2++;
                    }
                } else if (key == 1) {
                    if (l2 == size) {
//System.out.println("kursi pada bioskop 2 full!");
                    } else {
                        nomor = key + l2 * kategori;
                        l2++;
                    }
                } else if (key == 2) {
                    if (p2 == size) {
//System.out.println("kursi pada bioskop 2 full!");
                    } else {
                        nomor = key + p2 * kategori;
                        p2++;
                    }
                }

                break;
        }
        return nomor;
    }
}
