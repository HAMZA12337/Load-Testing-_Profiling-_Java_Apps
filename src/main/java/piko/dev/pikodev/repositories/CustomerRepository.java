package piko.dev.pikodev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import piko.dev.pikodev.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
