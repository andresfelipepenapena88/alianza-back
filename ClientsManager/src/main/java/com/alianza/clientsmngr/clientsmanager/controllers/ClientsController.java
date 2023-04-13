package com.alianza.clientsmngr.clientsmanager.controllers;

import com.alianza.clientsmngr.clientsmanager.entities.Client;
import com.alianza.clientsmngr.clientsmanager.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
@CrossOrigin(origins = "http://localhost:4200")
public class ClientsController {
    @Autowired
    private ClientService clientsService;
    @GetMapping("/getAllClients")
    public ResponseEntity<List<Client>> getAllClients() {
        return new ResponseEntity<>(this.clientsService.getAllClients(), HttpStatus.OK);
    }

    @GetMapping("/getClientBySharedKey")
    public ResponseEntity<List<Client>> getClientBySharedKey(@RequestParam(name = "shared_key") String sharedKey) {
        return new ResponseEntity<>(this.clientsService.getClientBySharedKey(sharedKey), HttpStatus.OK);
    }
}
