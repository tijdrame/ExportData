package com.boa.api.listener;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * JobCompletionNotifListener
 */
@Component
public class JobCompletionNotifListener extends JobExecutionListenerSupport  {
    private static final Logger log = LoggerFactory.getLogger(JobCompletionNotifListener.class);
    //private final JdbcTemplate jdbcTemplate;

    
    /*public JobCompletionNotifListener(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }*/

    public void afterJob(JobExecution jobExecution) {
        if(jobExecution.getStatus().equals(BatchStatus.COMPLETED)){
            log.info("JOB FINISHED!! Time to verify result. debut:[{}] - fin:[{}]", jobExecution.getStartTime(), jobExecution.getEndTime());
        }
    }
    
}