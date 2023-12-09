package org.emsi.Client.Controller;

import org.emsi.Client.Model.client;
import org.emsi.Client.Repository.clientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class clientController {
    @Autowired
    clientRepository ClientRepository ;
    @GetMapping("/clients")
    public List chercherClients(){
        return ClientRepository.findAll();
    }
    @GetMapping("/clients/{id}")
    public client chercherUnClients (@PathVariable Long id) throws Exception{

        return this.ClientRepository.findById(id).orElseThrow(()-> new Exception("Client inexistnt"));

    }
}
