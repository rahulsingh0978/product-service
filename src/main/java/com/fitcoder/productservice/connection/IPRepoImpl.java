package com.fitcoder.productservice.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component                                                                                                              
public class IPRepoImpl {                                                                                               
    @Autowired                                                                                                          
    IPRepository customerRepository;                                                                                    
    public void exampleMethod() {                                                                                       
        List<Object[]> results = customerRepository.getIpAndPort();                                                     
        for (Object[] result : results) {                                                                               
            String ip = (String) result[0];                                                                             
            int port = (Integer) result[1];                                                                             
            // do something with the ip and port values                                                                 
            System.out.println(ip+" : "+port);                                                                          
        }                                                                                                               
    }                                                                                                                   
    public static void main(String[] args) {                                                                            
                                                                                                                        
    }                                                                                                                   
} 




