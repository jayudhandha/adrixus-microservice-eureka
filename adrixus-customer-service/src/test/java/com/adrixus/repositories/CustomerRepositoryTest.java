package com.adrixus.repositories;

import com.adrixus.models.Customer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CustomerRepositoryTest {

    private static final String NAME = "Jayesh";
    private static final String STATE = "Gujarat";
    private static final String CITY = "Vadodara";

    @Autowired
    private CustomerRepository customerRepository;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testPersistence() {
        //given
        Customer customer = new Customer();
        customer.setId(Long.valueOf("1"));
        customer.setCity("Vadodara");
        customer.setName("Jayesh");
        customer.setState("Gujarat");

        //when
        customerRepository.save(customer);

        //then
        Assert.assertNotNull(customer.getId());
        Customer newCustomer = customerRepository.findById(customer.getId()).orElse(null);
        Assert.assertEquals((Long) 1L, newCustomer.getId());
        Assert.assertEquals(NAME, newCustomer.getName());
        Assert.assertEquals(CITY, newCustomer.getCity());
        Assert.assertEquals(STATE, newCustomer.getState());
    }
}
