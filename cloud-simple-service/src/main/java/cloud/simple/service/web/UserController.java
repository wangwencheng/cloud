/**
 * @author  wencheng
 * @date: 2017年5月2日 下午6:01:19
 */
package cloud.simple.service.web;


import cloud.simple.service.dao.UserDao;
import cloud.simple.service.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import cloud.simple.service.service.RedisService;
import cloud.simple.service.service.UserService;
import cloud.simple.service.model.User;

import java.util.List;
import java.util.Map;

/**
 *@Copyright (c), 2012-2016,DaZhi NetWork.Co.,Ltd  
 *@package could.simple.service.web
 *@FileName:UserController.java 
 *@Author:王文城                 
 *@Date:2017年5月2日 
 *@Description: 
 *@Vesion:1.0
 */
@RestController
public class UserController {
	@Autowired
	private UserService userService;
	 @Autowired
	 private RedisService redisService;
	@Autowired
	 private TestMapper testMapper;
	@RequestMapping(value="/user")
   public User lists(){
		if(!userService.lists().isEmpty()){
			redisService.set(userService.lists().get(0).getId().toString(),userService.lists().get(0));
			return (User) redisService.get(userService.lists().get(0).getId().toString());
		}
	   return userService.lists().get(0);
   }
		@RequestMapping(value="/insertuser",method=RequestMethod.POST)
		public User insertuser(@RequestBody User user){
			return user;
		}
	    @RequestMapping(value="/testMybaits")
        public List<User> test(){
			List<User> list=testMapper.testGetAssociateData();
			return	list;
	   }

}
