package es.ing.tddworkshopsession4.account.infrastructure;

import es.ing.tddworkshopsession4.account.domain.Account;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRestController {

    @PostMapping(path = "/accounts", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Account> createAccount(Account account) {
        return ResponseEntity.badRequest().build();
    }
}
