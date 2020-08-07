package clase20200727;

import java.awt.Color;
import java.util.Date;

public class Pizarra {
    //atributos
    private int codigo;
    private Color color;
    private int largo, ancho;
    private Date fecha;
    private String fabricante;
    
    //contructores
    public Pizarra(){}
    
    public Pizarra(int c){
       codigo=c;
    }
    
    public Pizarra(Color color, Date fecha){
      this.color=color;
      this.fecha=fecha;
    }
    
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    
    public void setColor(Color c){
        this.color=c;
    }
    
    
    @Override
    public String toString(){
        return "PIZARRA: Codigo="+codigo+" Largo="+largo;
    }
    
    
    
    
    
}
