/**
 * @author  wencheng
 * @date: 2017年7月15日 下午3:39:10
 */
package cloud.simple.ui.core.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


/**
 *@Copyright (c), 2012-2016,DaZhi NetWork.Co.,Ltd  
 *@package cloud.simple.core.interceptor
 *@FileName:LoginInterceptor.java 
 *@Author:王文城                 
 *@Date:2017年7月15日 
 *@Description: 
 *@Vesion:1.0
 */

public class LoginInterceptor implements HandlerInterceptor{

	@Override //目标方法之前
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
				return false;
		/*String parentPath=request.getContextPath();
		HttpSession session = request.getSession();
		Object obj=session.getAttribute("loginUser");
		if(obj==null){
			HandlerMethod handlerMethod=(HandlerMethod) handler;
			Class<?> methodType=handlerMethod.getMethod().getReturnType();
			String className=methodType.getName();
			if(className=="void"){
				response.sendRedirect(parentPath+"/index.html");
			}else{
				response.sendRedirect(parentPath+"/index.xhtml");
			}
			return false;
		}
		User sessionUser =  (User) obj;
		User dbUser = sysUserService.findById(sessionUser.getUser().getId());
		if(dbUser==null)
		{
			session.invalidate();
			response.sendRedirect(parentPath+"/main/loginLink.xhtml");
			return false;
		}
		if(dbUser.getStatus()!=User.STATUS.OPEN){
			session.invalidate();
			response.sendRedirect(parentPath+"/main/loginLink.xhtml");
			return false;
		}
		return true;*/
	}

	@Override  //目标方法之后  渲染视图之前
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
	}

	@Override  //渲染视图之后
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}
}
