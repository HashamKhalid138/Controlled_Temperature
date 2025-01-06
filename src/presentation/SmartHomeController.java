package presentation;

import logic.TemperatureService;

public class SmartHomeController {
    public TemperatureService temperatureService = new TemperatureService(); 

    public void setTemperature(float targetTemp) {
        System.out.println("Setting temperature to: " + targetTemp);
        temperatureService.onSystem(targetTemp);
    }
}
 