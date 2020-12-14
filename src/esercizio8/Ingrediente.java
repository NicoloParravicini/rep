/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio8;

/**
 *
 * @author arlin
 */
public class Ingrediente {
    
    private String descrizione;
    private int quantita;
    private double prezzoUnitario;

    public Ingrediente(String descrizione, int quantita, double prezzoUnitario) {
        this.descrizione = descrizione;
        this.quantita = quantita;
        this.prezzoUnitario = prezzoUnitario;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public int getQuantita() {
        return quantita;
    }

    public double getPrezzoUnitario() {
        return prezzoUnitario;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public void setPrezzoUnitario(double prezzoUnitario) {
        this.prezzoUnitario = prezzoUnitario;
    }
    
    
    
    
    
    
}
