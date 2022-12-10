import java.util.Scanner;
public class Main {

    static void power(){
        Scanner input = new Scanner(System.in);
        System.out.print("Taban Değeri Girin: ");
        int base = input.nextInt();
        System.out.print("Üs Değeri Girin: ");
        int exponent = input.nextInt();
        int result = 1;

            for(int i=1; i <= exponent; i++){
                result*=base;
            }
        System.out.println("Sonuç: "+result);
    }

    public static void main(String[] args) {

        power();

    }
}