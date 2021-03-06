package ch.teko.prg.tag02.workathome.oop2;

public class Book {
    //Attribute
    public String titel;
    public String autor;
    public double preis;
    public int kaufjahr;

    //Konstruktor

    public Book(String titel, String autor, double preis, int kaufjahr) {
        this.titel = titel;
        this.autor = autor;
        this.preis = preis;
        this.kaufjahr = kaufjahr;
    }

    public Book(String titel, String autor) {
        this.titel = titel;
        this.autor = autor;
        this.preis = 0.0;
        this.kaufjahr = -1;
    }

    //Methode


    public String getTitel() {
        return titel;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getKaufjahr() {
        return kaufjahr;
    }

    public void setKaufjahr(int Kaufjahr) {
        this.kaufjahr = kaufjahr;
    }

}
