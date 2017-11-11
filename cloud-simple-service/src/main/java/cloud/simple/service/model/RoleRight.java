package cloud.simple.service.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author wangwencheng
 * @ClassName: cloud.simple.service.model
 * @Description:
 * @date 2017/9/24 19:30
 */
@Entity
@Table(name = "CLOUD_ROLE_RIGHT")
public class RoleRight {
    /**
     * 角色Id
     */
    private String roleId;
    /**
     * 角色权限
     */
    private String roleRight;
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "ROLEID", unique = true, length = 32)
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
    @Column(name = "ROLERIGHT", length = 32)
    public String getRoleRight() {
        return roleRight;
    }

    public void setRoleRight(String roleRight) {
        this.roleRight = roleRight;
    }
}
