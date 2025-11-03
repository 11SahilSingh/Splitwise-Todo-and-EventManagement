package com.splitwise.splitwise.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="sw_dist_person")
public class SwDistPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="DIST_PRN_PK_ID")
    private Integer distPrnPkId;

    @Column(name="EXPENCE_FK_ID")
    private Integer expenceFkId;

    @Column(name="LENDER_PERSON_FK_ID")
    private Integer lenderPersonFkId;

    @Column(name="LENDED_AMOUNT")
    private double lendedAmount;

    @Transient
    private List<SwPerson>  swPersonList;

    @Transient
    SwPerson distributionPerson;

    public Integer getExpenceFkId() {
        return expenceFkId;
    }

    public void setExpenceFkId(Integer expenceFkId) {
        this.expenceFkId = expenceFkId;
    }

    public Integer getDistPrnPkId() {
        return distPrnPkId;
    }

    public void setDistPrnPkId(Integer distPrnPkId) {
        this.distPrnPkId = distPrnPkId;
    }

    public Integer getLenderPersonFkId() {
        return lenderPersonFkId;
    }

    public void setLenderPersonFkId(Integer lenderPersonFkId) {
        this.lenderPersonFkId = lenderPersonFkId;
    }

    public double getLendedAmount() {
        return lendedAmount;
    }

    public void setLendedAmount(double lendedAmount) {
        this.lendedAmount = lendedAmount;
    }

    public List<SwPerson> getSwPersonList() {
        return swPersonList;
    }

    public void setSwPersonList(List<SwPerson> swPersonList) {
        this.swPersonList = swPersonList;
    }

    public SwPerson getDistributionPerson() {
        return distributionPerson;
    }

    public void setDistributionPerson(SwPerson distributionPerson) {
        this.distributionPerson = distributionPerson;
    }
}
