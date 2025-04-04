import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Film tanımlamaları
        Film[] filmler = new Film[5];
        filmler[0] = new Film("Matrix", 136, "Aksiyon, Bilim Kurgu");
        filmler[1] = new Film("Oppenheimer", 180, "Biyografik, Gerilim");
        filmler[2] = new Film("Interstellar", 159, "Bilim Kurgu");
        filmler[3] = new Film("Godfather", 175, "Suç, Drama");
        filmler[4] = new Film("Batman Kara Şövalye", 152, "Aksiyon, Suç, Drama");

        // Müşteri tanımlamaları
        Musteri[] musteriler = new Musteri[20];
        musteriler[0] = new Musteri("Ali Erdal", "erdalali35@gmail.com");
        musteriler[1] = new Musteri("Buse Menekşe", "busemnks@gmail.com");
        musteriler[2] = new Musteri("Yusuf Torun", "yyusufttrun@gmail.com");
        musteriler[3] = new Musteri("Berker Yılmaz", "brkerylmz47@gmail.com");
        musteriler[4] = new Musteri("İnci Özilhan", "incozilhn26@gmail.com");
        musteriler[5] = new Musteri("Arif Kocabıyık", "arrrifkocbyk@gmail.com");
        musteriler[6] = new Musteri("Sedef Peri", "ssedfpri@gmail.com");
        musteriler[7] = new Musteri("Kaan Erdem", "kaanerdemm@gmail.com");
        musteriler[8] = new Musteri("Mehmet Demir", "dmrmehmt@gmail.com");
        musteriler[9] = new Musteri("Asya Kızıl", "asyakzl@gmail.com");

        // Bilet Kaydı
        Bilet[] biletler = new Bilet[10];
        biletler[0] = new Bilet(musteriler[0], filmler[1]); // Ali Erdal - Oppenheimer
        biletler[1] = new Bilet(musteriler[1], filmler[2]); // Buse Menekşe - Interstellar
        biletler[2] = new Bilet(musteriler[2], filmler[0]); // Yusuf Torun - Matrix
        biletler[3] = new Bilet(musteriler[3], filmler[3]); // Berker Yılmaz - Godfather
        biletler[4] = new Bilet(musteriler[4], filmler[4]); // İnci Özilhan - Batman Kara Şövalye
        biletler[5] = new Bilet(musteriler[5], filmler[0]); // Arif Kocabıyık - Matrix
        biletler[6] = new Bilet(musteriler[6], filmler[1]); // Sedef Peri - Oppenheimer
        biletler[7] = new Bilet(musteriler[7], filmler[2]); // Kaan Erdem - Interstellar
        biletler[8] = new Bilet(musteriler[8], filmler[3]); // Mehmet Demir - Godfather
        biletler[9] = new Bilet(musteriler[9], filmler[4]); // Asya Kızıl - Batman Kara Şövalye

        // Kullanıcıdan film adı al ve arama yap
        System.out.println("Aramak istediğiniz film adını girin:");
        String filmAdi = scanner.nextLine();

        boolean filmBulundu = false;
        for (Film film : filmler) {
            if (film.ad.equalsIgnoreCase(filmAdi)) {
                film.bilgileriGoster();
                filmBulundu = true;
                break;
            }
        }

        if (!filmBulundu) {
            System.out.println("Film bulunamadı.");
        }

        // Kullanıcıdan müşteri adı al ve arama yap
        System.out.println("\nAramak istediğiniz müşteri adını girin:");
        String musteriAdi = scanner.nextLine();

        boolean musteriBulundu = false;
        for (Musteri musteri : musteriler) {
            if (musteri.ad.equalsIgnoreCase(musteriAdi)) {
                musteri.bilgileriGoster();
                System.out.println("Bu müşteri, aşağıdaki filmler için bilet almış:");

                boolean biletBulundu = false;
                for (Bilet bilet : biletler) {
                    if (bilet.musteri.ad.equalsIgnoreCase(musteriAdi)) {
                        System.out.println("Film: " + bilet.film.ad);
                        biletBulundu = true;
                    }
                }

                if (!biletBulundu) {
                    System.out.println("Bilet Almadı");
                }
                musteriBulundu = true;
                break;
            }
        }

        if (!musteriBulundu) {
            System.out.println("Müşteri bulunamadı.");
        }

        scanner.close();
    }
}
