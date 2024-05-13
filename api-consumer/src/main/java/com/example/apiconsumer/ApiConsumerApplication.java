package com.example.apiconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiConsumerApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory
			.getLogger(ApiConsumerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ApiConsumerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("start");

		if(args.length == 2)
			LOG.info("response {}", Helper.send(args[0], args[1]));

		LOG.info("end");
	}
}
