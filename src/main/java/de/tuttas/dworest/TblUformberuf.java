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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jtutt_000
 */
@Entity
@Table(name = "tbl_uformberuf")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblUformberuf.findAll", query = "SELECT t FROM TblUformberuf t")
    , @NamedQuery(name = "TblUformberuf.findByUbid", query = "SELECT t FROM TblUformberuf t WHERE t.ubid = :ubid")
    , @NamedQuery(name = "TblUformberuf.findByIDBeruf", query = "SELECT t FROM TblUformberuf t WHERE t.iDBeruf = :iDBeruf")
    , @NamedQuery(name = "TblUformberuf.findByIDUForm", query = "SELECT t FROM TblUformberuf t WHERE t.iDUForm = :iDUForm")
    , @NamedQuery(name = "TblUformberuf.findByUFBJahr", query = "SELECT t FROM TblUformberuf t WHERE t.uFBJahr = :uFBJahr")
    , @NamedQuery(name = "TblUformberuf.findByUWochen", query = "SELECT t FROM TblUformberuf t WHERE t.uWochen = :uWochen")})
public class TblUformberuf implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "UBID")
    private Integer ubid;
    @Column(name = "ID_Beruf")
    private Integer iDBeruf;
    @Column(name = "ID_UForm")
    private Integer iDUForm;
    @Column(name = "UFBJahr")
    private Short uFBJahr;
    @Column(name = "UWochen")
    private Short uWochen;

    public TblUformberuf() {
    }

    public TblUformberuf(Integer ubid) {
        this.ubid = ubid;
    }

    public Integer getUbid() {
        return ubid;
    }

    public void setUbid(Integer ubid) {
        this.ubid = ubid;
    }

    public Integer getIDBeruf() {
        return iDBeruf;
    }

    public void setIDBeruf(Integer iDBeruf) {
        this.iDBeruf = iDBeruf;
    }

    public Integer getIDUForm() {
        return iDUForm;
    }

    public void setIDUForm(Integer iDUForm) {
        this.iDUForm = iDUForm;
    }

    public Short getUFBJahr() {
        return uFBJahr;
    }

    public void setUFBJahr(Short uFBJahr) {
        this.uFBJahr = uFBJahr;
    }

    public Short getUWochen() {
        return uWochen;
    }

    public void setUWochen(Short uWochen) {
        this.uWochen = uWochen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ubid != null ? ubid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblUformberuf)) {
            return false;
        }
        TblUformberuf other = (TblUformberuf) object;
        if ((this.ubid == null && other.ubid != null) || (this.ubid != null && !this.ubid.equals(other.ubid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "de.tuttas.dworest.TblUformberuf[ ubid=" + ubid + " ]";
    }
    
}
