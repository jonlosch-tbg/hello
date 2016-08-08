
package com.tbg.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String root() {

		Package objPackage = this.getClass().getPackage();
		String version = objPackage.getSpecificationVersion();

		return "Hello - " + version;
	}
}
