/**
 * 
 */
package com.xk.msa.api.cr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author yanhaixun
 * @date 2017年3月14日 下午8:00:12
 *
 */
@RestController
@SpringBootApplication(scanBasePackages = "com.xk.msa")
public class Application {
	@RequestMapping(name = "HelloService", method = RequestMethod.GET, path = "/hello")
	public String hello() {
		return "hello";
	}
 
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
