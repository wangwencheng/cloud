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
@Table(name = "CLOUD_GROUP_USER")
public class GruopUser {
    /**
     * 组织ID
     */
    private String groupId;
    /**
     * 用户ID
     */
    private String userId;
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
    @Column(name = "USERID",length = 32)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    @Column(name = "CRUSER",length = 32)
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
