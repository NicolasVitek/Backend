package com.example.demo.services;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.client;
import com.example.demo.repositories.IClientRepositoy;

@Service
public class clientService {
    private final IClientRepositoy clientRepository;
    @Autowired

    public clientService(IClientRepositoy clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Optional<client> getClient(Long id){
        return this.clientRepository.findById(id);
    }
}
