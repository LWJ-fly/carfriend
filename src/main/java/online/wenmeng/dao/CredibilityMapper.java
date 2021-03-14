package online.wenmeng.dao;

import online.wenmeng.bean.Credibility;
import online.wenmeng.bean.CredibilityExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CredibilityMapper {
    long countByExample(CredibilityExample example);

    int deleteByExample(CredibilityExample example);

    int deleteByPrimaryKey(Integer credibilityid);

    int insert(Credibility record);

    int insertSelective(Credibility record);

    List<Credibility> selectByExample(CredibilityExample example);

    Credibility selectByPrimaryKey(Integer credibilityid);

    int updateByExampleSelective(@Param("record") Credibility record, @Param("example") CredibilityExample example);

    int updateByExample(@Param("record") Credibility record, @Param("example") CredibilityExample example);

    int updateByPrimaryKeySelective(Credibility record);

    int updateByPrimaryKey(Credibility record);
}