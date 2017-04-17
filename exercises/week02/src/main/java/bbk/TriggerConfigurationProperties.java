package bbk;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by fatos on 20/02/2017.
 */
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "trigger")
@PropertySource("messages.properties")
public class TriggerConfigurationProperties {
    private String yes;
    private String no;

    public String getYes() {
        return yes;
    }

    public void setYes(String yes) {
        this.yes = yes;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}

