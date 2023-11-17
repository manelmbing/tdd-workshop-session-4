package es.ing.tddworkshopsession4.account.infrastructure;

import es.ing.tddworkshopsession4.account.domain.Account;

public interface AccountRepositoryService {
    Account create(Account account);
}
