package cloud.simple.service.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author wangwencheng
 * @ClassName: cloud.simple.service.model
 * @Description:
 * @date 2017/9/24 19:14
 */
@Entity
@Table(name = "CLOUD_ROLE")
public class Role {
    /**
     * 角色Id
     */
    private String roleId;
    /**
     * 角色名称
     */
    private String roleName;

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

    @Column(name = "ROLENAME", length = 32)
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
