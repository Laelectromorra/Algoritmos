import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        double base= Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base del triángulo:"));
        double altura= Double.parseDouble(JOptionPane.showInputDialog("Ingresa la altura del triángulo:"));
        double area= (base*altura)/2;
        JOptionPane.showMessageDialog(null,"El área del triángulo es igual a "+area+ " cm2");
    }
}
=======
        double salario= Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu salario"));
        if (salario<15000){
            salario=salario*1.2;
        JOptionPane.showMessageDialog(null,"Tu salario corresponde a $ "+salario+ " pesos");
        }
        else if(salario>15000){
                salario=salario*1.15;
            JOptionPane.showMessageDialog(null,"Tu salario corresponde a $ "+salario+ " pesos");
            }
        }
    }
>>>>>>> 6a39886 (Càlculo de aumento salarial)
