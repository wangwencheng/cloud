/**
 * @author  wencheng
 * @date: 2017年5月2日 下午5:59:59
 */
package cloud.simple.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cloud.simple.service.dao.UserDao;
import cloud.simple.service.model.User;


/**
 *@Copyright (c), 2012-2016,DaZhi NetWork.Co.,Ltd  
 *@package could.simple.service.domain
 *@FileName:UserService.java 
 *@Author:王文城                 
 *@Date:2017年5月2日 
 *@Description: 
 *@Vesion:1.0
 */
@Service("userService")
public class UserService {
	@Autowired
	private UserDao userDao;

	public List<User> lists() {
	 return userDao.findAll();	
	}

    /*
	 * @param user
	 * @return
	 */

	public User insertuser(User user) {
		return user;
	}

}
