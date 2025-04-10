package com.example.harjoitus;

/**
 * Lajike luokka, jossa lajitellaan kukat nimen, värin ja hinnan mukaan.
 */

public class lajike {
    private String lajikenimi;
    private String color;
    private double hinta;

    /**
     * Lajikkeet.
     * @param lajikenimi Lajin nimi
     * @param color Lajin väri
     * @param hinta Lajin hinta
     */

    public lajike(String lajikenimi, String color, double hinta) {
        this.lajikenimi = lajikenimi;
        this.color = color;
        this.hinta = hinta;
    }

    /**
     * Lajikkeen nimi
     * @return Lajikkeen nimen palautus
     */
    public String getLajikenimi() {
        return lajikenimi;
    }

    /**
     * Lajikkeen väri
     * @return Lajikkeen värin palautus
     */
    public String getColor() {
        return color;
    }

    /**
     * Lajikkeen hinta
     * @return Lajikkeen hinnan palautus
     */
    public double getHinta() {
        return hinta;
    }
}