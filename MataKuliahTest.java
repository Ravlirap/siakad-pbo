import java.util.Scanner;

public class MataKuliahTest {
    public static void main(String[] args) {
        MataKuliah[] daftarMK = {
            new MataKuliah("TIP2301", "Bahasa Inggris", 2, "22", "Selasa, 10:50 s.d 14:50 @Ruang Kuliah A"),
            new MataKuliah("TIP4301", "Internet Of Things", 3, "22", "Selasa 10.00 s.d 13.30 @LAB.IOT, Jumat 13.50 s.d 15:30 @Ruang 605"),
            new MataKuliah("TIP4302", "Metode Numerik", 3, "22", "Selasa, 07:30 s.d 10:50 @Ruang 409"),
            new MataKuliah("TIU2301", "Proyek 2", 3, "22", "Rabu 14:20 s.d 16:00 @Ruang 502, Jumat 07:30 s.d 10:50 @LAB.IOT"),
            new MataKuliah("TIU3301", "Administrasi Sistem dan Jaringan Komputer", 3, "22", "Rabu 07:30 s.d 10:00 @LAB.JARKOM, Kamis 07:30 s.d 09:10 @Ruang 604"),
            new MataKuliah("TIU3302", "Pemrograman Berorientasi Objek", 3, "22", "Senin 10:00 s.d 13:30 @LAB.PEMROGRAMAN, Selasa 14:20 s.d 16:00 @Ruang 501"),
            new MataKuliah("TIU3303", "Pemrograman Web Lanjut", 3, "22", "Senin 07:30 s.d 09:10, Rabu 10:00 s.d 13:30 @LAB.PEMROGRAMAN")
        };

        Scanner input = new Scanner(System.in);

        // Pilih mata kuliah
        System.out.print("Pilih nomor mata kuliah (1-7): ");
        int pilihan = input.nextInt();
        input.nextLine(); // clear buffer enter

        if (pilihan >= 1 && pilihan <= daftarMK.length) {
            // Pilih atribut apa yang mau ditampilkan
            System.out.print("Mau tampilkan apa? (kode/nama/sks/kelas/jadwal/all): ");
            String atribut = input.nextLine();

            // Panggil method show dengan parameter
            daftarMK[pilihan - 1].show(atribut);
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}
