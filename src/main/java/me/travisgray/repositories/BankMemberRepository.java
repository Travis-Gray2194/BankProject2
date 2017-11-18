package me.travisgray.repositories;

import me.travisgray.entities.BankMember;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ${TravisGray} on 11/17/2017.
 */
public interface BankMemberRepository extends CrudRepository<BankMember, Long>{
}
