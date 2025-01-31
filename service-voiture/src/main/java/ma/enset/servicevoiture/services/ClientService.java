package ma.enset.servicevoiture.services;

import ma.enset.servicevoiture.entites.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "SERVICE-CLIENT")
public interface ClientService {
    @GetMapping(path = "/clients/{id}")
    public Client clientById(@PathVariable Long id);
}
