public class UsluSayilar {
    public static void main(String[] args) {
        // Tablo Başlığı
        System.out.printf("%-5s %-5s %s\n", "a", "a^2", "a^3");
        System.out.println("-----------------");

        // Satır 1: a=1
        int a1 = 1;
        System.out.printf("%-5d %-5d %d\n", a1, a1 * a1, a1 * a1 * a1);

        // Satır 2: a=2
        int a2 = 2;
        System.out.printf("%-5d %-5d %d\n", a2, a2 * a2, a2 * a2 * a2);

        // Satır 3: a=3
        int a3 = 3;
        System.out.printf("%-5d %-5d %d\n", a3, a3 * a3, a3 * a3 * a3);
        
        // Satır 4: a=4
        int a4 = 4;
        System.out.printf("%-5d %-5d %d\n", a4, a4 * a4, a4 * a4 * a4);
        
        // Satır 5: a=5
        int a5 = 5;
        System.out.printf("%-5d %-5d %d\n", a5, a5 * a5, a5 * a5 * a5);
    }
}
