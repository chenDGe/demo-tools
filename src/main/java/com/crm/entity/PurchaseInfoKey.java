package com.crm.entity;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table purchase_info
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class PurchaseInfoKey {
    /**
     * Database Column Remarks:
     *   进货批次号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_info.batchno
     *
     * @mbg.generated
     */
    private String batchno;

    /**
     * Database Column Remarks:
     *   商品id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column purchase_info.goodsID
     *
     * @mbg.generated
     */
    private String goodsid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_info.batchno
     *
     * @return the value of purchase_info.batchno
     *
     * @mbg.generated
     */
    public String getBatchno() {
        return batchno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_info.batchno
     *
     * @param batchno the value for purchase_info.batchno
     *
     * @mbg.generated
     */
    public void setBatchno(String batchno) {
        this.batchno = batchno == null ? null : batchno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column purchase_info.goodsID
     *
     * @return the value of purchase_info.goodsID
     *
     * @mbg.generated
     */
    public String getGoodsid() {
        return goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column purchase_info.goodsID
     *
     * @param goodsid the value for purchase_info.goodsID
     *
     * @mbg.generated
     */
    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid == null ? null : goodsid.trim();
    }
}