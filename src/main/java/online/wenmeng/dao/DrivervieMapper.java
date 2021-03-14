package online.wenmeng.dao;

import online.wenmeng.bean.Drivervie;
import online.wenmeng.bean.DrivervieExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DrivervieMapper {
    long countByExample(DrivervieExample example);

    int deleteByExample(DrivervieExample example);

    int deleteByPrimaryKey(Integer vieid);

    int insert(Drivervie record);

    int insertSelective(Drivervie record);

    List<Drivervie> selectByExample(DrivervieExample example);

    Drivervie selectByPrimaryKey(Integer vieid);

    int updateByExampleSelective(@Param("record") Drivervie record, @Param("example") DrivervieExample example);

    int updateByExample(@Param("record") Drivervie record, @Param("example") DrivervieExample example);

    int updateByPrimaryKeySelective(Drivervie record);

    int updateByPrimaryKey(Drivervie record);
}