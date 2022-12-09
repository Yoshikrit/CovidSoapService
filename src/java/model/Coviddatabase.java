/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
 * @author acer
 */
@Entity
@Table(name = "COVIDDATABASE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Coviddatabase.findAll", query = "SELECT c FROM Coviddatabase c"),
    @NamedQuery(name = "Coviddatabase.findBySeq", query = "SELECT c FROM Coviddatabase c WHERE c.seq = :seq"),
    @NamedQuery(name = "Coviddatabase.findByCovidyear", query = "SELECT c FROM Coviddatabase c WHERE c.covidyear = :covidyear"),
    @NamedQuery(name = "Coviddatabase.findByWeeknum", query = "SELECT c FROM Coviddatabase c WHERE c.weeknum = :weeknum"),
    @NamedQuery(name = "Coviddatabase.findByNewCase", query = "SELECT c FROM Coviddatabase c WHERE c.newCase = :newCase"),
    @NamedQuery(name = "Coviddatabase.findByTotalCase", query = "SELECT c FROM Coviddatabase c WHERE c.totalCase = :totalCase"),
    @NamedQuery(name = "Coviddatabase.findByNewCaseExcludeabroad", query = "SELECT c FROM Coviddatabase c WHERE c.newCaseExcludeabroad = :newCaseExcludeabroad"),
    @NamedQuery(name = "Coviddatabase.findByTotalCaseExcludeabroad", query = "SELECT c FROM Coviddatabase c WHERE c.totalCaseExcludeabroad = :totalCaseExcludeabroad"),
    @NamedQuery(name = "Coviddatabase.findByNewRecovered", query = "SELECT c FROM Coviddatabase c WHERE c.newRecovered = :newRecovered"),
    @NamedQuery(name = "Coviddatabase.findByTotalRecovered", query = "SELECT c FROM Coviddatabase c WHERE c.totalRecovered = :totalRecovered"),
    @NamedQuery(name = "Coviddatabase.findByNewDeath", query = "SELECT c FROM Coviddatabase c WHERE c.newDeath = :newDeath"),
    @NamedQuery(name = "Coviddatabase.findByTotalDeath", query = "SELECT c FROM Coviddatabase c WHERE c.totalDeath = :totalDeath"),
    @NamedQuery(name = "Coviddatabase.findByCaseForeign", query = "SELECT c FROM Coviddatabase c WHERE c.caseForeign = :caseForeign"),
    @NamedQuery(name = "Coviddatabase.findByCasePrison", query = "SELECT c FROM Coviddatabase c WHERE c.casePrison = :casePrison"),
    @NamedQuery(name = "Coviddatabase.findByCaseWalkin", query = "SELECT c FROM Coviddatabase c WHERE c.caseWalkin = :caseWalkin"),
    @NamedQuery(name = "Coviddatabase.findByCaseNewPrev", query = "SELECT c FROM Coviddatabase c WHERE c.caseNewPrev = :caseNewPrev"),
    @NamedQuery(name = "Coviddatabase.findByCaseNewDiff", query = "SELECT c FROM Coviddatabase c WHERE c.caseNewDiff = :caseNewDiff"),
    @NamedQuery(name = "Coviddatabase.findByDeathNewPrev", query = "SELECT c FROM Coviddatabase c WHERE c.deathNewPrev = :deathNewPrev"),
    @NamedQuery(name = "Coviddatabase.findByDeathNewDiff", query = "SELECT c FROM Coviddatabase c WHERE c.deathNewDiff = :deathNewDiff"),
    @NamedQuery(name = "Coviddatabase.findByUpdateDate", query = "SELECT c FROM Coviddatabase c WHERE c.updateDate = :updateDate")})
