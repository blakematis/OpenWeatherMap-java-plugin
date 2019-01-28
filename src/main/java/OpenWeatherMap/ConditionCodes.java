package OpenWeatherMap;

/**
 * ConditionCodes can be described just by the weather id that is parsed from weather JSON object.
 */

public enum ConditionCodes {

    //Thunderstorm
    THUNDERSTORM_LIGHT_RAIN(200,"Thunderstorm", "thunderstorm with light rain"),
    THUNDERSTORM_RAIN(201, "Thundestorm", "thunderstorm with rain"),
    THUNDERSTORM_HEAVY_RAIN(202, "Thunderstorm", "thunderstorm with heavy rain"),
    LIGHT_THUNDERSTORM(210, "Thunderstorm", "light thunderstorm"),
    THUNDERSTORM(211, "Thunderstorm", "thunderstorm"),
    HEAVY_THUNDERSTORM(212, "Thunderstorm", "heavy thunderstorm"),
    RAGGED_THUNDERSTORM(221, "Thunderstorm", "ragged thunderstorm"),
    THUNDERSTORM_LIGHT_DRIZZLE(230, "Thunderstorm", "thunderstorm with light drizzle"),
    THUNDERSTORM_DRIZZLE(231, "Thunderstorm", "thunderstorm with drizzle"),
    THUNDERSTORM_HEAVY_DRIZZLE(232, "Thunderstorm", "thunderstorm with heavy drizzle"),
    LIGHT_INTENSITY_DRIZZLE(300, "Drizzle", "light intensity drizzle"),

    //Drizzle
    DRIZZLE(301, "Drizzle", "drizzle"),
    HEAVY_INTENSITY_DRIZZLE(302, "Drizzle", "heavy intensity drizzle"),
    LIGHT_INTENSITY_DRIZZLE_RAIN(310, "Drizzle", "light intensity drizzle rain"),
    DRIZZLE_RAIN(311, "Drizzle", "drizzle rain"),
    HEAVY_INTENSITY_DRIZZLE_RAIN(312, "Drizzle", "heavy intensity drizzle rain"),
    SHOWER_RAIN_AND_DRIZZLE(314, "Drizzle", "shower rain and drizzle"),
    HEAVY_SHOWER_RAIN_AND_DRIZZLE(314, "Drizzle", "heavy shower rain and drizzle"),
    SHOWER_DRIZZLE(321, "Drizzle", "shower drizzle"),

    //Rain
    LIGHT_RAIN(500, "Rain", "light rain"),
    MODERATE_RAIN(501, "Rain", "moderate rain"),
    HEAVY_INTENSITY_RAIN(502, "Rain", "heavy intensity rain"),
    VERY_HEAVY_RAIN(503, "Rain", "very heavy rain"),
    EXTREME_RAIN(504, "Rain", "extreme rain"),
    FREEZING_RAIN(511, "Rain", "freezing rain"),
    LIGHT_INTENSITY_SHOWER_RAIN(520, "Rain", "light intensity shower rain"),
    SHOWER_RAIN(521, "Rain", "shower rain"),
    HEAVY_INTENSITY_SHOWER_RAIN(522, "Rain", "heavy intensity shower rain"),
    RAGGED_SHOWER_RAIN(531, "Rain", "ragged shower rain"),

    //Snow
    LIGHT_SNOW(600, "Snow", "light snow"),
    SNOW(601, "Snow", "snow"),
    HEAVY_SNOW(602, "Snow", "heavy snow"),
    SLEET(611, "Snow", "sleet"),
    SHOWER_SLEET(612, "Snow", "shower sleet"),
    LIGHT_RAIN_AND_SNOW(615, "Snow", "light rain and snow"),
    RAIN_AND_SNOW(616, "Snow", "rain and snow"),
    LIGHT_SHOWER_SNOW(620, "Snow", "light shower snow"),
    SHOWER_SNOW(621, "Snow", "shower snow"),
    HEAVY_SHOWER_SNOW(622, "Snow", "heavy shower snow"),

    //Atmosphere
    MIST(700, "Atmosphere", "mist"),
    SMOKE(711, "Atmosphere", "smoke"),
    HAZE(721, "Atmosphere", "haze"),
    SAND_DUST_WHIRLS(731, "Atmosphere", "sand, dust whirls"),
    FOG(741, "Atmosphere", "fog"),
    SAND(751, "Atmosphere", "sand"),
    DUST(761, "Atmosphere", "dust"),
    VOLCANIC_ASH(762, "Atmosphere", "volcanic ash"),
    SQUALLS(771, "Atmosphere", "squalls"),
    TORNADO(781, "Atmosphere", "tornado"),

    //Clear
    CLEAR_SKY(800, "Clear", "clear sky"),

    //Clouds
    FEW_CLOUDS(801, "Clouds", "few clouds"),
    SCATTERED_CLOUDS(802, "Clouds", "scattered clouds"),
    BROKEN_CLOUDS(803, "Clouds", "broken clouds"),
    OVERCAST_CLOUDS(804, "Clouds", "overcast clouds");

    private final double id;
    private final String main;
    private final String description;

    ConditionCodes(int id, String main, String description){
        this.id = id;
        this.main = main;
        this.description = description;
    }

    public static ConditionCodes codeFromId(int id){
        for(ConditionCodes code: ConditionCodes.values()){
            if(code.id == id){
                return code;
            }
        }
        return null;
    }

    public double id(){ return  id;}

    public String main(){ return main;}

    public String description(){ return description;}

    public String toString(){
        return "id: " + id + "," +
                "\nmain: " + main + "," +
                "\ndescription: " + description;
    }
}