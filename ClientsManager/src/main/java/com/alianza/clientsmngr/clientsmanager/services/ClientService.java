package com.alianza.clientsmngr.clientsmanager.services;

import com.alianza.clientsmngr.clientsmanager.entities.Client;

import java.util.List;

public interface ClientService {
    List<Client> getAllClients();
    List<Client> getClientBySharedKey(String sharedKey);
}
