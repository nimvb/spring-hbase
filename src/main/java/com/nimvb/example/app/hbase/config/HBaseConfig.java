package com.nimvb.example.app.hbase.config;

import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class HBaseConfig {

    @Bean
    org.apache.hadoop.conf.Configuration configuration(){
        org.apache.hadoop.conf.Configuration configuration = HBaseConfiguration.create();
        configuration.set("hbase.zookeeper.quorum","localhost","127.0.0.1");
        configuration.set("hbase.zookeeper.property.clientPort","2181");
        configuration.set("hbase.rootdir","hdfs://localhost:9000/hbase");
        configuration.set("hbase.cluster.distributed","true");
        return configuration;
    }

    @Bean
    Connection connection() throws IOException {
        return ConnectionFactory.createConnection(configuration());

    }
}
