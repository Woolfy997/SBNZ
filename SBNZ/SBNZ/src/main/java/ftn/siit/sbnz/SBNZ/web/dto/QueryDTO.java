package ftn.siit.sbnz.SBNZ.web.dto;

import ftn.siit.sbnz.SBNZ.model.Car;
import ftn.siit.sbnz.SBNZ.model.Query;

public class QueryDTO {

    private Integer budget;
    private Integer familySize;
    private Integer experience;
    private String purpose;
    private Boolean regNotExpensive;
    private Boolean lowFuelConsumption;
    private Boolean lowKm;
    private Integer age;
    private Boolean luxury;
    private String country;
    private String make;
    private String gear;
    private Boolean environment;

    public QueryDTO() {
    }

    public QueryDTO(Integer budget, Integer familySize, Integer experience, String purpose, Boolean regNotExpensive, Boolean lowFuelConsumption, Boolean lowKm, Integer age, Boolean luxury, String country, String make, String gear, Boolean environment) {
        this.budget = budget;
        this.familySize = familySize;
        this.experience = experience;
        this.purpose = purpose;
        this.regNotExpensive = regNotExpensive;
        this.lowFuelConsumption = lowFuelConsumption;
        this.lowKm = lowKm;
        this.age = age;
        this.luxury = luxury;
        this.country = country;
        this.make = make;
        this.gear = gear;
        this.environment = environment;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public Integer getFamilySize() {
        return familySize;
    }

    public void setFamilySize(Integer familySize) {
        this.familySize = familySize;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Boolean getRegNotExpensive() {
        return regNotExpensive;
    }

    public void setRegNotExpensive(Boolean regNotExpensive) {
        this.regNotExpensive = regNotExpensive;
    }

    public Boolean getLowFuelConsumption() {
        return lowFuelConsumption;
    }

    public void setLowFuelConsumption(Boolean lowFuelConsumption) {
        this.lowFuelConsumption = lowFuelConsumption;
    }

    public Boolean getLowKm() {
        return lowKm;
    }

    public void setLowKm(Boolean lowKm) {
        this.lowKm = lowKm;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getLuxury() {
        return luxury;
    }

    public void setLuxury(Boolean luxury) {
        this.luxury = luxury;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public Boolean getEnvironment() {
        return environment;
    }

    public void setEnvironment(Boolean environment) {
        this.environment = environment;
    }
}
