/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.voinson.main.projet_info;

/**
 *
 * @author Biscouiiiit
 */
public class Operation {

    static void clear() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    String refOperation, dOperation, refEquipement;
    float dureeOperation, coutOperation;
    
    public double getDureeOperation() {
        return dureeOperation;
}

    public double getCoutOperation() {
        return coutOperation;
}
    public String getRefOperation() {
        return refOperation;
    }

    public void setRefOperation(String refOperation) {
        this.refOperation = refOperation;
    }

    public String getdOperation() {
        return dOperation;
    }

    public void setdOperation(String dOperation) {
        this.dOperation = dOperation;
    }

    public String getRefEquipement() {
        return refEquipement;
    }

    public void setRefEquipement(String refEquipement) {
        this.refEquipement = refEquipement;
    }

    public float getDureeOperation() {
        return dureeOperation;
    }

    public void setDureeOperation(float dureeOperation) {
        this.dureeOperation = dureeOperation;
    }

    public Operation(String refOperation, String dOperation, String refEquipement, float dureeOperation) {
        this.refOperation = refOperation;
        this.dOperation = dOperation;
        this.refEquipement = refEquipement;
        this.dureeOperation = dureeOperation;
    }
    
}
