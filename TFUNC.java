
import java.util.*;
import java.lang.Math;

public class TFUNC{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int angka;

        angka = Integer.parseInt(input.nextLine());
        angka = hitungrekursif(angka);
        System.out.println(angka);
    }
    
    public static int hitungrekursif(int angka) {
        int result;

        if (angka == 1) {
            result = 1;
        } else {
            result = hitungrekursif(angka - 1) + angka;
        }
        
        return result;
    }
}
