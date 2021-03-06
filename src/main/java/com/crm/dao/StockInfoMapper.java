package com.crm.dao;

import com.crm.entity.StockInfo;
import com.crm.entity.StockInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_info
     *
     * @mbg.generated
     */
    long countByExample(StockInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_info
     *
     * @mbg.generated
     */
    int deleteByExample(StockInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String goodsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_info
     *
     * @mbg.generated
     */
    int insert(StockInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_info
     *
     * @mbg.generated
     */
    int insertSelective(StockInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_info
     *
     * @mbg.generated
     */
    List<StockInfo> selectByExample(StockInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_info
     *
     * @mbg.generated
     */
    StockInfo selectByPrimaryKey(String goodsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") StockInfo record, @Param("example") StockInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") StockInfo record, @Param("example") StockInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(StockInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(StockInfo record);
}