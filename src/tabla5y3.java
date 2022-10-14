import javax.swing.*;

public class tabla5y3 {
    public static void main(String[] args) {
        int numeros[][] = new int[5][3];

        for (int f = 0; f < numeros.length; f++) {
            int c = 0;
            do {
               String valor = JOptionPane.showInputDialog("introduce un número entero, posición: " + f + "," + c);
                int v=Integer.parseInt(valor);
                numeros[f][c]=v;
                c++;
            } while (c < numeros[f].length);
        }
        for (int f = 0; f < numeros.length; f++) {
            int c = 0;
            do {
                System.out.println("posicion ("+ f + ","+ c + "):" + numeros[f][c]);
                c++;
            } while (c < numeros[f].length);
        }
    }
}