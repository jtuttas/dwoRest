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
@Table(name = "tbl_beruf")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblBeruf.findAll", query = "SELECT t FROM TblBeruf t")
    , @NamedQuery(name = "TblBeruf.findByBId", query = "SELECT t FROM TblBeruf t WHERE t.bId = :bId")
    , @NamedQuery(name = "TblBeruf.findByBerufname", query = "SELECT t FROM TblBeruf t WHERE t.berufname = :berufname")
    , @NamedQuery(name = "TblBeruf.findByIDAbteilung", query = "SELECT t FROM TblBeruf t WHERE t.iDAbteilung = :iDAbteilung")
    , @NamedQuery(name = "TblBeruf.findByIDBLeitung", query = "SELECT t FROM TblBeruf t WHERE t.iDBLeitung = :iDBLeitung")
    , @NamedQuery(name = "TblBeruf.findByIDSchema", query = "SELECT t FROM TblBeruf t WHERE t.iDSchema = :iDSchema")})
public class TblBeruf implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "BId")
    private Integer bId;
    @Size(max = 255)
    @Column(name = "Berufname")
    private String berufname;
    @Column(name = "ID_Abteilung")
    private Integer iDAbteilung;
    @Column(name = "ID_BLeitung")
    private Integer iDBLeitung;
    @Column(name = "ID_Schema")
    private Integer iDSchema;

    public TblBeruf() {
    }

    public TblBeruf(Integer bId) {
        this.bId = bId;
    }

    public Integer getBId() {
        return bId;
    }

    public void setBId(Integer bId) {
        this.bId = bId;
    }

    public String getBerufname() {
        return berufname;
    }

    public void setBerufname(String berufname) {
        this.berufname = berufname;
    }

    public Integer getIDAbteilung() {
        return iDAbteilung;
    }

    public void setIDAbteilung(Integer iDAbteilung) {
        this.iDAbteilung = iDAbteilung;
    }

    public Integer getIDBLeitung() {
        return iDBLeitung;
    }

    public void setIDBLeitung(Integer iDBLeitung) {
        this.iDBLeitung = iDBLeitung;
    }

    public Integer getIDSchema() {
        return iDSchema;
    }

    public void setIDSchema(Integer iDSchema) {
        this.iDSchema = iDSchema;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bId != null ? bId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblBeruf)) {
            return false;
        }
        TblBeruf other = (TblBeruf) object;
        if ((this.bId == null && other.bId != null) || (this.bId != null && !this.bId.equals(other.bId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "de.tuttas.dworest.TblBeruf[ bId=" + bId + " ]";
    }
    
}
