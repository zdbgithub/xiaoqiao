package com.qiaoben.xiaoqiao_manager.dao;

import com.qiaoben.xiaoqiao_manager.bean.BaseInfo;
import com.qiaoben.xiaoqiao_manager.bean.BaseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseInfoMapper {
    long countByExample(BaseInfoExample example);

    int deleteByExample(BaseInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseInfo record);

    int insertSelective(BaseInfo record);

    List<BaseInfo> selectByExample(BaseInfoExample example);

    BaseInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseInfo record, @Param("example") BaseInfoExample example);

    int updateByExample(@Param("record") BaseInfo record, @Param("example") BaseInfoExample example);

    int updateByPrimaryKeySelective(BaseInfo record);

    int updateByPrimaryKey(BaseInfo record);
}