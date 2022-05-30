package com.crm.dao;

import com.crm.entity.CustomerInfo;
import com.crm.entity.CustomerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_info
     *
     * @mbg.generated
     */
    long countByExample(CustomerInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_info
     *
     * @mbg.generated
     */
    int deleteByExample(CustomerInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String customerid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_info
     *
     * @mbg.generated
     */
    int insert(CustomerInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_info
     *
     * @mbg.generated
     */
    int insertSelective(CustomerInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_info
     *
     * @mbg.generated
     */
    List<CustomerInfo> selectByExample(CustomerInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_info
     *
     * @mbg.generated
     */
    CustomerInfo selectByPrimaryKey(String customerid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CustomerInfo record, @Param("example") CustomerInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CustomerInfo record, @Param("example") CustomerInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CustomerInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CustomerInfo record);
}