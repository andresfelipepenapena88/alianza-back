package com.alianza.clientsmngr.clientsmanager.repositories;

import com.alianza.clientsmngr.clientsmanager.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientsRepository extends JpaRepository<Client, Long> {
    @Query("SELECT c FROM Client c WHERE c.sharedKey LIKE %:sharedKey%")
    List<Client> getClientsBySharedKey(@Param("sharedKey") String sharedKey);
}
