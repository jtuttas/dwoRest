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
@Table(name = "tbl_lernfeld")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblLernfeld.findAll", query = "SELECT t FROM TblLernfeld t")
    , @NamedQuery(name = "TblLernfeld.findByLfid", query = "SELECT t FROM TblLernfeld t WHERE t.lfid = :lfid")
    , @NamedQuery(name = "TblLernfeld.findByLFVerweis", query = "SELECT t FROM TblLernfeld t WHERE t.lFVerweis = :lFVerweis")
    , @NamedQuery(name = "TblLernfeld.findByBezeichnung", query = "SELECT t FROM TblLernfeld t WHERE t.bezeichnung = :bezeichnung")
    , @NamedQuery(name = "TblLernfeld.findByLFVortitel", query = "SELECT t FROM TblLernfeld t WHERE t.lFVortitel = :lFVortitel")
    , @NamedQuery(name = "TblLernfeld.findByLfnr", query = "SELECT t FROM TblLernfeld t WHERE t.lfnr = :lfnr")
    , @NamedQuery(name = "TblLernfeld.findByIDBerufFach", query = "SELECT t FROM TblLernfeld t WHERE t.iDBerufFach = :iDBerufFach")
    , @NamedQuery(name = "TblLernfeld.findByLFDauer", query = "SELECT t FROM TblLernfeld t WHERE t.lFDauer = :lFDauer")
    , @NamedQuery(name = "TblLernfeld.findByStart", query = "SELECT t FROM TblLernfeld t WHERE t.start = :start")
    , @NamedQuery(name = "TblLernfeld.findByEnde", query = "SELECT t FROM TblLernfeld t WHERE t.ende = :ende")
    , @NamedQuery(name = "TblLernfeld.findByLFErsteller", query = "SELECT t FROM TblLernfeld t WHERE t.lFErsteller = :lFErsteller")
    , @NamedQuery(name = "TblLernfeld.findByLFGeaendertdurch", query = "SELECT t FROM TblLernfeld t WHERE t.lFGeaendertdurch = :lFGeaendertdurch")
    , @NamedQuery(name = "TblLernfeld.findByLFErstelltam", query = "SELECT t FROM TblLernfeld t WHERE t.lFErstelltam = :lFErstelltam")
    , @NamedQuery(name = "TblLernfeld.findByLFGeaendertam", query = "SELECT t FROM TblLernfeld t WHERE t.lFGeaendertam = :lFGeaendertam")
    , @NamedQuery(name = "TblLernfeld.findBySichtbar", query = "SELECT t FROM TblLernfeld t WHERE t.sichtbar = :sichtbar")
    , @NamedQuery(name = "TblLernfeld.findByLSVerweis", query = "SELECT t FROM TblLernfeld t WHERE t.lSVerweis = :lSVerweis")
    , @NamedQuery(name = "TblLernfeld.findByASVerweis", query = "SELECT t FROM TblLernfeld t WHERE t.aSVerweis = :aSVerweis")
    , @NamedQuery(name = "TblLernfeld.findByWissen", query = "SELECT t FROM TblLernfeld t WHERE t.wissen = :wissen")
    , @NamedQuery(name = "TblLernfeld.findByFertig", query = "SELECT t FROM TblLernfeld t WHERE t.fertig = :fertig")
    , @NamedQuery(name = "TblLernfeld.findBySozial", query = "SELECT t FROM TblLernfeld t WHERE t.sozial = :sozial")
    , @NamedQuery(name = "TblLernfeld.findBySelbst", query = "SELECT t FROM TblLernfeld t WHERE t.selbst = :selbst")
    , @NamedQuery(name = "TblLernfeld.findByPraefixID", query = "SELECT t FROM TblLernfeld t WHERE t.praefixID = :praefixID")
    , @NamedQuery(name = "TblLernfeld.findByPraefixName", query = "SELECT t FROM TblLernfeld t WHERE t.praefixName = :praefixName")
    , @NamedQuery(name = "TblLernfeld.findByPosition", query = "SELECT t FROM TblLernfeld t WHERE t.position = :position")
    , @NamedQuery(name = "TblLernfeld.findByASPosition", query = "SELECT t FROM TblLernfeld t WHERE t.aSPosition = :aSPosition")
    , @NamedQuery(name = "TblLernfeld.findByDeletet", query = "SELECT t FROM TblLernfeld t WHERE t.deletet = :deletet")})
