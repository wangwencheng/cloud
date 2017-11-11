/**
 * @author  wencheng
 * @date: 2017年7月13日 下午3:15:34
 */
package cloud.simple.service.core;

import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.alibaba.fastjson.JSON;
import cloud.simple.service.service.RedisService;
import cloud.simple.service.model.User;
import cloud.simple.service.util.MD5;




/**
 *@Copyright (c), 2012-2016,DaZhi NetWork.Co.,Ltd  
 *@package cloud.simple.service.core
 *@FileName:UserDataInit.java 
 *@Author:王文城                 
 *@Date:2017年7月13日 
 *@Description: 数据初始化  缓存初始化
 *@Vesion:1.0
 */
@Component
@SuppressWarnings("all")
public class UserDataInit implements CommandLineRunner{

	private final static Logger LOG = Logger.getLogger(UserDataInit.class);
	@Autowired
    private SessionFactory sessionFactory;
	 @Autowired
	 private RedisService redisService;
	public void run(String... arg0) throws Exception {
		//HttpServletRequest request =((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		LOG.info("用户数据初始化开始");
		initUserData();
		LOG.info("用户数据初始化结束");
		LOG.info("redis缓存数据开始");
		CacheUserData();
		LOG.info("redis缓存数据结束");
	}
	public void initUserData(){
		List<User> users=sessionFactory.openSession().createQuery("from User where 1=1").list();
		if(!users.isEmpty()){
			return ;
		}
		User user=null;
		user=new User();
		user.setAddress("福建福州");
		user.setCrTime(new Date());
		user.setCrUser("wwc");
		user.setEmail("960075207@qq.com");
		user.setLoginIp("127.0.0.1");
		user.setLoginTime(new Date());
		user.setPassword(MD5.toMD5("cloud"));
		user.setStatus(User.STATUS.OPEN);
		user.setUserName("cloud");
		saveUser(user);
		
		user=new User();
		user.setAddress("福建福州");
		user.setCrTime(new Date());
		user.setCrUser("wwc");
		user.setEmail("960075207@qq.com");
		user.setLoginIp("127.0.0.1");
		user.setLoginTime(new Date());
		user.setPassword(MD5.toMD5("cloudadmin@123"));
		user.setStatus(User.STATUS.OPEN);
		user.setUserName("cloudadmin");
		saveUser(user);
	}
	
	public void saveUser(User user){
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}
	
	public void CacheUserData(){
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		List<User> users=session.createQuery("from User where 1=1").list();
		if(users.isEmpty()){
			return ;
		}
		redisService.set("users",JSON.toJSONString(users));
	}
}
