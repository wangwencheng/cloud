/**
 * @author  wencheng
 * @date: 2017年7月1日 下午4:17:45
 */
package cloud.simple.service.service;

/**
 *@Copyright (c), 2012-2016,DaZhi NetWork.Co.,Ltd  
 *@package could.simple.service.domain
 *@FileName:RedisService.java 
 *@Author:王文城                 
 *@Date:2017年7月1日 
 *@Description: 
 *@Vesion:1.0
 */

public interface RedisService {

    public void set(String key, Object value);  

    public Object get(String key);  

}