package TP1_HERENCIA.EJER9;

public class circunferencia extends figura{

    private double radio;
    
    public circunferencia(double radio, String colorfondo, String colorborde) {
        super(colorfondo, colorborde);
        this.radio=radio;
    }

    @Override
    public double calcSuperficie() {
        double superficie = pi * (radio*radio);
        return superficie;
    }

    @Override
    public double calcPerimetro() {
        double perimetro = 2* pi * radio;
        return perimetro;
    }

    @Override
    public String dibujarFigura() {
        return "Circunferencia: ";
    }
    
}
