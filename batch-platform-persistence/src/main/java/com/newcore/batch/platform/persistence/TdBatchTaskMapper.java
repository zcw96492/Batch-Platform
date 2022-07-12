package com.newcore.batch.platform.persistence;

import com.newcore.batch.platform.model.TdBatchTask;
import com.newcore.batch.platform.model.TdBatchTaskExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TdBatchTaskMapper {
    /**
     * countByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int countByExample(TdBatchTaskExample example);

    /**
     * deleteByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByExample(TdBatchTaskExample example);

    /**
     * deleteByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int deleteByPrimaryKey(Long batchTaskId);

    /**
     * insert 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insert(TdBatchTask record);

    /**
     * insertSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int insertSelective(TdBatchTask record);

    /**
     * selectByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    List<TdBatchTask> selectByExample(TdBatchTaskExample example);

    /**
     * selectByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    TdBatchTask selectByPrimaryKey(Long batchTaskId);

    /**
     * updateByExampleSelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExampleSelective(@Param("record") TdBatchTask record, @Param("example") TdBatchTaskExample example);

    /**
     * updateByExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByExample(@Param("record") TdBatchTask record, @Param("example") TdBatchTaskExample example);

    /**
     * updateByPrimaryKeySelective 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKeySelective(TdBatchTask record);

    /**
     * updateByPrimaryKey 方法
     *
     * @date 2022-07-12 23:52:08
     */
    int updateByPrimaryKey(TdBatchTask record);
}