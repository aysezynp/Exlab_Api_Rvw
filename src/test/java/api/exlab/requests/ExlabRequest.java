package api.exlab.requests;
import api.exlab.common.DataForAPI;
import api.exlab.utilities.ConfigurationReader;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class ExlabRequests {

    public static Response response;
    public static int userID;
    public static String token;

    public static Response registerNewUser(String name,String email,String password,String about,String terms){
      response= given().contentType(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(DataForAPI.registerUSerBody(name, email, password, about, terms))
                .when()
                .post(ConfigurationReader.get("postRegisterUser"));

      userID=response.path("id");
      token=response.path("token");

      return response;
    }

    public static Response postExperience(String job,
                                          String company,String location,String fromdate,String todate,String current, String description){

        response=given().accept(ContentType.JSON)
                .header()
                .and()
                .body(DataForAPI.userExperienceBody(job, company, location, fromdate, todate, current, description))
                .when()



    }


}
