/**
 * @author  wencheng
 * @date: 2017年6月26日 下午6:04:19
 */
package cloud.simple.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;



/**
 *@Copyright (c), 2012-2016,DaZhi NetWork.Co.,Ltd  
 *@package cloud.simple.zuul
 *@FileName:ZuulApplication.java 
 *@Author:王文城                 
 *@Date:2017年6月26日 
 *@Description: 
 *@Vesion:1.0
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulApplication {
   public static void main(String[] args) {
	 SpringApplication.run(ZuulApplication.class, args);
}
}
