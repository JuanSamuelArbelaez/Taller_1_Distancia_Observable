package taller1.punto1;

import javax.swing.JOptionPane;

public class Taller1Punto1
{
    final static double RADIO=3960; //Radio de la tierra en Millas
    public static void main(String[] args)
    {
        double altura, distancia;
        
        altura=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura en millas a la que se encuentra el observador: "));
        
        distancia=Math.pow(((2*altura*RADIO)+Math.pow(altura, 2)), 0.5);
        
        JOptionPane.showMessageDialog(null, "La distancia a la que el observador puede ver es de: "+distancia+" millas");
    }
}