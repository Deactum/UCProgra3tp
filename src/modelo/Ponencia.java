package modelo;

/**
 *
 * @author Bogado
 */
public class Ponencia {

    private String titulo;
    //private fecha; // sin usar por el momento
    private String investigador;
    private String descripcion;
    private String medio;

    public Ponencia(String t, /*f,*/ String in, String des, String m) {
        titulo = t; 
        //fecha = f;
        descripcion = des;
        medio = m;
    }

    public String getTitulo() {
        return titulo;
    }
    
    /*public       getFecha(){
        return fecha;
    }*/
    public String getInvestigador() {
        return investigador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getMedio() {
        return medio;
    }

    public void setTitulo(String t) {
        titulo = t;
    }
    
    /*public     setFecha(      f) {
        fecha = f;
    }*/
    
    public void setInvestigador(String in) {
        investigador = in;
    }

    public void setDescripcion(String des) {
        descripcion = des;
    }

    public void setMedio(String m) {
        medio = m;
    }
    
    
}
