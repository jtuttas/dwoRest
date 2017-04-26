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
@Table(name = "tbl_fach")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblFach.findAll", query = "SELECT t FROM TblFach t")
    , @NamedQuery(name = "TblFach.findByFid", query = "SELECT t FROM TblFach t WHERE t.fid = :fid")
    , @NamedQuery(name = "TblFach.findByBezeichnung", query = "SELECT t FROM TblFach t WHERE t.bezeichnung = :bezeichnung")
    , @NamedQuery(name = "TblFach.findByLernbereich", query = "SELECT t FROM TblFach t WHERE t.lernbereich = :lernbereich")})
public class TblFach implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "FID")
    private Integer fid;
    @Size(max = 255)
    @Column(name = "Bezeichnung")
    private String bezeichnung;
    @Column(name = "Lernbereich")
    private Integer lernbereich;

    public TblFach() {
    }

    public TblFach(Integer fid) {
        this.fid = fid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Integer getLernbereich() {
        return lernbereich;
    }

    public void setLernbereich(Integer lernbereich) {
        this.lernbereich = lernbereich;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fid != null ? fid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblFach)) {
            return false;
        }
        TblFach other = (TblFach) object;
        if ((this.fid == null && other.fid != null) || (this.fid != null && !this.fid.equals(other.fid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "de.tuttas.dworest.TblFach[ fid=" + fid + " ]";
    }
    
}
