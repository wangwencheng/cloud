/**
 * @author  wencheng
 * @date: 2017年5月2日 上午11:38:41
 */
package could.config.server;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *@Copyright (c), 2012-2016,DaZhi NetWork.Co.,Ltd  
 *@package could.config.server
 *@FileName:ConfigServerApplication.java 
 *@Author:王文城                 
 *@Date:2017年5月2日 
 *@Description: 
 *@Vesion:1.0
 */
@SpringBootApplication
 @EnableConfigServer
public class ConfigServerApplication {
   public static void main(String[] args) {
	   SpringApplication.run(ConfigServerApplication.class, args);
	   System.out.println("配置文件管理服务器启动成功");
}
}
