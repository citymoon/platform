package com.dhb.platform.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OaConfigTabExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OaConfigTabExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andRowIdIsNull() {
            addCriterion("ROW_ID is null");
            return (Criteria) this;
        }

        public Criteria andRowIdIsNotNull() {
            addCriterion("ROW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRowIdEqualTo(Long value) {
            addCriterion("ROW_ID =", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdNotEqualTo(Long value) {
            addCriterion("ROW_ID <>", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdGreaterThan(Long value) {
            addCriterion("ROW_ID >", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ROW_ID >=", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdLessThan(Long value) {
            addCriterion("ROW_ID <", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdLessThanOrEqualTo(Long value) {
            addCriterion("ROW_ID <=", value, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdIn(List<Long> values) {
            addCriterion("ROW_ID in", values, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdNotIn(List<Long> values) {
            addCriterion("ROW_ID not in", values, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdBetween(Long value1, Long value2) {
            addCriterion("ROW_ID between", value1, value2, "rowId");
            return (Criteria) this;
        }

        public Criteria andRowIdNotBetween(Long value1, Long value2) {
            addCriterion("ROW_ID not between", value1, value2, "rowId");
            return (Criteria) this;
        }

        public Criteria andSysWebPathIsNull() {
            addCriterion("SYS_WEB_PATH is null");
            return (Criteria) this;
        }

        public Criteria andSysWebPathIsNotNull() {
            addCriterion("SYS_WEB_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andSysWebPathEqualTo(String value) {
            addCriterion("SYS_WEB_PATH =", value, "sysWebPath");
            return (Criteria) this;
        }

        public Criteria andSysWebPathNotEqualTo(String value) {
            addCriterion("SYS_WEB_PATH <>", value, "sysWebPath");
            return (Criteria) this;
        }

        public Criteria andSysWebPathGreaterThan(String value) {
            addCriterion("SYS_WEB_PATH >", value, "sysWebPath");
            return (Criteria) this;
        }

        public Criteria andSysWebPathGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_WEB_PATH >=", value, "sysWebPath");
            return (Criteria) this;
        }

        public Criteria andSysWebPathLessThan(String value) {
            addCriterion("SYS_WEB_PATH <", value, "sysWebPath");
            return (Criteria) this;
        }

        public Criteria andSysWebPathLessThanOrEqualTo(String value) {
            addCriterion("SYS_WEB_PATH <=", value, "sysWebPath");
            return (Criteria) this;
        }

        public Criteria andSysWebPathLike(String value) {
            addCriterion("SYS_WEB_PATH like", value, "sysWebPath");
            return (Criteria) this;
        }

        public Criteria andSysWebPathNotLike(String value) {
            addCriterion("SYS_WEB_PATH not like", value, "sysWebPath");
            return (Criteria) this;
        }

        public Criteria andSysWebPathIn(List<String> values) {
            addCriterion("SYS_WEB_PATH in", values, "sysWebPath");
            return (Criteria) this;
        }

        public Criteria andSysWebPathNotIn(List<String> values) {
            addCriterion("SYS_WEB_PATH not in", values, "sysWebPath");
            return (Criteria) this;
        }

        public Criteria andSysWebPathBetween(String value1, String value2) {
            addCriterion("SYS_WEB_PATH between", value1, value2, "sysWebPath");
            return (Criteria) this;
        }

        public Criteria andSysWebPathNotBetween(String value1, String value2) {
            addCriterion("SYS_WEB_PATH not between", value1, value2, "sysWebPath");
            return (Criteria) this;
        }

        public Criteria andSysUploadPathIsNull() {
            addCriterion("SYS_UPLOAD_PATH is null");
            return (Criteria) this;
        }

        public Criteria andSysUploadPathIsNotNull() {
            addCriterion("SYS_UPLOAD_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andSysUploadPathEqualTo(String value) {
            addCriterion("SYS_UPLOAD_PATH =", value, "sysUploadPath");
            return (Criteria) this;
        }

        public Criteria andSysUploadPathNotEqualTo(String value) {
            addCriterion("SYS_UPLOAD_PATH <>", value, "sysUploadPath");
            return (Criteria) this;
        }

        public Criteria andSysUploadPathGreaterThan(String value) {
            addCriterion("SYS_UPLOAD_PATH >", value, "sysUploadPath");
            return (Criteria) this;
        }

        public Criteria andSysUploadPathGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_UPLOAD_PATH >=", value, "sysUploadPath");
            return (Criteria) this;
        }

        public Criteria andSysUploadPathLessThan(String value) {
            addCriterion("SYS_UPLOAD_PATH <", value, "sysUploadPath");
            return (Criteria) this;
        }

        public Criteria andSysUploadPathLessThanOrEqualTo(String value) {
            addCriterion("SYS_UPLOAD_PATH <=", value, "sysUploadPath");
            return (Criteria) this;
        }

        public Criteria andSysUploadPathLike(String value) {
            addCriterion("SYS_UPLOAD_PATH like", value, "sysUploadPath");
            return (Criteria) this;
        }

        public Criteria andSysUploadPathNotLike(String value) {
            addCriterion("SYS_UPLOAD_PATH not like", value, "sysUploadPath");
            return (Criteria) this;
        }

        public Criteria andSysUploadPathIn(List<String> values) {
            addCriterion("SYS_UPLOAD_PATH in", values, "sysUploadPath");
            return (Criteria) this;
        }

        public Criteria andSysUploadPathNotIn(List<String> values) {
            addCriterion("SYS_UPLOAD_PATH not in", values, "sysUploadPath");
            return (Criteria) this;
        }

        public Criteria andSysUploadPathBetween(String value1, String value2) {
            addCriterion("SYS_UPLOAD_PATH between", value1, value2, "sysUploadPath");
            return (Criteria) this;
        }

        public Criteria andSysUploadPathNotBetween(String value1, String value2) {
            addCriterion("SYS_UPLOAD_PATH not between", value1, value2, "sysUploadPath");
            return (Criteria) this;
        }

        public Criteria andMailServerIpIsNull() {
            addCriterion("MAIL_SERVER_IP is null");
            return (Criteria) this;
        }

        public Criteria andMailServerIpIsNotNull() {
            addCriterion("MAIL_SERVER_IP is not null");
            return (Criteria) this;
        }

        public Criteria andMailServerIpEqualTo(String value) {
            addCriterion("MAIL_SERVER_IP =", value, "mailServerIp");
            return (Criteria) this;
        }

        public Criteria andMailServerIpNotEqualTo(String value) {
            addCriterion("MAIL_SERVER_IP <>", value, "mailServerIp");
            return (Criteria) this;
        }

        public Criteria andMailServerIpGreaterThan(String value) {
            addCriterion("MAIL_SERVER_IP >", value, "mailServerIp");
            return (Criteria) this;
        }

        public Criteria andMailServerIpGreaterThanOrEqualTo(String value) {
            addCriterion("MAIL_SERVER_IP >=", value, "mailServerIp");
            return (Criteria) this;
        }

        public Criteria andMailServerIpLessThan(String value) {
            addCriterion("MAIL_SERVER_IP <", value, "mailServerIp");
            return (Criteria) this;
        }

        public Criteria andMailServerIpLessThanOrEqualTo(String value) {
            addCriterion("MAIL_SERVER_IP <=", value, "mailServerIp");
            return (Criteria) this;
        }

        public Criteria andMailServerIpLike(String value) {
            addCriterion("MAIL_SERVER_IP like", value, "mailServerIp");
            return (Criteria) this;
        }

        public Criteria andMailServerIpNotLike(String value) {
            addCriterion("MAIL_SERVER_IP not like", value, "mailServerIp");
            return (Criteria) this;
        }

        public Criteria andMailServerIpIn(List<String> values) {
            addCriterion("MAIL_SERVER_IP in", values, "mailServerIp");
            return (Criteria) this;
        }

        public Criteria andMailServerIpNotIn(List<String> values) {
            addCriterion("MAIL_SERVER_IP not in", values, "mailServerIp");
            return (Criteria) this;
        }

        public Criteria andMailServerIpBetween(String value1, String value2) {
            addCriterion("MAIL_SERVER_IP between", value1, value2, "mailServerIp");
            return (Criteria) this;
        }

        public Criteria andMailServerIpNotBetween(String value1, String value2) {
            addCriterion("MAIL_SERVER_IP not between", value1, value2, "mailServerIp");
            return (Criteria) this;
        }

        public Criteria andMailServerPortIsNull() {
            addCriterion("MAIL_SERVER_PORT is null");
            return (Criteria) this;
        }

        public Criteria andMailServerPortIsNotNull() {
            addCriterion("MAIL_SERVER_PORT is not null");
            return (Criteria) this;
        }

        public Criteria andMailServerPortEqualTo(BigDecimal value) {
            addCriterion("MAIL_SERVER_PORT =", value, "mailServerPort");
            return (Criteria) this;
        }

        public Criteria andMailServerPortNotEqualTo(BigDecimal value) {
            addCriterion("MAIL_SERVER_PORT <>", value, "mailServerPort");
            return (Criteria) this;
        }

        public Criteria andMailServerPortGreaterThan(BigDecimal value) {
            addCriterion("MAIL_SERVER_PORT >", value, "mailServerPort");
            return (Criteria) this;
        }

        public Criteria andMailServerPortGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAIL_SERVER_PORT >=", value, "mailServerPort");
            return (Criteria) this;
        }

        public Criteria andMailServerPortLessThan(BigDecimal value) {
            addCriterion("MAIL_SERVER_PORT <", value, "mailServerPort");
            return (Criteria) this;
        }

        public Criteria andMailServerPortLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAIL_SERVER_PORT <=", value, "mailServerPort");
            return (Criteria) this;
        }

        public Criteria andMailServerPortIn(List<BigDecimal> values) {
            addCriterion("MAIL_SERVER_PORT in", values, "mailServerPort");
            return (Criteria) this;
        }

        public Criteria andMailServerPortNotIn(List<BigDecimal> values) {
            addCriterion("MAIL_SERVER_PORT not in", values, "mailServerPort");
            return (Criteria) this;
        }

        public Criteria andMailServerPortBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAIL_SERVER_PORT between", value1, value2, "mailServerPort");
            return (Criteria) this;
        }

        public Criteria andMailServerPortNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAIL_SERVER_PORT not between", value1, value2, "mailServerPort");
            return (Criteria) this;
        }

        public Criteria andWebMasterMailIsNull() {
            addCriterion("WEB_MASTER_MAIL is null");
            return (Criteria) this;
        }

        public Criteria andWebMasterMailIsNotNull() {
            addCriterion("WEB_MASTER_MAIL is not null");
            return (Criteria) this;
        }

        public Criteria andWebMasterMailEqualTo(String value) {
            addCriterion("WEB_MASTER_MAIL =", value, "webMasterMail");
            return (Criteria) this;
        }

        public Criteria andWebMasterMailNotEqualTo(String value) {
            addCriterion("WEB_MASTER_MAIL <>", value, "webMasterMail");
            return (Criteria) this;
        }

        public Criteria andWebMasterMailGreaterThan(String value) {
            addCriterion("WEB_MASTER_MAIL >", value, "webMasterMail");
            return (Criteria) this;
        }

        public Criteria andWebMasterMailGreaterThanOrEqualTo(String value) {
            addCriterion("WEB_MASTER_MAIL >=", value, "webMasterMail");
            return (Criteria) this;
        }

        public Criteria andWebMasterMailLessThan(String value) {
            addCriterion("WEB_MASTER_MAIL <", value, "webMasterMail");
            return (Criteria) this;
        }

        public Criteria andWebMasterMailLessThanOrEqualTo(String value) {
            addCriterion("WEB_MASTER_MAIL <=", value, "webMasterMail");
            return (Criteria) this;
        }

        public Criteria andWebMasterMailLike(String value) {
            addCriterion("WEB_MASTER_MAIL like", value, "webMasterMail");
            return (Criteria) this;
        }

        public Criteria andWebMasterMailNotLike(String value) {
            addCriterion("WEB_MASTER_MAIL not like", value, "webMasterMail");
            return (Criteria) this;
        }

        public Criteria andWebMasterMailIn(List<String> values) {
            addCriterion("WEB_MASTER_MAIL in", values, "webMasterMail");
            return (Criteria) this;
        }

        public Criteria andWebMasterMailNotIn(List<String> values) {
            addCriterion("WEB_MASTER_MAIL not in", values, "webMasterMail");
            return (Criteria) this;
        }

        public Criteria andWebMasterMailBetween(String value1, String value2) {
            addCriterion("WEB_MASTER_MAIL between", value1, value2, "webMasterMail");
            return (Criteria) this;
        }

        public Criteria andWebMasterMailNotBetween(String value1, String value2) {
            addCriterion("WEB_MASTER_MAIL not between", value1, value2, "webMasterMail");
            return (Criteria) this;
        }

        public Criteria andSysUrlIsNull() {
            addCriterion("SYS_URL is null");
            return (Criteria) this;
        }

        public Criteria andSysUrlIsNotNull() {
            addCriterion("SYS_URL is not null");
            return (Criteria) this;
        }

        public Criteria andSysUrlEqualTo(String value) {
            addCriterion("SYS_URL =", value, "sysUrl");
            return (Criteria) this;
        }

        public Criteria andSysUrlNotEqualTo(String value) {
            addCriterion("SYS_URL <>", value, "sysUrl");
            return (Criteria) this;
        }

        public Criteria andSysUrlGreaterThan(String value) {
            addCriterion("SYS_URL >", value, "sysUrl");
            return (Criteria) this;
        }

        public Criteria andSysUrlGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_URL >=", value, "sysUrl");
            return (Criteria) this;
        }

        public Criteria andSysUrlLessThan(String value) {
            addCriterion("SYS_URL <", value, "sysUrl");
            return (Criteria) this;
        }

        public Criteria andSysUrlLessThanOrEqualTo(String value) {
            addCriterion("SYS_URL <=", value, "sysUrl");
            return (Criteria) this;
        }

        public Criteria andSysUrlLike(String value) {
            addCriterion("SYS_URL like", value, "sysUrl");
            return (Criteria) this;
        }

        public Criteria andSysUrlNotLike(String value) {
            addCriterion("SYS_URL not like", value, "sysUrl");
            return (Criteria) this;
        }

        public Criteria andSysUrlIn(List<String> values) {
            addCriterion("SYS_URL in", values, "sysUrl");
            return (Criteria) this;
        }

        public Criteria andSysUrlNotIn(List<String> values) {
            addCriterion("SYS_URL not in", values, "sysUrl");
            return (Criteria) this;
        }

        public Criteria andSysUrlBetween(String value1, String value2) {
            addCriterion("SYS_URL between", value1, value2, "sysUrl");
            return (Criteria) this;
        }

        public Criteria andSysUrlNotBetween(String value1, String value2) {
            addCriterion("SYS_URL not between", value1, value2, "sysUrl");
            return (Criteria) this;
        }

        public Criteria andUploadFileLengthIsNull() {
            addCriterion("UPLOAD_FILE_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andUploadFileLengthIsNotNull() {
            addCriterion("UPLOAD_FILE_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andUploadFileLengthEqualTo(BigDecimal value) {
            addCriterion("UPLOAD_FILE_LENGTH =", value, "uploadFileLength");
            return (Criteria) this;
        }

        public Criteria andUploadFileLengthNotEqualTo(BigDecimal value) {
            addCriterion("UPLOAD_FILE_LENGTH <>", value, "uploadFileLength");
            return (Criteria) this;
        }

        public Criteria andUploadFileLengthGreaterThan(BigDecimal value) {
            addCriterion("UPLOAD_FILE_LENGTH >", value, "uploadFileLength");
            return (Criteria) this;
        }

        public Criteria andUploadFileLengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UPLOAD_FILE_LENGTH >=", value, "uploadFileLength");
            return (Criteria) this;
        }

        public Criteria andUploadFileLengthLessThan(BigDecimal value) {
            addCriterion("UPLOAD_FILE_LENGTH <", value, "uploadFileLength");
            return (Criteria) this;
        }

        public Criteria andUploadFileLengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UPLOAD_FILE_LENGTH <=", value, "uploadFileLength");
            return (Criteria) this;
        }

        public Criteria andUploadFileLengthIn(List<BigDecimal> values) {
            addCriterion("UPLOAD_FILE_LENGTH in", values, "uploadFileLength");
            return (Criteria) this;
        }

        public Criteria andUploadFileLengthNotIn(List<BigDecimal> values) {
            addCriterion("UPLOAD_FILE_LENGTH not in", values, "uploadFileLength");
            return (Criteria) this;
        }

        public Criteria andUploadFileLengthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPLOAD_FILE_LENGTH between", value1, value2, "uploadFileLength");
            return (Criteria) this;
        }

        public Criteria andUploadFileLengthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPLOAD_FILE_LENGTH not between", value1, value2, "uploadFileLength");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("CREATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("CREATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("CREATE_BY =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("CREATE_BY <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("CREATE_BY >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_BY >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("CREATE_BY <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("CREATE_BY <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("CREATE_BY like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("CREATE_BY not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("CREATE_BY in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("CREATE_BY not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("CREATE_BY between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("CREATE_BY not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNull() {
            addCriterion("LAST_UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNotNull() {
            addCriterion("LAST_UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE =", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterion("LAST_UPDATE_DATE >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterion("LAST_UPDATE_DATE <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIn(List<Date> values) {
            addCriterion("LAST_UPDATE_DATE in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotIn(List<Date> values) {
            addCriterion("LAST_UPDATE_DATE not in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_DATE between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_DATE not between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIsNull() {
            addCriterion("LAST_UPDATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIsNotNull() {
            addCriterion("LAST_UPDATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY =", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY <>", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThan(String value) {
            addCriterion("LAST_UPDATE_BY >", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY >=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThan(String value) {
            addCriterion("LAST_UPDATE_BY <", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY <=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLike(String value) {
            addCriterion("LAST_UPDATE_BY like", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotLike(String value) {
            addCriterion("LAST_UPDATE_BY not like", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIn(List<String> values) {
            addCriterion("LAST_UPDATE_BY in", values, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotIn(List<String> values) {
            addCriterion("LAST_UPDATE_BY not in", values, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByBetween(String value1, String value2) {
            addCriterion("LAST_UPDATE_BY between", value1, value2, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotBetween(String value1, String value2) {
            addCriterion("LAST_UPDATE_BY not between", value1, value2, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateCountIsNull() {
            addCriterion("UPDATE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andUpdateCountIsNotNull() {
            addCriterion("UPDATE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateCountEqualTo(Short value) {
            addCriterion("UPDATE_COUNT =", value, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountNotEqualTo(Short value) {
            addCriterion("UPDATE_COUNT <>", value, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountGreaterThan(Short value) {
            addCriterion("UPDATE_COUNT >", value, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountGreaterThanOrEqualTo(Short value) {
            addCriterion("UPDATE_COUNT >=", value, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountLessThan(Short value) {
            addCriterion("UPDATE_COUNT <", value, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountLessThanOrEqualTo(Short value) {
            addCriterion("UPDATE_COUNT <=", value, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountIn(List<Short> values) {
            addCriterion("UPDATE_COUNT in", values, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountNotIn(List<Short> values) {
            addCriterion("UPDATE_COUNT not in", values, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountBetween(Short value1, Short value2) {
            addCriterion("UPDATE_COUNT between", value1, value2, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountNotBetween(Short value1, Short value2) {
            addCriterion("UPDATE_COUNT not between", value1, value2, "updateCount");
            return (Criteria) this;
        }

        public Criteria andAttribute01IsNull() {
            addCriterion("ATTRIBUTE01 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute01IsNotNull() {
            addCriterion("ATTRIBUTE01 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute01EqualTo(String value) {
            addCriterion("ATTRIBUTE01 =", value, "attribute01");
            return (Criteria) this;
        }

        public Criteria andAttribute01NotEqualTo(String value) {
            addCriterion("ATTRIBUTE01 <>", value, "attribute01");
            return (Criteria) this;
        }

        public Criteria andAttribute01GreaterThan(String value) {
            addCriterion("ATTRIBUTE01 >", value, "attribute01");
            return (Criteria) this;
        }

        public Criteria andAttribute01GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE01 >=", value, "attribute01");
            return (Criteria) this;
        }

        public Criteria andAttribute01LessThan(String value) {
            addCriterion("ATTRIBUTE01 <", value, "attribute01");
            return (Criteria) this;
        }

        public Criteria andAttribute01LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE01 <=", value, "attribute01");
            return (Criteria) this;
        }

        public Criteria andAttribute01Like(String value) {
            addCriterion("ATTRIBUTE01 like", value, "attribute01");
            return (Criteria) this;
        }

        public Criteria andAttribute01NotLike(String value) {
            addCriterion("ATTRIBUTE01 not like", value, "attribute01");
            return (Criteria) this;
        }

        public Criteria andAttribute01In(List<String> values) {
            addCriterion("ATTRIBUTE01 in", values, "attribute01");
            return (Criteria) this;
        }

        public Criteria andAttribute01NotIn(List<String> values) {
            addCriterion("ATTRIBUTE01 not in", values, "attribute01");
            return (Criteria) this;
        }

        public Criteria andAttribute01Between(String value1, String value2) {
            addCriterion("ATTRIBUTE01 between", value1, value2, "attribute01");
            return (Criteria) this;
        }

        public Criteria andAttribute01NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE01 not between", value1, value2, "attribute01");
            return (Criteria) this;
        }

        public Criteria andAttribute02IsNull() {
            addCriterion("ATTRIBUTE02 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute02IsNotNull() {
            addCriterion("ATTRIBUTE02 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute02EqualTo(String value) {
            addCriterion("ATTRIBUTE02 =", value, "attribute02");
            return (Criteria) this;
        }

        public Criteria andAttribute02NotEqualTo(String value) {
            addCriterion("ATTRIBUTE02 <>", value, "attribute02");
            return (Criteria) this;
        }

        public Criteria andAttribute02GreaterThan(String value) {
            addCriterion("ATTRIBUTE02 >", value, "attribute02");
            return (Criteria) this;
        }

        public Criteria andAttribute02GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE02 >=", value, "attribute02");
            return (Criteria) this;
        }

        public Criteria andAttribute02LessThan(String value) {
            addCriterion("ATTRIBUTE02 <", value, "attribute02");
            return (Criteria) this;
        }

        public Criteria andAttribute02LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE02 <=", value, "attribute02");
            return (Criteria) this;
        }

        public Criteria andAttribute02Like(String value) {
            addCriterion("ATTRIBUTE02 like", value, "attribute02");
            return (Criteria) this;
        }

        public Criteria andAttribute02NotLike(String value) {
            addCriterion("ATTRIBUTE02 not like", value, "attribute02");
            return (Criteria) this;
        }

        public Criteria andAttribute02In(List<String> values) {
            addCriterion("ATTRIBUTE02 in", values, "attribute02");
            return (Criteria) this;
        }

        public Criteria andAttribute02NotIn(List<String> values) {
            addCriterion("ATTRIBUTE02 not in", values, "attribute02");
            return (Criteria) this;
        }

        public Criteria andAttribute02Between(String value1, String value2) {
            addCriterion("ATTRIBUTE02 between", value1, value2, "attribute02");
            return (Criteria) this;
        }

        public Criteria andAttribute02NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE02 not between", value1, value2, "attribute02");
            return (Criteria) this;
        }

        public Criteria andAttribute03IsNull() {
            addCriterion("ATTRIBUTE03 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute03IsNotNull() {
            addCriterion("ATTRIBUTE03 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute03EqualTo(Long value) {
            addCriterion("ATTRIBUTE03 =", value, "attribute03");
            return (Criteria) this;
        }

        public Criteria andAttribute03NotEqualTo(Long value) {
            addCriterion("ATTRIBUTE03 <>", value, "attribute03");
            return (Criteria) this;
        }

        public Criteria andAttribute03GreaterThan(Long value) {
            addCriterion("ATTRIBUTE03 >", value, "attribute03");
            return (Criteria) this;
        }

        public Criteria andAttribute03GreaterThanOrEqualTo(Long value) {
            addCriterion("ATTRIBUTE03 >=", value, "attribute03");
            return (Criteria) this;
        }

        public Criteria andAttribute03LessThan(Long value) {
            addCriterion("ATTRIBUTE03 <", value, "attribute03");
            return (Criteria) this;
        }

        public Criteria andAttribute03LessThanOrEqualTo(Long value) {
            addCriterion("ATTRIBUTE03 <=", value, "attribute03");
            return (Criteria) this;
        }

        public Criteria andAttribute03In(List<Long> values) {
            addCriterion("ATTRIBUTE03 in", values, "attribute03");
            return (Criteria) this;
        }

        public Criteria andAttribute03NotIn(List<Long> values) {
            addCriterion("ATTRIBUTE03 not in", values, "attribute03");
            return (Criteria) this;
        }

        public Criteria andAttribute03Between(Long value1, Long value2) {
            addCriterion("ATTRIBUTE03 between", value1, value2, "attribute03");
            return (Criteria) this;
        }

        public Criteria andAttribute03NotBetween(Long value1, Long value2) {
            addCriterion("ATTRIBUTE03 not between", value1, value2, "attribute03");
            return (Criteria) this;
        }

        public Criteria andAttribute04IsNull() {
            addCriterion("ATTRIBUTE04 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute04IsNotNull() {
            addCriterion("ATTRIBUTE04 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute04EqualTo(Long value) {
            addCriterion("ATTRIBUTE04 =", value, "attribute04");
            return (Criteria) this;
        }

        public Criteria andAttribute04NotEqualTo(Long value) {
            addCriterion("ATTRIBUTE04 <>", value, "attribute04");
            return (Criteria) this;
        }

        public Criteria andAttribute04GreaterThan(Long value) {
            addCriterion("ATTRIBUTE04 >", value, "attribute04");
            return (Criteria) this;
        }

        public Criteria andAttribute04GreaterThanOrEqualTo(Long value) {
            addCriterion("ATTRIBUTE04 >=", value, "attribute04");
            return (Criteria) this;
        }

        public Criteria andAttribute04LessThan(Long value) {
            addCriterion("ATTRIBUTE04 <", value, "attribute04");
            return (Criteria) this;
        }

        public Criteria andAttribute04LessThanOrEqualTo(Long value) {
            addCriterion("ATTRIBUTE04 <=", value, "attribute04");
            return (Criteria) this;
        }

        public Criteria andAttribute04In(List<Long> values) {
            addCriterion("ATTRIBUTE04 in", values, "attribute04");
            return (Criteria) this;
        }

        public Criteria andAttribute04NotIn(List<Long> values) {
            addCriterion("ATTRIBUTE04 not in", values, "attribute04");
            return (Criteria) this;
        }

        public Criteria andAttribute04Between(Long value1, Long value2) {
            addCriterion("ATTRIBUTE04 between", value1, value2, "attribute04");
            return (Criteria) this;
        }

        public Criteria andAttribute04NotBetween(Long value1, Long value2) {
            addCriterion("ATTRIBUTE04 not between", value1, value2, "attribute04");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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