public class Film {
    String ad;
    int sure;
    String tur;

    public Film(String ad, int sure, String tur) {
        this.ad = ad;
        this.sure = sure;
        this.tur = tur;
    }

    public void bilgileriGoster() {
        System.out.println("Film Adı: " + ad);
        System.out.println("Süresi: " + sure + " dakika");
        System.out.println("Türü: " + tur);
    }
}
