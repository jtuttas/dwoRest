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
@Table(name = "tbl_bildungsgang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblBildungsgang.findAll", query = "SELECT t FROM TblBildungsgang t")
    , @NamedQuery(name = "TblBildungsgang.findByBGId", query = "SELECT t FROM TblBildungsgang t WHERE t.bGId = :bGId")
    , @NamedQuery(name = "TblBildungsgang.findByIDAbt", query = "SELECT t FROM TblBildungsgang t WHERE t.iDAbt = :iDAbt")
    , @NamedQuery(name = "TblBildungsgang.findByName", query = "SELECT t FROM TblBildungsgang t WHERE t.name = :name")
    , @NamedQuery(name = "TblBildungsgang.findByIDBGLeiter", query = "SELECT t FROM TblBildungsgang t WHERE t.iDBGLeiter = :iDBGLeiter")
    , @NamedQuery(name = "TblBildungsgang.findByIDBGVertreter", query = "SELECT t FROM TblBildungsgang t WHERE t.iDBGVertreter = :iDBGVertreter")})
public class TblBildungsgang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "BGId")
    private Integer bGId;
    @Column(name = "ID_Abt")
    private Integer iDAbt;
    @Size(max = 255)
    @Column(name = "Name")
    private String name;
    @Column(name = "ID_BG_Leiter")
    private Integer iDBGLeiter;
    @Column(name = "ID_BG_Vertreter")
    private Integer iDBGVertreter;

    public TblBildungsgang() {
    }

    public TblBildungsgang(Integer bGId) {
        this.bGId = bGId;
    }

    public Integer getBGId() {
        return bGId;
    }

    public void setBGId(Integer bGId) {
        this.bGId = bGId;
    }

    public Integer getIDAbt() {
        return iDAbt;
    }

    public void setIDAbt(Integer iDAbt) {
        this.iDAbt = iDAbt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIDBGLeiter() {
        return iDBGLeiter;
    }

    public void setIDBGLeiter(Integer iDBGLeiter) {
        this.iDBGLeiter = iDBGLeiter;
    }

    public Integer getIDBGVertreter() {
        return iDBGVertreter;
    }

    public void setIDBGVertreter(Integer iDBGVertreter) {
        this.iDBGVertreter = iDBGVertreter;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bGId != null ? bGId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblBildungsgang)) {
            return false;
        }
        TblBildungsgang other = (TblBildungsgang) object;
        if ((this.bGId == null && other.bGId != null) || (this.bGId != null && !this.bGId.equals(other.bGId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "de.tuttas.dworest.TblBildungsgang[ bGId=" + bGId + " ]";
    }
    
}
