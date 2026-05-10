package Classwork_11;

public class Weather {


	private String city;
    private double temperature;
    private int humidity;

    public Weather(String city, double temp, int hum) {
        this.city = city;
        setTemperature(temp);
        setHumidity(hum);
    }

    public String getCity() {
    return city;
    }
    public double getTemperature() {
    	return temperature;
    	}
    public int    getHumidity()    {
    	return humidity;
    	}

    public void setTemperature(double t) {
        if (t >= -60 && t <= 60) {
			temperature = t;
		} else {
			System.out.println("Ne pravilnaya temperatura: " + t);
		}
    }

    public void setHumidity(int h) {
        if (h >= 0 && h <= 100) {
			humidity = h;
		}
    }

    public void describe() {
        String feel = temperature < 0 ? "xolodno"
                    : temperature < 15 ? "proxladno"
                    : "Тепло";
        System.out.println(city + ": " + feel + ", "
            + temperature + "°C, vlajnost " + humidity + "%");
    }

    public static void main(String[] args) {
        Weather w = new Weather("AZERBAIJANSKIY", -5.0, 80);
        w.describe();
        w.setTemperature(999);
    }
}
