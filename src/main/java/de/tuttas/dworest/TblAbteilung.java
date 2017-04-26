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
@Table(name = "tbl_abteilung")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblAbteilung.findAll", query = "SELECT t FROM TblAbteilung t")
    , @NamedQuery(name = "TblAbteilung.findByAId", query = "SELECT t FROM TblAbteilung t WHERE t.aId = :aId")
    , @NamedQuery(name = "TblAbteilung.findByAbteilungsname", query = "SELECT t FROM TblAbteilung t WHERE t.abteilungsname = :abteilungsname")
    , @NamedQuery(name = "TblAbteilung.findByAbteilungskuerzel", query = "SELECT t FROM TblAbteilung t WHERE t.abteilungskuerzel = :abteilungskuerzel")
    , @NamedQuery(name = "TblAbteilung.findByAbteilungserlaeuterung", query = "SELECT t FROM TblAbteilung t WHERE t.abteilungserlaeuterung = :abteilungserlaeuterung")
    , @NamedQuery(name = "TblAbteilung.findByIDSchulform", query = "SELECT t FROM TblAbteilung t WHERE t.iDSchulform = :iDSchulform")
    , @NamedQuery(name = "TblAbteilung.findByIDLeiter", query = "SELECT t FROM TblAbteilung t WHERE t.iDLeiter = :iDLeiter")
    , @NamedQuery(name = "TblAbteilung.findByIDVertreter", query = "SELECT t FROM TblAbteilung t WHERE t.iDVertreter = :iDVertreter")})
public class TblAbteilung implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "AId")
    private Integer aId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "Abteilungsname")
    private String abteilungsname;
    @Size(max = 4)
    @Column(name = "Abteilungskuerzel")
    private String abteilungskuerzel;
    @Size(max = 50)
    @Column(name = "Abteilungserlaeuterung")
    private String abteilungserlaeuterung;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Schulform")
    private int iDSchulform;
    @Column(name = "ID_Leiter")
    private Integer iDLeiter;
    @Column(name = "ID_Vertreter")
    private Integer iDVertreter;

    public TblAbteilung() {
    }

    public TblAbteilung(Integer aId) {
        this.aId = aId;
    }

    public TblAbteilung(Integer aId, String abteilungsname, int iDSchulform) {
        this.aId = aId;
        this.abteilungsname = abteilungsname;
        this.iDSchulform = iDSchulform;
    }

    public Integer getAId() {
        return aId;
    }

    public void setAId(Integer aId) {
        this.aId = aId;
    }

    public String getAbteilungsname() {
        return abteilungsname;
    }

    public void setAbteilungsname(String abteilungsname) {
        this.abteilungsname = abteilungsname;
    }

    public String getAbteilungskuerzel() {
        return abteilungskuerzel;
    }

    public void setAbteilungskuerzel(String abteilungskuerzel) {
        this.abteilungskuerzel = abteilungskuerzel;
    }

    public String getAbteilungserlaeuterung() {
        return abteilungserlaeuterung;
    }

    public void setAbteilungserlaeuterung(String abteilungserlaeuterung) {
        this.abteilungserlaeuterung = abteilungserlaeuterung;
    }

    public int getIDSchulform() {
        return iDSchulform;
    }

    public void setIDSchulform(int iDSchulform) {
        this.iDSchulform = iDSchulform;
    }

    public Integer getIDLeiter() {
        return iDLeiter;
    }

    public void setIDLeiter(Integer iDLeiter) {
        this.iDLeiter = iDLeiter;
    }

    public Integer getIDVertreter() {
        return iDVertreter;
    }

    public void setIDVertreter(Integer iDVertreter) {
        this.iDVertreter = iDVertreter;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aId != null ? aId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblAbteilung)) {
            return false;
        }
        TblAbteilung other = (TblAbteilung) object;
        if ((this.aId == null && other.aId != null) || (this.aId != null && !this.aId.equals(other.aId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "de.tuttas.dworest.TblAbteilung[ aId=" + aId + " ]";
    }
    
}
