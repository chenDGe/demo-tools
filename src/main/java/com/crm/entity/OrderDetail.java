package com.crm.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table order_detail
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class OrderDetail {
    /**
     * Database Column Remarks:
     *   流水号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.serialno
     *
     * @mbg.generated
     */
    private String serialno;

    /**
     * Database Column Remarks:
     *   订单号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.orderno
     *
     * @mbg.generated
     */
    private String orderno;

    /**
     * Database Column Remarks:
     *   商品id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.goodsID
     *
     * @mbg.generated
     */
    private String goodsid;

    /**
     * Database Column Remarks:
     *   商品批次号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.batchno
     *
     * @mbg.generated
     */
    private String batchno;

    /**
     * Database Column Remarks:
     *   商品名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.goodsname
     *
     * @mbg.generated
     */
    private String goodsname;

    /**
     * Database Column Remarks:
     *   商品类别
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.goodsype
     *
     * @mbg.generated
     */
    private String goodsype;

    /**
     * Database Column Remarks:
     *   进价
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.purchasePrice
     *
     * @mbg.generated
     */
    private BigDecimal purchaseprice;

    /**
     * Database Column Remarks:
     *   售价
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.price
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     * Database Column Remarks:
     *   维修日期
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.repairdate
     *
     * @mbg.generated
     */
    private String repairdate;

    /**
     * Database Column Remarks:
     *   保修期（月）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.termmonth
     *
     * @mbg.generated
     */
    private String termmonth;

    /**
     * Database Column Remarks:
     *   过保日期
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.overduedate
     *
     * @mbg.generated
     */
    private String overduedate;

    /**
     * Database Column Remarks:
     *   预计下次维修日期
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.nextrepairdate
     *
     * @mbg.generated
     */
    private String nextrepairdate;

    /**
     * Database Column Remarks:
     *   开单人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.openuser
     *
     * @mbg.generated
     */
    private String openuser;

    /**
     * Database Column Remarks:
     *   开单时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.serialno
     *
     * @return the value of order_detail.serialno
     *
     * @mbg.generated
     */
    public String getSerialno() {
        return serialno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.serialno
     *
     * @param serialno the value for order_detail.serialno
     *
     * @mbg.generated
     */
    public void setSerialno(String serialno) {
        this.serialno = serialno == null ? null : serialno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.orderno
     *
     * @return the value of order_detail.orderno
     *
     * @mbg.generated
     */
    public String getOrderno() {
        return orderno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.orderno
     *
     * @param orderno the value for order_detail.orderno
     *
     * @mbg.generated
     */
    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.goodsID
     *
     * @return the value of order_detail.goodsID
     *
     * @mbg.generated
     */
    public String getGoodsid() {
        return goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.goodsID
     *
     * @param goodsid the value for order_detail.goodsID
     *
     * @mbg.generated
     */
    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid == null ? null : goodsid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.batchno
     *
     * @return the value of order_detail.batchno
     *
     * @mbg.generated
     */
    public String getBatchno() {
        return batchno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.batchno
     *
     * @param batchno the value for order_detail.batchno
     *
     * @mbg.generated
     */
    public void setBatchno(String batchno) {
        this.batchno = batchno == null ? null : batchno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.goodsname
     *
     * @return the value of order_detail.goodsname
     *
     * @mbg.generated
     */
    public String getGoodsname() {
        return goodsname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.goodsname
     *
     * @param goodsname the value for order_detail.goodsname
     *
     * @mbg.generated
     */
    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.goodsype
     *
     * @return the value of order_detail.goodsype
     *
     * @mbg.generated
     */
    public String getGoodsype() {
        return goodsype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.goodsype
     *
     * @param goodsype the value for order_detail.goodsype
     *
     * @mbg.generated
     */
    public void setGoodsype(String goodsype) {
        this.goodsype = goodsype == null ? null : goodsype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.purchasePrice
     *
     * @return the value of order_detail.purchasePrice
     *
     * @mbg.generated
     */
    public BigDecimal getPurchaseprice() {
        return purchaseprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.purchasePrice
     *
     * @param purchaseprice the value for order_detail.purchasePrice
     *
     * @mbg.generated
     */
    public void setPurchaseprice(BigDecimal purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.price
     *
     * @return the value of order_detail.price
     *
     * @mbg.generated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.price
     *
     * @param price the value for order_detail.price
     *
     * @mbg.generated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.repairdate
     *
     * @return the value of order_detail.repairdate
     *
     * @mbg.generated
     */
    public String getRepairdate() {
        return repairdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.repairdate
     *
     * @param repairdate the value for order_detail.repairdate
     *
     * @mbg.generated
     */
    public void setRepairdate(String repairdate) {
        this.repairdate = repairdate == null ? null : repairdate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.termmonth
     *
     * @return the value of order_detail.termmonth
     *
     * @mbg.generated
     */
    public String getTermmonth() {
        return termmonth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.termmonth
     *
     * @param termmonth the value for order_detail.termmonth
     *
     * @mbg.generated
     */
    public void setTermmonth(String termmonth) {
        this.termmonth = termmonth == null ? null : termmonth.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.overduedate
     *
     * @return the value of order_detail.overduedate
     *
     * @mbg.generated
     */
    public String getOverduedate() {
        return overduedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.overduedate
     *
     * @param overduedate the value for order_detail.overduedate
     *
     * @mbg.generated
     */
    public void setOverduedate(String overduedate) {
        this.overduedate = overduedate == null ? null : overduedate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.nextrepairdate
     *
     * @return the value of order_detail.nextrepairdate
     *
     * @mbg.generated
     */
    public String getNextrepairdate() {
        return nextrepairdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.nextrepairdate
     *
     * @param nextrepairdate the value for order_detail.nextrepairdate
     *
     * @mbg.generated
     */
    public void setNextrepairdate(String nextrepairdate) {
        this.nextrepairdate = nextrepairdate == null ? null : nextrepairdate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.openuser
     *
     * @return the value of order_detail.openuser
     *
     * @mbg.generated
     */
    public String getOpenuser() {
        return openuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.openuser
     *
     * @param openuser the value for order_detail.openuser
     *
     * @mbg.generated
     */
    public void setOpenuser(String openuser) {
        this.openuser = openuser == null ? null : openuser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.update_time
     *
     * @return the value of order_detail.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.update_time
     *
     * @param updateTime the value for order_detail.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}