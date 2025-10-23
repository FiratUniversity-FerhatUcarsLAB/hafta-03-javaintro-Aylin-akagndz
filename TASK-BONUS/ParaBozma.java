public class ParaBozma {
    public static void main(String[] args) {
        // Bozulacak toplam para miktarı
        int toplamPara = 278; 
        int kalan = toplamPara;

        System.out.println("--- " + toplamPara + " TL Para Bozma ---");

        // 1. 100 TL'lik Banknotlar
        int yuzluk = kalan / 100;
        kalan = kalan % 100; // Kalan: 78

        // 2. 50 TL'lik Banknotlar
        int ellilik = kalan / 50;
        kalan = kalan % 50; // Kalan: 28

        // 3. 20 TL'lik Banknotlar
        int yirmilik = kalan / 20;
        kalan = kalan % 20; // Kalan: 8

        // 4. 10 TL'lik Banknotlar (Bu örnekte 0 çıkacak)
        int onluk = kalan / 10;
        kalan = kalan % 10; // Kalan: 8

        // 5. 5 TL'lik Banknotlar
        int beslik = kalan / 5;
        kalan = kalan % 5; // Kalan: 3

        // 6. 1 TL'lik Madeni Paralar
        int birlik = kalan; // Geriye kalan direk 1'liklerdir.

        // Sonuçları yazdır
        System.out.println("100 TL: " + yuzluk);
        System.out.println("50 TL : " + ellilik);
        System.out.println("20 TL : " + yirmilik);
        System.out.println("10 TL : " + onluk);
        System.out.println("5 TL  : " + beslik);
        System.out.println("1 TL  : " + birlik);
    }
}