package org.example.contactapp.service;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.contactapp.dto.request.RequestContactDTO;
import org.example.contactapp.dto.response.ResponseContactDTO;
import org.example.contactapp.entity.Contact;
import org.example.contactapp.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
@AllArgsConstructor
@Builder
@Slf4j
public class ContactService {

    @Autowired
    private final ContactRepository contactRepository;

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
    public ResponseContactDTO getContactById(int id){

        log.info("Fetching contact with id: {}", id);
        ResponseContactDTO response = contactRepository.findById(id)
                .orElseThrow()
                .toDto();
        log.info("Contact fetched successfully with id: {}", id);
        return response;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public ResponseContactDTO addContact(Contact contact){

        log.info("Adding new contact with email: {}", contact.getEmail());
        ResponseContactDTO response = contactRepository.save(contact)
                .toDto();
        log.info("Contact added successfully with id: {}", response.getContactId());
        return response;
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
    public ResponseContactDTO updateContactDetail(Contact contact){
        return contactRepository.save(contact).toDto();
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
    public void deleteContactById(int id){
        contactRepository.deleteById(id);
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
    public List<ResponseContactDTO> getAllContacts(){
        List<Contact> contacts = contactRepository.findAll();
        List<ResponseContactDTO> contactDTOList = new ArrayList<>();
        for(Contact key: contacts){
            contactDTOList.add(key.toDto());
        }
        log.info("number of contacts in list is {} ",contactDTOList.size());
        return contactDTOList;
    }

}
