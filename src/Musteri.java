public class Musteri {
    String ad;
    String email;

    public Musteri(String ad, String email) {
        this.ad = ad;
        this.email = email;
    }

    public void bilgileriGoster() {
        System.out.println("Müşteri Adı: " + ad);
        System.out.println("Email: " + email);
    }
}
