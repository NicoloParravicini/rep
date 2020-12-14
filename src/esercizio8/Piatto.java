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
public class Piatto {
    
    private String nomeUnivoco;
    private String tipo;
    private ArrayList <Ingrediente> listaIngredienti;
    
    
    public Piatto(String nomeUnivoco, String tipo) {
        this.nomeUnivoco = nomeUnivoco;
        this.tipo = tipo;
        this.listaIngredienti = new ArrayList<>();
    }
    
    

    public String getNomeUnivoco() {
        return nomeUnivoco;
    }

    public String getTipo() {
        return tipo;
    }

    public ArrayList<Ingrediente> getListaIngredienti() {
        return listaIngredienti;
    }
    
    public double ottieniPrezzo(){
    
        double prezzo=0;
        
        for(int i=0; i<listaIngredienti.size();i++){
        
            prezzo = prezzo + (listaIngredienti.get(i).getPrezzoUnitario() * listaIngredienti.get(i).getQuantita());
        }
        
        return prezzo;
    }
    
    public void addIngrediente (Ingrediente nuovoIng){
    
        this.listaIngredienti.add(nuovoIng);
    }
    
    public boolean removeIngrediente (Ingrediente ingRm){
    
        for(int i=0; i<this.listaIngredienti.size(); i++){
        
            if(this.listaIngredienti.get(i).getDescrizione().equals(ingRm.getDescrizione())){
            
                this.listaIngredienti.remove(i);
                return true;
                
            }
        }
        return  false;
    }
     
}
