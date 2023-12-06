import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog("Ingresa tu nombre");
        JOptionPane.showMessageDialog(null,"Hola, "+name);
        int edad= Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
        JOptionPane.showMessageDialog(null,"Hola, tú tienes "+edad+ " años");
        double estatura= Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu estatura"));
        JOptionPane.showMessageDialog(null,"Hola, tú mides "+estatura+ " metros");
    }
}