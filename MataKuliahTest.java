public class MataKuliahTest {

    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah("TIP2301", "Bahasa Inggris", 2, "22", "Selasa, 10:50 s.d 14:50 @Ruang Kuliah A");
        MataKuliah mk2 = new MataKuliah("TIP4301", "Internet Of Things", 3, "22", "Selasa 10.00 s.d 13.30 @LAB.IOT, Jumat 13.50 s.d 15:30 @Ruang 605");
        MataKuliah mk3 = new MataKuliah("TIP4302", "Metode Numerik", 3, "22", "Selasa, 07:30 s.d 10:50 @Ruang 409 ");
        MataKuliah mk4 = new MataKuliah("TIU2301", "Proyek 2", 3, "22", "Rabu 14:20 s.d 16:00 @Ruang 502, Jumat 07:30 s.d 10:50 @LAB.IOT");
        MataKuliah mk5 = new MataKuliah("TIU3301", "Adiministrasi Sistem dan Jaringan Komputer", 3, "22", "Rabu 07:30 s.d 10:00 @LAB.JARKOM, Kamis 07:30 s.d 09:10 @Ruang 604");
        MataKuliah mk6 = new MataKuliah("TIU3302", "Pemrograman Berorientasi Objek", 3, "22", "Senin 10:00 s.d 13:30 @LAB.PEMROGRAMAN, Selasa 14:20 s.d 16:00 @Ruang 501");
        MataKuliah mk7 = new MataKuliah("TIU3303", "Pemrograman Web Lanjut", 3, "22", "Senin 07:30 s.d 09:10, Rabu 10:00 s.d 13:30 @LAB.PEMROGRAMAN");

        // Menampilkan semua atribut sekaligus
        mk1.showMataKuliah();
        mk2.showMataKuliah();
        mk3.showMataKuliah();
        mk4.showMataKuliah();
        mk5.showMataKuliah();
        mk6.showMataKuliah();
        mk7.showMataKuliah();
    }
    
}
