public class Bilet {
    Musteri musteri;
    Film film;

    public Bilet(Musteri musteri, Film film) {
        this.musteri = musteri;
        this.film = film;
    }

    public void bilgileriGoster() {
        System.out.println("Müşteri Adı: " + musteri.ad);
        System.out.println("Email: " + musteri.email);
        System.out.println("Film Adı: " + film.ad);
        System.out.println("Süresi: " + film.sure + " dakika");
        System.out.println("Türü: " + film.tur);
        System.out.println("-----------");
    }
}
