package org.example.gorestTest;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import kg.salyk.ettn.generator.Fakers;
import kg.salyk.ettn.serialisations.User;
import org.junit.Before;
import org.junit.Test;

public class FirstApiTest {
    RequestSpecification requestSpecification;

    @Before
    public void reqSpec(){
        Fakers f = new Fakers();
        String name = f.getName();
        String mail = f.getEmail();

        String body = String.format(
                "{\n" +
                        "    \"name\": \"%s\",\n" +
                        "    \"email\": \"%s\",\n" +
                        "    \"gender\": \"male\",\n" +
                        "    \"status\": \"active\"\n" +
                        "}", name,mail);
       requestSpecification = RestAssured.given()
                .baseUri("https://gorest.co.in")
                .header("Authorization", "Bearer c6477183d5938350a36b7ea47e87c1ec061c600aa43667ea215e6f9a5ea77197")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(body);
    }

    @Test
    public void post(){
        Response response1 = requestSpecification.post("/public/v2/users");
        User user = response1.as(User.class);
        System.out.println(user);

    }


}
