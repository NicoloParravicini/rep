/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio8;
import java.util.ArrayList;
/**
 *
 * @author arlin
 */
public class Ordine {
    
    private int numeroIdentificativo;
    private String nomeCameriere;
    private ArrayList<Piatto> listaPiattiOrdinati;
    private double prezzoOrdine;
    
    static int contaNumIdentificativo = 0;
    
    public Ordine(String nomeCamerire){
    
        this.nomeCameriere = nomeCamerire;
        this.listaPiattiOrdinati = new ArrayList<>();
        this.numeroIdentificativo = contaNumIdentificativo;
        
        contaNumIdentificativo++;
    }

    public int getNumeroIdentificativo() {
        return numeroIdentificativo;
    }

    public String getNomeCameriere() {
        return nomeCameriere;
    }

    public ArrayList<Piatto> getListaPiattiOrdinati() {
        return listaPiattiOrdinati;
    }

    public double getPrezzoOrdine() {
        
        for(int i=0; i<listaPiattiOrdinati.size(); i++){
        
            this.prezzoOrdine += listaPiattiOrdinati.get(i).ottieniPrezzo();
        
        }
        
        return prezzoOrdine;
    }

    public static int getContaNumIdentificativo() {
        return contaNumIdentificativo;
    }
    
    
}
