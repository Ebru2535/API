package test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C13_Get_SoftAssertIleExpectedDataTesti {
    public static void main(String[] args) {

    }
    @Test
    public void get01() throws InterruptedException {
        String url="http://dummy.restapiexample.com/api/v1/employee/3";
        JSONObject expectedData=new JSONObject();
        expectedData.put("status", "success");
        expectedData.put("id", 3);
        expectedData.put("employee_name" , "Ashton Cox");
        expectedData.put("employee_salary", 86000);
        expectedData.put("employee_age", 66);
        expectedData.put("profile_image" , "");

        Response actualData=given().when().get(url);
       Thread.sleep(2);
        actualData.prettyPrint();


        JsonPath jsonPath=actualData.jsonPath();

        Assert.assertEquals(expectedData.get("status"),jsonPath.get("status"));
        Assert.assertEquals(expectedData.get("id"),jsonPath.get("data.id"));
        Assert.assertEquals(expectedData.get("employee_name"),jsonPath.get("data.employee_name"));
        Assert.assertEquals(expectedData.get("employee_salary"),jsonPath.get("data.employee_salary"));
        Assert.assertEquals(expectedData.get("employee_age"),jsonPath.get("data.employee_age"));
        Assert.assertEquals(expectedData.get("profile_image"),jsonPath.get("data.profile_image"));

    }
}
