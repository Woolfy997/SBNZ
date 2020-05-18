package ftn.siit.sbnz.SBNZ.model;

public class Car {

    public enum Country {
        GERMANY, ITALY, FRANCE, JAPAN, USA, RUSSIA, ROMANIA, CZECHIA, SPAIN, UK, SOUTH_KOREA, CHINA, NA
    }

    public enum Fuel {
        ELECTRIC, HYBRID, DIESEL, GAS, LPG
    }

    public enum Type {
        HATCHBACK, SEDAN, STATIONWAGON, COUPE, CONVERTIBLE, SUV, PICKUP, MINIVAN
    }

    public enum Gear {
        MANUAL, AUTOMATIC
    }

    private Integer id;
    private String make;
    private String model;
    private Country country;
    private Fuel fuel;
    private Integer year;
    private Double price;
    private Type type;
    private Boolean luxury;
    private Integer doors;
    private Integer seats;
    private Integer cc;
    private Integer kw;
    private Integer km;
    private String engine;
    private Double rating;
    private Double fuelConsumption;
    private Integer regPrice;
    private Gear gear;
    private Integer score;

    public Car() {
        this.score = 0;
    }

    public Car(Integer id, String make, String model, Country country, Fuel fuel, Integer year, Double price,
               Type type, Boolean luxury, Integer doors, Integer seats, Integer cc, Integer kw, Integer km,
               String engine, Double rating, Double fuelConsumption, Integer regPrice, Gear gear) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.country = country;
        this.fuel = fuel;
        this.year = year;
        this.price = price;
        this.type = type;
        this.luxury = luxury;
        this.doors = doors;
        this.seats = seats;
        this.cc = cc;
        this.kw = kw;
        this.km = km;
        this.engine = engine;
        this.rating = rating;
        this.fuelConsumption = fuelConsumption;
        this.regPrice = regPrice;
        this.gear = gear;
        this.score = 0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Integer getDoors() {
        return doors;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public Integer getCc() {
        return cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    public Integer getKw() {
        return kw;
    }

    public void setKw(Integer kw) {
        this.kw = kw;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(Double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public Integer getRegPrice() {
        return regPrice;
    }

    public void setRegPrice(Integer regPrice) {
        this.regPrice = regPrice;
    }

    public Boolean getLuxury() {
        return luxury;
    }

    public void setLuxury(Boolean luxury) {
        this.luxury = luxury;
    }

    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }

    public Gear getGear() {
        return gear;
    }

    public void setGear(Gear gear) {
        this.gear = gear;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score += score;
    }

    @Override
    public String toString() {
        return id + " " + year + " " + make + " " + model + " " + price + " " + ": " + score;
    }
}