/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.tuttas.dworest.helper;

/**
 *
 * @author jtutt_000
 */
public class Lernsituation {
    private Integer id;
    private String Name;
    private Short Lf;
    private String LF_Name;
    private int UStunden;
    private Short von;
    private Short bis;
    private String ersteller;
    private String deleted;
    private String sichtbar;
    private Integer lsnr;
    
    public Lernsituation() {
        
    }
    
    public Lernsituation(Integer id, String Name, Short Lf, String LF_Name, int UStunden, Short von, Short bis, String ersteller, String deleted, String sichtbar,Integer lsnr) {
        this.id = id;
        this.Name = Name;
        this.Lf = Lf;
        this.LF_Name = LF_Name;
        this.UStunden = UStunden;
        this.von = von;
        this.bis = bis;
        this.ersteller = ersteller;
        this.deleted = deleted;
        this.sichtbar = sichtbar;
        this.lsnr=lsnr;
    }

    public Integer getLsnr() {
        return lsnr;
    }

    public void setLsnr(Integer lsnr) {
        this.lsnr = lsnr;
    }

    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Short getLf() {
        return Lf;
    }

    public void setLf(Short Lf) {
        this.Lf = Lf;
    }

    public String getLF_Name() {
        return LF_Name;
    }

    public void setLF_Name(String LF_Name) {
        this.LF_Name = LF_Name;
    }

    public int getUStunden() {
        return UStunden;
    }

    public void setUStunden(int UStunden) {
        this.UStunden = UStunden;
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

    public String getErsteller() {
        return ersteller;
    }

    public void setErsteller(String ersteller) {
        this.ersteller = ersteller;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getSichtbar() {
        return sichtbar;
    }

    public void setSichtbar(String sichtbar) {
        this.sichtbar = sichtbar;
    }
    
}
