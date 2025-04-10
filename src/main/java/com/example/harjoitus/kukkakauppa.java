package com.example.harjoitus;

import java.util.ArrayList;
import java.util.List;

/**
 * Kukkakauppa luokka on kaupan tiedot ja tiedot sen myytävistä lajikkeista.
 */

public class kukkakauppa {
    private List<lajike> lajikkeet;

    public kukkakauppa() {
        lajikkeet = new ArrayList<>();
        // Lisää lajikkeet
        lajikkeet.add(new lajike("orvokki", "punainen", 6.79));
        lajikkeet.add(new lajike("lilja", "valkoinen", 13.99));
        lajikkeet.add(new lajike("flamingonkukka", "vaaleanpunainen", 40.99));
        lajikkeet.add(new lajike("Ametistipensas", "violetti/vihreä", 45.99));
        lajikkeet.add(new lajike("tulppaani", "keltainen", 6.89));
        lajikkeet.add(new lajike("Amaryllis", "punainen", 12.15));
        lajikkeet.add(new lajike("Begonia", "oranssi", 13.99));
    }

    /**
     * Etsii tietyn lajikkeen
     * @param Lajikenimi nimen mukaan
     * @param color värin mukaan
     * @param hinta hinnan mukaan
     * @return palauttaa lajikkeet
     */
    public List<lajike> etsilajike(String Lajikenimi, String color, double hinta) {
        List<lajike> lista = new ArrayList<>();
        for (lajike lajike : lajikkeet) {
            boolean lajikenimiMatches = (Lajikenimi == null || Lajikenimi.isEmpty() || lajike.getLajikenimi().equalsIgnoreCase(Lajikenimi));
            boolean colorMatches = (color == null || color.isEmpty() || lajike.getColor().equalsIgnoreCase(color));
            boolean hintaMatches = (hinta <= 0 || lajike.getHinta() <= hinta);

            if (lajikenimiMatches && colorMatches && hintaMatches) {
                lista.add(lajike);
            }
        }
        return lista;
    }
}