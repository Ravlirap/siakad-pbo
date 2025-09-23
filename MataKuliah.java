public class MataKuliah {
    public String kodeMatkul;
    public String namaMatkul;
    public int SKS;
    public String namaKelas;
    public String jadwal;

    public MataKuliah(String kodeMatkul, String namaMatkul, int SKS, String namaKelas, String jadwal) {
        this.kodeMatkul = kodeMatkul;
        this.namaMatkul = namaMatkul;
        this.SKS = SKS;
        this.namaKelas = namaKelas;
        this.jadwal = jadwal;
    }

    // Method tampilkan semua atribut
    public void showMataKuliah() {
        System.out.println("===== Data Mata Kuliah =====");
        System.out.println("Kode Mata Kuliah : " + this.kodeMatkul);
        System.out.println("Nama Mata Kuliah : " + this.namaMatkul);
        System.out.println("Jumlah SKS       : " + this.SKS);
        System.out.println("Nama Kelas       : " + this.namaKelas);
        System.out.println("Jadwal Kuliah    : " + this.jadwal);
    }

    // Method tampilkan berdasarkan pilihan
    public void show(String pilihan) {
        switch (pilihan.toLowerCase()) {
            case "kode":
                System.out.println("Kode Mata Kuliah : " + this.kodeMatkul);
                break;
            case "nama":
                System.out.println("Nama Mata Kuliah : " + this.namaMatkul);
                break;
            case "sks":
                System.out.println("Jumlah SKS       : " + this.SKS);
                break;
            case "kelas":
                System.out.println("Nama Kelas       : " + this.namaKelas);
                break;
            case "jadwal":
                System.out.println("Jadwal Kuliah    : " + this.jadwal);
                break;
            case "all":
                this.showMataKuliah();
                break;
            default:
                System.out.println("Pilihan tidak valid. Gunakan: kode, nama, SKS, kelas, jadwal, all");
        }
    }
}
