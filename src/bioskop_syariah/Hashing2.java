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
public class Hashing2 {
    
    private Array[] hashArr;
    private int Kategori;
    private int Size;
    int K = 0;
    int k = 0;
    int L = 0;
    int l = 0;
    int P = 0;
    int p = 0;
    
    public Hashing2(int kategori, int size)
    {
        Kategori = kategori;
        Size = size;
        hashArr = new Array[Kategori];
        for (int i = 0; i < Kategori; i++) {
            hashArr[i] = new Array(size);
        }
    }
    public int hashFunc(int key)
    {
        return key%Kategori;
    }
    public void insertHash(int kategori)
    {
        int key = 0;
        
        if(kategori == 0)
        {
            while(K!=Size)
            {
                key = K*3+0;
                K++;
                int hashVal = hashFunc(key);
                hashArr[hashVal].insert(key);
                return;
            }
            System.out.println("Kategori Keluarga sudah penuh");
        }
        else if(kategori == 1)
        {
            while(L!=Size)
            {
                key = L*Kategori+kategori;
                L++;
                int hashVal = hashFunc(key);
                hashArr[hashVal].insert(key);
                return;
            }
            System.out.println("Kategori Laki-laki sudah penuh");
        }
        else if(kategori == 2)
        {
            while(P!=Size)
            {
                key = P*Kategori+kategori;
                P++;
                int hashVal = hashFunc(key);
                hashArr[hashVal].insert(key);
                return;
            }
            System.out.println("Kategori Perempuan sudah penuh");
        }
    }
    public void displayTable()
    {
        System.out.println("Table Tiket B: ");
        for (int i = 0; i < Kategori; i++) {
            if(i == 0)
                System.out.print(" Keluarga\t: ");
            else if(i == 1)
                System.out.print(" Laki-laki\t: ");
            else if(i == 2)
                System.out.print(" Perampuan\t: ");
            hashArr[i].display();
        }
    }
    public int print(int kategori)
    {
        int nomor = 0;
        System.out.print("Tiket Film B");
        if(kategori == 0)
        {
            if(k != Size){
                nomor = k*3+0;
                k++;
                System.out.print(" Keluarga no ");
            }
            else
            {
                
                System.out.println(" Keluarga habis");
            }
        }
        else if(kategori == 1)
        {
            if(l == Size)
                System.out.println(" Laki-laki habis");
            else
            {
                nomor = l*3+1;
                System.out.print(" Laki-laki no ");
            }
        }
        else if(kategori == 2)
        {
            if(p == Size)
                System.out.println(" Perempuan habis");
            else
            {
                nomor = p*3+2;
                System.out.print(" Perampuan no ");
            }
        }
        System.out.println(nomor);
        return nomor;
    }
}
