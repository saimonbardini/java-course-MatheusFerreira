import java.util.Scanner;

public class calculoMedia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("input the first note: ");
        float nota1 = sc.nextFloat();
        System.out.println("input the second note: ");
        float nota2 = sc.nextFloat();
        System.out.println("input the third note: ");
        float nota3 = sc.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;

        System.out.println("media = "+media);
    }
}