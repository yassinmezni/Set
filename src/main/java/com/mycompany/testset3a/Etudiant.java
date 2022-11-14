/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testset3a;

/**
 *
 * @author yassinmezni
 */
public class Etudiant implements Comparable<Etudiant>{

    private int id;
    private String nom, prenom;
    private int age;

    public Etudiant(int id, String nom, String prenom, int age) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (o.getClass() != this.getClass()) {
            return false;
        }

        Etudiant e = (Etudiant) o;
        return e.id == this.id && e.prenom.equals(prenom);

    }

    @Override
    public int hashCode() {
        return id+prenom.hashCode();
    }

    @Override
    public int compareTo(Etudiant o) {
        return this.prenom.compareTo(o.prenom);
        
    }
    

}
