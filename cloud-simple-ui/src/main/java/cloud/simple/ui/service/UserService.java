/**
 * @author  wencheng
 * @date: 2017年6月14日 下午2:57:26
 */
package cloud.simple.ui.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cloud.simple.ui.model.User;


/**
 *@Copyright (c), 2012-2016,DaZhi NetWork.Co.,Ltd  
 *@package cloud.simple
 *@FileName:UserFeignClient.java 
 *@Author:王文城                 
 *@Date:2017年6月14日 
 *@Description: 
 *@Vesion:1.0
 */
@FeignClient("cloud-simple-service")
public interface  UserService {
	@RequestMapping(value="/user", method=RequestMethod.GET)
	 public User findAll();

	/**
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/insertuser", method=RequestMethod.POST)
	public User insertuser(@RequestBody User user);
	
	/*@RequestMapping(value="/insertuser", method=RequestMethod.POST)
	public List<User> getUsersCache();*/
}
