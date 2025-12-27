package com.splitwise.splitwise.entities;

import jakarta.persistence.*;

@Entity
@Table(name="t_country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="COUNTRY_PK_ID")
    private Integer countryPkId;

    @Column(name="COUNTRY_NAME")
    private String countryName;

    @Column(name="COUNTRY_CODE")
    private String countryCode;

    public Integer getCountryPkId() {
        return countryPkId;
    }

    public void setCountryPkId(Integer countryPkId) {
        this.countryPkId = countryPkId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
