package owner.tests;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import owner.config.ApiConfig;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ApiTest {

    @Test
    void apiTest() {

        ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());
        assertThat(config.baseUrl()).isEqualTo("https://github.com");
        assertThat(config.token()).isEqualTo("my_token");
    }
}
