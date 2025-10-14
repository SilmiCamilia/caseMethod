import java.util.Scanner;

public class kelulusanSemester {
    public static void main(String[] args) {
        Scanner mawo = new Scanner(System.in);
        String nama;
        int nim, uts, uas, tugas;
        double rata1 = 0, rata2 = 0;

        System.out.print("Masukkan nama = ");
        nama = mawo.nextLine();
        System.out.print("Masukkan NIM = ");
        nim = mawo.nextInt();

        System.out.println("\nMata Kuliah 1: Algoritma dan Pemrograman");
        System.out.print("Berapa nilai UTS = ");
        uts = mawo.nextInt();
        System.out.print("Berapa nilai UAS = ");
        uas = mawo.nextInt();
        System.out.print("Berapa nilai Tugas = ");
        tugas = mawo.nextInt();

        rata1 = (uts + uas + tugas) / 3.0;
        System.out.println("Rata-rata anda = " + rata1);

        if (rata1 >= 85) {
            System.out.println("Status Mata Kuliah: Lulus dengan Pujian");
        } else if (rata1 >= 70) {
            System.out.println("Status Mata Kuliah: Lulus");
        } else if (rata1 >= 50) {
            System.out.println("Status Mata Kuliah: Remedial");
        } else {
            System.out.println("Status Mata Kuliah: Tidak Lulus");
        }

  
        System.out.println("\nMata Kuliah 2: Struktur Data");
        System.out.print("Berapa nilai UTS = ");
        uts = mawo.nextInt();
        System.out.print("Berapa nilai UAS = ");
        uas = mawo.nextInt();
        System.out.print("Berapa nilai Tugas = ");
        tugas = mawo.nextInt();

        rata2 = (uts + uas + tugas) / 3.0;
        System.out.println("Rata-rata anda = " + rata2);

        if (rata2 >= 85) {
            System.out.println("Status Mata Kuliah: Lulus dengan Pujian");
        } else if (rata2 >= 70) {
            System.out.println("Status Mata Kuliah: Lulus");
        } else if (rata2 >= 50) {
            System.out.println("Status Mata Kuliah: Remedial");
        } else {
            System.out.println("Status Mata Kuliah: Tidak Lulus");
        }


        System.out.println("\n=== HASIL AKHIR ===");
        System.out.println("Nama Mahasiswa = " + nama);
        System.out.println("NIM Mahasiswa = " + nim);
        System.out.println("Rata-rata Mata Kuliah 1 (Algoritma dan Pemrograman) = " + rata1);
        System.out.println("Rata-rata Mata Kuliah 2 (Struktur Data) = " + rata2);

        if (rata1 >= 70 && rata2 >= 70) {
            System.out.println("Status Akhir = LULUS");
        } else {
            System.out.println("Status Akhir = TIDAK LULUS");
        }

        System.out.println("===========================");
        mawo.close();
    }
}
