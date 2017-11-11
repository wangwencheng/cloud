/**
 * @author  wencheng
 * @date: 2017年6月12日 下午3:04:48
 */
package cloud.simple.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@Copyright (c), 2012-2016,DaZhi NetWork.Co.,Ltd  
 *@package cloud.simple.docker
 *@FileName:Application.java 
 *@Author:王文城                 
 *@Date:2017年6月12日 
 *@Description: 
 *@Vesion:1.0
 */

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public String home() {
		return "Hello Docker World";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}