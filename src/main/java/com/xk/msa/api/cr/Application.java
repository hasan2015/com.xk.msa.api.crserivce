/**
 * 
 */
package com.xk.msa.api.cr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author yanhaixun
 * @date 2017年3月14日 下午8:00:12
 *
 */
//@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.xk.msa")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
