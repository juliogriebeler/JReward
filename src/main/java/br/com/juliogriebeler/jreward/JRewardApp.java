package br.com.juliogriebeler.jreward;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import br.com.juliogriebeler.jreward.properties.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class JRewardApp {
	public static void main(String[] args) {
		SpringApplication.run(JRewardApp.class, args);
	}
}
