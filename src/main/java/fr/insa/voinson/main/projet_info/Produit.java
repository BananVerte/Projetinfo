/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.voinson.main.projet_info;

/**
 *
 * @author Biscouiiiit
 */
public class Produit {

    private String codeProduit;
    private String dProduit;
    private float prix;

    public Produit(String codeProduit, String dPtoduit, float prix) {
        this.codeProduit = codeProduit;
        this.dProduit = dPtoduit;
        this.prix = prix;
    }

    public String getCodeProduit() {
        return codeProduit;
    }

    public void setCodeProduit(String codeProduit) {
        this.codeProduit = codeProduit;
    }

    public String getdPtoduit() {
        return dProduit;
    }

    public void setdPtoduit(String dPtoduit) {
        this.dProduit = dPtoduit;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
    
    @Override
    public String toString(){
        return "Produit [codeProduit=" + codeProduit + ", dProduit=" + dProduit + "]";  
    }
    
}
