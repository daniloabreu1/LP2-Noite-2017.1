
import javax.swing.JOptionPane;

public class CaixasDeDialogo {

    public static void main(String[] args) {
        String frutas[]={"banana","pera","uva"};
        String op;
        op = (String) JOptionPane.showInputDialog(null, "Selecione", "Título", JOptionPane.QUESTION_MESSAGE, null, frutas, frutas[0]);
        JOptionPane.showMessageDialog(null, "Fruta: "+op);
    }
}
