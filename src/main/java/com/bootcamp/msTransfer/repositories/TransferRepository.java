package com.bootcamp.msTransfer.repositories;

import com.bootcamp.msTransfer.models.entities.Transfer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface TransferRepository extends ReactiveMongoRepository<Transfer,String> {
}
