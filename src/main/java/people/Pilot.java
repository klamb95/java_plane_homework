package people;

public class Pilot extends Person{

    private String pilotLicense;

    public Pilot(String name, Rank rank, String pilotLicense){
        super(name, rank);
        this.pilotLicense = pilotLicense;
    }

    public String getPilotLicense() {
        return pilotLicense;
    }
}
