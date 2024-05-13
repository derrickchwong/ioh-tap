package com.example.apiconsumer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties.StubsMode;

@SpringBootTest
@AutoConfigureStubRunner(ids = "com.example:api-provider:+:stubs:8080", stubsMode = StubsMode.LOCAL)
class HelperTest {

    @Test
    void testSendSuccess() throws Exception {
        // Call the send method with valid data
        String response = Helper.send("1", "12345678");

        // Assert the expected response
        assertEquals("{\"id\":\"1\",\"phone\":\"12345678\"}", response);
    }

    @Test
    void invalidPhone1() throws Exception {
        // Call the send method with invalid data (e.g., invalid phone number)
        assertThrows(Exception.class, () -> Helper.send("1", "1234567"));
    }

    @Test
    void invalidPhone2() throws Exception {
        // Call the send method with invalid data (e.g., invalid phone number)
        assertThrows(Exception.class, () -> Helper.send("1", "123456789"));
    }

    @Test
    void missingPhone() throws Exception {
        // Call the send method with invalid data (e.g., empty phone number)
        assertThrows(Exception.class, () -> Helper.send("1", null));
    }

    @Test
    void missingId() throws Exception {
        // Call the send method with invalid data (e.g., empty phone number)
        assertThrows(Exception.class, () -> Helper.send(null, "12345678"));
    }

    @Test
    void missingIdAndPhone() throws Exception {
        // Call the send method with invalid data (e.g., empty phone number)
        assertThrows(Exception.class, () -> Helper.send(null, null));
    }
}
