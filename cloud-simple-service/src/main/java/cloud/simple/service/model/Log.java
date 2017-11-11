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
@Table(name = "CLOUD_LOG")
public class Log {
    /**
     * 日志ID
     */
    private String logId;
    /**
     * 操作描述
     */
    private String operDesc;
    /**
     * 操作耗时
     */
    private String costTime;
    /**
     * 操作类型
     */
    private int operType;
    /**
     * 操作对象
     */
    private String operObj;
    /**
     * 错误信息
     */
    private String errorInfo;
    /**
     * 操作结果
     */
    private String operResult;
    /**
     * 操作参数
     */
    private String param;
    /**
     * 操作IP
     */
    private String operIp;
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
    @Column(name = "LOGID", unique = true, length = 32)
    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    @Column(name = "OPERDESC", length = 32)
    public String getOperDesc() {
        return operDesc;
    }

    public void setOperDesc(String operDesc) {
        this.operDesc = operDesc;
    }

    @Column(name = "COSTTIME", length = 32)
    public String getCostTime() {
        return costTime;
    }

    public void setCostTime(String costTime) {
        this.costTime = costTime;
    }

    @Column(name = "OPERTYPE", length = 1)
    public int getOperType() {
        return operType;
    }

    public void setOperType(int operType) {
        this.operType = operType;
    }

    @Column(name = "OPEROBJ", length = 32)
    public String getOperObj() {
        return operObj;
    }

    public void setOperObj(String operObj) {
        this.operObj = operObj;
    }

    @Column(name = "ERRORINFO", length = 32)
    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    @Column(name = "OPERRESULT", length = 32)
    public String getOperResult() {
        return operResult;
    }

    public void setOperResult(String operResult) {
        this.operResult = operResult;
    }

    @Column(name = "PARAM", length = 32)
    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    @Column(name = "OPERIP", length = 32)
    public String getOperIp() {
        return operIp;
    }

    public void setOperIp(String operIp) {
        this.operIp = operIp;
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
