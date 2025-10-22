public class DikdortgenHesap {
    public static void main(String[] args) {
        // En ve Boy değerlerini tanımla
        double en = 4.5;
        double boy = 7.9;
        
        // Alan hesapla: En * Boy
        double alan = en * boy;
        
        // Çevre hesapla: 2 * (En + Boy)
        double cevre = 2 * (en + boy);
        
        // Sonuçları yazdır
        System.out.println("En: " + en + ", Boy: " + boy);
        System.out.printf("Alanı: %.2f\n", alan); 
        System.out.printf("Çevresi: %.2f\n", cevre); 
    }
}