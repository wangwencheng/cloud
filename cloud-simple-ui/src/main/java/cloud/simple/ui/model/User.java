/**
 * @author  wencheng
 * @date: 2017年5月2日 下午5:33:32
 */
package cloud.simple.ui.model;

import java.util.Date;

/**
 *@Copyright (c), 2012-2016,DaZhi NetWork.Co.,Ltd  
 *@package could.simple.service.model
 *@FileName:User.java 
 *@Author:王文城                 
 *@Date:2017年5月2日 
 *@Description: 
 *@Vesion:1.0
 */
public class User {
	private Long id;
	private String username;
	private Date birthday;
	private String sex;
	private String address;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", birthday="
				+ birthday + ", sex=" + sex + ", address=" + address + "]";
	}
}
