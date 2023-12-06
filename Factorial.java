import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int fact=1;
        int n=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));
        if (n>0){
            for (int i=1;i<=n;i++){
                fact=fact*i;
                JOptionPane.showMessageDialog(null,"El factorial de " + n + " es " + fact);
            }
        }

    }
}