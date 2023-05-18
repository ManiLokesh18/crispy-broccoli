package generateRandom;
import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {
    private static final String CHAR_POOL="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_=+[]{}|;:',<.>/?~`";

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of your password, recommended length is 8-16 characters:");
        int DEFAULT_LENGTH=sc.nextInt();
        System.out.println(generatePassword(DEFAULT_LENGTH));
    }
    public static String generatePassword(int length){
        SecureRandom Srandom = new SecureRandom();
        StringBuilder Password = new StringBuilder();
        for(int i=0;i<length;i++){
            int index = Srandom.nextInt(CHAR_POOL.length());
            Password.append(CHAR_POOL.charAt(index));
            if ((i + 1) % 4 == 0 && i != length - 1) {
                Password.append("-");
            }
        }
        return Password.toString();
    }
}
