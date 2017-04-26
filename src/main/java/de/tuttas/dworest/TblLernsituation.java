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
import javax.persistence.Lob;
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
@Table(name = "tbl_lernsituation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblLernsituation.findAll", query = "SELECT t FROM TblLernsituation t")
    , @NamedQuery(name = "TblLernsituation.findByBeruf", query = "SELECT new de.tuttas.dworest.helper.Lernsituation(t.lsid,t.name,t.lfNr,tlf.bezeichnung,t.uStunden,t.von,t.bis,t.ersteller,t.deletet,t.sichtbar) FROM TblLernsituation t JOIN TblLernfeld tlf on t.iDLernfeld=tlf.lfid JOIN TblBeruffach tbf on tlf.iDBerufFach=tbf.bfid JOIN TblUformberuf tuf ON tbf.iDUFormBeruf=tuf.ubid WHERE tuf.iDBeruf = :idBeruf")
    , @NamedQuery(name = "TblLernsituation.findByLsid", query = "SELECT t FROM TblLernsituation t WHERE t.lsid = :lsid")
    , @NamedQuery(name = "TblLernsituation.findByName", query = "SELECT t FROM TblLernsituation t WHERE t.name = :name")
    , @NamedQuery(name = "TblLernsituation.findByVerweis", query = "SELECT t FROM TblLernsituation t WHERE t.verweis = :verweis")
    , @NamedQuery(name = "TblLernsituation.findByVortitel", query = "SELECT t FROM TblLernsituation t WHERE t.vortitel = :vortitel")
    , @NamedQuery(name = "TblLernsituation.findByLsnr", query = "SELECT t FROM TblLernsituation t WHERE t.lsnr = :lsnr")
    , @NamedQuery(name = "TblLernsituation.findByLfNr", query = "SELECT t FROM TblLernsituation t WHERE t.lfNr = :lfNr")
    , @NamedQuery(name = "TblLernsituation.findByIDLernfeld", query = "SELECT t FROM TblLernsituation t WHERE t.iDLernfeld = :iDLernfeld")
    , @NamedQuery(name = "TblLernsituation.findByUStunden", query = "SELECT t FROM TblLernsituation t WHERE t.uStunden = :uStunden")
    , @NamedQuery(name = "TblLernsituation.findByVon", query = "SELECT t FROM TblLernsituation t WHERE t.von = :von")
    , @NamedQuery(name = "TblLernsituation.findByBis", query = "SELECT t FROM TblLernsituation t WHERE t.bis = :bis")
    , @NamedQuery(name = "TblLernsituation.findByErsteller", query = "SELECT t FROM TblLernsituation t WHERE t.ersteller = :ersteller")
    , @NamedQuery(name = "TblLernsituation.findByErstelltam", query = "SELECT t FROM TblLernsituation t WHERE t.erstelltam = :erstelltam")
    , @NamedQuery(name = "TblLernsituation.findByDeletet", query = "SELECT t FROM TblLernsituation t WHERE t.deletet = :deletet")
    , @NamedQuery(name = "TblLernsituation.findBySichtbar", query = "SELECT t FROM TblLernsituation t WHERE t.sichtbar = :sichtbar")
    , @NamedQuery(name = "TblLernsituation.findByFarbid", query = "SELECT t FROM TblLernsituation t WHERE t.farbid = :farbid")})
