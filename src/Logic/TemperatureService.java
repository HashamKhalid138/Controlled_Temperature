package logic;

import data.TemperatureDevices;

public class TemperatureService {
    public TemperatureDevices temperatureDevices = new TemperatureDevices();

    public void onSystem(float targetTemp) {
        System.out.println("System is turned ON at target temperature: " + targetTemp);
        temperatureDevices.coolingSystem();
    }

    public void offSystem(float targetTemp) {
        System.out.println("System is turned OFF at target temperature: " + targetTemp);
        temperatureDevices.heatingSystem();
    }
}
