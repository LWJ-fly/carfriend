package online.wenmeng.dao;

import online.wenmeng.bean.Carfriend;
import online.wenmeng.bean.CarfriendExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CarfriendMapper {
    long countByExample(CarfriendExample example);

    int deleteByExample(CarfriendExample example);

    int deleteByPrimaryKey(Integer poolingcarid);

    int insert(Carfriend record);

    int insertSelective(Carfriend record);

    List<Carfriend> selectByExample(CarfriendExample example);

    Carfriend selectByPrimaryKey(Integer poolingcarid);

    int updateByExampleSelective(@Param("record") Carfriend record, @Param("example") CarfriendExample example);

    int updateByExample(@Param("record") Carfriend record, @Param("example") CarfriendExample example);

    int updateByPrimaryKeySelective(Carfriend record);

    int updateByPrimaryKey(Carfriend record);
}