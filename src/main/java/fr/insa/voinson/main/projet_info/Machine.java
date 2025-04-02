/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.voinson.main.projet_info;

/**
 *
 * @author ntribaldos01
 */
public class Machine {
    String refMachine, dMachine, type;
    float x, y, cout;

    public String getRefMachine() {
        return refMachine;
    }

    public void setRefMachine(String refMachine) {
        this.refMachine = refMachine;
    }

    public String getdMachine() {
        return dMachine;
    }

    public void setdMachine(String dMachine) {
        this.dMachine = dMachine;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getCout() {
        return cout;
    }

    public void setCout(float cout) {
        this.cout = cout;
    }

    public Machine(String refMachine, String dMachine, String type, float x, float y, float cout) {
        this.refMachine = refMachine;
        this.dMachine = dMachine;
        this.type = type;
        this.x = x;
        this.y = y;
        this.cout = cout;
    }
    
    
}
