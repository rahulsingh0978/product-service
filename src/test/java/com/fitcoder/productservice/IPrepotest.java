package com.fitcoder.productservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class IPrepotest {

    /*@Mock
    private tIpResultPortRepository ipResultPortRepository;

    @InjectMocks
    private IpResultPortService ipResultPortService;

    @Test
    public void testGetIpAndPortByCustomerId() {
        Long customerId = 1L;
        Object[] result1 = new Object[]{"192.168.1.1", 8080};
        Object[] result2 = new Object[]{"192.168.1.2", 8081};
        List<Object[]> results = new ArrayList<>();
        results.add(result1);
        results.add(result2);
        Mockito.when(ipResultPortRepository.findIpAndPortByCustomerId(customerId)).thenReturn(results);

        List<Object[]> ipAndPortList = ipResultPortService.getIpAndPortByCustomerId(customerId);
        Assert.assertNotNull(ipAndPortList);
        Assert.assertEquals(ipAndPortList.size(), 2);
        Assert.assertEquals(ipAndPortList.get(0)[0], "192.168.1.1");
        Assert.assertEquals(ipAndPortList.get(0)[1], 8080);
        Assert.assertEquals(ipAndPortList.get(1)[0], "192.168.1.2");
        Assert.assertEquals(ipAndPortList.get(1)[1], 8081);
    }*/
}