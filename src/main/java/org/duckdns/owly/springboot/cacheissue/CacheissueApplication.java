package org.duckdns.owly.springboot.cacheissue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.filter.ShallowEtagHeaderFilter;

@SpringBootApplication
@Import(ShallowEtagHeaderFilter.class)
public class CacheissueApplication {

	public static void main(String[] args) {
		SpringApplication.run(CacheissueApplication.class, args);
	}

}
