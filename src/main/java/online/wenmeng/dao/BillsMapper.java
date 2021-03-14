package online.wenmeng.dao;

import online.wenmeng.bean.Bills;
import online.wenmeng.bean.BillsExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillsMapper {
    long countByExample(BillsExample example);

    int deleteByExample(BillsExample example);

    int deleteByPrimaryKey(Integer billid);

    int insert(Bills record);

    int insertSelective(Bills record);

    List<Bills> selectByExample(BillsExample example);

    Bills selectByPrimaryKey(Integer billid);

    int updateByExampleSelective(@Param("record") Bills record, @Param("example") BillsExample example);

    int updateByExample(@Param("record") Bills record, @Param("example") BillsExample example);

    int updateByPrimaryKeySelective(Bills record);

    int updateByPrimaryKey(Bills record);
}