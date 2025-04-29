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
public class Gamme {
    private String refGamme;
    private Produit produit;
    private ArrayList<Operation> listeOperations;
    private ArrayList<Equipement> listeEquipements;
    private Gamme g;

    

    

    public String getRefGamme() {
        return refGamme;
    }

    public void setRefGamme(String refGamme) {
        this.refGamme = refGamme;
    }

    public ArrayList<Operation> getListeOperations() {
        return listeOperations;
    }

    public void setListeOperations(ArrayList<Operation> listeOperations) {
        this.listeOperations = listeOperations;
    }

    public ArrayList<Equipement> getListeEquipements() {
        return listeEquipements;
    }

    public void setListeEquipements(ArrayList<Equipement> listeEquipements) {
        this.listeEquipements = listeEquipements;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Gamme getG() {
        return g;
    }

    public void setG(Gamme g) {
        this.g = g;
    }

    public Gamme(String refGamme, Produit produit, ArrayList<Operation> listeOperations, ArrayList<Equipement> listeEquipements, Gamme g) {
        this.refGamme = refGamme;
        this.produit = produit;
        this.listeOperations = listeOperations;
        this.listeEquipements = listeEquipements;
        this.g = g;
    }
    

    // 🔹 Méthode statique pour créer une gamme et l'associer au produit
    public static Gamme creerGamme(String refGamme, Produit produit) {
        if (produit.getGamme() == null) {
            Gamme g = new Gamme(refGamme, produit);
            produit.setGamme(g);
            System.out.println("Gamme créée.");
            return g;
        } else {
            System.out.println("Produit a déjà une gamme.");
            return (Gamme) produit.getGamme();
        }
    }

    // 🔹 Modifier le nom de la gamme
    public void modifierNom(String nouveauNom) {
        this.refGamme = nouveauNom;
        System.out.println("Nom de la gamme modifié.");
    }

    // 🔹 Supprimer la gamme (logiquement : vider les opérations)
    public void supprimer() {
        Operation.clear();
        produit.setGamme(null); // supprime le lien avec le produit
        System.out.println("Gamme supprimée.");
    }

    // 🔹 Afficher la gamme
    public void afficherGamme() {
    System.out.println("Gamme : " + refGamme);

    for (int i = 0; i < listeOperations.size(); i++) {
        Operation op = listeOperations.get(i);
        System.out.println("  - " + op);
    }

    System.out.println("Durée totale : " + dureeGamme() + " h");
    System.out.println("Coût total : " + coutGamme() + " €");
}
    public double dureeGamme() {
        double total = 0;
        for (Operation op : listeOperations) {
            total += op.getDureeOperation();
        }
        return total;
}
    public double coutGamme() {
    double total = 0;
    for (Operation op : listeOperations) {
        total += op.getCoutOperation();
    }
    return total;
}
}
