import bbk.SmokeSensor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmokeSensorTest {

  @Test
  public void testThatIsTriggeredReturnsFalse() {
    SmokeSensor sensor = new SmokeSensor("Lobby 1st floor","Smoke sensor","Hazard");
    boolean isTriggered = sensor.isTriggered();
    assertEquals(false, isTriggered);
  }

  @Test
  public void testThatGetLocationReturnsNull() {
    SmokeSensor sensor = new SmokeSensor("Lobby 1st floor","Smoke sensor","Hazard");
    String location = sensor.getLocation();
    assertEquals(null, location);
  }

  @Test
  public void testThatGetSensorTypeReturnsNull() {
    SmokeSensor sensor = new SmokeSensor("Lobby 1st floor","Smoke sensor","Hazard");
    String sensorType = sensor.getSensorType();
    assertEquals(null, sensorType);
  }

  @Test
  public void testThatGetBatteryPercentageReturnsNegativeOne() {
    SmokeSensor sensor = new SmokeSensor("Lobby 1st floor","Smoke sensor","Hazard");
    double batteryPercentage = sensor.getBatteryPercentage();
    assertEquals(-1.0, batteryPercentage, 0.01);
  }

}