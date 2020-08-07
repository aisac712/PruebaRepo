package clase20200727;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

public class Carro {
    private int serie;
    private String marca;
    private String modelo;
    private Color color;
    private Date fecha_creación;
    ArrayList<String> personas_usan = new ArrayList();

    public Carro() {
    }

    public Carro(int serie) {
        this.serie = serie;
    }
    
    public void setMarca(String m){
        this.marca=m;
    }
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(Color c){
        this.color=c;
    }
    public Color getColor(){
        return color;
    }
    
    public void setPersonas(ArrayList<String> p){
        this.personas_usan=p;
    }
    
    public ArrayList<String> getPersonas(){
        return this.personas_usan;
    }
    
    public String toString(){
        return "CARRO: Serie:"+serie+" Marca:"+marca;
    }
    
    public String pitar(){
        return "PIIIII   PIIIII   PIIIII";
    }

}
