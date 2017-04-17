import bbk.FireSensor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FireSensorTest {

  @Test
  public void testThatIsTriggeredReturnsFalse() {
    FireSensor sensor = new FireSensor("Lobby 1st floor","Fire sensor","Hazard");
    boolean isTriggered = sensor.isTriggered();
    assertEquals(false, isTriggered);
  }

  @Test
  public void testThatGetLocationReturnsNull() {
    FireSensor sensor = new FireSensor("Lobby 1st floor","Fire sensor","Hazard");
    String location = sensor.getLocation();
    assertEquals(null, location);
  }

  @Test
  public void testThatGetSensorTypeReturnsNull() {
    FireSensor sensor = new FireSensor("Lobby 1st floor","Fire sensor","Hazard");
    String sensorType = sensor.getSensorType();
    assertEquals(null, sensorType);
  }

  @Test
  public void testThatGetBatteryPercentageReturnsNegativeOne() {
    FireSensor sensor = new FireSensor("Lobby 1st floor","Fire sensor","Hazard");
    double batteryPercentage = sensor.getBatteryPercentage();
    assertEquals(-1.0, batteryPercentage, 0.01);
  }
}