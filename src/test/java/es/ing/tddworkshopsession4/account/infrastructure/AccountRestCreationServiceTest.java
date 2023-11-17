package es.ing.tddworkshopsession4.account.infrastructure;

import es.ing.tddworkshopsession4.account.domain.Account;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.security.InvalidParameterException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertThrows;

class AccountRestCreationServiceTest {

    @Test
    void shouldReturnErrorIfAccountHasNoClient() {
        Account account = new Account(new ArrayList<>(), BigDecimal.ZERO);
        AccountRestCreationService accountRestCreationService = new AccountRestCreationService();

        assertThrows(InvalidParameterException.class, () -> accountRestCreationService.create(account));
    }
}