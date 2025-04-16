/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.voinson.main.projet_info;
import java.util.ArrayList;
/**
 *
 * @author Biscouiiiit
 */
public class Poste {
    String refPoste, dPoste;
    ArrayList<Machine> listeMachines;

    public String getRefPoste() {
        return refPoste;
    }

    public void setRefPoste(String refPoste) {
        this.refPoste = refPoste;
    }

    public String getdPoste() {
        return dPoste;
    }

    public void setdPoste(String dPoste) {
        this.dPoste = dPoste;
    }

    public ArrayList<Machine> getListeMachines() {
        return listeMachines;
    }

    public void setListeMachines(ArrayList<Machine> listeMachines) {
        this.listeMachines = listeMachines;
    }

    public Poste(String refPoste, String dPoste, ArrayList<Machine> listeMachines) {
        this.refPoste = refPoste;
        this.dPoste = dPoste;
        this.listeMachines = listeMachines;
    }
    
    
}
