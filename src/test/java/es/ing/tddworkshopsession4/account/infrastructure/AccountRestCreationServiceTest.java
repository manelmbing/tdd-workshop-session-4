package es.ing.tddworkshopsession4.account.infrastructure;

import es.ing.tddworkshopsession4.account.domain.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AccountRestCreationServiceTest {
    AccountRestCreationService accountRestCreationService;

    @Mock
    AccountRepositoryService repository;

    @BeforeEach
    public void setUp() {
        accountRestCreationService = new AccountRestCreationService(repository);
    }
    @Test
    void shouldReturnErrorIfAccountHasNoClient() {
        Account account = new Account(new ArrayList<>(), BigDecimal.ZERO);

        assertThrows(InvalidParameterException.class, () -> accountRestCreationService.create(account));
    }

    @Test
    void shouldReturnCreatedAccountIfAccountHasOneClient() {
        Account account = new Account(List.of("1"), BigDecimal.ZERO);
        when(repository.create(any(Account.class))).thenReturn(account);

        Account createdAccount = accountRestCreationService.create(account);

        assertEquals(account, createdAccount);
    }

    /*
    * RESTO DE TESTS ZOMBIES
    */

     @Test
    void shouldPersistAccountIfRequestIsValid() {
         Account account = new Account(List.of("1"), BigDecimal.ZERO);

         when(repository.create(any(Account.class))).thenReturn(account);
         Account createdAccount = accountRestCreationService.create(account);

         ArgumentCaptor<Account> captured = ArgumentCaptor.forClass(Account.class);
         verify(repository, times(1)).create(captured.capture());
         assertEquals(captured.getValue(), createdAccount);
     }
}