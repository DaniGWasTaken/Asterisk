import javax.swing.*;

public class gato {
    public static void main(String[] args) {
        String gato2;
        String gato3;

        String gato1 = JOptionPane.showInputDialog("¿Has nacido en Madrid?");

        if (gato1.equals("no") || gato1.equals("No") || gato1.equals("NO") || gato1.equals("nO")) {
            JOptionPane.showMessageDialog(null, "No eres gato");
        }

        if (gato1.equals("si") || gato1.equals("Si") || gato1.equals("SI") || gato1.equals("sI")) {
            gato2 = JOptionPane.showInputDialog("¿Tus padres nacieron en Madrid?");

            if (gato2.equals("no") || gato2.equals("No") || gato2.equals("NO")|| gato2.equals("nO")) {
                JOptionPane.showMessageDialog(null, "No eres gato");
            }

            if (gato2.equals("si") || gato2.equals("Si") || gato2.equals("SI") || gato2.equals("sI")) {
                gato3 = JOptionPane.showInputDialog("¿Tus abuelos nacieron en Madrid?");

                if (gato3.equals("no") || gato3.equals("No") || gato3.equals("NO") || gato3.equals("nO")) {
                    JOptionPane.showMessageDialog(null, "No eres gato");
                }

                if (gato3.equals("si") || gato3.equals("Si") || gato3.equals("SI") || gato3.equals("sI")) {
                    JOptionPane.showMessageDialog(null,"Eres gato");
                }
            }
        }
    }
}