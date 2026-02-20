public class matakuliahmain23 {
    public static void main(String[] args) {
        matakuliah23 mk1 = new matakuliah23();
        mk1.kodeMK = "IF101";
        mk1.nama = "Pemrograman Dasar";
        mk1.sks = 3;
        mk1.jumlahJam = 6;
        matakuliah23 mk2 = new matakuliah23("IF202", "Struktur Data", 3, 6);
        System.out.println("Informasi Awal:");
        mk1.tampilInformasi();
        mk2.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(1);
        mk2.ubahSKS(2);
        mk2.tambahJam(1);
        mk2.kurangiJam(1);
        System.out.println("Setelah Perubahan:");
        mk1.tampilInformasi();
        mk2.tampilInformasi();
    }
}