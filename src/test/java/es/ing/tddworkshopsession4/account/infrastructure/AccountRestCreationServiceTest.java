package es.ing.tddworkshopsession4.account.infrastructure;

import es.ing.tddworkshopsession4.account.domain.Account;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AccountRestCreationServiceTest {

    @Test
    void shouldReturnErrorIfAccountHasNoClient() {
        Account account = new Account(new ArrayList<>(), BigDecimal.ZERO);
        AccountRestCreationService accountRestCreationService = new AccountRestCreationService();

        assertThrows(InvalidParameterException.class, () -> accountRestCreationService.create(account));
    }

    @Test
    void shouldReturnCreatedAccountIfAccountHasOneClient() {
        Account account = new Account(List.of("1"), BigDecimal.ZERO);
        AccountRestCreationService accountRestCreationService = new AccountRestCreationService();

        Account createdAccount = accountRestCreationService.create(account);

        assertEquals(account, createdAccount);
    }
}