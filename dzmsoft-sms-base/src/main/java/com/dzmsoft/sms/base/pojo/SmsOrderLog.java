package com.dzmsoft.sms.base.pojo;

import java.util.Date;

public class SmsOrderLog {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_order_log.id
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    private String id;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_order_log.opt
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    private String opt;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_order_log.opt_time
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    private Date optTime;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_order_log.opt_content
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    private String optContent;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_order_log.director
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    private String director;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_order_log.member
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    private String member;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_order_log.order_id
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    private String orderId;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_order_log.id
     * @return  the value of sms_order_log.id
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_order_log.id
     * @param id  the value for sms_order_log.id
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_order_log.opt
     * @return  the value of sms_order_log.opt
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public String getOpt() {
        return opt;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_order_log.opt
     * @param opt  the value for sms_order_log.opt
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public void setOpt(String opt) {
        this.opt = opt == null ? null : opt.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_order_log.opt_time
     * @return  the value of sms_order_log.opt_time
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public Date getOptTime() {
        return optTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_order_log.opt_time
     * @param optTime  the value for sms_order_log.opt_time
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public void setOptTime(Date optTime) {
        this.optTime = optTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_order_log.opt_content
     * @return  the value of sms_order_log.opt_content
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public String getOptContent() {
        return optContent;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_order_log.opt_content
     * @param optContent  the value for sms_order_log.opt_content
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public void setOptContent(String optContent) {
        this.optContent = optContent == null ? null : optContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_order_log.director
     * @return  the value of sms_order_log.director
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public String getDirector() {
        return director;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_order_log.director
     * @param director  the value for sms_order_log.director
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public void setDirector(String director) {
        this.director = director == null ? null : director.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_order_log.member
     * @return  the value of sms_order_log.member
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public String getMember() {
        return member;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_order_log.member
     * @param member  the value for sms_order_log.member
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public void setMember(String member) {
        this.member = member == null ? null : member.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_order_log.order_id
     * @return  the value of sms_order_log.order_id
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_order_log.order_id
     * @param orderId  the value for sms_order_log.order_id
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }
}