package cloud.simple.service.mapper;

import cloud.simple.service.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author wangwencheng
 * @ClassName: cloud.simple.service.dao
 * @Description:
 * @date 2017/10/24 13:45
 */
@Repository
public interface TestMapper {
    public List<User> testGetAssociateData() ;
}
