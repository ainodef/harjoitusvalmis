package com.example.harjoitus;

/**
 * Bonus luokka, joka käsittelee ostoksien summaa ja niistä kertyviä bonuksia
 */

public class bonus {
    private final String kanta_asiakas;
    private double ostokset;
    private double bonusrahat;

    /**
     * Luo kanta-asiakkaan
     * @param kanta_asiakas kanta-asikkaan nimi ja ostokset
     */
    public bonus(String kanta_asiakas){
        this.kanta_asiakas=kanta_asiakas;
        this.ostokset=0.0;
        this.bonusrahat=0.0;
    }

    /**
     * Ostosten laskenta
     * @param summa laskee ostokset
     */
    public void ostos(double summa){
        ostokset+=summa;
        bonusnyt();
    }
    private void bonusnyt(){
        if (ostokset>=100.0){
            bonusrahat=ostokset*0.10;
        }
    }

    /**
     * Palauttaa ostokset
     * @return palauttaa ostokset
     */
    public double getOstokset() {
        return ostokset;
    }

    /**
     * Palauttaa bonusrahat
     * @return palauttaa bonukset
     */
    public double getBonusrahat() {
        return bonusrahat;
    }
}