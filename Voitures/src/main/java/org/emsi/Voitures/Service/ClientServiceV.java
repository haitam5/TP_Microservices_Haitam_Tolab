package org.emsi.Voitures.Service;


import org.emsi.Voitures.Model.Client;
import org.emsi.Voitures.Model.Voiture;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@FeignClient(name="SERVICE-CLIENT")
public interface ClientServiceV {

        //List<Voiture> findAll();

   // Voiture findById(Long id) throws Exception;


       // void addClient(Voiture voiture) ;
    @GetMapping("/clients/{id}")
    Client clientById(@PathVariable Long id);

}
