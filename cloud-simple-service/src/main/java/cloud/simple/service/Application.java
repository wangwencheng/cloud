/**
 * @author  wencheng
 * @date: 2017年4月24日 下午4:20:27
 */
package cloud.simple.service;

//import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *@Copyright (c), 2012-2016,DaZhi NetWork.Co.,Ltd  
 *@package could.simple.hello
 *@FileName:Application.java 
 *@Author:王文城                 
 *@Date:2017年4月24日 
 *@Description: 
 *@Vesion:1.0
 */
@Controller
@EnableDiscoveryClient
@ComponentScan("cloud.simple.service") // 扫描该包路径下的所有spring组件
@MapperScan(value="cloud.simple.service.mapper") //mybaits  mapper文件路径
@EnableJpaRepositories("cloud.simple.service.dao") // JPA扫描该包路径下的Repositorie
@EntityScan("cloud.simple.service.model") // 扫描实体类
@SpringBootApplication
//@RefreshScope  配置改变时无需重启 自动更新配置
public class Application{

	    public static void main(String[] args) throws Exception {
	        SpringApplication.run(Application.class, args);
	    } 
	    @Bean
	    public HibernateJpaSessionFactoryBean sessionFactory() {
	        return new HibernateJpaSessionFactoryBean();
	    }
}
