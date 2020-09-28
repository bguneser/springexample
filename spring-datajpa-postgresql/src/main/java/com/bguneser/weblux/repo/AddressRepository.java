package com.bguneser.weblux.repo;

import com.bguneser.weblux.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
