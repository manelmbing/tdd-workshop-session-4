package es.ing.tddworkshopsession4.account.infrastructure;

import es.ing.tddworkshopsession4.account.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.InvalidParameterException;

@Service
public class AccountRestCreationService implements AccountCreationService {

    private final AccountRepositoryService repository;

    @Autowired
    public AccountRestCreationService(AccountRepositoryService repository) {
        this.repository = repository;
    }

    public Account create(Account account) {
        if (account.getClients().isEmpty()) {
            throw new InvalidParameterException();
        }
        return repository.create(account);
    }
}
