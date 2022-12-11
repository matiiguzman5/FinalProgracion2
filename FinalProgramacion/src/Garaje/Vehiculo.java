package Garaje;

public class Vehiculo {
    private double km;
    private int numRuedas;
    private String marca;

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Vehiculo(double km, int numRuedas, String marca) {
        setKm(km);
        setNumRuedas(numRuedas);
        setMarca(marca);
    }

}

