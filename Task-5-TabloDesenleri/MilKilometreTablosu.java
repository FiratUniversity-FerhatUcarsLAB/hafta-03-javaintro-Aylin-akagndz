public class MilKilometreTablosu {
    public static void main(String[] args) {
        // Mil'den Kilometreye dönüşüm sabiti
        final double KILOMETER_PER_MILE = 1.609;
        
        // Mil değerleri
        int mil1 = 1;
        int mil2 = 5;
        int mil3 = 10;
        int mil4 = 20;
        int mil5 = 50;

        // Tablo Başlığı
        System.out.println("-------------------------");
        System.out.printf("%-10s %s\n", "Mil", "Kilometre");
        System.out.println("-------------------------");

        // Dönüşümleri hesapla ve yazdır (%.3f ile 3 ondalık basamak formatında)
        System.out.printf("%-10d %.3f\n", mil1, mil1 * KILOMETER_PER_MILE);
        System.out.printf("%-10d %.3f\n", mil2, mil2 * KILOMETER_PER_MILE);
        System.out.printf("%-10d %.3f\n", mil3, mil3 * KILOMETER_PER_MILE);
        System.out.printf("%-10d %.3f\n", mil4, mil4 * KILOMETER_PER_MILE);
        System.out.printf("%-10d %.3f\n", mil5, mil5 * KILOMETER_PER_MILE);
        
        System.out.println("-------------------------");
    }
}