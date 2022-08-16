package udea.com.reto4;

import java.util.ArrayList;

public class Cliente {

    // atributos
    private String nombreCompleto;
    private String documentoIdentidad;
    private int totalAPagar;
    private String fechaCompra;
    private String numeroFactura;

    //Contructor
    public Cliente(String nombreCompleto, String documentodentidad, int totalAPagar, String fechaCompra, String numeroFactura) {
        this.nombreCompleto = nombreCompleto;
        this.documentoIdentidad = documentoIdentidad;
        this.totalAPagar = totalAPagar;
        this.fechaCompra = fechaCompra;
        this.numeroFactura = numeroFactura;
    }


    // Getters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDocumentodentidad() {
        return documentoIdentidad;
    }

    public int getTotalAPagar() {
        return totalAPagar;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    //Setters
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setDocumentodentidad(String documentodentidad) {
        this.documentoIdentidad = documentodentidad;
    }

    public void setTotalAPagar(int totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    //metodo
    public static Object[] reportes(ArrayList <Cliente> tienda) {

        //promedio
        double sum = 0;
        for (int i = 0; i < tienda.size(); i++) {
            sum += tienda.get(i).getTotalAPagar();//sumar
        }
        double promedio = sum / tienda.size();

        // nombre del cliente y monto minimo
        int minimo = tienda.get(0).getTotalAPagar();
        String nombreMinimo = tienda.get(0).getNombreCompleto();
        for (int e = 0; e < tienda.size(); e++) {
            if (minimo > tienda.get(e).getTotalAPagar()) {
                minimo = tienda.get(e).getTotalAPagar();
                nombreMinimo = tienda.get(e).getNombreCompleto();
            }//fin if
        }//fin for min

        //nombre del cliente y monto maximo
        int maximo = tienda.get(0).getTotalAPagar();
        String nombreMaximo = tienda.get(0).getNombreCompleto();
        for (int e = 0; e < tienda.size(); e++) {
            if (maximo < tienda.get(e).getTotalAPagar()) {
                maximo = tienda.get(e).getTotalAPagar();
                nombreMaximo = tienda.get(e).getNombreCompleto();
            }//fin if
        }//fin for min

        Object[] resultados = new Object[5];
        resultados[0] = promedio;
        resultados[1] = nombreMinimo;
        resultados[2] = minimo;
        resultados[3] = nombreMaximo;
        resultados[4] = maximo;

        return resultados;

    }// fin metodo reportes

    
    
    /**/
    //metodo mostrar datos
    public String mostrarDatos() {
        return nombreCompleto + "\n"
                + documentoIdentidad + "\n"
                + totalAPagar + "\n"
                + fechaCompra + "\n"
                + numeroFactura + "\n"
                + "************";
    }
    /**/

}
