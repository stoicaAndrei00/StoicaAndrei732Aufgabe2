package model;

public class Produkte {
    private String name;
    private double preis;
    private String universum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public String getUniversum() {
        return universum;
    }

    public void setUniversum(String universum) {
        this.universum = universum;
    }

    public Produkte(String name, double preis, String universum) {
        this.name = name;
        this.preis = preis;
        this.universum = universum;
    }
}
