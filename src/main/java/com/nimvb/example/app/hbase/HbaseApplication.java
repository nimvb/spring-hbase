package com.nimvb.example.app.hbase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.io.compress.Compression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HbaseApplication implements ApplicationRunner {

	@Autowired
	Configuration configuration;


	@Autowired
	Connection connection;

	public static void main(String[] args) {
		SpringApplication.run(HbaseApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {

		HBaseAdmin.available(configuration);

	}
}