public class Coviddatabase implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SEQ")
    private Integer seq;
    @Column(name = "COVIDYEAR")
    private Integer covidyear;
    @Column(name = "WEEKNUM")
    private Integer weeknum;
    @Column(name = "NEW_CASE")
    private Integer newCase;
    @Column(name = "TOTAL_CASE")
    private Integer totalCase;
    @Column(name = "NEW_CASE_EXCLUDEABROAD")
    private Integer newCaseExcludeabroad;
    @Column(name = "TOTAL_CASE_EXCLUDEABROAD")
    private Integer totalCaseExcludeabroad;
    @Column(name = "NEW_RECOVERED")
    private Integer newRecovered;
    @Column(name = "TOTAL_RECOVERED")
    private Integer totalRecovered;
    @Column(name = "NEW_DEATH")
    private Integer newDeath;
    @Column(name = "TOTAL_DEATH")
    private Integer totalDeath;
    @Column(name = "CASE_FOREIGN")
    private Integer caseForeign;
    @Column(name = "CASE_PRISON")
    private Integer casePrison;
    @Column(name = "CASE_WALKIN")
    private Integer caseWalkin;
    @Column(name = "CASE_NEW_PREV")
    private Integer caseNewPrev;
    @Column(name = "CASE_NEW_DIFF")
    private Integer caseNewDiff;
    @Column(name = "DEATH_NEW_PREV")
    private Integer deathNewPrev;
    @Column(name = "DEATH_NEW_DIFF")
    private Integer deathNewDiff;
    @Size(max = 80)
    @Column(name = "UPDATE_DATE")
    private String updateDate;

    public Coviddatabase() {
    }

    public Coviddatabase(Integer covidyear, Integer weeknum, Integer newCase, Integer totalCase, Integer newCaseExcludeabroad, Integer totalCaseExcludeabroad, Integer newRecovered, Integer totalRecovered, Integer newDeath, Integer totalDeath, Integer caseForeign, Integer casePrison, Integer caseWalkin, Integer caseNewPrev, Integer caseNewDiff, Integer deathNewPrev, Integer deathNewDiff, String updateDate) {
        this.covidyear = covidyear;
        this.weeknum = weeknum;
        this.newCase = newCase;
        this.totalCase = totalCase;
        this.newCaseExcludeabroad = newCaseExcludeabroad;
        this.totalCaseExcludeabroad = totalCaseExcludeabroad;
        this.newRecovered = newRecovered;
        this.totalRecovered = totalRecovered;
        this.newDeath = newDeath;
        this.totalDeath = totalDeath;
        this.caseForeign = caseForeign;
        this.casePrison = casePrison;
        this.caseWalkin = caseWalkin;
        this.caseNewPrev = caseNewPrev;
        this.caseNewDiff = caseNewDiff;
        this.deathNewPrev = deathNewPrev;
        this.deathNewDiff = deathNewDiff;
        this.updateDate = updateDate;
    }
    

    public Coviddatabase(Integer seq) {
        this.seq = seq;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getCovidyear() {
        return covidyear;
    }

    public void setCovidyear(Integer covidyear) {
        this.covidyear = covidyear;
    }

    public Integer getWeeknum() {
        return weeknum;
    }

    public void setWeeknum(Integer weeknum) {
        this.weeknum = weeknum;
    }

    public Integer getNewCase() {
        return newCase;
    }

    public void setNewCase(Integer newCase) {
        this.newCase = newCase;
    }

    public Integer getTotalCase() {
        return totalCase;
    }

    public void setTotalCase(Integer totalCase) {
        this.totalCase = totalCase;
    }

    public Integer getNewCaseExcludeabroad() {
        return newCaseExcludeabroad;
    }

    public void setNewCaseExcludeabroad(Integer newCaseExcludeabroad) {
        this.newCaseExcludeabroad = newCaseExcludeabroad;
    }

    public Integer getTotalCaseExcludeabroad() {
        return totalCaseExcludeabroad;
    }

    public void setTotalCaseExcludeabroad(Integer totalCaseExcludeabroad) {
        this.totalCaseExcludeabroad = totalCaseExcludeabroad;
    }

    public Integer getNewRecovered() {
        return newRecovered;
    }

    public void setNewRecovered(Integer newRecovered) {
        this.newRecovered = newRecovered;
    }

    public Integer getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(Integer totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public Integer getNewDeath() {
        return newDeath;
    }

    public void setNewDeath(Integer newDeath) {
        this.newDeath = newDeath;
    }

    public Integer getTotalDeath() {
        return totalDeath;
    }

    public void setTotalDeath(Integer totalDeath) {
        this.totalDeath = totalDeath;
    }

    public Integer getCaseForeign() {
        return caseForeign;
    }

    public void setCaseForeign(Integer caseForeign) {
        this.caseForeign = caseForeign;
    }

    public Integer getCasePrison() {
        return casePrison;
    }

    public void setCasePrison(Integer casePrison) {
        this.casePrison = casePrison;
    }

    public Integer getCaseWalkin() {
        return caseWalkin;
    }

    public void setCaseWalkin(Integer caseWalkin) {
        this.caseWalkin = caseWalkin;
    }

    public Integer getCaseNewPrev() {
        return caseNewPrev;
    }

    public void setCaseNewPrev(Integer caseNewPrev) {
        this.caseNewPrev = caseNewPrev;
    }

    public Integer getCaseNewDiff() {
        return caseNewDiff;
    }

    public void setCaseNewDiff(Integer caseNewDiff) {
        this.caseNewDiff = caseNewDiff;
    }

    public Integer getDeathNewPrev() {
        return deathNewPrev;
    }

    public void setDeathNewPrev(Integer deathNewPrev) {
        this.deathNewPrev = deathNewPrev;
    }

    public Integer getDeathNewDiff() {
        return deathNewDiff;
    }

    public void setDeathNewDiff(Integer deathNewDiff) {
        this.deathNewDiff = deathNewDiff;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seq != null ? seq.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Coviddatabase)) {
            return false;
        }
        Coviddatabase other = (Coviddatabase) object;
        if ((this.seq == null && other.seq != null) || (this.seq != null && !this.seq.equals(other.seq))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Coviddatabase[ seq=" + seq + " ]";
    }
    
}
