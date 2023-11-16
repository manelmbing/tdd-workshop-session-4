package es.ing.tddworkshopsession4.account;

import es.ing.tddworkshopsession4.TddWorkshopSession4Application;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = TddWorkshopSession4Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AccountCreationAcceptanceTest {

    @Autowired
    TestRestTemplate restTemplate;

    @LocalServerPort
    Integer randomServerPort;

    @Test
    void shouldReturnBadRequestResponseIfRequestHasNoClient() {
        final String baseUrl = "http://localhost:" + randomServerPort + "/accounts";
        Account account = new Account(new ArrayList<>(), BigDecimal.ZERO);

        ResponseEntity<Account> result = this.restTemplate.postForEntity(baseUrl, account, Account.class);

        assertEquals(HttpStatus.BAD_REQUEST, result.getStatusCode());
    }
}
