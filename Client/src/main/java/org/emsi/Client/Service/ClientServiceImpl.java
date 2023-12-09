package org.emsi.Client.Service;

import org.emsi.Client.Model.client;
import org.emsi.Client.Repository.clientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{
    @Autowired
    private clientRepository ClientRepository;
    @Override
    public List<client> findAll() {
        return ClientRepository.findAll();
    }
    @Override
    public client findById(Long id) throws Exception {
        return ClientRepository.findById(id).orElseThrow(()->new Exception("Invalid Client ID"));
    }

    @Override
    public void addClient(client Client) {

    }
    // @Override
   /* public void addClient(client Client) {
        clientRepository.save(Client);
    }*/
}