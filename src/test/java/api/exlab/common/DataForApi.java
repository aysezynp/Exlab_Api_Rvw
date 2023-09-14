package api.exlab.common;

import java.util.HashMap;
import java.util.Map;

public class DataForApi {
    /**{
     "name": "{{$randomFirstName}}",
     "email": "{{$randomEmail}}",
     "password": "Test1234",
     "about": "About Me",
     "terms": "10"
     }*/

    public static Map<String,Object> registerUserBody(String name,String email,String password,String about,String terms) {
        Map<String, Object> requestMap = new HashMap<>();
        requestMap.put("name", name);
        requestMap.put("email", email);
        requestMap.put("password", password);
        requestMap.put("about", about);
        requestMap.put("terms", terms);
        return requestMap;
    }
    /**"job": "Junior Developer",
            "company": "{{$randomCompanyName}}",
            "location": "{{$randomCountry}}",
            "fromdate": "2023-01-01",
            "todate": "2023-08-08",
            "current": "false",
            "description": "Description"
    }*/

       public static Map <String,Object> userExperienceBody(String job,
               String company,String location,String fromdate,String todate,String current, String description){
           Map<String, Object> experienceBody=new HashMap<>();
           experienceBody.put("job",job);
           experienceBody.put("company",company);
           experienceBody.put("location",location);
           experienceBody.put("fromdate",fromdate);
           experienceBody.put("todate",todate);
           experienceBody.put("current",current);
           experienceBody.put("description",description);
           return  experienceBody;
       }


   }

