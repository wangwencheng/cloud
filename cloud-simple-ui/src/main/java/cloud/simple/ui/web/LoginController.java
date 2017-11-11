/**
 * @author  wencheng
 * @date: 2017年7月14日 上午10:09:03
 */
package cloud.simple.ui.web;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *@Copyright (c), 2012-2016,DaZhi NetWork.Co.,Ltd  
 *@package cloud.simple.web
 *@FileName:LoginController.java 
 *@Author:王文城                 
 *@Date:2017年7月14日 
 *@Description: 
 *@Vesion:1.0
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	@RequestMapping("/user")
	 public ModelAndView index(){
		ModelAndView mav=new ModelAndView();
		mav.addObject("name","wwc2");
		mav.setViewName("login");
		return mav;
	 }
}
