package modelo;

/**
 *
 * @author Bogado
 */
import java.util.*;
import java.io.*;
public class Ponencia implements Comparable<Ponencia>,Serializable {

    private String titulo;
    private Date fecha;
    private String investigador;
    private String descripcion;
    private String medio;

    public Ponencia(String t, Date f, String in, String des, String m) {
        titulo = t; 
        fecha = f;
        investigador = in;
        descripcion = des;
        medio = m;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public Date getFecha(){
        return fecha;
    }
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
    
    public void setFecha(Date f) {
        fecha = f;
    }
    
    public void setInvestigador(String in) {
        investigador = in;
    }

    public void setDescripcion(String des) {
        descripcion = des;
    }

    public void setMedio(String m) {
        medio = m;
    }
    
  public int compareTo(Ponencia p) {
    return getFecha().compareTo(p.getFecha());
  }
    
}
