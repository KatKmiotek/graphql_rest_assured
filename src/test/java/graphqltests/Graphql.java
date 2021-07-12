package graphqltests;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;

public class Graphql {
    String endpoint = "https://graphql-teas-endpoint.netlify.app/";
    String query = "query allTea{\n" +
            "  teas{\n" +
            "    name\n" +
            "    id\n" +
            "  }\n" +
            "}";

    public String getQuery() {
        return query;
    }

    public void post(String query) {
        RestAssured.baseURI = endpoint;
        RequestSpecBuilder reqSpecBuilder = new RequestSpecBuilder();
        reqSpecBuilder.setContentType("application/json; charset=UTF-8");
        reqSpecBuilder.setBody(query);
    }
}
