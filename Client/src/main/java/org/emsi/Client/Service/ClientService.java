package org.emsi.Client.Service;

import org.emsi.Client.Model.client;

import java.util.List;

public interface  ClientService {
    List<client> findAll();

    client findById(Long id) throws Exception;


    void addClient(client Client) ;
}
