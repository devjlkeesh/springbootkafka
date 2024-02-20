package dev.jlkeesh.springbootkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestSpringbootkafkaApplication {

  public static void main(String[] args) {
    SpringApplication.from(SpringbootkafkaApplication::main)
        .with(TestSpringbootkafkaApplication.class).run(args);
  }

}
