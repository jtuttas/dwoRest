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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jtutt_000
 */
@Entity
@Table(name = "tbl_uform")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblUform.findAll", query = "SELECT t FROM TblUform t")
    , @NamedQuery(name = "TblUform.findByUid", query = "SELECT t FROM TblUform t WHERE t.uid = :uid")
    , @NamedQuery(name = "TblUform.findByUFormname", query = "SELECT t FROM TblUform t WHERE t.uFormname = :uFormname")
    , @NamedQuery(name = "TblUform.findByUFormnamekurz", query = "SELECT t FROM TblUform t WHERE t.uFormnamekurz = :uFormnamekurz")})
public class TblUform implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "UID")
    private Integer uid;
    @Size(max = 255)
    @Column(name = "UFormname")
    private String uFormname;
    @Size(max = 255)
    @Column(name = "UFormnamekurz")
    private String uFormnamekurz;

    public TblUform() {
    }

    public TblUform(Integer uid) {
        this.uid = uid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUFormname() {
        return uFormname;
    }

    public void setUFormname(String uFormname) {
        this.uFormname = uFormname;
    }

    public String getUFormnamekurz() {
        return uFormnamekurz;
    }

    public void setUFormnamekurz(String uFormnamekurz) {
        this.uFormnamekurz = uFormnamekurz;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uid != null ? uid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblUform)) {
            return false;
        }
        TblUform other = (TblUform) object;
        if ((this.uid == null && other.uid != null) || (this.uid != null && !this.uid.equals(other.uid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "de.tuttas.dworest.TblUform[ uid=" + uid + " ]";
    }
    
}
