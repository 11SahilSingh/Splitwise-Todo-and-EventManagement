package com.splitwise.splitwise.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "t_city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CITY_PK_ID")
    Integer cityPkId;

    @Column(name = "CITY_NAME")
    String cityName;

    @Column(name = "ZIP_CODE")
    Integer zipCode;

    @Column(name = "CITY_CODE")
    Integer cityCode;

    public Integer getCityPkId() {
        return cityPkId;
    }

    public void setCityPkId(Integer cityPkId) {
        this.cityPkId = cityPkId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public Integer getCityCode() {
        return cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }
}
