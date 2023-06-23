package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class QualityDomyBaseUrl {
    protected RequestSpecification specDom;
    @Before
    public void setUp(){

        specDom = new RequestSpecBuilder()
                .setBaseUri("http://dummy.restapiexample.com")
                .build();

    }


}