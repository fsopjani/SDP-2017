package bbk;

import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by fatos on 19/02/2017.
 */
@Component
public class SecurityControlUnit extends ControlUnit {
    @Override
    public void pollSensors() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int hour = cal.get(Calendar.HOUR_OF_DAY);

        if (hour <= 22 && hour >= 6) {
            super.pollSensors() ;
        }
    }
}
