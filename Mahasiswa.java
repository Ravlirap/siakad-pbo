public class Mahasiswa {
    public String nama;
    public String nim;
    public String jurusan;
    public int umur;

    public Mahasiswa(String nama, String nim, String jurusan, int umur){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.umur = umur;
    }

    public void showMahasiswa(){
        System.out.println("Nama Mahasiswa : " + this.nama);
        System.out.println("NIM Mahasiswa : " + this.nim);
        System.out.println("Jurusan Mahasiswa : " + this.jurusan);
        System.out.println("Umur Mahasiswa : " + this.umur + " tahun");
    }
}
