package owner.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "system:properties",
        "classpath:config/api.properties"
})
public interface ApiConfig extends Config {

    @Key("baseUrl")
    String baseUrl();

    @Key("token")
    String token();
}
