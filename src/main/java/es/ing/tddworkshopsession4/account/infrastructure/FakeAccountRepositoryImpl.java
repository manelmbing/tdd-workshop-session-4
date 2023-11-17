package es.ing.tddworkshopsession4.account.infrastructure;

import es.ing.tddworkshopsession4.account.domain.Account;
import org.springframework.stereotype.Repository;

@Repository
public class FakeAccountRepositoryImpl implements AccountRepositoryService {
    @Override
    public Account create(Account account) {
        return account;
    }
}
