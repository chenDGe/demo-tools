package com.crm.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order_info
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order_info
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order_info
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated
     */
    public OrderInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table order_info
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOrdernoIsNull() {
            addCriterion("orderno is null");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNotNull() {
            addCriterion("orderno is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoEqualTo(String value) {
            addCriterion("orderno =", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotEqualTo(String value) {
            addCriterion("orderno <>", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThan(String value) {
            addCriterion("orderno >", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("orderno >=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThan(String value) {
            addCriterion("orderno <", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThanOrEqualTo(String value) {
            addCriterion("orderno <=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLike(String value) {
            addCriterion("orderno like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotLike(String value) {
            addCriterion("orderno not like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoIn(List<String> values) {
            addCriterion("orderno in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotIn(List<String> values) {
            addCriterion("orderno not in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoBetween(String value1, String value2) {
            addCriterion("orderno between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotBetween(String value1, String value2) {
            addCriterion("orderno not between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andCaridIsNull() {
            addCriterion("carid is null");
            return (Criteria) this;
        }

        public Criteria andCaridIsNotNull() {
            addCriterion("carid is not null");
            return (Criteria) this;
        }

        public Criteria andCaridEqualTo(String value) {
            addCriterion("carid =", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotEqualTo(String value) {
            addCriterion("carid <>", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThan(String value) {
            addCriterion("carid >", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThanOrEqualTo(String value) {
            addCriterion("carid >=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThan(String value) {
            addCriterion("carid <", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThanOrEqualTo(String value) {
            addCriterion("carid <=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLike(String value) {
            addCriterion("carid like", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotLike(String value) {
            addCriterion("carid not like", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridIn(List<String> values) {
            addCriterion("carid in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotIn(List<String> values) {
            addCriterion("carid not in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridBetween(String value1, String value2) {
            addCriterion("carid between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotBetween(String value1, String value2) {
            addCriterion("carid not between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andPreferentialamountIsNull() {
            addCriterion("preferentialamount is null");
            return (Criteria) this;
        }

        public Criteria andPreferentialamountIsNotNull() {
            addCriterion("preferentialamount is not null");
            return (Criteria) this;
        }

        public Criteria andPreferentialamountEqualTo(BigDecimal value) {
            addCriterion("preferentialamount =", value, "preferentialamount");
            return (Criteria) this;
        }

        public Criteria andPreferentialamountNotEqualTo(BigDecimal value) {
            addCriterion("preferentialamount <>", value, "preferentialamount");
            return (Criteria) this;
        }

        public Criteria andPreferentialamountGreaterThan(BigDecimal value) {
            addCriterion("preferentialamount >", value, "preferentialamount");
            return (Criteria) this;
        }

        public Criteria andPreferentialamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("preferentialamount >=", value, "preferentialamount");
            return (Criteria) this;
        }

        public Criteria andPreferentialamountLessThan(BigDecimal value) {
            addCriterion("preferentialamount <", value, "preferentialamount");
            return (Criteria) this;
        }

        public Criteria andPreferentialamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("preferentialamount <=", value, "preferentialamount");
            return (Criteria) this;
        }

        public Criteria andPreferentialamountIn(List<BigDecimal> values) {
            addCriterion("preferentialamount in", values, "preferentialamount");
            return (Criteria) this;
        }

        public Criteria andPreferentialamountNotIn(List<BigDecimal> values) {
            addCriterion("preferentialamount not in", values, "preferentialamount");
            return (Criteria) this;
        }

        public Criteria andPreferentialamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("preferentialamount between", value1, value2, "preferentialamount");
            return (Criteria) this;
        }

        public Criteria andPreferentialamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("preferentialamount not between", value1, value2, "preferentialamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountIsNull() {
            addCriterion("orderamount is null");
            return (Criteria) this;
        }

        public Criteria andOrderamountIsNotNull() {
            addCriterion("orderamount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderamountEqualTo(BigDecimal value) {
            addCriterion("orderamount =", value, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountNotEqualTo(BigDecimal value) {
            addCriterion("orderamount <>", value, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountGreaterThan(BigDecimal value) {
            addCriterion("orderamount >", value, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("orderamount >=", value, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountLessThan(BigDecimal value) {
            addCriterion("orderamount <", value, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("orderamount <=", value, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountIn(List<BigDecimal> values) {
            addCriterion("orderamount in", values, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountNotIn(List<BigDecimal> values) {
            addCriterion("orderamount not in", values, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orderamount between", value1, value2, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOrderamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orderamount not between", value1, value2, "orderamount");
            return (Criteria) this;
        }

        public Criteria andOweamountIsNull() {
            addCriterion("oweamount is null");
            return (Criteria) this;
        }

        public Criteria andOweamountIsNotNull() {
            addCriterion("oweamount is not null");
            return (Criteria) this;
        }

        public Criteria andOweamountEqualTo(BigDecimal value) {
            addCriterion("oweamount =", value, "oweamount");
            return (Criteria) this;
        }

        public Criteria andOweamountNotEqualTo(BigDecimal value) {
            addCriterion("oweamount <>", value, "oweamount");
            return (Criteria) this;
        }

        public Criteria andOweamountGreaterThan(BigDecimal value) {
            addCriterion("oweamount >", value, "oweamount");
            return (Criteria) this;
        }

        public Criteria andOweamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("oweamount >=", value, "oweamount");
            return (Criteria) this;
        }

        public Criteria andOweamountLessThan(BigDecimal value) {
            addCriterion("oweamount <", value, "oweamount");
            return (Criteria) this;
        }

        public Criteria andOweamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("oweamount <=", value, "oweamount");
            return (Criteria) this;
        }

        public Criteria andOweamountIn(List<BigDecimal> values) {
            addCriterion("oweamount in", values, "oweamount");
            return (Criteria) this;
        }

        public Criteria andOweamountNotIn(List<BigDecimal> values) {
            addCriterion("oweamount not in", values, "oweamount");
            return (Criteria) this;
        }

        public Criteria andOweamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("oweamount between", value1, value2, "oweamount");
            return (Criteria) this;
        }

        public Criteria andOweamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("oweamount not between", value1, value2, "oweamount");
            return (Criteria) this;
        }

        public Criteria andActualpayamountIsNull() {
            addCriterion("actualpayamount is null");
            return (Criteria) this;
        }

        public Criteria andActualpayamountIsNotNull() {
            addCriterion("actualpayamount is not null");
            return (Criteria) this;
        }

        public Criteria andActualpayamountEqualTo(BigDecimal value) {
            addCriterion("actualpayamount =", value, "actualpayamount");
            return (Criteria) this;
        }

        public Criteria andActualpayamountNotEqualTo(BigDecimal value) {
            addCriterion("actualpayamount <>", value, "actualpayamount");
            return (Criteria) this;
        }

        public Criteria andActualpayamountGreaterThan(BigDecimal value) {
            addCriterion("actualpayamount >", value, "actualpayamount");
            return (Criteria) this;
        }

        public Criteria andActualpayamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("actualpayamount >=", value, "actualpayamount");
            return (Criteria) this;
        }

        public Criteria andActualpayamountLessThan(BigDecimal value) {
            addCriterion("actualpayamount <", value, "actualpayamount");
            return (Criteria) this;
        }

        public Criteria andActualpayamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("actualpayamount <=", value, "actualpayamount");
            return (Criteria) this;
        }

        public Criteria andActualpayamountIn(List<BigDecimal> values) {
            addCriterion("actualpayamount in", values, "actualpayamount");
            return (Criteria) this;
        }

        public Criteria andActualpayamountNotIn(List<BigDecimal> values) {
            addCriterion("actualpayamount not in", values, "actualpayamount");
            return (Criteria) this;
        }

        public Criteria andActualpayamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actualpayamount between", value1, value2, "actualpayamount");
            return (Criteria) this;
        }

        public Criteria andActualpayamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actualpayamount not between", value1, value2, "actualpayamount");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNull() {
            addCriterion("orderstatus is null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNotNull() {
            addCriterion("orderstatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusEqualTo(String value) {
            addCriterion("orderstatus =", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotEqualTo(String value) {
            addCriterion("orderstatus <>", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThan(String value) {
            addCriterion("orderstatus >", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThanOrEqualTo(String value) {
            addCriterion("orderstatus >=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThan(String value) {
            addCriterion("orderstatus <", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThanOrEqualTo(String value) {
            addCriterion("orderstatus <=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLike(String value) {
            addCriterion("orderstatus like", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotLike(String value) {
            addCriterion("orderstatus not like", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIn(List<String> values) {
            addCriterion("orderstatus in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotIn(List<String> values) {
            addCriterion("orderstatus not in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusBetween(String value1, String value2) {
            addCriterion("orderstatus between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotBetween(String value1, String value2) {
            addCriterion("orderstatus not between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOpenuserIsNull() {
            addCriterion("openuser is null");
            return (Criteria) this;
        }

        public Criteria andOpenuserIsNotNull() {
            addCriterion("openuser is not null");
            return (Criteria) this;
        }

        public Criteria andOpenuserEqualTo(String value) {
            addCriterion("openuser =", value, "openuser");
            return (Criteria) this;
        }

        public Criteria andOpenuserNotEqualTo(String value) {
            addCriterion("openuser <>", value, "openuser");
            return (Criteria) this;
        }

        public Criteria andOpenuserGreaterThan(String value) {
            addCriterion("openuser >", value, "openuser");
            return (Criteria) this;
        }

        public Criteria andOpenuserGreaterThanOrEqualTo(String value) {
            addCriterion("openuser >=", value, "openuser");
            return (Criteria) this;
        }

        public Criteria andOpenuserLessThan(String value) {
            addCriterion("openuser <", value, "openuser");
            return (Criteria) this;
        }

        public Criteria andOpenuserLessThanOrEqualTo(String value) {
            addCriterion("openuser <=", value, "openuser");
            return (Criteria) this;
        }

        public Criteria andOpenuserLike(String value) {
            addCriterion("openuser like", value, "openuser");
            return (Criteria) this;
        }

        public Criteria andOpenuserNotLike(String value) {
            addCriterion("openuser not like", value, "openuser");
            return (Criteria) this;
        }

        public Criteria andOpenuserIn(List<String> values) {
            addCriterion("openuser in", values, "openuser");
            return (Criteria) this;
        }

        public Criteria andOpenuserNotIn(List<String> values) {
            addCriterion("openuser not in", values, "openuser");
            return (Criteria) this;
        }

        public Criteria andOpenuserBetween(String value1, String value2) {
            addCriterion("openuser between", value1, value2, "openuser");
            return (Criteria) this;
        }

        public Criteria andOpenuserNotBetween(String value1, String value2) {
            addCriterion("openuser not between", value1, value2, "openuser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table order_info
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table order_info
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}