package OpenWeatherMap;

public class City {
    private int id;
    private String name;
    private Coord coord;
    private String country;

    public City(){
    }

    public City(int id, String name, double lon, double lat, String country){
        this.id = id;
        this.name = name;
        this.coord = new Coord(lon, lat);
        this.country = country;
    }

    public int getId(){ return id;}

    public String getName(){ return name;}

    public Coord getCoord(){ return coord;}

    public String getCountry(){ return country;}


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoord(double lon, double lat) {
        this.coord = new Coord(lon, lat);
    }

    public void setCountry(String country) {
        this.country = country;
    }


    private class Coord{
        private double lon;
        private double lat;

        public Coord(double lon, double lat){
            this.lon = lon;
            this.lat = lat;
        }

        @Override
        public String toString(){
            String str = "{\n\t\t lon: " + lon + "," +
                    "\n\t\t lat: " + lat +
                    "\n\t }";
            return str;
        }
    }

    @Override
    public String toString(){
        String str = "- city: { " +
                "\n\t id: " + id + "," +
                "\n\t name: " + name + "," +
                "\n\t - coord: " + coord.toString() + "," +
                "\n\t country: " + country +
                "\n }";
        return str;
    }
}
