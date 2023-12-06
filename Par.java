import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        double par= Double.parseDouble(JOptionPane.showInputDialog("Ingresa un número:"));
        if (par%2==0){
            JOptionPane.showMessageDialog(null, "El número "+par+" es par");
        }
        else{
            JOptionPane.showMessageDialog(null,"El número "+par+" no es par");
        }
    }
}