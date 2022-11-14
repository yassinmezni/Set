/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testset3a;

import java.util.Comparator;

/**
 *
 * @author yassinmezni
 */
public class TriId implements Comparator<Etudiant>{

    @Override
    public int compare(Etudiant o1, Etudiant o2) {
        //if(o1.getId()>o2.getId()) return 1;
        
   return o1.getId()-o2.getId();
    }
    
}
