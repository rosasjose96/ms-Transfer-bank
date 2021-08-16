package com.bootcamp.msTransfer.services;

import com.bootcamp.msTransfer.models.dto.TransactionDTO;
import reactor.core.publisher.Mono;

public interface ITransactionDTOService {
    public Mono<TransactionDTO> saveTransaction(TransactionDTO transaction);
}
