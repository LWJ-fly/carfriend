package online.wenmeng.dao;

import online.wenmeng.bean.Drivercar;
import online.wenmeng.bean.DrivercarExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DrivercarMapper {
    long countByExample(DrivercarExample example);

    int deleteByExample(DrivercarExample example);

    int deleteByPrimaryKey(Integer driverid);

    int insert(Drivercar record);

    int insertSelective(Drivercar record);

    List<Drivercar> selectByExample(DrivercarExample example);

    Drivercar selectByPrimaryKey(Integer driverid);

    int updateByExampleSelective(@Param("record") Drivercar record, @Param("example") DrivercarExample example);

    int updateByExample(@Param("record") Drivercar record, @Param("example") DrivercarExample example);

    int updateByPrimaryKeySelective(Drivercar record);

    int updateByPrimaryKey(Drivercar record);
}