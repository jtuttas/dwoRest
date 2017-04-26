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
@Table(name = "tbl_klassen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblKlassen.findAll", query = "SELECT t FROM TblKlassen t")
    , @NamedQuery(name = "TblKlassen.findByKlid", query = "SELECT t FROM TblKlassen t WHERE t.klid = :klid")
    , @NamedQuery(name = "TblKlassen.findByKlassennamekurz", query = "SELECT t FROM TblKlassen t WHERE t.klassennamekurz = :klassennamekurz")
    , @NamedQuery(name = "TblKlassen.findByKlassennamelang", query = "SELECT t FROM TblKlassen t WHERE t.klassennamelang = :klassennamelang")
    , @NamedQuery(name = "TblKlassen.findByIDBeruf", query = "SELECT t FROM TblKlassen t WHERE t.iDBeruf = :iDBeruf")
    , @NamedQuery(name = "TblKlassen.findByIDBeruf2", query = "SELECT t FROM TblKlassen t WHERE t.iDBeruf2 = :iDBeruf2")
    , @NamedQuery(name = "TblKlassen.findByIDBeruf3", query = "SELECT t FROM TblKlassen t WHERE t.iDBeruf3 = :iDBeruf3")
    , @NamedQuery(name = "TblKlassen.findByIDKlassenlehrer", query = "SELECT t FROM TblKlassen t WHERE t.iDKlassenlehrer = :iDKlassenlehrer")
    , @NamedQuery(name = "TblKlassen.findByIDStatus", query = "SELECT t FROM TblKlassen t WHERE t.iDStatus = :iDStatus")
    , @NamedQuery(name = "TblKlassen.findByArt", query = "SELECT t FROM TblKlassen t WHERE t.art = :art")
    , @NamedQuery(name = "TblKlassen.findByAktiv", query = "SELECT t FROM TblKlassen t WHERE t.aktiv = :aktiv")})
public class TblKlassen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "KLID")
    private Integer klid;
    @Size(max = 10)
    @Column(name = "Klassennamekurz")
    private String klassennamekurz;
    @Size(max = 30)
    @Column(name = "Klassennamelang")
    private String klassennamelang;
    @Column(name = "ID_Beruf")
    private Integer iDBeruf;
    @Column(name = "ID_Beruf2")
    private Integer iDBeruf2;
    @Column(name = "ID_Beruf3")
    private Integer iDBeruf3;
    @Column(name = "ID_Klassenlehrer")
    private Integer iDKlassenlehrer;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Status")
    private short iDStatus;
    @Column(name = "Art")
    private Integer art;
    @Size(max = 5)
    @Column(name = "Aktiv")
    private String aktiv;

    public TblKlassen() {
    }

    public TblKlassen(Integer klid) {
        this.klid = klid;
    }

    public TblKlassen(Integer klid, short iDStatus) {
        this.klid = klid;
        this.iDStatus = iDStatus;
    }

    public Integer getKlid() {
        return klid;
    }

    public void setKlid(Integer klid) {
        this.klid = klid;
    }

    public String getKlassennamekurz() {
        return klassennamekurz;
    }

    public void setKlassennamekurz(String klassennamekurz) {
        this.klassennamekurz = klassennamekurz;
    }

    public String getKlassennamelang() {
        return klassennamelang;
    }

    public void setKlassennamelang(String klassennamelang) {
        this.klassennamelang = klassennamelang;
    }

    public Integer getIDBeruf() {
        return iDBeruf;
    }

    public void setIDBeruf(Integer iDBeruf) {
        this.iDBeruf = iDBeruf;
    }

    public Integer getIDBeruf2() {
        return iDBeruf2;
    }

    public void setIDBeruf2(Integer iDBeruf2) {
        this.iDBeruf2 = iDBeruf2;
    }

    public Integer getIDBeruf3() {
        return iDBeruf3;
    }

    public void setIDBeruf3(Integer iDBeruf3) {
        this.iDBeruf3 = iDBeruf3;
    }

    public Integer getIDKlassenlehrer() {
        return iDKlassenlehrer;
    }

    public void setIDKlassenlehrer(Integer iDKlassenlehrer) {
        this.iDKlassenlehrer = iDKlassenlehrer;
    }

    public short getIDStatus() {
        return iDStatus;
    }

    public void setIDStatus(short iDStatus) {
        this.iDStatus = iDStatus;
    }

    public Integer getArt() {
        return art;
    }

    public void setArt(Integer art) {
        this.art = art;
    }

    public String getAktiv() {
        return aktiv;
    }

    public void setAktiv(String aktiv) {
        this.aktiv = aktiv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (klid != null ? klid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblKlassen)) {
            return false;
        }
        TblKlassen other = (TblKlassen) object;
        if ((this.klid == null && other.klid != null) || (this.klid != null && !this.klid.equals(other.klid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "de.tuttas.dworest.TblKlassen[ klid=" + klid + " ]";
    }
    
}
