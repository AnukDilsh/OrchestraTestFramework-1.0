//[Documentation] A test suit for Qmatic Orchestra
//[Author] Anuk Dilshan

package com.orchestra.testCases.API;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class TC_POST_002 {

    @Test
    void addEmployeeDetails(){

        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
        RequestSpecification httpRequest = RestAssured.given();

        JSONObject requestParams = new JSONObject();

        String randomOPName = "_emp_"+uniqueNum();


        //RQ Payload
        requestParams.put("name",randomOPName);
        requestParams.put("description","OPs getting generated from the API");
        requestParams.put("name","Anuk"+randomOPName);
        requestParams.put("salary","100000");
        requestParams.put("age","33");


        httpRequest.header("Content-Type","application/json");

        httpRequest.body(requestParams.toJSONString());

        Response response = httpRequest.request(Method.POST,"/create");
        String resBody = response.getBody().asString();
        System.out.println();

        int status = response.getStatusCode();
        System.out.println("Here are the added details: "+resBody);

    }

    public String uniqueNum(){

        String randomNum = RandomStringUtils.randomAlphanumeric(3);
        return (randomNum);

    }

}
