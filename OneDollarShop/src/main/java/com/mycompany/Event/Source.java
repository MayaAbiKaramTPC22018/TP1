/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Event;

import java.util.ArrayList;

/**
 *
 * @author Maya
 */
public class  Source<D> {
    ArrayList<GEventListener> listListener;
    
    public Source() {
         listListener=new ArrayList<>();
    }
    public void addGEventListener(GEventListener listener) {
        listListener.add(listener);
    }
    public void removeGEventListener(GEventListener listener) {
        listListener.remove(listener);
    }
    
    public void dispatch(GEvent<Source<D>,D> ev) {
        listListener.forEach((gel) ->  gel.action(ev));
    }
    public GEvent<Source<D>,D> genEvent(D d) {
        return new GEvent<Source<D>,D>(this, d);
    }
}