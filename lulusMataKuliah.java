import java.util.Scanner;

public class lulusMataKuliah {
    public static void main(String[] args) {
        Scanner mimi = new Scanner(System.in);
        System.out.print("Berapakah nilai mahasiswa? = ");
        int nilai = mimi.nextInt();

        if(nilai==100||nilai>80){
            System.out.println("Nilai Huruf = A \nNilai Setara = 4 \nSangat Baik");
        }
        else if(nilai>73||nilai==80){
            System.out.println("Nilai Huruf = B+ \nNilai Setara = 3.5 \nLebih dari Baik");
        }
        else if(nilai>65||nilai==73){
            System.out.println("Nilai Huruf = B \nNilai Setara = 3 \nBaik");
        }
        else if(nilai>60||nilai==65){
            System.out.println("Nilai Huruf = C+ \nNilai Setara = 2.5 \nLebih dari Cukup");
        }
        else if(nilai>50||nilai==60){
            System.out.println("Nilai Huruf = C \nNilai Setara = 2 \nCukup");
        }
        else if(nilai>39||nilai==50){
            System.out.println("Nilai Huruf = D \nNilai Setara = 1 \nKurang");
        }
        else if(nilai<=32){
            System.out.println("Nilai Huruf = E \nNilai Setara = 0 \nGagal");
        }
    }
}
