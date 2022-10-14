import java.util.Arrays;
import java.util.Scanner;


public class matriz223 {
    public static void main(String[] args) {
        int[][][] a = new int[2][2][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int x = 0; x < a[i][j].length; x++) {
                    System.out.println("Introduce un número: ");
                    a[i][j][x] = sc.nextInt();
                }
            }
        }
        System.out.println(Arrays.deepToString(a));

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int x = 0; x < a[i][j].length; x++) {
                    System.out.print("("+ i + "," + j + "," + x + ")" + "=" + a[i][j][x] + ";");
                }
            }
            System.out.println();
        }
    }
}
