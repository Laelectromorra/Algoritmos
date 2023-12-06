import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        double base= Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base del triángulo:"));
        double altura= Double.parseDouble(JOptionPane.showInputDialog("Ingresa la altura del triángulo:"));
        double area= (base*altura)/2;
        JOptionPane.showMessageDialog(null,"El área del triángulo es igual a "+area+ " cm2");
    }
}