/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.voinson.main.projet_info;

/**
 *
 * @author Biscouiiiit
 */
public class Equipement {
    private String refEquipement, dEquipement;
    private float coutEquipement;

    public String getRefEquipement() {
        return refEquipement;
    }

    public void setRefEquipement(String refEquipement) {
        this.refEquipement = refEquipement;
    }

    public String getdEquipement() {
        return dEquipement;
    }

    public void setdEquipement(String dEquipement) {
        this.dEquipement = dEquipement;
    }

    public Equipement(String refEquipement, String dEquipement, float coutEquipement) {
        this.refEquipement = refEquipement;
        this.dEquipement = dEquipement;
        this.coutEquipement = coutEquipement;
    }

    public float getCoutEquipement() {
        return coutEquipement;
    }

    public void setCoutEquipement(float coutEquipement) {
        this.coutEquipement = coutEquipement;
    }

    @Override
    public String toString() {
        return "Equipement [refEquipement=" + refEquipement + ", dEquipement=" + dEquipement + ", coutEquipement=" + coutEquipement + "]";
    }
    
}
