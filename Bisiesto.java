import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int año= Integer.parseInt(JOptionPane.showInputDialog("Ingresa un año:"));
        if (año%4==0){
            JOptionPane.showMessageDialog(null,"El año "+año+ " es bisiesto");
        }
        else{
            JOptionPane.showMessageDialog(null,"El año "+año+ " no es bisiesto");
        }
    }
}