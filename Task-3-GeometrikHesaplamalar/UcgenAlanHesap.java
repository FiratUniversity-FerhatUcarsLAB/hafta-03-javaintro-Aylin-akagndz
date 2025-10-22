public class UcgenAlanHesap {
    public static void main(String[] args) {
        // Kenar uzunluklarını tanımla
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;
        
        // 1. Yarı çevreyi (s) hesapla: (a + b + c) / 2
        double s = (a + b + c) / 2;
        
        // 2. Alanı hesapla (Heron Formülü: Alan = sqrt(s * (s-a) * (s-b) * (s-c)))
        // Karekök almak için Math.sqrt() metodunu kullanıyoruz.
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        
        // Sonuçları yazdır
        System.out.println("Kenarlar: " + a + ", " + b + ", " + c);
        System.out.printf("Yarı Çevre (s): %.1f\n", s); // Beklenen: 6.0
        System.out.printf("Alanı (Heron): %.2f\n", alan); // Beklenen: 6.00
    }
}