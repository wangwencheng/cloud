package cloud.simple.service.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * @author wangwencheng
 * @ClassName: cloud.simple.service.model
 * @Description:
 * @date 2017/9/24 19:14
 */
@Entity
@Table(name = "CLOUD_ROLE_USER")
public class RoleUser {
    /**
     * 用户Id
     */
    private String userId;
    /**
     * 角色Id
     */
    private String roleId;
    /**
     * 创建人
     */
    private String crUser;
    /**
     * 创建时间
     */
    private Date crTime;

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "USERID", unique = true, length = 32)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    @Column(name = "ROLEID", length = 32)
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
    @Column(name = "CRUSER", length = 32)
    public String getCrUser() {
        return crUser;
    }

    public void setCrUser(String crUser) {
        this.crUser = crUser;
    }
    @Column(name = "CRTIME")
    public Date getCrTime() {
        return crTime;
    }

    public void setCrTime(Date crTime) {
        this.crTime = crTime;
    }
}
