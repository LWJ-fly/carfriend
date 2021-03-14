package online.wenmeng.dao;

import online.wenmeng.bean.Ulogin;
import online.wenmeng.bean.UloginExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UloginMapper {
    long countByExample(UloginExample example);

    int deleteByExample(UloginExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(Ulogin record);

    int insertSelective(Ulogin record);

    List<Ulogin> selectByExample(UloginExample example);

    Ulogin selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") Ulogin record, @Param("example") UloginExample example);

    int updateByExample(@Param("record") Ulogin record, @Param("example") UloginExample example);

    int updateByPrimaryKeySelective(Ulogin record);

    int updateByPrimaryKey(Ulogin record);
}