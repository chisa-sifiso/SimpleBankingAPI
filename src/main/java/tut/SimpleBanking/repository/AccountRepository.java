package tut.SimpleBanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tut.SimpleBanking.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
