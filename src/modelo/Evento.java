
package modelo;

/**
 *
 * @author dfleitas
 */
import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Evento implements Serializable  {
    private String ciudad;
    private Date fechain;
    private Date fechafin;
    private ArrayList<Ponencia>lista;
    public Evento(String c,Date in,Date fin){
        lista = new ArrayList();
        ciudad= c;
        fechain=in;
        fechafin=fin;
    }
    //getters 
    public String getCiudad(){
        return ciudad;
    }
    public Date getFechain(){
        return fechain;
    }
    public Date getFechafin(){
        return fechafin;
    }
    public ArrayList<Ponencia> getLista(){
        return lista;
    }
    //setters
    public void setCiudad(String ciudad){
        this.ciudad=ciudad;
    }
    public void setFechain(Date fechain){
        this.fechain= fechain;
    }
    public void setFechafin(Date fechafin){
        this.fechain=fechafin;
    }
    public void setLista(ArrayList<Ponencia> lista){
        this.lista=lista;
    }
    //metodos
    public void agregarPonencias(String t,Date f,String n, String m, String d ){
        Ponencia o= new Ponencia(t,f,n,m,d);
        lista.add(o);
        Collections.sort(lista);
    }
    
    public boolean buscarPonencia(String fecha) throws ParseException {
        SimpleDateFormat sdformat = new SimpleDateFormat("dd-MM-yyyy");
        Ponencia ponenciaBuscada = null;
        for (Ponencia pon : lista) {
            if (fecha.equals(sdformat.format(pon.getFecha()))) {
                ponenciaBuscada = pon;
                break;
            }
        }
        return ponenciaBuscada == null;
    }
    
    public void borrarPonencia(int index){
        lista.remove(index);
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
