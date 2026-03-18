package TP1_HERENCIA.EJER9;

import java.util.*;
public class pizarra {
    
    private String colorfondo;

    public pizarra(String colorfondo) {
        this.colorfondo = colorfondo;
    }

    public String getColorfondo() {
        return colorfondo;
    }

    public void setColorfondo(String colorfondo) {
        this.colorfondo = colorfondo;
    }
    
    Vector <figura> figuras = new Vector<figura>();

    public void agregarFigura(){

    }
    public void eliminarFigura(){

    }

    public void limpiarPizarra(){
        figuras.clear();
    }

}
