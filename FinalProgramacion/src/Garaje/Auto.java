package Garaje;

public class Auto extends Vehiculo{

    private int numDePuertas;

    public int getNumDePuertas() {
        return numDePuertas;
    }

    public void setNumDePuertas(int numDePuertas) {
        this.numDePuertas = numDePuertas;
    }
    public Auto (double km, int numRuedas, String marca, int numPuertas) {
        super (km, numRuedas, marca);
        setNumDePuertas(numPuertas);
    }
}
