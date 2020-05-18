package ftn.siit.sbnz.SBNZ.model;

public class Query {

    public enum Purpose {
        EVERYDAY, SPORT, OFFROAD, TRANSPORT
    }

    public enum Gear {
        MANUAL, AUTOMATIC, NA
    }

    private Integer budget;
    private Integer familySize;
    private Integer experience;
    private Purpose purpose;
    private Boolean regNotExpensive;
    private Boolean lowFuelConsumption;
    private Boolean lowKm;
    private Integer age;
    private Boolean luxury;
    private Car.Country country;
    private String make;
    private Gear gear;
    private Boolean environment;

    public Query() {
    }

    public Query(Integer budget, Integer familySize, Integer experience, Purpose purpose, Boolean regNotExpensive,
                 Boolean lowFuelConsumption, Integer age, Boolean luxury, Car.Country country, String make,
                 Gear gear, Boolean environment, Boolean lowKm) {
        this.budget = budget;
        this.familySize = familySize;
        this.experience = experience;
        this.purpose = purpose;
        this.regNotExpensive = regNotExpensive;
        this.lowFuelConsumption = lowFuelConsumption;
        this.age = age;
        this.luxury = luxury;
        this.country = country;
        this.make = make;
        this.gear = gear;
        this.environment = environment;
        this.lowKm = lowKm;
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

    public Purpose getPurpose() {
        return purpose;
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
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

    public Car.Country getCountry() {
        return country;
    }

    public void setCountry(Car.Country country) {
        this.country = country;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Gear getGear() {
        return gear;
    }

    public void setGear(Gear gear) {
        this.gear = gear;
    }

    public Boolean getEnvironment() {
        return environment;
    }

    public void setEnvironment(Boolean environment) {
        this.environment = environment;
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
}
