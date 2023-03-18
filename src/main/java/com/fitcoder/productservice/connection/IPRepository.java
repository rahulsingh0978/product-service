package com.fitcoder.productservice.connection;


import com.fitcoder.productservice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPRepository extends JpaRepository<Customer, Long> {
    @Query("SELECT c.ip, r.port FROM Customers c JOIN IpResultPort r ON c.id = r.ipId")
    List<Object[]> getIpAndPort();
}