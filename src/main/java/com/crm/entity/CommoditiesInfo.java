package com.crm.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table commodities_info
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class CommoditiesInfo {
    /**
     * Database Column Remarks:
     *   商品id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodities_info.goodsID
     *
     * @mbg.generated
     */
    private String goodsid;

    /**
     * Database Column Remarks:
     *   商品名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodities_info.goodsname
     *
     * @mbg.generated
     */
    private String goodsname;

    /**
     * Database Column Remarks:
     *   商品类别
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodities_info.goodsype
     *
     * @mbg.generated
     */
    private String goodsype;

    /**
     * Database Column Remarks:
     *   商品预计使用寿命（月）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodities_info.servicemonth
     *
     * @mbg.generated
     */
    private String servicemonth;

    /**
     * Database Column Remarks:
     *   备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodities_info.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * Database Column Remarks:
     *   进价
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodities_info.purchasePrice
     *
     * @mbg.generated
     */
    private BigDecimal purchaseprice;

    /**
     * Database Column Remarks:
     *   售价
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodities_info.price
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     * Database Column Remarks:
     *   更新人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodities_info.updateuser
     *
     * @mbg.generated
     */
    private String updateuser;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodities_info.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodities_info.goodsID
     *
     * @return the value of commodities_info.goodsID
     *
     * @mbg.generated
     */
    public String getGoodsid() {
        return goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodities_info.goodsID
     *
     * @param goodsid the value for commodities_info.goodsID
     *
     * @mbg.generated
     */
    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid == null ? null : goodsid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodities_info.goodsname
     *
     * @return the value of commodities_info.goodsname
     *
     * @mbg.generated
     */
    public String getGoodsname() {
        return goodsname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodities_info.goodsname
     *
     * @param goodsname the value for commodities_info.goodsname
     *
     * @mbg.generated
     */
    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodities_info.goodsype
     *
     * @return the value of commodities_info.goodsype
     *
     * @mbg.generated
     */
    public String getGoodsype() {
        return goodsype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodities_info.goodsype
     *
     * @param goodsype the value for commodities_info.goodsype
     *
     * @mbg.generated
     */
    public void setGoodsype(String goodsype) {
        this.goodsype = goodsype == null ? null : goodsype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodities_info.servicemonth
     *
     * @return the value of commodities_info.servicemonth
     *
     * @mbg.generated
     */
    public String getServicemonth() {
        return servicemonth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodities_info.servicemonth
     *
     * @param servicemonth the value for commodities_info.servicemonth
     *
     * @mbg.generated
     */
    public void setServicemonth(String servicemonth) {
        this.servicemonth = servicemonth == null ? null : servicemonth.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodities_info.remark
     *
     * @return the value of commodities_info.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodities_info.remark
     *
     * @param remark the value for commodities_info.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodities_info.purchasePrice
     *
     * @return the value of commodities_info.purchasePrice
     *
     * @mbg.generated
     */
    public BigDecimal getPurchaseprice() {
        return purchaseprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodities_info.purchasePrice
     *
     * @param purchaseprice the value for commodities_info.purchasePrice
     *
     * @mbg.generated
     */
    public void setPurchaseprice(BigDecimal purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodities_info.price
     *
     * @return the value of commodities_info.price
     *
     * @mbg.generated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodities_info.price
     *
     * @param price the value for commodities_info.price
     *
     * @mbg.generated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodities_info.updateuser
     *
     * @return the value of commodities_info.updateuser
     *
     * @mbg.generated
     */
    public String getUpdateuser() {
        return updateuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodities_info.updateuser
     *
     * @param updateuser the value for commodities_info.updateuser
     *
     * @mbg.generated
     */
    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser == null ? null : updateuser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodities_info.update_time
     *
     * @return the value of commodities_info.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodities_info.update_time
     *
     * @param updateTime the value for commodities_info.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}