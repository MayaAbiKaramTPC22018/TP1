/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Event;

/**
 *
 * @author Maya
 */
public class GEvent <S extends Source<D>,D>{
    
    public S getSource() {
        return _source;
    }

    /**
     * @param _source the _source to set
     */
    public void setSource(S _source) {
        this._source = _source;
    }

    /**
     * @return the _data
     */
    public D getData() {
        return _data;
    }

    /**
     * @param _data the _data to set
     */
    public void setData(D _data) {
        this._data = _data;
    }
    
    private S _source;
    private D _data;
    
    public GEvent(S source, D data) {
        _source = source;
        _data = data;
    }
    
    public GEvent(S source) {
        _source = source;
        _data = null;
    }
}
