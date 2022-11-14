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
public class TestMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<Object, Object> hashm = new HashMap();
        hashm.put("test", 3);
        hashm.put("3A6", "sana");
        hashm.put(7, "java");
        hashm.put("3A6", "wiem");
        hashm.put(7, "java2");
        System.out.println(hashm.size());
        System.out.println(hashm);

        HashMap<Etudiant, String> hase = new HashMap<>();
        Etudiant et1 = new Etudiant(1, "ben fadhe", "sana", 10);
        Etudiant et2 = new Etudiant(1, "ben fadhe", "sana", 10);
        Etudiant et3 = new Etudiant(3, "ben slimen", "noiuha", 10);
        Etudiant et4 = new Etudiant(4, "hjiri", "wiem", 10);

        hase.put(et4, "3A5");
        hase.put(et1, "3A7");
        hase.put(et2, "3A8");

        hase.put(et3, "3A9");
        hase.put(et3, "3A10");
        System.out.println(hase);
        System.out.println(hase.size());
        
        System.out.println(hase.containsKey(et4));
        System.out.println(hase.containsValue("3A9"));
        
        System.out.println(hase.remove(et1));
        
        System.out.println(hase.get(et4));
        

    }

}
