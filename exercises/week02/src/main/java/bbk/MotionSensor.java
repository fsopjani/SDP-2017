package bbk;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by fatos on 20/02/2017.
 */
@Component("motion-sensor")
@Scope("prototype")
public class MotionSensor extends SecuritySensor {
    private String location;
    private String sensorType;
    private String sensorCategory;
    private int pollCount = 0;

    public MotionSensor(String location, String sensorType, String sensorCategory) {
        this.location = location;
        this.sensorType = sensorType;
        this.sensorCategory = sensorCategory;
    }

    @Override
    public boolean isTriggered() {
        //some logic, not specified in the notes
        pollCount++;
        if (100 / pollCount <= 5 ) {
            pollCount = 0;
            return true;
        }
        return false;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String getSensorType() {
        return sensorType;
    }

    @Override
    public String getSensorCategory() {
        return sensorCategory;
    }

}
