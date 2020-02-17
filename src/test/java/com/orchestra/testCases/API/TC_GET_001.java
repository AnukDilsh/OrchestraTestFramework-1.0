//[Documentation] A test suit for Qmatic Orchestra
//[Author] Anuk Dilshan

package com.orchestra.testCases.API;

        import io.restassured.RestAssured;
        import io.restassured.http.Method;
        import io.restassured.response.Response;
        import io.restassured.specification.RequestSpecification;
        import org.testng.Assert;
        import org.testng.annotations.Test;

public class TC_GET_001 {

    @Test
    void getEmployeeDetails(){

        //Specify URI
        RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/";

        //Request Object
        RequestSpecification httpRequest = RestAssured.given();

        //Response Object
        Response response = httpRequest.request(Method.GET,"employees");
        String body = response.getBody().asString();
        System.out.println(body);

        //verify status code
        int statusCode = response.getStatusCode();
        System.out.println(statusCode);
        Assert.assertEquals(statusCode,200);

        //verify status line
        String statusLine = response.getStatusLine();
        System.out.println("this is the line"+statusLine);
        Assert.assertEquals(statusLine,"HTTP/1.1 200 OK");

    }

}