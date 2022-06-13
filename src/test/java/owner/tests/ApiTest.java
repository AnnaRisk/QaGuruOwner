package owner.tests;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import owner.config.ApiConfig;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;


public class ApiTest {

    @Test
    void apiTest() {

        ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());
        given()

                .contentType(JSON)
                .when()
                .queryParam(config.token())
                .get(config.baseUrl())
                .then()
                .statusCode(200);

    }
}
