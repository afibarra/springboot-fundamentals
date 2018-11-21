package me.afibarra.core;

import me.afibarra.core.services.PaymentService;
import me.afibarra.core.services.PaymentServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoreApplicationTests {

    @Autowired
    private PaymentServiceImpl service;

    @Test
    public void testDI() {
        assertNotNull(service);
        assertNotNull(service.getDao());
    }
}
