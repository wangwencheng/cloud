/**
 * @author  wencheng
 * @date: 2017年5月2日 下午2:09:49
 */
package cloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @Copyright (c), 2012-2016,DaZhi NetWork.Co.,Ltd
 * @package cloud.eureka.server
 * @FileName:EurekaServer.java
 * @Author:王文城
 * @Date:2017年5月2日
 * @Description:
 * @Vesion:1.0
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer.class, args);

		/*List<Integer> list=new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);

		Iterator<Integer> it=list.iterator();
		while(it.hasNext()){
			if(1==it.next()){
              it.remove();
			}
		}
		System.out.println(list);*/
		System.out.println("服务发现启动成功");
	}
}
