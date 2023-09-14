package api.exlab.utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.authentication;
import static io.restassured.RestAssured.given;

public class ApiUtils {

    public static Map<String,Object> getToken(String email, String password){
        Response response = given()
                //.accept(ContentType.ANY)
                .accept(ContentType.MULTIPART)
                .and()
                .formParam("email", email)
                .and()
                .formParam("password", password)
                .and()
                .log().all()
                .when()
                .post(ConfigurationReader.get("postLogin"));
        String token = response.path("token");
        Map<String,Object> authorization=new HashMap<>();
        authorization.put("token",token);
        return authorization;

    }
}

