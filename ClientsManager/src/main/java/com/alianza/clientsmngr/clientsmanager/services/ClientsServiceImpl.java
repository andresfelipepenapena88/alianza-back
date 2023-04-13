package com.alianza.clientsmngr.clientsmanager.services;

import com.alianza.clientsmngr.clientsmanager.entities.Client;
import com.alianza.clientsmngr.clientsmanager.repositories.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClientsServiceImpl implements ClientService {

    @Autowired
    private ClientsRepository clientsRepository;
    @Override
    public List<Client> getAllClients() {
        return this.clientsRepository.findAll();
    }

    @Override
    public List<Client> getClientBySharedKey(String sharedKey) {
        return this.clientsRepository.getClientsBySharedKey(sharedKey);
    }

}
