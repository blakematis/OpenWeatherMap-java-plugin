package OpenWeatherMap;

import java.time.LocalDateTime;

public interface IDateTime {

    public LocalDateTime buildLocalDateTime(Long epochTime);

}
