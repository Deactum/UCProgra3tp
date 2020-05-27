
package modelo;

/**
 *
 * @author dfleitas
 */
import java.util.*;
public class Evento {
    private String ciudad;
    private int fechain;
    private int fechafin;
    private ArrayList<Ponencia>lista;
    public Evento(String c,int in,int fin){
        lista = new ArrayList();
        ciudad= c;
        fechain=in;
        fechafin=fin;
    }
    //getters 
    public String getCiudad(){
        return ciudad;
    }
    public int getFechain(){
        return fechain;
    }
    public int getFechafin(){
        return fechafin;
    }
    public ArrayList<Ponencia> getLista(){
        return lista;
    }
    //setters
    public void setCiudad(String ciudad){
        this.ciudad=ciudad;
    }
    public void setFechain(int fechain){
        this.fechain= fechain;
    }
    public void setFechafin(int fechafin){
        this.fechain=fechafin;
    }
    public void setLista(ArrayList<Ponencia> lista){
        this.lista=lista;
    }
    //metodos
    public void agregarPonencias(String t,String n, String m, String d ){
        Ponencia o= new Ponencia(t,n,m,d);
        lista.add(o);
    }
    
    public String toString(){
        StringBuilder srt = new StringBuilder("Eventos");
        srt.append("\nCiudad"+ciudad);
        srt.append("\nFecha de inicio"+fechain);
        srt.append("\nFecha de finalización"+fechafin);
        srt.append("\nlista de Ponencias"+lista);
        return srt.toString();
                
    }
}
