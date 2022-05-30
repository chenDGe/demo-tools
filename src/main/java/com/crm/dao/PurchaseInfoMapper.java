package com.crm.dao;

import com.crm.entity.PurchaseInfo;
import com.crm.entity.PurchaseInfoExample;
import com.crm.entity.PurchaseInfoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_info
     *
     * @mbg.generated
     */
    long countByExample(PurchaseInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_info
     *
     * @mbg.generated
     */
    int deleteByExample(PurchaseInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(PurchaseInfoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_info
     *
     * @mbg.generated
     */
    int insert(PurchaseInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_info
     *
     * @mbg.generated
     */
    int insertSelective(PurchaseInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_info
     *
     * @mbg.generated
     */
    List<PurchaseInfo> selectByExample(PurchaseInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_info
     *
     * @mbg.generated
     */
    PurchaseInfo selectByPrimaryKey(PurchaseInfoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") PurchaseInfo record, @Param("example") PurchaseInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") PurchaseInfo record, @Param("example") PurchaseInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(PurchaseInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PurchaseInfo record);
}