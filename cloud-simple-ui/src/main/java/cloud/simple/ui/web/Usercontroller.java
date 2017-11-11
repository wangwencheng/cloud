/**
 * @author  wencheng
 * @date: 2017年5月9日 上午9:05:38
 */
package cloud.simple.ui.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import cloud.simple.ui.model.User;
import cloud.simple.ui.service.UserService;


/**
 *@Copyright (c), 2012-2016,DaZhi NetWork.Co.,Ltd  
 *@package cloud.simple.web
 *@FileName:Usercontroller.java 
 *@Author:王文城                 
 *@Date:2017年5月9日 
 *@Description: 
 *@Vesion:1.0
 */
@SuppressWarnings("all")
@Controller
public class Usercontroller {
/*	@Autowired
	private RestTemplate restTemplate;
	@RequestMapping("/user")
	public List<User> findAll(){
		return restTemplate.getForObject("http://cloud-simple-service/user/", List.class);
	}
	*/
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public ModelAndView test(){
		ModelAndView mav=new ModelAndView();
		mav.setViewName("index");
		return mav;
	}
	@ResponseBody
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public User findAll(){
		System.out.println(userService.findAll());
		return userService.findAll();
	}
	@ResponseBody
	@RequestMapping(value="/insertuser",method=RequestMethod.GET)
	public User insertuser(User user){
		return userService.insertuser(user);
	}
	
	
	
}
