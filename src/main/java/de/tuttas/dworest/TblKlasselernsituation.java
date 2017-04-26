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
@Table(name = "tbl_klasselernsituation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblKlasselernsituation.findAll", query = "SELECT t FROM TblKlasselernsituation t")
    , @NamedQuery(name = "TblKlasselernsituation.findByKllsid", query = "SELECT t FROM TblKlasselernsituation t WHERE t.kllsid = :kllsid")
    , @NamedQuery(name = "TblKlasselernsituation.findByIDKlasse", query = "SELECT t FROM TblKlasselernsituation t WHERE t.iDKlasse = :iDKlasse")
    , @NamedQuery(name = "TblKlasselernsituation.findByIdLs", query = "SELECT t FROM TblKlasselernsituation t WHERE t.idLs = :idLs")
    , @NamedQuery(name = "TblKlasselernsituation.findByIDLehrer", query = "SELECT t FROM TblKlasselernsituation t WHERE t.iDLehrer = :iDLehrer")
    , @NamedQuery(name = "TblKlasselernsituation.findByPasswort", query = "SELECT t FROM TblKlasselernsituation t WHERE t.passwort = :passwort")})
public class TblKlasselernsituation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "KLLSID")
    private Integer kllsid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Klasse")
    private int iDKlasse;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_LS")
    private int idLs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Lehrer")
    private int iDLehrer;
    @Size(max = 50)
    @Column(name = "Passwort")
    private String passwort;

    public TblKlasselernsituation() {
    }

    public TblKlasselernsituation(Integer kllsid) {
        this.kllsid = kllsid;
    }

    public TblKlasselernsituation(Integer kllsid, int iDKlasse, int idLs, int iDLehrer) {
        this.kllsid = kllsid;
        this.iDKlasse = iDKlasse;
        this.idLs = idLs;
        this.iDLehrer = iDLehrer;
    }

    public Integer getKllsid() {
        return kllsid;
    }

    public void setKllsid(Integer kllsid) {
        this.kllsid = kllsid;
    }

    public int getIDKlasse() {
        return iDKlasse;
    }

    public void setIDKlasse(int iDKlasse) {
        this.iDKlasse = iDKlasse;
    }

    public int getIdLs() {
        return idLs;
    }

    public void setIdLs(int idLs) {
        this.idLs = idLs;
    }

    public int getIDLehrer() {
        return iDLehrer;
    }

    public void setIDLehrer(int iDLehrer) {
        this.iDLehrer = iDLehrer;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kllsid != null ? kllsid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblKlasselernsituation)) {
            return false;
        }
        TblKlasselernsituation other = (TblKlasselernsituation) object;
        if ((this.kllsid == null && other.kllsid != null) || (this.kllsid != null && !this.kllsid.equals(other.kllsid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "de.tuttas.dworest.TblKlasselernsituation[ kllsid=" + kllsid + " ]";
    }
    
}
