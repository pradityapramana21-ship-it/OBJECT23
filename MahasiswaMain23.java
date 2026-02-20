public class MahasiswaMain23 {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;
        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();
        Mahasiswa mhs2 = new Mahasiswa("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();
        System.out.println("Evaluasi Kinerja: " + mhs1.nilaiKinerja());
    }
}
class Mahasiswa {
    String nim;
    String nama;
    String kelas;
    double ipk;
    public Mahasiswa() {
    }
    public Mahasiswa(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
    void tampilkanInformasi() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
        System.out.println("----------------------");
    }
    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }
    void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
            System.out.println("IPK berhasil diperbarui menjadi: " + ipk);
        } else {
            System.out.println("IPK tidak valid.");
        }
    }
    String nilaiKinerja() {
        if (ipk >= 3.5) return "Kinerja sangat baik";
        else if (ipk >= 3.0) return "Kinerja baik";
        else if (ipk >= 2.0) return "Kinerja cukup";
        else return "Kinerja kurang";
    }
}