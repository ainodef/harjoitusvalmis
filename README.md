# Kukkakauppa-sovellus

Java kukkakauppasovellus, jossa voi ostaa eri kukkalajikkeita ja lajitella ne lajikkeen, värin ja hinnan mukaan

---

## Projekti

src/ └── com/example/harjoitus/ ├── ikkunaa.java ├── kukkakauppa.java ├── lajike.java // Kukkalajikkeen tietorakenne └── bonus.java

---
-Sovellus näyttää saatavilla olevat lajikkeet
-Niitä voi sitten ostaa valitsemansa ja valitsemansa määrän
-Näyttää myös mitä ole viimeksi ostanut ja tallentaa sen tiedon
---
## Luokat
### 'lajike'
/**
 * Lajike luokka, jossa lajitellaan kukat nimen, värin ja hinnan mukaan.
 */
Lajike luokka, jossa lajitellaan kukat nimen, värin ja hinnan mukaan.
-'lajikenimi'
-'color'
-'hinta'
- 'String lajikenimi` – Lajin nimi
- 'String color' – Lajin väri
- 'double hinta' – Lajin hinta
- /**
 * Lajikkeet.
 * @param lajikenimi Lajin nimi
 * @param color Lajin väri
 * @param hinta Lajin hinta

 *//**
 * Lajikkeen nimi
 * @return Lajikkeen nimen palautus
 */
/**
 * Lajikkeen väri
 * @return Lajikkeen värin palautus

 */
 /**
 * Lajikkeen hinta
 * @return Lajikkeen hinnan palautus
 */
- 'getLajikenimi()' – Palauttaa lajikkeen nimen
- 'getColor()' – Palauttaa lajikkeen värin
- 'getHinta()' – Palauttaa lajikkeen hinnan
### 'bonus'
/**
 * Bonus luokka, joka käsittelee ostoksien summaa ja niistä kertyviä bonuksia
 */
Bonus luokka, joka käsittelee ostoksien summaa ja niistä kertyviä bonuksia
-Jos tekee 100 eurolla ostoksia bonusta tulee 10%
-Sisältää kanta-asiakkuuden
- 'String kanta_asiakas' – Asiakkaan nimi
- 'double ostokset' – Ostosten summa
- 'double bonusrahat' – Bonusten määrä
- 'ostos(double summa)' – Lisää ostoksen ja päivittää bonuksen, jos ostot ylittävät 100 €
- 'getOstokset()' – Palauttaa ostosten summan
- 'getBonusrahat()' – Palauttaa bonusrahat
- /**
 * Luo kanta-asiakkaan
 * @param kanta_asiakas kanta-asikkaan nimi ja ostokset

 *//**
 * Ostosten laskenta
 * @param summa laskee ostokset
 */

/**
 * Palauttaa ostokset
 * @return palauttaa ostokset
 */

/**
 * Palauttaa bonusrahat
 * @return palauttaa bonukset
 */
### 'kukkakauppa'
/**
 * Kukkakauppa luokka on kaupan tiedot ja tiedot sen myytävistä lajikkeista.
 */
Kukkakauppa luokka on kaupan tiedot ja tiedot sen myytävistä lajikkeista.
-'etsilajike(String nimi, String color, double hinta)' – Palauttaa listan lajikkeista, jotka täyttävät annetut ehdot
/**
 * Etsii tietyn lajikkeen
 * @param Lajikenimi nimen mukaan
 * @param color värin mukaan
 * @param hinta hinnan mukaan
 * @return palauttaa lajikkeet
 */
### 'ikkunaa'
/**
 * Ikkuna luokka, joka toimii käyttöliittymänä
 */
JavaFX käyttöliittymä, joka näyttää kukkalajikkeet ja hoitaa ostoprosessin napin kautta.
-Graafinen käyttöliittymä
- 'init()' – Alustaa kukkakaupan ja kanta-asiakkaan
- 'start(Stage)' – Luo käyttöliittymän ja hoitaa tapahtumien hallinnan
- 'tiedostoOstos(String)' – Tallentaa ostoksen tiedostoon
- 'lueViimeOstos()' – Lukee viimeisimmän ostoksen tiedostosta
 /**
 * init valmistaa kukkakaupan ja kanta-asiakkaan start-komentoa varten
 */

/**
 * Käyttöliittymä ja sen komennot
 * @param primaryStage Pääikkuna
 */

/**
 * Määrä jonka asiakas ostaa
 */

/**
 * nappi, jota painamalla näkee ostokset ja viime ostokset
 */

/**
 * Luo ikkunan, jossa kaikki näkyy
 */

/**
 * Ostoksen tallennus tiedostoon
 * @param ostos Kertoo mitä ostit
 */

/**
 * Lukee viimeisimmän ostoksen tiedostosta
 * @return Viimeisin ostos
 */

/**
 * Main-metodi, jolla koko homma toimii
 * @param args argumentit
 */

## Käyttö
-Kukkakaupan käyttötarkoitus on sen nimensä mukainen eli siellä myydään kukkia asiakkaille
-Asiakas itse syöttää ostamansa määrän ja painaa sitten nappia nähdäkseen ostokset
-Asiakas näkee alhaalla myös edelliset ostokset
## Tiedosto tallennus
-Edllinen ostos tallennetaan 'viimeostokset.txt' tiedostoon

