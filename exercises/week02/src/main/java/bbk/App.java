package bbk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@EnableAutoConfiguration
@ComponentScan("bbk")
@SpringBootApplication
public class App implements CommandLineRunner {
  private static final String EXIT = "exit";
  private static final String POLL = "poll";

  @Autowired
  ControlUnit controlUnit;

  @Autowired
  SecurityControlUnit securityControlUnit;

  @Autowired
  SensorConfigurationProperties sensorConfigurationProperties;

  @Autowired
  ApplicationContext context;

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);

  }

  @Override
  public void run(String... strings) throws Exception {
    controlUnit.setSensors(setUpSensors().stream().filter(p -> p.getSensorCategory().equals("Hazard")).collect(Collectors.toList()));
    securityControlUnit.setSensors(setUpSensors().stream().filter(p -> p.getSensorCategory().equals("Security")).collect(Collectors.toList()));
    Scanner scanner = new Scanner(System.in);
    String input = "";
    while (!input.equals(EXIT)) {
      System.out.println("Type \"poll\" to poll all sensors once or \"exit\" to exit");
      input = scanner.nextLine();
      if (input.equals(POLL)) {
        controlUnit.pollSensors();
        securityControlUnit.pollSensors();
      }
    }
  }

  private List<Sensor> setUpSensors(){
    List<Sensor> sensors = new ArrayList<>();
    sensors.add(new SmokeSensor("Lobby 9st floor","Smoke sensor","Hazard"));
    sensors.add(new FireSensor("Lobby 5st floor","Fire sensor","Hazard"));
    sensors.add(new SmokeSensor("Lobby 2st floor","Smoke sensor","Hazard"));
    sensors.add(new FireSensor("Lobby 3st floor","Fire sensor","Hazard"));
    sensors.add(new SmokeSensor("Lobby 8st floor","Smoke sensor","Hazard"));
    sensors.add(new MotionSensor("Lobby 1st floor","Motion sensor","Security"));
    sensors.add(new MotionSensor("Lobby 2st floor","Motion sensor","Security"));
    sensors.add(new MotionSensor("Lobby 3st floor","Motion sensor","Security"));
    return sensors;
  }
}
