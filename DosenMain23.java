public class DosenMain23 {
    public static void main(String[] args) {
        Dosen23 d1 = new Dosen23();
        d1.idDosen = "D001";
        d1.nama = "Budi Santoso";
        d1.statusAktif = true;
        d1.tahunBergabung = 2015;
        d1.bidangKeahlian = "Pemrograman";
        Dosen23 d2 = new Dosen23("D002", "Siti Aminah", true, 2018, "Basis Data");
        System.out.println("Informasi Awal:");
        d1.tampilInformasi();
        d2.tampilInformasi();
        d1.setStatusAktif(false);
        d1.ubahKeahlian("Artificial Intelligence");
        int masaKerja1 = d1.hitungMasaKerja(2025);
        d2.setStatusAktif(true);
        d2.ubahKeahlian("Jaringan Komputer");
        int masaKerja2 = d2.hitungMasaKerja(2025);
        System.out.println("Masa Kerja Dosen 1: " + masaKerja1 + " tahun");
        System.out.println("Masa Kerja Dosen 2: " + masaKerja2 + " tahun");
        System.out.println("\nSetelah Perubahan:");
        d1.tampilInformasi();
        d2.tampilInformasi();
    }
}