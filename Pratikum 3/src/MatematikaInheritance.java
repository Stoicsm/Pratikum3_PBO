public class MatematikaInheritance {
    public static void main(String[] args) {
        // Membuat objek dari kelas Matematika
        Matematika matematika = new Matematika();
        Matematika2 matematika2 = new Matematika2();

        // Menggunakan metode dari objek Matematika
        int hasilPertambahan = matematika.pertambahan(20, 10);
        int hasilPengurangan = matematika.pengurangan(10, 5);
        int hasilPerkalian = matematika.perkalian(10, 3);
        int hasilPembagian = matematika.pembagian(21, 2);
        int hasilModulus = matematika2.modulus(10, 3);

        // Menampilkan hasil
        System.out.println("Pertambahan : 20 + 10 = " + hasilPertambahan);
        System.out.println("Pengurangan : 10 - 5 = " + hasilPengurangan);
        System.out.println("Perkalian : 10 * 3 = " + hasilPerkalian);
        System.out.println("Pembagian : 21 / 2 = " + hasilPembagian);
        System.out.println("Modulus : 10 % 3 = " + hasilModulus);
    }
}
