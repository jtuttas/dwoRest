/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.tuttas.dworest.helper;

/**
 *
 * @author jtutt_000
 */
public class Beruf {
    private Integer id;
    private Integer idAbteilung;
    private String name;

    public Beruf() {
    }

    public Beruf(Integer id, String name, Integer idAbteilung) {
        this.id = id;
        this.idAbteilung = idAbteilung;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdAbteilung() {
        return idAbteilung;
    }

    public void setIdAbteilung(Integer idAbteilung) {
        this.idAbteilung = idAbteilung;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
