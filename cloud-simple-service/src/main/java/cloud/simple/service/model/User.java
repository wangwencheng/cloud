/**
 * @author  wencheng
 * @date: 2016年8月10日 下午2:22:00
 */
package cloud.simple.service.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @package com.dazhi.common.model
 * @FileName:User.java
 * @Author:王文城
 * @table:用户表
 * @Date:2016年10月19日
 * @Description:
 * @Vesion:1.0
 */
@Entity
@Table(name = "CLOUD_USER")
public class User implements Serializable{
	public User(){};
	private static final long serialVersionUID = 1L;
	private String userId;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 用户密码
	 */
	private String password;
	/**
	 * 联系电话
	 */
	private String telephone;
	/**
	 * 联系地址
	 */
	private String address;
	/**
	 * 登录Ip
	 */
	private String loginIp;
	/**
	 * 登陆时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd:hh:mm:ss")
	private Date loginTime;
	/**
	 * 电子邮箱
	 */
	private String email;
	/**
	 * 用户状态
	 */
	private int status;
	/**
	 * 创建时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd:hh:mm:ss")
	private Date crTime;
	/**
	 * 创建人
	 */
	private String crUser;

	public interface STATUS{
		/**
		 * 待审核
		 */
		public static final int DSK=0;
		/**
		 * 已开通
		 */
		public static final int OPEN=1;
		/**
		 * 停用
		 */
		public static final int CLOSE=2;
	}
	
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "USERID", unique = true,  length = 32)
	public String getId() {
		return userId;
	}

	public void setId(String id) {
		userId = id;
	}

	@Column(name = "USERNAME",  length = 32)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "PASSWORD",  length = 32)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name = "TELEPHONE", length = 16)
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telphone) {
		this.telephone = telphone;
	}

	@Column(name = "EMAIL",  length = 64)
	public String getEmail() {
		return email;
	}

	public void setEmail(String eamil) {
		this.email = eamil;
	}

	@Column(name = "ADDRESS", length = 256)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "STATUS")
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Column(name = "LOGINTIME")
	public Date getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	@Column(name = "LOGINIP", length = 32)
	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}


	@Column(name = "CRTIME")
	public Date getCrTime() {
		return crTime;
	}

	public void setCrTime(Date crTime) {
		this.crTime = crTime;
	}

	@Column(name = "CRUSER", length = 32)
	public String getCrUser() {
		return crUser;
	}

	public void setCrUser(String crUser) {
		this.crUser = crUser;
	}
}
