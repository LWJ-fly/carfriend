package online.wenmeng.dao;

import online.wenmeng.bean.Callleave;
import online.wenmeng.bean.CallleaveExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CallleaveMapper {
    long countByExample(CallleaveExample example);

    int deleteByExample(CallleaveExample example);

    int deleteByPrimaryKey(Integer callleaveid);

    int insert(Callleave record);

    int insertSelective(Callleave record);

    List<Callleave> selectByExample(CallleaveExample example);

    Callleave selectByPrimaryKey(Integer callleaveid);

    int updateByExampleSelective(@Param("record") Callleave record, @Param("example") CallleaveExample example);

    int updateByExample(@Param("record") Callleave record, @Param("example") CallleaveExample example);

    int updateByPrimaryKeySelective(Callleave record);

    int updateByPrimaryKey(Callleave record);
}