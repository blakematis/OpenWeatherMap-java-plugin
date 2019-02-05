# OpenWeatherMap

## Features
<ul>
  <li> 16 Day Weather Forecast
    <ul>
      <li>
      <li>https://openweathermap.org/forecast16</li>
    </ul>
  </li>
  <li> Current Weather Forecast
    <ul>
      <li>By ZIP code Description:
        <ul>Please note if country is not specified then the search works for USA as a default.
        </ul>
      </li>
      <li>API call:
        <ul>api.openweathermap.org/data/2.5/weather?zip={zip code},{country code}
        </ul>
      </li>
      <li>Examples of API calls:
        <ul>api.openweathermap.org/data/2.5/weather?zip=94040,us
        </ul>
      <li>Parameters:
        <ul>ZIP: zip code
        </ul>
      </li>
      <li>API response:
        <ul><code>{ "coord":{"lon":-122.09,"lat":37.39},
                    "sys":{"type":3,"id":168940,"message":0.0297,"country":"US","sunrise":1427723751,"sunset":1427768967},
                    "weather":[{"id":800,"main":"Clear","description":"Sky is Clear","icon":"01n"}],
                    "base":"stations",
                    "main":{"temp":285.68,"humidity":74,"pressure":1016.8,"temp_min":284.82,"temp_max":286.48},
                    "wind":{"speed":0.96,"deg":285.001},
                    "clouds":{"all":0},
                    "dt":1427700245,
                    "id":0,
                    "name":"Mountain View",
                    "cod":200}
          </code></ul>
      </li>
      <li>https://openweathermap.org/current</li>
    </ul>
  </li>
</ul>

## Not Supported
5 day 3 hour forecasts.

