public class matakuliah23 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;
    public matakuliah23() {
    }
    public matakuliah23(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    public void tampilInformasi() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama MK: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
        System.out.println("-------------------");
    }
    public void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }
    public void tambahJam(int jam) {
        jumlahJam += jam;
    }
    public void kurangiJam(int jam) {
        jumlahJam -= jam;
}
}