package udea.com.reto4;

import java.util.ArrayList;


public class Principal {

    public static void main(String[] args) {

        ArrayList<Cliente> t3 = new ArrayList<>();
        t3.add(new Cliente("Valeria Di", "10367876345", 9653, "03/07/2022", "0004"));
        t3.add(new Cliente("Johan Doe", "1037645345", 3918, "03/07/2022", "0005"));
        t3.add(new Cliente("Maurice Doe", "98765234", 6048, "03/07/2022", "0006"));
        t3.add(new Cliente("Matthew Doe", "1036789453", 5840, "03/07/2022", "0007"));
        t3.add(new Cliente("Agustina Doe", "10003456", 3940, "03/07/2022", "0008"));
        t3.add(new Cliente("Agustina Doe", "10003456", 3840, "03/07/2022", "0009"));
        t3.add(new Cliente("Milena Doe", "20003456", 3696, "03/07/2022", "0010"));
        t3.add(new Cliente("Carla Di", "103789762", 2432, "03/07/2022", "0011"));
        
        //*************prueba***************
        
        //promedio
        double sum = 0;
        for (int i = 0; i < t3.size(); i++) {
            sum += t3.get(i).getTotalAPagar();//sumar
        }
        double promedio = sum / t3.size();
        
        System.out.println("Promedio: " + promedio);

        // nombre del cliente y monto minimo
        int minimo = t3.get(0).getTotalAPagar();
        String nombreMinimo = t3.get(0).getNombreCompleto();
        for (int e = 0; e < t3.size(); e++) {
            if (minimo > t3.get(e).getTotalAPagar()) {
                minimo = t3.get(e).getTotalAPagar();
                nombreMinimo = t3.get(e).getNombreCompleto();
            }//fin if
        }//fin for min
        
        System.out.println("Nombre del cliente que menos pago: " + nombreMinimo);
        System.out.println("Total pagado más bajo: " + minimo);

        //nombre del cliente y monto maximo
        int maximo = t3.get(0).getTotalAPagar();
        String nombreMaximo = t3.get(0).getNombreCompleto();
        for (int e = 0; e < t3.size(); e++) {
            if (minimo > t3.get(e).getTotalAPagar()) {
                maximo = t3.get(e).getTotalAPagar();
                nombreMaximo = t3.get(e).getNombreCompleto();
            }//fin if
        }//fin for min

        System.out.println("Nombre del cliente que más pago: " + nombreMaximo);
        System.out.println("Total pagado más alto: " + maximo);
        
        System.out.println("***** Array tipo object *****");
        Object[] resultados = new Object[5];
        resultados[0] = promedio;
        resultados[1] = nombreMinimo;
        resultados[2] = minimo;
        resultados[3] = nombreMaximo;
        resultados[4] = maximo;
        
        for (int i = 0; i < resultados.length; i++) {
            System.out.println(resultados[i]);
        }
        
        System.out.println("***** funcion *****");
        System.out.println(Cliente.reportes(t3));

        //***********fin prueba*************
        
        
        
        
        
    }//fin main


}// fin clase principal
