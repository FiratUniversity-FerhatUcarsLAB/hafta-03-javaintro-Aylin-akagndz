public class SaatDonusum {
    public static void main(String[] args) {
        // Dönüştürülecek toplam saniye miktarı
        int toplamSaniye = 3665; 

        // 1. Saati Hesaplama: Toplam saniyeyi 3600'e (1 saat) böl
        int saat = toplamSaniye / 3600;
        
        // Kalan saniyeyi bul
        int kalanSaniye = toplamSaniye % 3600; 

        // 2. Dakikayı Hesaplama: Kalan saniyeyi 60'a böl
        int dakika = kalanSaniye / 60;

        // 3. Saniyeyi Hesaplama: Kalan saniyeyi 60'a göre mod al
        int saniye = kalanSaniye % 60; 

        // Sonucu saat:dakika:saniye formatında yazdır
        System.out.println("Toplam Saniye: " + toplamSaniye);
        System.out.printf("Dönüşüm: %d:%02d:%02d\n", saat, dakika, saniye);
        // %02d formatı, tek haneli sayının başına 0 ekler (örneğin 5 yerine 05)
    }
}