
class WeatherIdentifier {
    private final WeatherType weatherValue;

    public enum WeatherType {
        HEAVY_RAIN, SUBTLE_RAIN, SUNNY_DAY
    }

    public WeatherIdentifier(WeatherType weatherValue) {
        this.weatherValue = weatherValue;
    }

    public String checkWeather() {
        return switch (this.weatherValue) {
            case HEAVY_RAIN -> "Heavy Rain";
            case SUBTLE_RAIN -> "Subtle Rain";
            case SUNNY_DAY -> "Sunny Day";
            default -> "Unknown Weather";
        };
    }
}



public class IfElse {
    public static void main(String[] args) {
        boolean adminAccess = true;
        if (!adminAccess) {
            System.out.println("Access Denied");
        } else {
            WeatherIdentifier weatherIdentity = new WeatherIdentifier(WeatherIdentifier.WeatherType.SUNNY_DAY);
            System.out.printf(weatherIdentity.checkWeather());
        }
    } 
}
