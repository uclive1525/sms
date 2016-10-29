package com.dzmsoft.sms.base.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class SmsMemberCardConsume {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_member_card_consume.id
     *
     * @mbggenerated Thu Jun 09 14:52:07 CST 2016
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_member_card_consume.member_card_id
     *
     * @mbggenerated Thu Jun 09 14:52:07 CST 2016
     */
    private String memberCardId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_member_card_consume.order_id
     *
     * @mbggenerated Thu Jun 09 14:52:07 CST 2016
     */
    private String orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_member_card_consume.amount
     *
     * @mbggenerated Thu Jun 09 14:52:07 CST 2016
     */
    private BigDecimal amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_member_card_consume.consume_time
     *
     * @mbggenerated Thu Jun 09 14:52:07 CST 2016
     */
    private Date consumeTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_member_card_consume.id
     *
     * @return the value of sms_member_card_consume.id
     *
     * @mbggenerated Thu Jun 09 14:52:07 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_member_card_consume.id
     *
     * @param id the value for sms_member_card_consume.id
     *
     * @mbggenerated Thu Jun 09 14:52:07 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_member_card_consume.member_card_id
     *
     * @return the value of sms_member_card_consume.member_card_id
     *
     * @mbggenerated Thu Jun 09 14:52:07 CST 2016
     */
    public String getMemberCardId() {
        return memberCardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_member_card_consume.member_card_id
     *
     * @param memberCardId the value for sms_member_card_consume.member_card_id
     *
     * @mbggenerated Thu Jun 09 14:52:07 CST 2016
     */
    public void setMemberCardId(String memberCardId) {
        this.memberCardId = memberCardId == null ? null : memberCardId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_member_card_consume.order_id
     *
     * @return the value of sms_member_card_consume.order_id
     *
     * @mbggenerated Thu Jun 09 14:52:07 CST 2016
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_member_card_consume.order_id
     *
     * @param orderId the value for sms_member_card_consume.order_id
     *
     * @mbggenerated Thu Jun 09 14:52:07 CST 2016
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_member_card_consume.amount
     *
     * @return the value of sms_member_card_consume.amount
     *
     * @mbggenerated Thu Jun 09 14:52:07 CST 2016
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_member_card_consume.amount
     *
     * @param amount the value for sms_member_card_consume.amount
     *
     * @mbggenerated Thu Jun 09 14:52:07 CST 2016
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_member_card_consume.consume_time
     *
     * @return the value of sms_member_card_consume.consume_time
     *
     * @mbggenerated Thu Jun 09 14:52:07 CST 2016
     */
    public Date getConsumeTime() {
        return consumeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_member_card_consume.consume_time
     *
     * @param consumeTime the value for sms_member_card_consume.consume_time
     *
     * @mbggenerated Thu Jun 09 14:52:07 CST 2016
     */
    public void setConsumeTime(Date consumeTime) {
        this.consumeTime = consumeTime;
    }
}