public class DaireHesap {
    public static void main(String[] args) {
        // Yarıçapı tanımla
        double r = 5.5; 
        
        // Alan hesapla: π * r * r (Math.PI kullanılır)
        double alan = Math.PI * r * r; 
        
        // Çevre hesapla: 2 * π * r
        double cevre = 2 * Math.PI * r; 
        
        // Sonuçları yazdır
        System.out.println("Yarıçap: " + r);
        System.out.printf("Alanı: %.2f\n", alan); // Alan: ~95.03
        System.out.printf("Çevresi: %.2f\n", cevre); // Çevre: ~34.56
    }
}
