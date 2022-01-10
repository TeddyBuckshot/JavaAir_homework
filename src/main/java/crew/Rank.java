package crew;

public enum Rank {

    CAPTAIN("Captain"),
    OFFICER("First officer"),
    PURSUER("Pursuer"),
    ATTENDANT("Flight attendant");

    private final String value;

    Rank(String value){
        this.value = value;
    }

    //getters
    public String getValue(){
        return this.value;
    }
}
