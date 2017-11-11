package cloud.simple.service.model;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * @author wangwencheng
 * @ClassName: cloud.simple.service.model
 * @Description:
 * @date 2017/9/24 19:39
 */
@Entity
@Table(name = "CLOUD_GROUP")
public class Group {
    /**
     * 组织Id
     */
    private String groupId;
    /**
     * 组织代码
     */
    private String groupCode;
    /**
     * 组织名称
     */
    private String gruopName;
    /**
     * 组织描述
     */
    private String groupDesc;
    /**
     * 父Id
     */
    private String parentId;
    /**
     * 组织排序
     */
    private Long groupOrder;
    /**
     * 联系人
     */
    private String linkMan;
    /**
     * 联系电话
     */
    private String linkPhone;
    /**
     * 创建人
     */
    private String crUser;
    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd:hh:mm:ss")
    private Date crTime;
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "GROUPID", unique = true, length = 32)
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    @Column(name = "GROUPCODE", length = 32)
    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }
    @Column(name = "GROUPNAME", length = 32)
    public String getGruopName() {
        return gruopName;
    }

    public void setGruopName(String gruopName) {
        this.gruopName = gruopName;
    }
    @Column(name = "GROUPDESC", length = 32)
    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }
    @Column(name = "PARENTID", length = 32)
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
    @Column(name = "GROUPORDER", length = 32)
    public Long getGroupOrder() {
        return groupOrder;
    }

    public void setGroupOrder(Long groupOrder) {
        this.groupOrder = groupOrder;
    }
    @Column(name = "LINKMAN", length = 32)
    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan;
    }
    @Column(name = "LINKPHONE", length = 32)
    public String getLinkPhone() {
        return linkPhone;
    }

    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone;
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
