package com.vapasi.mocking;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.github.tomakehurst.wiremock.stubbing.StubMapping;
import okhttp3.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.xml.transform.Result;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static com.github.tomakehurst.wiremock.client.WireMock.*;
public class Wiremockexample {

    @Test
    public void exampleTest() {
        WireMock.configureFor("216.10.245.166", 8000);
        StubMapping smap=stubFor(post(urlEqualTo("/Library/Addbook.php"))
                    .withHeader("Accept", equalTo("*/*"))
                    .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "text/plain")
                        .withBody("hiii this is my first mocking trial")));

      // Assert.assertTrue(smap.getResponse().getTextBody().equals(" {\"Msg\": \"successfully added\", \"ID\": \"8921\" }"));

    }
}
