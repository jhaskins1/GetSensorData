package ipro497.middleware.getsensordata.model;

public class SensorData {
    // USING THE EXAMPLE CO2 SENSOR FOR NOW
    private String id;

    private double epochUtc;
    private String localDateTime;
    private double co2;



    public SensorData(String id, double epochUtc, String localDatetime, double co2){
        this.id=id;
        this.epochUtc=epochUtc;
        this.localDateTime=localDatetime;
        this.co2=co2;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getEpochUtc() {
        return epochUtc;
    }

    public void setEpochUtc(double epochUtc) {
        this.epochUtc = epochUtc;
    }

    public String getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(String localDateTime) {
        this.localDateTime = localDateTime;
    }

    public double getCo2() {
        return co2;
    }

    public void setCo2(double co2) {
        this.co2 = co2;
    }

}
