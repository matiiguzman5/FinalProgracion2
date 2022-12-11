package Garaje;

public class Moto extends Vehiculo {

    private int cc; // Con cc me refiero a la cilindrada de la moto

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
    public Moto(double km, int numRuedas, String marca, int cc) {
        super(km, numRuedas, marca);
        setCc(cc);
    }
}
