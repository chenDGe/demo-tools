package com.crm.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table purchase_info
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class PurchaseInfo extends PurchaseInfoKey {
    /**
     * Database Column Remarks:
     *   商品名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_info.goodsname
     *
     * @mbg.generated
     */
    private String goodsname;

    /**
     * Database Column Remarks:
     *   商品进货数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_info.goodscount
     *
     * @mbg.generated
     */
    private String goodscount;

    /**
     * Database Column Remarks:
     *   进价
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_info.purchasePrice
     *
     * @mbg.generated
     */
    private BigDecimal purchaseprice;

    /**
     * Database Column Remarks:
     *   进货点
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_info.purchaseOrigin
     *
     * @mbg.generated
     */
    private String purchaseorigin;

    /**
     * Database Column Remarks:
     *   进货点联系方式
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_info.purchasecontact
     *
     * @mbg.generated
     */
    private String purchasecontact;

    /**
     * Database Column Remarks:
     *   备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_info.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * Database Column Remarks:
     *   更新人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_info.updateuser
     *
     * @mbg.generated
     */
    private String updateuser;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_info.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_info.goodsname
     *
     * @return the value of purchase_info.goodsname
     *
     * @mbg.generated
     */
    public String getGoodsname() {
        return goodsname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_info.goodsname
     *
     * @param goodsname the value for purchase_info.goodsname
     *
     * @mbg.generated
     */
    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_info.goodscount
     *
     * @return the value of purchase_info.goodscount
     *
     * @mbg.generated
     */
    public String getGoodscount() {
        return goodscount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_info.goodscount
     *
     * @param goodscount the value for purchase_info.goodscount
     *
     * @mbg.generated
     */
    public void setGoodscount(String goodscount) {
        this.goodscount = goodscount == null ? null : goodscount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_info.purchasePrice
     *
     * @return the value of purchase_info.purchasePrice
     *
     * @mbg.generated
     */
    public BigDecimal getPurchaseprice() {
        return purchaseprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_info.purchasePrice
     *
     * @param purchaseprice the value for purchase_info.purchasePrice
     *
     * @mbg.generated
     */
    public void setPurchaseprice(BigDecimal purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_info.purchaseOrigin
     *
     * @return the value of purchase_info.purchaseOrigin
     *
     * @mbg.generated
     */
    public String getPurchaseorigin() {
        return purchaseorigin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_info.purchaseOrigin
     *
     * @param purchaseorigin the value for purchase_info.purchaseOrigin
     *
     * @mbg.generated
     */
    public void setPurchaseorigin(String purchaseorigin) {
        this.purchaseorigin = purchaseorigin == null ? null : purchaseorigin.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_info.purchasecontact
     *
     * @return the value of purchase_info.purchasecontact
     *
     * @mbg.generated
     */
    public String getPurchasecontact() {
        return purchasecontact;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_info.purchasecontact
     *
     * @param purchasecontact the value for purchase_info.purchasecontact
     *
     * @mbg.generated
     */
    public void setPurchasecontact(String purchasecontact) {
        this.purchasecontact = purchasecontact == null ? null : purchasecontact.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_info.remark
     *
     * @return the value of purchase_info.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_info.remark
     *
     * @param remark the value for purchase_info.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_info.updateuser
     *
     * @return the value of purchase_info.updateuser
     *
     * @mbg.generated
     */
    public String getUpdateuser() {
        return updateuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_info.updateuser
     *
     * @param updateuser the value for purchase_info.updateuser
     *
     * @mbg.generated
     */
    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser == null ? null : updateuser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_info.update_time
     *
     * @return the value of purchase_info.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_info.update_time
     *
     * @param updateTime the value for purchase_info.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}