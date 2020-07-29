/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitalthinking.ada_quartz.service;

import java.util.concurrent.atomic.AtomicInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author sotobotero
 */
@Service
public class BillingService {

    private Logger log = LoggerFactory.getLogger(getClass());

    public static final long EXECUTION_TIME = 5000L;

    private AtomicInteger count = new AtomicInteger();

    public void callBillingProcess() {

        log.info("The sample job has begun...");
       // getPets();
        try {
            Thread.sleep(EXECUTION_TIME);
        } catch (InterruptedException e) {
            log.error("Error while executing sample job", e);
        } finally {
            count.incrementAndGet();
            log.info("Sample job has finished...");
        }
    }

    public int getNumberOfInvocations() {
        return count.get();  
    }
    
    
    @Value("${billing.endpoint}")
    private  String ENDPOINT;
    @Value("${billing.resource.billing}")
    private  String URL_BILLING;
    @Value("${billing.username}")
    private  String USER_NAME;
    @Value("${billing.password}")
    private  String PASSWORD;
    @Value("${billing.parameter.status}")    
    private String STATUS_PARAMETR;
    @Value("${billing.iso.date.format}")
   
    private String getPets() {
       log.info("The gettoken Service was called...");
        String token = "";
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
            UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(ENDPOINT + URL_BILLING)                  
                    .queryParam("status", STATUS_PARAMETR);
            String fullUrl = builder.build().toString();                     
             ResponseEntity<Object[]> response =  new RestTemplate().getForEntity(fullUrl,  Object[].class);
             Object[] pets = response.getBody();      
            log.info("The getPets Service finished sucessfuly..."+pets.length);
        } catch (RestClientException e) {
            log.error("Error while executing callBillingProcess job", e);
        } 
        return token;
    }
      

}
