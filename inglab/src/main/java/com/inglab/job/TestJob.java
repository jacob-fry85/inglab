package com.inglab.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestJob implements Job {
	 private static Logger logger = LoggerFactory.getLogger(TestJob.class);
	
	@Override
	public void execute(JobExecutionContext jExeCtx) throws JobExecutionException {
		logger.debug("please update the stocks gainers and losers...");		
	}
}
