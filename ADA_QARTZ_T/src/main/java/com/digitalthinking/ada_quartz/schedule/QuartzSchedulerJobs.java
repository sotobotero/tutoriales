/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitalthinking.ada_quartz.schedule;

import org.quartz.JobDetail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;

/**
 *
 * @author sotobotero
 */
@Configuration
public class QuartzSchedulerJobs {              
  
    @Value("${billing.cron}")
    private  String CRON_BILLING;      
    Logger log = LoggerFactory.getLogger(getClass());
     
    /**
     * 
     * @return a job of a specifi class 
     */
    @Bean(name = "memberClassBilling")
    public JobDetailFactoryBean jobMemberClassBilling() {
        return QuartzConfig.createJobDetail(BillingJob.class, "Class billing Job");
    }

    @Bean(name = "memberClassBillingTrigger")
    public CronTriggerFactoryBean triggerMemberClassBilling(@Qualifier("memberClassBilling") JobDetail jobDetail) {
        return QuartzConfig.createCronTrigger(jobDetail, CRON_BILLING, "Class Billing Trigger");
    }
    
}
