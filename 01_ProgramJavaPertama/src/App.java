public class App {
    public static void main(String[] args) throws Exception {
        // Program Biodata Mahasiswa
        // deklarasi variable
        String nama;
        String nim;
        String tgl_lahir;
        String alamat;
        float berat_badan;
        float tinggi_badan;

        // mengisi variable
        nama = "Nabila";
        nim = "23241056";
        tgl_lahir = "21 Februari 2005";
        alamat = "Mataram No. 33";
        berat_badan = 56.3f;
        tinggi_badan = 163.4f;

        // cetak Biodata
        System.out.println("==========================");
        System.out.println("Nama : "+ nama);
        System.out.println("NIM : " + nim);
        System.out.println("Tanggal lahir : " + tgl_lahir);
        System.out.println("Alamat : " + alamat);
        System.out.println("berat badan : " + berat_badan);
        System.out.println("tinggi badan : " + tinggi_badan);
        System.out.println("==========================");
    }
}
