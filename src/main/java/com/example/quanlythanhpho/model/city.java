package com.example.quanlythanhpho.model;

import javax.persistence.*;

@Entity
@Table(name = "cities")
public class city {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;
    private String country;
    private int area;
    private int population;
    private int GDP;
    private String describe;

    public city() {
    }

    public city(String name, String country, int area, int population, int GDP, String describe) {
        this.name = name;
        this.country = country;
        this.area = area;
        this.population = population;
        this.GDP = GDP;
        this.describe = describe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getGDP() {
        return GDP;
    }

    public void setGDP(int GDP) {
        this.GDP = GDP;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
