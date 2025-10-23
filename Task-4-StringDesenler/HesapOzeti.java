public class HesapOzeti {
    public static void main(String[] args) {
        // Ürün bilgileri
        String urun1 = "Defter";
        int miktar1 = 3;
        double fiyat1 = 15.75;
        
        String urun2 = "Kalem Seti";
        int miktar2 = 1;
        double fiyat2 = 45.00;
        
        String urun3 = "Silgi";
        int miktar3 = 5;
        double fiyat3 = 5.25;
        
        // Tablo Başlığı
        System.out.println("---------------------------------");
        System.out.printf("%-15s %-8s %s\n", "ÜRÜN", "MİKTAR", "FİYAT");
        System.out.println("---------------------------------");

        // Ürünleri tablo formatında yazdır (printf ile sütunları hizala)
        // %-15s: Sola hizalı, 15 karakterlik yer kaplayan String
        // %-8d: Sola hizalı, 8 karakterlik yer kaplayan tam sayı (miktar)
        // %.2f: 2 ondalık basamaklı Fiyat
        System.out.printf("%-15s %-8d %.2f TL\n", urun1, miktar1, fiyat1);
        System.out.printf("%-15s %-8d %.2f TL\n", urun2, miktar2, fiyat2);
        System.out.printf("%-15s %-8d %.2f TL\n", urun3, miktar3, fiyat3);
        System.out.println("---------------------------------");
    }
}