public class IkiIslem {
    public static void main(String[] args) {
        // Pay (üst kısım) hesapla: (9.5 * 4.5) - (2.5 * 3)
        double pay = (9.5 * 4.5) - (2.5 * 3); 
        
        // Payda (alt kısım) hesapla: 45.5 - 3.5
        double payda = 45.5 - 3.5; 
        
        // Bölme yap
        double sonuc = pay / payda;
        
        // Sonucu 4 ondalık basamakla formatla ve yazdır
        System.out.printf("İşlem Sonucu: %.4f\n", sonuc); 
    }
}