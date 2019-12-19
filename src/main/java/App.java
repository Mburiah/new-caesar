import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Cipher newCipher = new Cipher();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter plaintext");
        String plaintext = sc.next();
        System.out.println("Enter Key");
        int key = sc.nextInt();
        System.out.println(newCipher.encrypt(plaintext, key));
    }
}
