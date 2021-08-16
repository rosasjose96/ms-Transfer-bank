package com.bootcamp.msTransfer.services;

import com.bootcamp.msTransfer.models.dto.DebitAccountDTO;
import reactor.core.publisher.Mono;

public interface IDebitAccountDTOService {
    public Mono<DebitAccountDTO> findByAccountNumber(String typeofdebit, String accountNumber);
    public Mono<DebitAccountDTO> updateDebit(String typeofdebit, DebitAccountDTO account);
}
