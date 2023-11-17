package es.ing.tddworkshopsession4.account.infrastructure;

import ch.qos.logback.core.joran.util.beans.BeanDescriptionFactory;
import es.ing.tddworkshopsession4.account.domain.Account;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.security.InvalidParameterException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertThrows;

class RestAccountCreationServiceTest {

    @Test
    void shouldReturnErrorIfAccountHasNoClient() {
        Account account = new Account(new ArrayList<>(), BigDecimal.ZERO);
        RestAccountCreationService restAccountCreationService = new RestAccountCreationService();

        assertThrows(InvalidParameterException.class, () -> restAccountCreationService.create(account));
    }
}