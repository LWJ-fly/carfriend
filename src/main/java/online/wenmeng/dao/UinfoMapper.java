package online.wenmeng.dao;

import online.wenmeng.bean.Uinfo;
import online.wenmeng.bean.UinfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UinfoMapper {
    long countByExample(UinfoExample example);

    int deleteByExample(UinfoExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(Uinfo record);

    int insertSelective(Uinfo record);

    List<Uinfo> selectByExample(UinfoExample example);

    Uinfo selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") Uinfo record, @Param("example") UinfoExample example);

    int updateByExample(@Param("record") Uinfo record, @Param("example") UinfoExample example);

    int updateByPrimaryKeySelective(Uinfo record);

    int updateByPrimaryKey(Uinfo record);
}