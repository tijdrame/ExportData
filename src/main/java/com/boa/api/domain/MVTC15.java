package com.boa.api.domain;

import java.util.Date;

/**
 * MVTC15
 */
public class MVTC15 {

    private String compte, libelle, codopsc, expl, natop, refrel, nooper;
    private Date datoper, datval;
    private Double mntdev;

    public String getCompte() {
        return this.compte;
    }

    public void setCompte(String compte) {
        this.compte = compte;
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

    @Override
    public String toString() {
        return "{" +
            " compte='" + compte + "'" +
            ", libelle='" + libelle + "'" +
            ", codopsc='" + codopsc + "'" +
            ", expl='" + expl + "'" +
            ", natop='" + natop + "'" +
            ", refrel='" + refrel + "'" +
            ", nooper='" + nooper + "'" +
            ", datoper='" + datoper + "'" +
            ", datval='" + datval + "'" +
            ", mntdev='" + mntdev + "'" +
            "}";
    }

}