package com.example.apiprovider;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ApiProviderApplication.class)
public class ContactControllerTest {

  @Autowired
  private MockMvc mockMvc;

  // @Test
  // public void testAddContactWithValidData() throws Exception {
  //   // Create a valid contact object
  //   Contact contact = new Contact();
  //   contact.setId("1");
  //   contact.setAddress("address1");
  //   contact.setPhone("93123123");
  //   contact.setFirstName("Peter");
  //   contact.setLastName("Chan");
  //
  //
  //   // Perform the POST request
  //   mockMvc.perform(MockMvcRequestBuilders.post("/contacts")
  //           .contentType(MediaType.APPLICATION_JSON)
  //           .content(asJsonString(contact)))
  //       .andExpect(status().isOk())
  //       .andExpect(content().contentType(MediaType.APPLICATION_JSON))
  //       ;
  //
  // }

  private String asJsonString(final Object obj) {
    try {
      return new ObjectMapper().writeValueAsString(obj);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
