/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testset3a;

import java.util.*;

/**
 *
 * @author yassinmezni
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        HashSet hash = new HashSet();
        hash.add(5);
        hash.add("test");
        hash.add(5.3);

        hash.add("test");
        hash.add(5);
        hash.add(5.3);
        System.out.println(hash.size());
        System.out.println(hash);

        HashSet<Etudiant> hash1 = new HashSet<>();
        Etudiant et1 = new Etudiant(1, "ben fadhe", "sana", 10);
        Etudiant et2 = new Etudiant(1, "ben fadhe", "sana", 10);
        Etudiant et3 = new Etudiant(3, "ben slimen", "noiuha", 10);
        Etudiant et4 = new Etudiant(4, "hjiri", "wiem", 10);

        hash1.add(et1);
        hash1.add(et3);
        //hash1.add(et3);
        hash1.add(et4);
        // hash1.add(et2);
        System.out.println(et1.equals(et2));
        System.out.println(hash1.size());
        System.out.println(hash1);

        System.out.println(et1.hashCode());
        System.out.println(et2.hashCode());

        System.out.println(hash1.contains(et1));
        System.out.println(hash1.contains(et2));
        System.out.println(hash1.remove(et2));

        for (Etudiant e : hash1) {
            System.out.println(e);
        }
        
        TreeSet<String> trest=new TreeSet<>(Collections.reverseOrder());
        
        trest.add("test");
        trest.add("abc");
        trest.add("Abc");
        
        System.out.println(trest);
        
        TreeSet<Etudiant> treet=new TreeSet<>();
        
        treet.addAll(hash1);
        treet.add(et1);
        
        System.out.println(treet);
        TreeSet<Etudiant> treet1=new TreeSet<>(new TriId());
        
        treet1.addAll(treet);
    }

}
