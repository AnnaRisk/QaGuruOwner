package owner.tests;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import owner.config.ApiConfig;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.hamcrest.Matchers.is;

public class ApiTest {

    @Test
    void apiTest() {

        ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());
        given()
                .log().body()
                .contentType(JSON)
                .when()
                .queryParam(config.token())
                .get(config.baseUrl())
                .then()
                .log().status()
                .log().body()
                .statusCode(200);

    }
}
