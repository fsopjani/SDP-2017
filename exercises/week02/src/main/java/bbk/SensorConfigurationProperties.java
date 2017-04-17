package bbk;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by fatos on 20/02/2017.
 */
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "sensor")
public class SensorConfigurationProperties {

    private String fire;
    private String smoke;

    public String getFire() {
        return fire;
    }

    public void setFire(String fire) {
        this.fire = fire;
    }

    public String getSmoke() {
        return smoke;
    }

    public void setSmoke(String smoke) {
        this.smoke = smoke;
    }
}
