/**
 * @author  wencheng
 * @date: 2017年7月13日 下午4:48:12
 */
package cloud.simple.service.core;

import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

/**
 *@Copyright (c), 2012-2016,DaZhi NetWork.Co.,Ltd  
 *@package cloud.simple.service.core
 *@FileName:UserDataDestory.java 
 *@Author:王文城                 
 *@Date:2017年7月13日 
 *@Description: 
 *@Vesion:1.0
 */
//@Component
public class UserDataDestory {
 // @PreDestroy 
  public void destory(){
	  System.out.println("我被销毁啦");
  }
}