public class TblLernfeld implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "LFID")
    private Integer lfid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LFVerweis")
    private int lFVerweis;
    @Size(max = 255)
    @Column(name = "Bezeichnung")
    private String bezeichnung;
    @Column(name = "LFVortitel")
    private Short lFVortitel;
    @Column(name = "LFNR")
    private Short lfnr;
    @Column(name = "ID_BerufFach")
    private Integer iDBerufFach;
    @Column(name = "LFDauer")
    private Integer lFDauer;
    @Column(name = "Start")
    private Integer start;
    @Column(name = "Ende")
    private Integer ende;
    @Size(max = 100)
    @Column(name = "LFErsteller")
    private String lFErsteller;
    @Size(max = 100)
    @Column(name = "LFGeaendert_durch")
    private String lFGeaendertdurch;
    @Size(max = 100)
    @Column(name = "LFErstellt_am")
    private String lFErstelltam;
    @Size(max = 100)
    @Column(name = "LFGeaendert_am")
    private String lFGeaendertam;
    @Size(max = 5)
    @Column(name = "Sichtbar")
    private String sichtbar;
    @Column(name = "LSVerweis")
    private Integer lSVerweis;
    @Column(name = "ASVerweis")
    private Integer aSVerweis;
    @Lob
    @Size(max = 65535)
    @Column(name = "Ziel")
    private String ziel;
    @Size(max = 255)
    @Column(name = "Wissen")
    private String wissen;
    @Size(max = 255)
    @Column(name = "Fertig")
    private String fertig;
    @Size(max = 255)
    @Column(name = "Sozial")
    private String sozial;
    @Size(max = 255)
    @Column(name = "Selbst")
    private String selbst;
    @Column(name = "PraefixID")
    private Short praefixID;
    @Size(max = 50)
    @Column(name = "PraefixName")
    private String praefixName;
    @Column(name = "Position")
    private Short position;
    @Column(name = "ASPosition")
    private Short aSPosition;
    @Size(max = 5)
    @Column(name = "Deletet")
    private String deletet;

    public TblLernfeld() {
    }

    public TblLernfeld(Integer lfid) {
        this.lfid = lfid;
    }

    public TblLernfeld(Integer lfid, int lFVerweis) {
        this.lfid = lfid;
        this.lFVerweis = lFVerweis;
    }

    public Integer getLfid() {
        return lfid;
    }

    public void setLfid(Integer lfid) {
        this.lfid = lfid;
    }

    public int getLFVerweis() {
        return lFVerweis;
    }

    public void setLFVerweis(int lFVerweis) {
        this.lFVerweis = lFVerweis;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Short getLFVortitel() {
        return lFVortitel;
    }

    public void setLFVortitel(Short lFVortitel) {
        this.lFVortitel = lFVortitel;
    }

    public Short getLfnr() {
        return lfnr;
    }

    public void setLfnr(Short lfnr) {
        this.lfnr = lfnr;
    }

    public Integer getIDBerufFach() {
        return iDBerufFach;
    }

    public void setIDBerufFach(Integer iDBerufFach) {
        this.iDBerufFach = iDBerufFach;
    }

    public Integer getLFDauer() {
        return lFDauer;
    }

    public void setLFDauer(Integer lFDauer) {
        this.lFDauer = lFDauer;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnde() {
        return ende;
    }

    public void setEnde(Integer ende) {
        this.ende = ende;
    }

    public String getLFErsteller() {
        return lFErsteller;
    }

    public void setLFErsteller(String lFErsteller) {
        this.lFErsteller = lFErsteller;
    }

    public String getLFGeaendertdurch() {
        return lFGeaendertdurch;
    }

    public void setLFGeaendertdurch(String lFGeaendertdurch) {
        this.lFGeaendertdurch = lFGeaendertdurch;
    }

    public String getLFErstelltam() {
        return lFErstelltam;
    }

    public void setLFErstelltam(String lFErstelltam) {
        this.lFErstelltam = lFErstelltam;
    }

    public String getLFGeaendertam() {
        return lFGeaendertam;
    }

    public void setLFGeaendertam(String lFGeaendertam) {
        this.lFGeaendertam = lFGeaendertam;
    }

    public String getSichtbar() {
        return sichtbar;
    }

    public void setSichtbar(String sichtbar) {
        this.sichtbar = sichtbar;
    }

    public Integer getLSVerweis() {
        return lSVerweis;
    }

    public void setLSVerweis(Integer lSVerweis) {
        this.lSVerweis = lSVerweis;
    }

    public Integer getASVerweis() {
        return aSVerweis;
    }

    public void setASVerweis(Integer aSVerweis) {
        this.aSVerweis = aSVerweis;
    }

    public String getZiel() {
        return ziel;
    }

    public void setZiel(String ziel) {
        this.ziel = ziel;
    }

    public String getWissen() {
        return wissen;
    }

    public void setWissen(String wissen) {
        this.wissen = wissen;
    }

    public String getFertig() {
        return fertig;
    }

    public void setFertig(String fertig) {
        this.fertig = fertig;
    }

    public String getSozial() {
        return sozial;
    }

    public void setSozial(String sozial) {
        this.sozial = sozial;
    }

    public String getSelbst() {
        return selbst;
    }

    public void setSelbst(String selbst) {
        this.selbst = selbst;
    }

    public Short getPraefixID() {
        return praefixID;
    }

    public void setPraefixID(Short praefixID) {
        this.praefixID = praefixID;
    }

    public String getPraefixName() {
        return praefixName;
    }

    public void setPraefixName(String praefixName) {
        this.praefixName = praefixName;
    }

    public Short getPosition() {
        return position;
    }

    public void setPosition(Short position) {
        this.position = position;
    }

    public Short getASPosition() {
        return aSPosition;
    }

    public void setASPosition(Short aSPosition) {
        this.aSPosition = aSPosition;
    }

    public String getDeletet() {
        return deletet;
    }

    public void setDeletet(String deletet) {
        this.deletet = deletet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lfid != null ? lfid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblLernfeld)) {
            return false;
        }
        TblLernfeld other = (TblLernfeld) object;
        if ((this.lfid == null && other.lfid != null) || (this.lfid != null && !this.lfid.equals(other.lfid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "de.tuttas.dworest.TblLernfeld[ lfid=" + lfid + " ]";
    }
    
}
