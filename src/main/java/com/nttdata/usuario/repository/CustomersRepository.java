package com.nttdata.usuario.repository;

import com.nttdata.usuario.model.Customers;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepository extends ReactiveMongoRepository<Customers, Double> {

}
