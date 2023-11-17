package es.ing.tddworkshopsession4.account.infrastructure;

import es.ing.tddworkshopsession4.account.domain.Account;

import java.security.InvalidParameterException;

public class AccountRestCreationService implements AccountCreationService {
    public Account create(Account account) {
        if (account.getClients().isEmpty()) {
            throw new InvalidParameterException();
        }
        return account;
    }
}
