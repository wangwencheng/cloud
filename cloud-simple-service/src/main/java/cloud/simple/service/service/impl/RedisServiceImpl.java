/**
 * @author  wencheng
 * @date: 2017年7月1日 下午4:18:57
 */
package cloud.simple.service.service.impl;

import javax.annotation.Resource;

import cloud.simple.service.service.RedisService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;


/**
 *@Copyright (c), 2012-2016,DaZhi NetWork.Co.,Ltd  
 *@package could.simple.service.domain.impl
 *@FileName:RedisServiceImpl.java 
 *@Author:王文城                 
 *@Date:2017年7月1日 
 *@Description: 
 *@Vesion:1.0
 */
@Service
public class RedisServiceImpl implements RedisService {

	  @Resource
	    private RedisTemplate<String,Object> redisTemplate;
	    @Override
	    public void set(String key, Object value) {
	        ValueOperations<String,Object> vo = redisTemplate.opsForValue();
	         vo.set(key, value);
	    }
	    @Override
	    public Object get(String key) {
	        ValueOperations<String,Object> vo = redisTemplate.opsForValue();
	        return vo.get(key);
	    }

}
