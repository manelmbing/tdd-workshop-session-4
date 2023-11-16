package es.ing.tddworkshopsession4.account.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class Account {
    private List<String> clients;
    private BigDecimal balance;
}
