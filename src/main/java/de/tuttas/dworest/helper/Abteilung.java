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
public class Abteilung {
    private Integer id;
    private String name;
    private String schulform;

    public Abteilung() {
    }

    public Abteilung(Integer id, String name, String schulform) {
        this.id = id;
        this.name = name;
        this.schulform = schulform;
    }

   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchulform() {
        return schulform;
    }

    public void setSchulform(String schulform) {
        this.schulform = schulform;
    }
    
    
    
}
