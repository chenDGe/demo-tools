package com.crm.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table customer_info
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class CustomerInfo {
    /**
     * Database Column Remarks:
     *   客户id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_info.customerid
     *
     * @mbg.generated
     */
    private String customerid;

    /**
     * Database Column Remarks:
     *   车牌号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_info.carid
     *
     * @mbg.generated
     */
    private String carid;

    /**
     * Database Column Remarks:
     *   用户名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_info.customername
     *
     * @mbg.generated
     */
    private String customername;

    /**
     * Database Column Remarks:
     *   联系方式
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_info.contact
     *
     * @mbg.generated
     */
    private String contact;

    /**
     * Database Column Remarks:
     *   车辆公里数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_info.kilometers
     *
     * @mbg.generated
     */
    private String kilometers;

    /**
     * Database Column Remarks:
     *   使用年份
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_info.useysars
     *
     * @mbg.generated
     */
    private String useysars;

    /**
     * Database Column Remarks:
     *   总消费金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_info.consumption
     *
     * @mbg.generated
     */
    private BigDecimal consumption;

    /**
     * Database Column Remarks:
     *   状态 0正常 1锁定
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_info.STATUS
     *
     * @mbg.generated
     */
    private String status;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_info.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_info.customerid
     *
     * @return the value of customer_info.customerid
     *
     * @mbg.generated
     */
    public String getCustomerid() {
        return customerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_info.customerid
     *
     * @param customerid the value for customer_info.customerid
     *
     * @mbg.generated
     */
    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_info.carid
     *
     * @return the value of customer_info.carid
     *
     * @mbg.generated
     */
    public String getCarid() {
        return carid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_info.carid
     *
     * @param carid the value for customer_info.carid
     *
     * @mbg.generated
     */
    public void setCarid(String carid) {
        this.carid = carid == null ? null : carid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_info.customername
     *
     * @return the value of customer_info.customername
     *
     * @mbg.generated
     */
    public String getCustomername() {
        return customername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_info.customername
     *
     * @param customername the value for customer_info.customername
     *
     * @mbg.generated
     */
    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_info.contact
     *
     * @return the value of customer_info.contact
     *
     * @mbg.generated
     */
    public String getContact() {
        return contact;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_info.contact
     *
     * @param contact the value for customer_info.contact
     *
     * @mbg.generated
     */
    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_info.kilometers
     *
     * @return the value of customer_info.kilometers
     *
     * @mbg.generated
     */
    public String getKilometers() {
        return kilometers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_info.kilometers
     *
     * @param kilometers the value for customer_info.kilometers
     *
     * @mbg.generated
     */
    public void setKilometers(String kilometers) {
        this.kilometers = kilometers == null ? null : kilometers.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_info.useysars
     *
     * @return the value of customer_info.useysars
     *
     * @mbg.generated
     */
    public String getUseysars() {
        return useysars;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_info.useysars
     *
     * @param useysars the value for customer_info.useysars
     *
     * @mbg.generated
     */
    public void setUseysars(String useysars) {
        this.useysars = useysars == null ? null : useysars.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_info.consumption
     *
     * @return the value of customer_info.consumption
     *
     * @mbg.generated
     */
    public BigDecimal getConsumption() {
        return consumption;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_info.consumption
     *
     * @param consumption the value for customer_info.consumption
     *
     * @mbg.generated
     */
    public void setConsumption(BigDecimal consumption) {
        this.consumption = consumption;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_info.STATUS
     *
     * @return the value of customer_info.STATUS
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_info.STATUS
     *
     * @param status the value for customer_info.STATUS
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_info.update_time
     *
     * @return the value of customer_info.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_info.update_time
     *
     * @param updateTime the value for customer_info.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}