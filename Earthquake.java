
public class Earthquake {
    private String mag;
    private String loc;
    private String date;
    public Earthquake(String magnitude,String Location,String dates){
        mag = magnitude;
        loc = Location;
        date = dates;
    }
    public String getMagnitude(){
        return mag;
    }
    public String getLoc(){
        return  loc;
    }
    public String getDate(){
        return  date;
    }
}
