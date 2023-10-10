package miPrincipal;

public class PoligonoRegular
{
    // Atributos
    private int     n;
    private double  lado;
    private double  x;
    private double  y;

    // Constructores
    public PoligonoRegular( int n, double lado, double x, double y )
    {
        // Asignar valores a los atributos
    }

    public PoligonoRegular( int n, double lado )
    {
        this( n, lado, 0.0, 0.0 );
    }

    public PoligonoRegular()
    {
        this( 3, 1.0, 0.0, 0.0 );
    }

    // Metodos set/get
    public void setN( int n )
    {
        // n debe ser 3 o mayor
    }

    public void setLado( double lado )
    {
        // lado debe ser mayor que 0.0
    }

    public void setX( double x )
    {
        // x puede ser cualquier valor
    }

    public void setY( double y )
    {
        // y puede ser cualquier valor
    }

    public int getN()
    {
        return 0;
    }

    public double getLado()
    {
        return 0.0;
    }

    public double getX()
    {
        return 0.0;
    }

    public double getY()
    {
        return 0.0;
    }

    // Metodos de instancia
    public double getPerimetro()
    {
        // El perimetro es la suma de todos los lados
        return 0.0;
    }

    public double getArea()
    {
        // Utilizar la formula proporcionada en el planteamiento del ejercicio
        return 0.0;
    }

    // Sobreescribir metodo toString()
    public String toString()
    {
        // El resultado debe tener el siguiente formato:
        // PoligonoRegular: N=9, Lado=9.99, Perimetro=9.99, Area=9.99
        String resultado = String.format("PoligonoRegular: N=%d, Lado=%.2f, Perimetro=%.2f, Area=%.2f", n,lado,getPerimetro(),getArea());
        return resultado;
    }
}