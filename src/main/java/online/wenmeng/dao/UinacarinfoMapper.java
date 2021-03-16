package online.wenmeng.dao;

import online.wenmeng.bean.Uinacarinfo;
import online.wenmeng.bean.UinacarinfoExample;
import online.wenmeng.bean.UinacarinfoKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UinacarinfoMapper {
    long countByExample(UinacarinfoExample example);

    int deleteByExample(UinacarinfoExample example);

    int deleteByPrimaryKey(UinacarinfoKey key);

    int insert(Uinacarinfo record);

    int insertSelective(Uinacarinfo record);

    List<Uinacarinfo> selectByExample(UinacarinfoExample example);

    Uinacarinfo selectByPrimaryKey(UinacarinfoKey key);

    int updateByExampleSelective(@Param("record") Uinacarinfo record, @Param("example") UinacarinfoExample example);

    int updateByExample(@Param("record") Uinacarinfo record, @Param("example") UinacarinfoExample example);

    int updateByPrimaryKeySelective(Uinacarinfo record);

    int updateByPrimaryKey(Uinacarinfo record);
}