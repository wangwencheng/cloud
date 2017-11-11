package cloud.simple.service.dao;

/**
 * @author  wencheng
 * @date: 2017年5月2日 下午5:59:44
 */

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Table;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import cloud.simple.service.model.User;

/**
 * @Copyright (c), 2012-2016,DaZhi NetWork.Co.,Ltd
 * @package could.simple.service.dao
 * @FileName:UserDao.java
 * @Author:王文城
 * @Date:2017年5月2日
 * @Description:
 * @Vesion:1.0
 */

 @Repository
@SuppressWarnings("all")
public interface UserDao extends JpaRepository<User,Long>{

}
