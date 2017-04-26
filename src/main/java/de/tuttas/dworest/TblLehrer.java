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
@Table(name = "tbl_lehrer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblLehrer.findAll", query = "SELECT t FROM TblLehrer t")
    , @NamedQuery(name = "TblLehrer.findByLId", query = "SELECT t FROM TblLehrer t WHERE t.lId = :lId")
    , @NamedQuery(name = "TblLehrer.findByLehrername", query = "SELECT t FROM TblLehrer t WHERE t.lehrername = :lehrername")
    , @NamedQuery(name = "TblLehrer.findByVorname", query = "SELECT t FROM TblLehrer t WHERE t.vorname = :vorname")
    , @NamedQuery(name = "TblLehrer.findByKuerzel", query = "SELECT t FROM TblLehrer t WHERE t.kuerzel = :kuerzel")
    , @NamedQuery(name = "TblLehrer.findByGeschlecht", query = "SELECT t FROM TblLehrer t WHERE t.geschlecht = :geschlecht")
    , @NamedQuery(name = "TblLehrer.findByIDStatus", query = "SELECT t FROM TblLehrer t WHERE t.iDStatus = :iDStatus")
    , @NamedQuery(name = "TblLehrer.findByPasswort", query = "SELECT t FROM TblLehrer t WHERE t.passwort = :passwort")
    , @NamedQuery(name = "TblLehrer.findByUsername", query = "SELECT t FROM TblLehrer t WHERE t.username = :username")
    , @NamedQuery(name = "TblLehrer.findByAktiv", query = "SELECT t FROM TblLehrer t WHERE t.aktiv = :aktiv")
    , @NamedQuery(name = "TblLehrer.findByDIFAbteilungen", query = "SELECT t FROM TblLehrer t WHERE t.dIFAbteilungen = :dIFAbteilungen")
    , @NamedQuery(name = "TblLehrer.findByLogintime", query = "SELECT t FROM TblLehrer t WHERE t.logintime = :logintime")
    , @NamedQuery(name = "TblLehrer.findByRegtime", query = "SELECT t FROM TblLehrer t WHERE t.regtime = :regtime")
    , @NamedQuery(name = "TblLehrer.findByEmail", query = "SELECT t FROM TblLehrer t WHERE t.email = :email")})
public class TblLehrer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "LId")
    private Integer lId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Lehrername")
    private String lehrername;
    @Size(max = 30)
    @Column(name = "Vorname")
    private String vorname;
    @Size(max = 10)
    @Column(name = "Kuerzel")
    private String kuerzel;
    @Column(name = "Geschlecht")
    private Character geschlecht;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Status")
    private short iDStatus;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Passwort")
    private String passwort;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "aktiv")
    private String aktiv;
    @Size(max = 255)
    @Column(name = "DIFAbteilungen")
    private String dIFAbteilungen;
    @Size(max = 20)
    @Column(name = "logintime")
    private String logintime;
    @Size(max = 20)
    @Column(name = "regtime")
    private String regtime;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "Email")
    private String email;

    public TblLehrer() {
    }

    public TblLehrer(Integer lId) {
        this.lId = lId;
    }

    public TblLehrer(Integer lId, String lehrername, short iDStatus, String passwort, String username, String aktiv) {
        this.lId = lId;
        this.lehrername = lehrername;
        this.iDStatus = iDStatus;
        this.passwort = passwort;
        this.username = username;
        this.aktiv = aktiv;
    }

    public Integer getLId() {
        return lId;
    }

    public void setLId(Integer lId) {
        this.lId = lId;
    }

    public String getLehrername() {
        return lehrername;
    }

    public void setLehrername(String lehrername) {
        this.lehrername = lehrername;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getKuerzel() {
        return kuerzel;
    }

    public void setKuerzel(String kuerzel) {
        this.kuerzel = kuerzel;
    }

    public Character getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(Character geschlecht) {
        this.geschlecht = geschlecht;
    }

    public short getIDStatus() {
        return iDStatus;
    }

    public void setIDStatus(short iDStatus) {
        this.iDStatus = iDStatus;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAktiv() {
        return aktiv;
    }

    public void setAktiv(String aktiv) {
        this.aktiv = aktiv;
    }

    public String getDIFAbteilungen() {
        return dIFAbteilungen;
    }

    public void setDIFAbteilungen(String dIFAbteilungen) {
        this.dIFAbteilungen = dIFAbteilungen;
    }

    public String getLogintime() {
        return logintime;
    }

    public void setLogintime(String logintime) {
        this.logintime = logintime;
    }

    public String getRegtime() {
        return regtime;
    }

    public void setRegtime(String regtime) {
        this.regtime = regtime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lId != null ? lId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblLehrer)) {
            return false;
        }
        TblLehrer other = (TblLehrer) object;
        if ((this.lId == null && other.lId != null) || (this.lId != null && !this.lId.equals(other.lId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "de.tuttas.dworest.TblLehrer[ lId=" + lId + " ]";
    }
    
}
