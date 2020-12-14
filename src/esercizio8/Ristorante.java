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
public class Ristorante {
    
    private String nomeRist;
    private String indirizzoRist;
    private ArrayList <Piatto> elencoPiatti;
    private ArrayList <Ordine> elencoOrdinazioni;
    
    public Ristorante (String nomeRist, String indirizzoRist){
    
        this.nomeRist = nomeRist;
        this.indirizzoRist = indirizzoRist;
        this.elencoPiatti = new ArrayList<>();
        this.elencoOrdinazioni = new ArrayList<>();
    }
    
    public Ristorante (Ristorante rCopia){
    
        this.nomeRist = rCopia.nomeRist;
        this.indirizzoRist = rCopia.indirizzoRist;
        this.elencoPiatti = (ArrayList)rCopia.getElencoPiatti().clone();
        this.elencoOrdinazioni = (ArrayList)rCopia.getElencoOrdinazioni().clone();
    }

    public String getNomeRist() {
        return nomeRist;
    }

    public String getIndirizzoRist() {
        return indirizzoRist;
    }

    public ArrayList<Piatto> getElencoPiatti() {
        return elencoPiatti;
    }

    public ArrayList<Ordine> getElencoOrdinazioni() {
        return elencoOrdinazioni;
    }
          
    public void addPiatto(Piatto nuovoP){
    
        this.elencoPiatti.add(nuovoP);
    }
    
    public boolean removePiatto(Piatto p){
    
        for(int i=0; i<this.elencoPiatti.size(); i++){
        
            if(this.elencoPiatti.get(i).getNomeUnivoco().equals(p.getNomeUnivoco())){
            
                this.elencoPiatti.remove(i);
                return true;
            }
            
        }
        
        return false;
    }
    
    public void addOrdinazione(Ordine o){
    
        this.elencoOrdinazioni.add(o);
    }
    
    public boolean removeOrdinazione (Ordine o){
    
        for(int i=0; i<this.elencoOrdinazioni.size(); i++){
        
            if(this.elencoOrdinazioni.get(i).getNumeroIdentificativo() == o.getNumeroIdentificativo()){
            
                this.elencoOrdinazioni.remove(i);
                return true;
            }
            
        }
        
        return false;
    }
    
    private int TrovaPos(ArrayList <Piatto> lista, Piatto p){
        
        if(lista.isEmpty()){
        
            return 0;
        }
        
        for(int i=0; i<lista.size(); i++){
        
            if(p.ottieniPrezzo()<lista.get(i).ottieniPrezzo()){
            
                return i;
            }
        }
        
        return lista.size();
    }
    
    public ArrayList ListaPiattiTipo(String tipo){
    
        ArrayList <Piatto> piattiTipo = new ArrayList <>();
        int pos = 0;
        
        for(int i=0; i<this.elencoPiatti.size(); i++){
        
            if(this.elencoPiatti.get(i).getTipo().equals(tipo)){
            
                pos= this.TrovaPos(piattiTipo, this.elencoPiatti.get(i));
                piattiTipo.add(pos, this.elencoPiatti.get(i));
            }
        }
        return piattiTipo;
    }
    
    public double incassoGiornaliero(){
        
        double incasso = 0;
    
        for(int i=0; i<this.elencoOrdinazioni.size(); i++){
        
            incasso += this.elencoOrdinazioni.get(i).getPrezzoOrdine();
        
        }
        
        return incasso;
    
    }
    
    public Ordine ordineConIncassoMaggiore(){
    
        double max = this.elencoOrdinazioni.get(0).getPrezzoOrdine();
        int pos = 0;
        
        for(int i=1; i<this.elencoOrdinazioni.size(); i++){
        
            if(this.elencoOrdinazioni.get(i).getPrezzoOrdine() > max){
            
                max = this.elencoOrdinazioni.get(i).getPrezzoOrdine();
                pos = i;
                
            }
        }
        return this.elencoOrdinazioni.get(pos);
    }
    
}
