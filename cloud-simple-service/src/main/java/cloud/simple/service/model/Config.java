package cloud.simple.service.model;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * @author wangwencheng
 * @ClassName: cloud.simple.service.model
 * @Description:
 * @date 2017/9/24 20:12
 */
@Entity
@Table(name = "CLOUD_CONFIG")
public class Config {
    /**
     * 配置Id
     */
    private String configId;
    /**
     * 配置名称
     */
    private String configName;
    /**
     * 配置类型
     */
    private int configType;
    /**
     * 配置值
     */
    private String configValue;
    /**
     * 配置描述
     */
    private String configDesc;
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
    @Column(name = "CONFIGID", unique = true, length = 32)
    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }
    @Column(name = "CONFIGNAME", length = 32)
    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }
    @Column(name = "CONFIGTYPE", length = 12)
    public int getConfigType() {
        return configType;
    }

    public void setConfigType(int configType) {
        this.configType = configType;
    }
    @Column(name = "CONFIGVALUE", length = 256)
    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }
    @Column(name = "CONFIGDESC", length = 256)
    public String getConfigDesc() {
        return configDesc;
    }

    public void setConfigDesc(String configDesc) {
        this.configDesc = configDesc;
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
