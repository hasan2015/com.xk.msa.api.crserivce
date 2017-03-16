/**
 * 
 */
package com.xk.msa.api.cr.ctrl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanhaixun
 * @date 2017年3月16日 上午10:56:06
 *
 */
@RestController
@RefreshScope
public class MySampleRestController {
	@Value("${crservice.msg}") // 1
	private String message;
	@Value("${crservice.msg2}") // 1
	private String message2;
	@RequestMapping(name = "CRHelloService", method = RequestMethod.GET, path = "/hello")
	public String hello() {
		return "hello CR: " + message+" [msg2=]"+message2;
	}
}
