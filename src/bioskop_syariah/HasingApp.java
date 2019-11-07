/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioskop_syariah;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Array {

    int[] Arr;
    int nElemen;
    int max;
    int Key;

    public Array(int size) {
        max = size;
        Arr = new int[max];
        nElemen = 0;
    }

    public void insert(int key) {
        if (nElemen == max) {
            return;
        } else {
            Arr[nElemen] = key;
            for (int i = 0; i < nElemen; i++) {
                for (int j = 0; j < nElemen; j++) {
                    if (Arr[nElemen] < Arr[j]) {
                        swep(nElemen, j);
                    }
                }
            }
            nElemen++;
        }
        Key = key;
    }
    public int getArr()
    {
        return Arr[1];
    }

    public void swep(int i, int j) {
        int temp = Arr[i];
        Arr[i] = Arr[j];
        Arr[j] = temp;

    }
    public void display() {
        for (int i = 0; i < nElemen; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println("");
    }
    public int Arr(int i)
    {
        return Arr[i];
    }
}

class Hashing {

    Array[] hashArr0;
    Array[] hashArr1;
    Array[] hashArr2;
    private int Kategori;
    private int Size;
    int K = 0;
    int k = 0;
    int L = 0;
    int l = 0;
    int P = 0;
    int p = 0;
    
    int jml = 0;
    
    App theBio = new App();

    public Hashing(int kategori, int size) {
        Kategori = kategori;
        Size = size;
        hashArr0 = new Array[Kategori];
        for (int i = 0; i < Kategori; i++) {
            hashArr0[i] = new Array(size);
        }
        hashArr1 = new Array[Kategori];
        for (int i = 0; i < Kategori; i++) {
            hashArr1[i] = new Array(size);
        }
        hashArr2 = new Array[Kategori];
        for (int i = 0; i < Kategori; i++) {
            hashArr2[i] = new Array(size);
        }
    }
    public int hashFunc(int key) {
        return key % Kategori;
    }

    public void insertHash(int key, Array[] hashArr) {
        int hashVal = hashFunc(key);
        hashArr[hashVal].insert(key);
    }

    public void displayTableA(Array[]hashArr) {
//        System.out.println("Table : ");
        for (int i = 0; i < Kategori; i++) {
            if (i == 0) {
                System.out.print(" Keluarga\t: ");
            } else if (i == 1) {
                System.out.print(" Laki-laki\t: ");
            } else if (i == 2) {
                System.out.print(" Perampuan\t: ");
            }
            for (int j = 0; j < Size; j++) {
                System.out.print(hashArr[i].Arr(j)+", ");
            }
            System.out.println("");
        }
    }
}

public class HasingApp {

    public static void main(String[] args) throws IOException {

        int kategori = 3;
        int size = 5;
        int nomor = 0;
        
        Hashing n = new Hashing(kategori, size);
        telusuri coba = new telusuri();
//        n.memilih(kategori, size);
//        n.TabelHash_A();
//        n.TabelHash_B();
//        n.TabelHash_C();
        while(1==1)
        {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String film = br.readLine();
            
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader kat = new BufferedReader(is);
            int key = Integer.parseInt(kat.readLine());
            
            nomor = coba.buatnomor(film, key, size, kategori);
            if(film == "A"){
                n.insertHash(nomor, n.hashArr0);
            }
            else if(film == "B"){
                n.insertHash(nomor, n.hashArr1);
            }
            else if(film == "C"){
                n.insertHash(nomor, n.hashArr1);
            }
        }
//        n.insertHash(1, n.hashArr0);
//        n.insertHash(2, n.hashArr0);
//        n.insertHash(3, n.hashArr0);
//        n.insertHash(4, n.hashArr0);
//        n.displayTableA(n.hashArr0);
    }
}
