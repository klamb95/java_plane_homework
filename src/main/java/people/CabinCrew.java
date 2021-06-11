package people;

public class CabinCrew extends Person {


    public CabinCrew(String name, Rank rank) {
        super(name, rank);
    }

    public String giveTakeOffInstructions(){
        return "Please leave your try in the upright position";
    }


}
