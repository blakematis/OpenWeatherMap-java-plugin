package OpenWeatherMap;

public class MainForecast {

    private String date_txt;
    private double temp;
    private double tempMin;
    private double tempMax;
    private double pressure;
    private double seaLevel;
    private double groundLevel;
    private int humidity;

    public MainForecast(){

    }

    public String getDate_txt() {
        return date_txt;
    }

    public void setDate_txt(String date_txt) {
        this.date_txt = date_txt;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getTempMin() {
        return tempMin;
    }

    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }

    public double getTempMax() {
        return tempMax;
    }

    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getSeaLevel() {
        return seaLevel;
    }

    public void setSeaLevel(double seaLevel) {
        this.seaLevel = seaLevel;
    }

    public double getGroundLevel() {
        return groundLevel;
    }

    public void setGroundLevel(double groundLevel) {
        this.groundLevel = groundLevel;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString(){
        String str = "- MainForecast: {" +
                "\n\t temp: " + temp + "," +
                "\n\t temp_min: " + tempMin + "," +
                "\n\t temp_max: " + tempMax + "," +
                "\n\t pressure: " + pressure + "," +
                "\n\t sea_level: " + seaLevel + "," +
                "\n\t grnd_level: " + groundLevel + "," +
                "\n\t humidty: " + humidity + "," +
                "\n\t dt_txt: " + date_txt;
        return str;
    }

}
