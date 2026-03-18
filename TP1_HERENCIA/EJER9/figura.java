package TP1_HERENCIA.EJER9;

abstract public class figura {
    private String colorfondo;
    private String colorborde;

    //Constructor
    public figura(String colorfondo, String colorborde) {
        this.colorfondo = colorfondo;
        this.colorborde = colorborde;
    }
    //Gets y Sets
    public String getColorfondo() {
        return colorfondo;
    }
    public void setColorfondo(String colorfondo) {
        this.colorfondo = colorfondo;
    }
    public String getColorborde() {
        return colorborde;
    }
    public void setColorborde(String colorborde) {
        this.colorborde = colorborde;
    }

    public abstract double calcSuperficie();
    public abstract double calcPerimetro();
    public abstract String dibujarFigura();
    
}
