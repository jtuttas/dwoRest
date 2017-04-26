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
@Table(name = "tbl_beruffach")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblBeruffach.findAll", query = "SELECT t FROM TblBeruffach t")
    , @NamedQuery(name = "TblBeruffach.findByBfid", query = "SELECT t FROM TblBeruffach t WHERE t.bfid = :bfid")
    , @NamedQuery(name = "TblBeruffach.findByIDUFormBeruf", query = "SELECT t FROM TblBeruffach t WHERE t.iDUFormBeruf = :iDUFormBeruf")
    , @NamedQuery(name = "TblBeruffach.findByIDFach", query = "SELECT t FROM TblBeruffach t WHERE t.iDFach = :iDFach")
    , @NamedQuery(name = "TblBeruffach.findByJahr", query = "SELECT t FROM TblBeruffach t WHERE t.jahr = :jahr")
    , @NamedQuery(name = "TblBeruffach.findByPosition", query = "SELECT t FROM TblBeruffach t WHERE t.position = :position")})
public class TblBeruffach implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "BFID")
    private Integer bfid;
    @Column(name = "ID_UFormBeruf")
    private Integer iDUFormBeruf;
    @Column(name = "ID_Fach")
    private Integer iDFach;
    @Column(name = "Jahr")
    private Short jahr;
    @Column(name = "Position")
    private Short position;

    public TblBeruffach() {
    }

    public TblBeruffach(Integer bfid) {
        this.bfid = bfid;
    }

    public Integer getBfid() {
        return bfid;
    }

    public void setBfid(Integer bfid) {
        this.bfid = bfid;
    }

    public Integer getIDUFormBeruf() {
        return iDUFormBeruf;
    }

    public void setIDUFormBeruf(Integer iDUFormBeruf) {
        this.iDUFormBeruf = iDUFormBeruf;
    }

    public Integer getIDFach() {
        return iDFach;
    }

    public void setIDFach(Integer iDFach) {
        this.iDFach = iDFach;
    }

    public Short getJahr() {
        return jahr;
    }

    public void setJahr(Short jahr) {
        this.jahr = jahr;
    }

    public Short getPosition() {
        return position;
    }

    public void setPosition(Short position) {
        this.position = position;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bfid != null ? bfid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblBeruffach)) {
            return false;
        }
        TblBeruffach other = (TblBeruffach) object;
        if ((this.bfid == null && other.bfid != null) || (this.bfid != null && !this.bfid.equals(other.bfid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "de.tuttas.dworest.TblBeruffach[ bfid=" + bfid + " ]";
    }
    
}
