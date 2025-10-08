import java.util.Scanner;

public class kelulusanSemester {
    public static void main(String[] args) {
        Scanner mawo = new Scanner(System.in);
        String nama;
        char ulang;
        int nim, mataKuliah, uts, uas, tugas;
        double rata1=0, rata2=0;
        boolean status1 = false, status2 = false;
        
        System.out.print("Masukkan nama = ");
        nama = mawo.nextLine();
        System.out.print("Masukkan nim = ");
        nim = mawo.nextInt();
    do { 
        System.out.println("Pilih Mata Kuliah:");
        System.out.println("1. Algoritma dan Pemograman ");
        System.out.println("2. Struktur Data");
        System.out.print("Masukkan pilihan (1/2): ");
        mataKuliah = mawo.nextInt();

        switch(mataKuliah){
            case 1:
            System.out.println("Berapa nilai uts = ");
            uts = mawo.nextInt();
            System.out.println("Berapa nilai uas = ");
            uas = mawo.nextInt();
            System.out.println("Berapa nilai tugas = ");
            tugas = mawo.nextInt();
            rata1 = (uts+uas+tugas)/3;
            System.out.println("rata rata anda = "+rata1);
            status1 = true;
            
            break;

            case 2:
            System.out.println("Berapa nilai uts = ");
            uts = mawo.nextInt();
            System.out.println("Berapa nilai uas = ");
            uas = mawo.nextInt();
            System.out.println("Berapa nilai tugas = ");
            tugas = mawo.nextInt();
            rata2 = (uts+uas+tugas)/3;
            System.out.println("rata rata anda = "+rata2);
            status2 = true;
            break;
            default:
                    System.out.println("Pilihan tidak valid!");
            
        }   
        System.out.print("Masukkan nilai matkul lain? (y/n): ");
            ulang = mawo.next().charAt(0);
    } while (ulang == 'y' || ulang == 'Y');
        
        System.out.println("\n=== HASIL AKHIR ===");
        System.out.println("Nama Mahasiswa = " +nama);
        System.out.println("NIM Mahasiswa = "+nim);
        if (status1) System.out.println("Rata rata Mata Kuliah 1 (Algoritma dan Pemograman) = " + rata1);
        if (status2) System.out.println("Rata rata Mata Kuliah 2 (Struktur Data) = " + rata2);

        if (status1 && status2 && rata1 >= 70 && rata2 >= 70) {
            System.out.println("Status = LULUS");
        } else {
            System.out.println("Status = TIDAK LULUS");
        }

        System.out.println("===========================");

        
    }
}
