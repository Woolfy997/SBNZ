package ftn.siit.sbnz.SBNZ.web.dto;

public class FilterDTO {

    private String fuel;
    private String type;
    private String gear;

    public FilterDTO() {
    }

    public FilterDTO(String fuel, String type, String gear) {
        this.fuel = fuel;
        this.type = type;
        this.gear = gear;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }
}
