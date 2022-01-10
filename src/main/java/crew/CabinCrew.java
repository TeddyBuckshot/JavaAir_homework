package crew;

public class CabinCrew {

    private String name;
    private Rank rankType;

    public CabinCrew(String name, Rank rankType){
        this.name = name;
        this.rankType = rankType;
    }

    //getters
    public String getName(){
        return this.name;
    }

    public String getRank(){
        return this.rankType.getValue();
    }

    public Rank getRankType(){
        return rankType;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }

    //methods
    public String relayMessage(){
        return "Crew has relayed message to passengers";
    }


}
