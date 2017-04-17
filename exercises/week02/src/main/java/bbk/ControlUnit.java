package bbk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;
import java.util.List;

@Component
public class ControlUnit {
  private List<Sensor> sensors;

  @Autowired
  TriggerConfigurationProperties triggerConfigurationProperties;

  public void pollSensors() {

    for (Sensor sensor : sensors) {
      if (sensor.isTriggered()) {
        System.out.println(MessageFormat.format(triggerConfigurationProperties.getYes(), sensor.getSensorType(), sensor.getLocation()));
      } else {
        System.out.println(MessageFormat.format(triggerConfigurationProperties.getNo(), sensor.getSensorType(), sensor.getLocation()));
      }
    }
  }

  public void setSensors(List<Sensor> sensors) {
    this.sensors = sensors;
  }


}
