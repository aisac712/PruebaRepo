package clase20200727;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Clase20200727 {

    public static void main(String[] args) {
        ArrayList inventario = new ArrayList();
        int opcion = 0;
        while (opcion != 7) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1- Agregar un vehiculo\n"
                    + "2- agregar un pizarra\n"
                    + "3- listar todo               \n"
                    + "4-Listar Vehiculos        \n"
                    + "5-modificar Marca de un vehiculo\n"
                    + "6- eliminar algo\n"
                    + "8- Agregar personas a vehiculo\n"
                    + "9- modificar el nombre de un ocupante de un vehiculo\n"
                    + "7 salir"));
            if (opcion == 1) {
                int s;
                s = Integer.parseInt(JOptionPane.showInputDialog("Serie"));
                inventario.add(new Carro(s));
            }
            if (opcion == 2) {
                int c;
                c = Integer.parseInt(JOptionPane.showInputDialog("Codigo"));
                inventario.add(new Pizarra(c));
            }
            if (opcion == 3) {
                String salida = "";
                for (Object o : inventario) {
                    salida += inventario.indexOf(o) + "- " + o + "\n";
                }
                JOptionPane.showMessageDialog(null, salida);

            }

            if (opcion == 4) {
                String salida = "";
                for (Object o : inventario) {
                    if (o instanceof Carro) {
                        salida += inventario.indexOf(o) + "- " + o + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, salida);

            }

            if (opcion == 5) {
                int p;
                p = Integer.parseInt(JOptionPane.showInputDialog("Posicion a modificar"));
                if (inventario.get(p) instanceof Carro) {
                    String m;
                    m = JOptionPane.showInputDialog("Deme la nueva marca");
                    ((Carro) inventario.get(p)).setMarca(m);
                    JOptionPane.showMessageDialog(null, "Carro modificado exitosamente");
                } else {
                    JOptionPane.showMessageDialog(null, "el elemento seleccionado no es un carro");
                }

            }

            if (opcion == 6) {
                int p;
                p = Integer.parseInt(JOptionPane.showInputDialog("Posicion a eliminar"));
                inventario.remove(p);
            }

            if (opcion == 8) {
                int p;
                p = Integer.parseInt(JOptionPane.showInputDialog("Posicion del carro"));
                String n;
                n = JOptionPane.showInputDialog("nombre persona");
                if (inventario.get(p) instanceof Carro) {
                    ((Carro) inventario.get(p)).getPersonas().add(n);
                } else {
                    JOptionPane.showMessageDialog(null, "el elemento seleccionado no es un carro");
                }
            }

            if (opcion == 9) {
                int p, pp;
                p = Integer.parseInt(JOptionPane.showInputDialog("Posicion del carro"));
                pp = Integer.parseInt(JOptionPane.showInputDialog("Posicion de la persona en el carro"));
                if (inventario.get(p) instanceof Carro) {
                    String n;
                    n = JOptionPane.showInputDialog("nuevo nombre persona");
                    
                    ( (Carro)inventario.get(p) ).getPersonas().set(pp, n);
                    
                } else {
                    JOptionPane.showMessageDialog(null, "el elemento seleccionado no es un carro");
                }
            }

        }//FIN WHILE
    }
}
