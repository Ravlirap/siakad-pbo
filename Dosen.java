public class Dosen{
    
    public String nama;
    public String nip;
    public String fungsional;

    public Dosen(String nama, String nip ,String fungsional){
        this.nama = nama;
        this.nip = nip;
        this.fungsional = fungsional;
    }

    public void showDosen(){
        System.out.println("Nama Dosen       : " + this.nama);
        System.out.println("NIP Dosen        : " + this.nip);
        System.out.println("Fungsional Dosen : " + this.fungsional);
    }
}