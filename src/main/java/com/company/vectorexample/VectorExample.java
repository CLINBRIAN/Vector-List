/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.vectorexample;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author kamau
 */
public class VectorExample {

    /*
    it implements dynamic array
    similar to arrayList, but its synchronized
    imolements List interface and extends abstractList
    
    
     */
    public static void main(String[] args) {
        Vector v = new Vector();

        v.add("java");
        v.add(1);

        Iterator iterator = v.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();

        Vector<Integer> v1 = new Vector<Integer>();
        v1.add(1);
        v1.add(3);

        Iterator<Integer> iterator1 = v1.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next() + " ");
        }
        System.out.println();

        //it will still work bcos it adds the elements implicitly even if the sixe is already defined
        Vector<Integer> v2 = new Vector<Integer>(2);
        v2.add(1);
        v2.add(3);
        v2.add(2);
        v2.add(4);
        
        //whenever the list is full increment the size by 5 values
        Vector<Integer> v3 = new Vector<Integer>(2,5);
        v3.add(1);
        v3.add(3);
        v3.add(2);
        v3.add(4);

    }
}
