package TP1_HERENCIA.EJER9;

public class rectangulo extends figura{

    private double base;
    private double altura;
    
    public rectangulo(double base, double altura, String colorfondo, String colorborde) {
        super(colorfondo, colorborde);
        this.base=base;
        this.altura=altura;
    }

    @Override
    public double calcSuperficie() {
        double superficie = (2*base)+(2*altura);
        return superficie;
    }

    @Override
    public double calcPerimetro() {
        double perimetro = base * altura;
        return perimetro;
    }

    @Override
    public String dibujarFigura() {
        return "Rectangulo: ";
    }
    
}
