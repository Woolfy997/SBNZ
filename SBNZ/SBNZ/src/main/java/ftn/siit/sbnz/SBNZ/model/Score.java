package ftn.siit.sbnz.SBNZ.model;

import org.kie.api.definition.type.Position;

import javax.persistence.*;

@Entity
@Table
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    @Position(0)
    private Integer id;
    @Column(nullable = false)
    private Integer age = 0;
    @Column(nullable = false)
    private Integer budget = 0;
    @Column(nullable = false)
    private Integer country = 0;
    @Column(nullable = false)
    private Integer environment = 0;
    @Column(nullable = false)
    private Integer experience = 0;
    @Column(nullable = false)
    private Integer familySeats = 0;
    @Column(nullable = false)
    private Integer familyDoors = 0;
    @Column(nullable = false)
    private Integer fuel = 0;
    @Column(nullable = false)
    private Integer gear = 0;
    @Column(nullable = false)
    private Integer luxury = 0;
    @Column(nullable = false)
    private Integer make = 0;
    @Column(nullable = false)
    private Integer mileage = 0;
    @Column(nullable = false)
    private Integer purpose = 0;
    @Column(nullable = false)
    private Integer rating = 0;
    @Column(nullable = false)
    private Integer registration = 0;
    @Column(nullable = false)
    private Integer lowCost = 0;
    @Column(nullable = false)
    private Integer cheapAndEco = 0;
    @Column(nullable = false)
    private Integer sum = 0;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
        this.sum += age;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
        this.sum += budget;
    }

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
        this.sum += country;
    }

    public Integer getEnvironment() {
        return environment;
    }

    public void setEnvironment(Integer environment) {
        this.environment = environment;
        this.sum += environment;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
        this.sum += experience;
    }

    public Integer getFamilySeats() {
        return familySeats;
    }

    public void setFamilySeats(Integer familySeats) {
        this.familySeats = familySeats;
        this.sum += familySeats;
    }

    public Integer getFamilyDoors() {
        return familyDoors;
    }

    public void setFamilyDoors(Integer familyDoors) {
        this.familyDoors = familyDoors;
        this.sum += familyDoors;
    }

    public Integer getFuel() {
        return fuel;
    }

    public void setFuel(Integer fuel) {
        this.fuel = fuel;
        this.sum += fuel;
    }

    public Integer getGear() {
        return gear;
    }

    public void setGear(Integer gear) {
        this.gear = gear;
        this.sum += gear;
    }

    public Integer getLuxury() {
        return luxury;
    }

    public void setLuxury(Integer luxury) {
        this.luxury = luxury;
        this.sum += luxury;
    }

    public Integer getMake() {
        return make;
    }

    public void setMake(Integer make) {
        this.make = make;
        this.sum += make;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
        this.sum += mileage;
    }

    public Integer getPurpose() {
        return purpose;
    }

    public void setPurpose(Integer purpose) {
        this.purpose = purpose;
        this.sum += purpose;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
        this.sum += rating;
    }

    public Integer getRegistration() {
        return registration;
    }

    public void setRegistration(Integer registration) {
        this.registration = registration;
        this.sum += registration;
    }

    public Integer getLowCost() {
        return lowCost;
    }

    public void setLowCost(Integer lowCost) {
        this.lowCost = lowCost;
        this.sum += lowCost;
    }

    public Integer getCheapAndEco() {
        return cheapAndEco;
    }

    public void setCheapAndEco(Integer cheapAndEco) {
        this.cheapAndEco = cheapAndEco;
        this.sum += cheapAndEco;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Score() {

    }

    public Score(Integer age, Integer budget, Integer country, Integer environment, Integer experience, Integer familySeats, Integer familyDoors, Integer fuel, Integer gear, Integer luxury, Integer make, Integer mileage, Integer purpose, Integer rating, Integer registration, Integer lowCost, Integer cheapAndEco, Integer sum) {
        this.age = age;
        this.budget = budget;
        this.country = country;
        this.environment = environment;
        this.experience = experience;
        this.familySeats = familySeats;
        this.familyDoors = familyDoors;
        this.fuel = fuel;
        this.gear = gear;
        this.luxury = luxury;
        this.make = make;
        this.mileage = mileage;
        this.purpose = purpose;
        this.rating = rating;
        this.registration = registration;
        this.lowCost = lowCost;
        this.cheapAndEco = cheapAndEco;
        this.sum = sum;
    }
}
