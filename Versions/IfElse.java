
class WeatherIdentifier {
    private WeatherType weatherValue;

    public enum WeatherType {
        HEAVY_RAIN, SUBTLE_RAIN, SUNNY_DAY
    }

    public WeatherIdentifier(WeatherType weatherValue) {
        this.weatherValue = weatherValue;
    }

    public void checkWeather() {
        switch (this.weatherValue) {
            case HEAVY_RAIN -> System.out.println("Heavy Rain");
            case SUBTLE_RAIN -> System.out.println("Subtle Rain");
            case SUNNY_DAY -> System.out.println("Sunny Day");
            default -> System.out.println("Unknown Weather");
        }
    }
}



public class IfElse {
    public static void main(String[] args) {
        boolean adminAccess = true;
        if (adminAccess == true) {
            System.out.println("Access Denied");
        } else
        {
            WeatherIdentifier weatherIdentity = new WeatherIdentifier(WeatherIdentifier.WeatherType.SUNNY_DAY);
            weatherIdentity.checkWeather();
        }
    } 
}
