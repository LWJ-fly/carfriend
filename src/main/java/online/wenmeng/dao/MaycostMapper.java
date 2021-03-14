package online.wenmeng.dao;

import online.wenmeng.bean.Maycost;
import online.wenmeng.bean.MaycostExample;
import online.wenmeng.bean.MaycostKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MaycostMapper {
    long countByExample(MaycostExample example);

    int deleteByExample(MaycostExample example);

    int deleteByPrimaryKey(MaycostKey key);

    int insert(Maycost record);

    int insertSelective(Maycost record);

    List<Maycost> selectByExample(MaycostExample example);

    Maycost selectByPrimaryKey(MaycostKey key);

    int updateByExampleSelective(@Param("record") Maycost record, @Param("example") MaycostExample example);

    int updateByExample(@Param("record") Maycost record, @Param("example") MaycostExample example);

    int updateByPrimaryKeySelective(Maycost record);

    int updateByPrimaryKey(Maycost record);
}