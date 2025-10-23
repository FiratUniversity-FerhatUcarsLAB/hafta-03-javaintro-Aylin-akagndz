public class BmiHesaplama {
    public static void main(String[] args) {
        // Kendi değerlerini düzenle (Boy metre cinsinden olmalı!)
        double kilo = 70.0;     // Örneğin: 70 kg
        double boy = 1.75;      // Örneğin: 1.75 metre
        
        // BMI Hesaplama: kilo / (boy * boy)
        double bmi = kilo / (boy * boy);
        
        // Sonuçları yazdır
        System.out.println("--- Vücut Kitle İndeksi (BMI) ---");
        System.out.println("Kilo: " + kilo + " kg");
        System.out.println("Boy: " + boy + " metre");
        System.out.printf("BMI Sonucu: %.2f\n", bmi);
        
        // Not: 18.5-24.9 arası normal kabul edilir. (Örnek sonuç: 22.86)
    }
}