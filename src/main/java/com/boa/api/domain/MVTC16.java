package com.boa.api.domain;

import java.util.Date;

/**
 * MVTC16
 */
public class MVTC16 {

    private String compte;
    private Date datoper;
    private Date datval;
    private Double mntdev;
    private String libelle;
    private String codopsc;    
    private String expl;    
    private String natop;    
    private String refrel;    
    private String nooper;
    private Date dathgen;
    private String noref;
    private Date datech;
    private Boolean xcash;

    public String getCompte() {
        return this.compte;
    }

    public void setCompte(String compte) {
        this.compte = compte;
    }

    public Date getDatoper() {
        return this.datoper;
    }

    public void setDatoper(Date datoper) {
        this.datoper = datoper;
    }

    public Date getDatval() {
        return this.datval;
    }

    public void setDatval(Date datval) {
        this.datval = datval;
    }

    public Double getMntdev() {
        return this.mntdev;
    }

    public void setMntdev(Double mntdev) {
        this.mntdev = mntdev;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCodopsc() {
        return this.codopsc;
    }

    public void setCodopsc(String codopsc) {
        this.codopsc = codopsc;
    }

    public String getExpl() {
        return this.expl;
    }

    public void setExpl(String expl) {
        this.expl = expl;
    }

    public String getNatop() {
        return this.natop;
    }

    public void setNatop(String natop) {
        this.natop = natop;
    }

    public String getRefrel() {
        return this.refrel;
    }

    public void setRefrel(String refrel) {
        this.refrel = refrel;
    }

    public String getNooper() {
        return this.nooper;
    }

    public void setNooper(String nooper) {
        this.nooper = nooper;
    }

    public Date getDathgen() {
        return this.dathgen;
    }

    public void setDathgen(Date dathgen) {
        this.dathgen = dathgen;
    }

    public String getNoref() {
        return this.noref;
    }

    public void setNoref(String noref) {
        this.noref = noref;
    }

    public Date getDatech() {
        return this.datech;
    }

    public void setDatech(Date datech) {
        this.datech = datech;
    }

    public Boolean isXcash() {
        return this.xcash;
    }

    public Boolean getXcash() {
        return this.xcash;
    }

    public void setXcash(Boolean xcash) {
        this.xcash = xcash;
    }

    @Override
    public String toString() {
        return "{" +
            " compte='" + getCompte() + "'" +
            ", datoper='" + getDatoper() + "'" +
            ", datval='" + getDatval() + "'" +
            ", mintdev='" + getMntdev() + "'" +
            ", libelle='" + getLibelle() + "'" +
            ", codopsc='" + getCodopsc() + "'" +
            ", expl='" + getExpl() + "'" +
            ", natop='" + getNatop() + "'" +
            ", refrel='" + getRefrel() + "'" +
            ", nooper='" + getNooper() + "'" +
            ", dathgen='" + getDathgen() + "'" +
            ", noref='" + getNoref() + "'" +
            ", datech='" + getDatech() + "'" +
            ", xcash='" + isXcash() + "'" +
            "}";
    }
    
}