import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("insert first note: ");
        float note = sc.nextFloat();
        System.out.println("enter the weight of the note: ");
        float weight = sc.nextFloat();

        System.out.println("insert a second note: ");
        float note1 = sc.nextFloat();
        System.out.println("enter the weight of the second note: ");
        float weight1 = sc.nextFloat();

        System.out.println("insert a third note: ");
        float note2 = sc.nextFloat();
        System.out.println("enter the weight of the third note: ");
        float weight2 = sc.nextFloat();

        float media = (note * weight + note1 * weight1 + note2 * weight2) / (weight + weight1 + weight2);

        System.out.println("the average is: " + media);
    }
}
