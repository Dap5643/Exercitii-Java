package org.example;

public class Latte implements Cafea {
    private String lapte;
    private Integer ml;

    public Latte() {
    }
    public Latte(String lapte, Integer ml) {
        this.lapte = lapte;
        this.ml = ml;
    }



    @Override
    public void fierbeCafea() {
        System.out.println("S-a fiert latte-ul.");
    }

    @Override
    public void toarnaCafea() {
        System.out.println("S-a turnat latte-ul.");
    }

    public void setLapte(String lapte) {
        this.lapte = lapte;
    }

    public void setMl(Integer ml) {
        this.ml = ml;
    }

    @Override
    public String toString() {
        return "Latte{" +
                "lapte='" + lapte + '\'' +
                ", ml=" + ml +
                '}';
    }
}
