package elhassanmahmoud.rezeptapp;


public class Rezept {


    private Long id;

    private String titel;
    private String beschreibung;

    public Rezept() {}

    public Rezept(Long id, String titel, String beschreibung) {
        this.id = id;
        this.titel = titel;
        this.beschreibung = beschreibung;
    }

    // Getter & Setter
}
