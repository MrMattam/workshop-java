package fr.mbo.workshops.core;

public class Pizza {

    private String name;
    private Float price;

    private boolean estVegetarienne;

    public Pizza(){

    }

    public Pizza(String name, Float price, boolean vegetarienne) {
        this.name = name;
        this.price = price;
        this.estVegetarienne = vegetarienne;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public boolean isEstVegetarienne() {
        return estVegetarienne;
    }

    public void setEstVegetarienne(boolean estVegetarienne) {
        this.estVegetarienne = estVegetarienne;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.price + signeVege();
    }

    private String signeVege() {
        return this.estVegetarienne ? " - (V)" : "";
    }

    public String getName() {
        return name;
    }

    public Float getPrice() {
        return price;
    }


}
