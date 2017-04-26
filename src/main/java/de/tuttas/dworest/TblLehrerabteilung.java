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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jtutt_000
 */
@Entity
@Table(name = "tbl_lehrerabteilung")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblLehrerabteilung.findAll", query = "SELECT t FROM TblLehrerabteilung t")
    , @NamedQuery(name = "TblLehrerabteilung.findByLAId", query = "SELECT t FROM TblLehrerabteilung t WHERE t.lAId = :lAId")
    , @NamedQuery(name = "TblLehrerabteilung.findByIDLehrer", query = "SELECT t FROM TblLehrerabteilung t WHERE t.iDLehrer = :iDLehrer")
    , @NamedQuery(name = "TblLehrerabteilung.findByIDAbteilung", query = "SELECT t FROM TblLehrerabteilung t WHERE t.iDAbteilung = :iDAbteilung")})
public class TblLehrerabteilung implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "LAId")
    private Integer lAId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Lehrer")
    private int iDLehrer;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Abteilung")
    private int iDAbteilung;

    public TblLehrerabteilung() {
    }

    public TblLehrerabteilung(Integer lAId) {
        this.lAId = lAId;
    }

    public TblLehrerabteilung(Integer lAId, int iDLehrer, int iDAbteilung) {
        this.lAId = lAId;
        this.iDLehrer = iDLehrer;
        this.iDAbteilung = iDAbteilung;
    }

    public Integer getLAId() {
        return lAId;
    }

    public void setLAId(Integer lAId) {
        this.lAId = lAId;
    }

    public int getIDLehrer() {
        return iDLehrer;
    }

    public void setIDLehrer(int iDLehrer) {
        this.iDLehrer = iDLehrer;
    }

    public int getIDAbteilung() {
        return iDAbteilung;
    }

    public void setIDAbteilung(int iDAbteilung) {
        this.iDAbteilung = iDAbteilung;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lAId != null ? lAId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblLehrerabteilung)) {
            return false;
        }
        TblLehrerabteilung other = (TblLehrerabteilung) object;
        if ((this.lAId == null && other.lAId != null) || (this.lAId != null && !this.lAId.equals(other.lAId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "de.tuttas.dworest.TblLehrerabteilung[ lAId=" + lAId + " ]";
    }
    
}
