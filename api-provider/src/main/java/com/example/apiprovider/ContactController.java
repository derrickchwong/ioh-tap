package com.example.apiprovider;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
  @PostMapping("/contacts")
  public ResponseEntity<Contact> addContact(@RequestBody Contact contact){
    if(contact.getPhone() == null)
      return ResponseEntity.badRequest().build();

    if(contact.getPhone().length() != 8)
      return ResponseEntity.badRequest().build();

    if(contact.getId() == null)
      return ResponseEntity.badRequest().build();

    return ResponseEntity.ok(contact);
  }

}
