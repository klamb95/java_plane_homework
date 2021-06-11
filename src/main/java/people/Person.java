package people;

public abstract class Person {

    private String name;
    private Rank rank;

    public Person(String name, Rank rank){
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }


    public Rank getRank(){
        return rank;
    };
}
