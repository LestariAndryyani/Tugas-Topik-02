package no1;

import java.util.ArrayList;

class Buku{
    private String isbn;
    private String judulBuku;
    private String pengarang;
    private int tahunTerbit;
    private int harga;
    private float rating;

    Buku(String isbn, String judulBuku, String pengarang, int tahunTerbit, int harga, float rating){
        this.isbn = isbn;
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
        this.rating = rating;
    }

    String getIsbn(){
        return isbn;
    }

    String getJudulBuku(){
        return judulBuku;
    }

    void setJudulBuku(String judulBuku){
        this.judulBuku = judulBuku;
    }

    String getPengarang(){
        return pengarang;
    }

    void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    int getTahunTerbit(){
        return tahunTerbit;
    }

    void setTahunTerbit(int tahunTerbit){
        this.tahunTerbit = tahunTerbit;
    }

    int getHarga(){
        return harga;
    }

    void setHarga(int harga){
        this.harga = harga;
    }

    float getRating(){
        return rating;
    }

    void setRating(float rating){
        this.rating = rating;
    }

    public void cariIsbn(String isbn){
        if(this.isbn.equalsIgnoreCase(isbn)){
            System.out.println(isbn+ " " + judulBuku + " " + pengarang + " " + tahunTerbit + " " + harga + " " + rating);
        }
    }

    public String toString(){
        return isbn + " " + judulBuku + " " + pengarang + " " + tahunTerbit + " " + harga + " " + rating;
    }

}

public class Main {
    public static void main(String[] args) {
        ArrayList<Buku> ApkBuku = new ArrayList<Buku>();

        ApkBuku.add(new Buku("978-01", "Mariposa", "Luluk HF", 2018, 99000, 5 ));
        ApkBuku.add(new Buku("978-02", "Dikta dan Hukum", "Rizka Pratiwi Utami", 2021, 99000, 5 ));

        ApkBuku.get(0).setJudulBuku("Mariposa Reborn");
        ApkBuku.get(0).setPengarang("Luluk HF");
        ApkBuku.get(0).setTahunTerbit(2019);
        ApkBuku.get(0).setHarga(100000);
        ApkBuku.get(0).setRating(4);

        System.out.println("Tampilkan semua buku");
        for(Buku apkbuku:ApkBuku){
            System.out.println( apkbuku.getIsbn() + " " + apkbuku.getJudulBuku() + " " + apkbuku.getPengarang() + " " + apkbuku.getTahunTerbit() +
            " " + apkbuku.getHarga() + " " + apkbuku.getRating());
        }

        System.out.println();

        System.out.println("Tampilkan salah satu buku menurut isbn:");
        for (Buku apkbuku:ApkBuku){
            apkbuku.cariIsbn("978-01");
        }

        System.out.println();

        System.out.println("Tampilankan buku setelah dihapus:");
        ApkBuku.remove(0);
        for (Buku apkbuku:ApkBuku){
            System.out.println(apkbuku);
        }

    }
}
