package crew;

public class Pilot {

    private String name;
    private Rank rankType;
    private String licenceNum;

    public Pilot(String name, Rank rankType, String licenceNum){
        this.name = name;
        this.rankType = rankType;
        this.licenceNum = licenceNum;
    }

    //getters
    public String getName(){
        return this.name;
    }

    public String getRank(){
        return this.rankType.getValue();
    }

    public Rank getRankType(){
        return this.rankType;
    }

    public String getLicenceNum(){
        return this.licenceNum;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }

    public void setLicenceNum(String newLicence){
        this.licenceNum = newLicence;
    }

    //methods
    public String flyPlane(){
        return "The Pilot flies the plane";
    }

}
