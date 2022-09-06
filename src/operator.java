import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scnaner = new Scanner(System.in);
        System.out.println("Enter width:");
        width= scnaner.nextFloat();
        System.out.println("Enter height:");
        height= scnaner.nextFloat();
        float area = width  * height;
        System.out.println("Area is:" + area);
    }
}
