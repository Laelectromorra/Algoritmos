import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        double vol;
        double radio=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio de la esfera"));
        if (radio>0){
            vol=(4*Math.PI*Math.pow(radio,3))/3;
            JOptionPane.showMessageDialog(null,"El volumen de la esfera es igual a "+vol+" cm3");
        }
        else{
            JOptionPane.showMessageDialog(null,"No existen radios negativos");
        }
    }
}