public class TblLernsituation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "LSID")
    private Integer lsid;
    @Size(max = 255)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Verweis")
    private int verweis;
    @Column(name = "Vortitel")
    private Short vortitel;
    @Column(name = "LSNR")
    private Integer lsnr;
    @Column(name = "LF_NR")
    private Short lfNr;
    @Column(name = "ID_Lernfeld")
    private Integer iDLernfeld;
    @Column(name = "UStunden")
    private Integer uStunden;
    @Column(name = "Von")
    private Short von;
    @Column(name = "Bis")
    private Short bis;
    @Lob
    @Size(max = 65535)
    @Column(name = "Szenario")
    private String szenario;
    @Lob
    @Size(max = 65535)
    @Column(name = "Handlungsprodukt")
    private String handlungsprodukt;
    @Lob
    @Size(max = 65535)
    @Column(name = "Kompetenzen")
    private String kompetenzen;
    @Lob
    @Size(max = 65535)
    @Column(name = "Inhalte")
    private String inhalte;
    @Lob
    @Size(max = 65535)
    @Column(name = "Arbeitstechnik")
    private String arbeitstechnik;
    @Lob
    @Size(max = 65535)
    @Column(name = "Umaterial")
    private String umaterial;
    @Lob
    @Size(max = 65535)
    @Column(name = "Organisation")
    private String organisation;
    @Size(max = 100)
    @Column(name = "Ersteller")
    private String ersteller;
    @Size(max = 100)
    @Column(name = "Erstellt_am")
    private String erstelltam;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "Deletet")
    private String deletet;
    @Size(max = 5)
    @Column(name = "Sichtbar")
    private String sichtbar;
    @Column(name = "Farbid")
    private Integer farbid;

    public TblLernsituation() {
    }

    public TblLernsituation(Integer lsid) {
        this.lsid = lsid;
    }

    public TblLernsituation(Integer lsid, int verweis, String deletet) {
        this.lsid = lsid;
        this.verweis = verweis;
        this.deletet = deletet;
    }

    public Integer getLsid() {
        return lsid;
    }

    public void setLsid(Integer lsid) {
        this.lsid = lsid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVerweis() {
        return verweis;
    }

    public void setVerweis(int verweis) {
        this.verweis = verweis;
    }

    public Short getVortitel() {
        return vortitel;
    }

    public void setVortitel(Short vortitel) {
        this.vortitel = vortitel;
    }

    public Integer getLsnr() {
        return lsnr;
    }

    public void setLsnr(Integer lsnr) {
        this.lsnr = lsnr;
    }

    public Short getLfNr() {
        return lfNr;
    }

    public void setLfNr(Short lfNr) {
        this.lfNr = lfNr;
    }

    public Integer getIDLernfeld() {
        return iDLernfeld;
    }

    public void setIDLernfeld(Integer iDLernfeld) {
        this.iDLernfeld = iDLernfeld;
    }

    public Integer getUStunden() {
        return uStunden;
    }

    public void setUStunden(Integer uStunden) {
        this.uStunden = uStunden;
    }

    public Short getVon() {
        return von;
    }

    public void setVon(Short von) {
        this.von = von;
    }

    public Short getBis() {
        return bis;
    }

    public void setBis(Short bis) {
        this.bis = bis;
    }

    public String getSzenario() {
        return szenario;
    }

    public void setSzenario(String szenario) {
        this.szenario = szenario;
    }

    public String getHandlungsprodukt() {
        return handlungsprodukt;
    }

    public void setHandlungsprodukt(String handlungsprodukt) {
        this.handlungsprodukt = handlungsprodukt;
    }

    public String getKompetenzen() {
        return kompetenzen;
    }

    public void setKompetenzen(String kompetenzen) {
        this.kompetenzen = kompetenzen;
    }

    public String getInhalte() {
        return inhalte;
    }

    public void setInhalte(String inhalte) {
        this.inhalte = inhalte;
    }

    public String getArbeitstechnik() {
        return arbeitstechnik;
    }

    public void setArbeitstechnik(String arbeitstechnik) {
        this.arbeitstechnik = arbeitstechnik;
    }

    public String getUmaterial() {
        return umaterial;
    }

    public void setUmaterial(String umaterial) {
        this.umaterial = umaterial;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getErsteller() {
        return ersteller;
    }

    public void setErsteller(String ersteller) {
        this.ersteller = ersteller;
    }

    public String getErstelltam() {
        return erstelltam;
    }

    public void setErstelltam(String erstelltam) {
        this.erstelltam = erstelltam;
    }

    public String getDeletet() {
        return deletet;
    }

    public void setDeletet(String deletet) {
        this.deletet = deletet;
    }

    public String getSichtbar() {
        return sichtbar;
    }

    public void setSichtbar(String sichtbar) {
        this.sichtbar = sichtbar;
    }

    public Integer getFarbid() {
        return farbid;
    }

    public void setFarbid(Integer farbid) {
        this.farbid = farbid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lsid != null ? lsid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblLernsituation)) {
            return false;
        }
        TblLernsituation other = (TblLernsituation) object;
        if ((this.lsid == null && other.lsid != null) || (this.lsid != null && !this.lsid.equals(other.lsid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "de.tuttas.dworest.TblLernsituation[ lsid=" + lsid + " ]";
    }
    
}
