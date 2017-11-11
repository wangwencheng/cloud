/**
 * @author  wencheng
 * @date: 2017年7月13日 下午6:57:30
 */
package cloud.simple.service.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;

import cloud.simple.service.service.RedisService;
import cloud.simple.service.model.User;

/**
 *@Copyright (c), 2012-2016,DaZhi NetWork.Co.,Ltd  
 *@package cloud.simple.service.web
 *@FileName:UserCache.java 
 *@author:王文城
 *@Date:2017年7月13日 
 *@Description: 
 *@Vesion:1.0
 */
@RestController
public class UserCacheController {
     @Autowired
	private RedisService redisService;
	 @RequestMapping(value="usersCache")
	public List<User> getuserCacheData(){
    	List<User> users=new ArrayList<>();
		Object usersStr=redisService.get("users");
		if(null!=usersStr  && !"".equals(usersStr.toString())){
			users=JSON.parseArray(usersStr.toString(),User.class);
		}
		return users;
	}
}
