package TP1_HERENCIA.EJER9;

public class linea extends figura{

    private double longitud;
    
    public linea(double longitud, String colorfondo, String colorborde) {
        super(colorfondo, colorborde);
        this.longitud=longitud;
    }

    @Override
    public double calcSuperficie() {
        return longitud;
    }

    @Override
    public double calcPerimetro() {
        return 0;
    }

    @Override
    public String dibujarFigura() {
        return "Linea: ";
    }
    
}
