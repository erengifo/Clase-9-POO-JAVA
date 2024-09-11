package matematicas;

public class Operaciones {

    private double primerNumero;
    private double segundoNumero;

    public Operaciones(int primerNumero, int segundoNumero) {
        this.primerNumero = primerNumero;
        this.segundoNumero = segundoNumero;
    }

    public double suma() {
        return (double) primerNumero + segundoNumero;
    }

    public double resta() {
        return (double) primerNumero - segundoNumero;
    }

    public double multiplicacion() {
        return (double) primerNumero / segundoNumero;

    }

    public double division() {
        return (double) primerNumero / segundoNumero;
    }
}
