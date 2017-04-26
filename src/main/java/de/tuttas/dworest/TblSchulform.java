/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.tuttas.dworest;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jtutt_000
 */
@Entity
@Table(name = "tbl_schulform")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblSchulform.findAll", query = "SELECT t FROM TblSchulform t")
    , @NamedQuery(name = "TblSchulform.findBySFId", query = "SELECT t FROM TblSchulform t WHERE t.sFId = :sFId")
    , @NamedQuery(name = "TblSchulform.findBySchulformname", query = "SELECT t FROM TblSchulform t WHERE t.schulformname = :schulformname")})
public class TblSchulform implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SFId")
    private Integer sFId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "Schulformname")
    private String schulformname;

    public TblSchulform() {
    }

    public TblSchulform(Integer sFId) {
        this.sFId = sFId;
    }

    public TblSchulform(Integer sFId, String schulformname) {
        this.sFId = sFId;
        this.schulformname = schulformname;
    }

    public Integer getSFId() {
        return sFId;
    }

    public void setSFId(Integer sFId) {
        this.sFId = sFId;
    }

    public String getSchulformname() {
        return schulformname;
    }

    public void setSchulformname(String schulformname) {
        this.schulformname = schulformname;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sFId != null ? sFId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblSchulform)) {
            return false;
        }
        TblSchulform other = (TblSchulform) object;
        if ((this.sFId == null && other.sFId != null) || (this.sFId != null && !this.sFId.equals(other.sFId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "de.tuttas.dworest.TblSchulform[ sFId=" + sFId + " ]";
    }
    
}
