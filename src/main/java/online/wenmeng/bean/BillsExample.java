package online.wenmeng.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BillsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillsExample() {
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

        public Criteria andBillidIsNull() {
            addCriterion("billid is null");
            return (Criteria) this;
        }

        public Criteria andBillidIsNotNull() {
            addCriterion("billid is not null");
            return (Criteria) this;
        }

        public Criteria andBillidEqualTo(Integer value) {
            addCriterion("billid =", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidNotEqualTo(Integer value) {
            addCriterion("billid <>", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidGreaterThan(Integer value) {
            addCriterion("billid >", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidGreaterThanOrEqualTo(Integer value) {
            addCriterion("billid >=", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidLessThan(Integer value) {
            addCriterion("billid <", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidLessThanOrEqualTo(Integer value) {
            addCriterion("billid <=", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidIn(List<Integer> values) {
            addCriterion("billid in", values, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidNotIn(List<Integer> values) {
            addCriterion("billid not in", values, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidBetween(Integer value1, Integer value2) {
            addCriterion("billid between", value1, value2, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidNotBetween(Integer value1, Integer value2) {
            addCriterion("billid not between", value1, value2, "billid");
            return (Criteria) this;
        }

        public Criteria andAlipayidIsNull() {
            addCriterion("alipayid is null");
            return (Criteria) this;
        }

        public Criteria andAlipayidIsNotNull() {
            addCriterion("alipayid is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayidEqualTo(String value) {
            addCriterion("alipayid =", value, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidNotEqualTo(String value) {
            addCriterion("alipayid <>", value, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidGreaterThan(String value) {
            addCriterion("alipayid >", value, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidGreaterThanOrEqualTo(String value) {
            addCriterion("alipayid >=", value, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidLessThan(String value) {
            addCriterion("alipayid <", value, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidLessThanOrEqualTo(String value) {
            addCriterion("alipayid <=", value, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidLike(String value) {
            addCriterion("alipayid like", value, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidNotLike(String value) {
            addCriterion("alipayid not like", value, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidIn(List<String> values) {
            addCriterion("alipayid in", values, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidNotIn(List<String> values) {
            addCriterion("alipayid not in", values, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidBetween(String value1, String value2) {
            addCriterion("alipayid between", value1, value2, "alipayid");
            return (Criteria) this;
        }

        public Criteria andAlipayidNotBetween(String value1, String value2) {
            addCriterion("alipayid not between", value1, value2, "alipayid");
            return (Criteria) this;
        }

        public Criteria andOutrequestnoIsNull() {
            addCriterion("outRequestNo is null");
            return (Criteria) this;
        }

        public Criteria andOutrequestnoIsNotNull() {
            addCriterion("outRequestNo is not null");
            return (Criteria) this;
        }

        public Criteria andOutrequestnoEqualTo(Integer value) {
            addCriterion("outRequestNo =", value, "outrequestno");
            return (Criteria) this;
        }

        public Criteria andOutrequestnoNotEqualTo(Integer value) {
            addCriterion("outRequestNo <>", value, "outrequestno");
            return (Criteria) this;
        }

        public Criteria andOutrequestnoGreaterThan(Integer value) {
            addCriterion("outRequestNo >", value, "outrequestno");
            return (Criteria) this;
        }

        public Criteria andOutrequestnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("outRequestNo >=", value, "outrequestno");
            return (Criteria) this;
        }

        public Criteria andOutrequestnoLessThan(Integer value) {
            addCriterion("outRequestNo <", value, "outrequestno");
            return (Criteria) this;
        }

        public Criteria andOutrequestnoLessThanOrEqualTo(Integer value) {
            addCriterion("outRequestNo <=", value, "outrequestno");
            return (Criteria) this;
        }

        public Criteria andOutrequestnoIn(List<Integer> values) {
            addCriterion("outRequestNo in", values, "outrequestno");
            return (Criteria) this;
        }

        public Criteria andOutrequestnoNotIn(List<Integer> values) {
            addCriterion("outRequestNo not in", values, "outrequestno");
            return (Criteria) this;
        }

        public Criteria andOutrequestnoBetween(Integer value1, Integer value2) {
            addCriterion("outRequestNo between", value1, value2, "outrequestno");
            return (Criteria) this;
        }

        public Criteria andOutrequestnoNotBetween(Integer value1, Integer value2) {
            addCriterion("outRequestNo not between", value1, value2, "outrequestno");
            return (Criteria) this;
        }

        public Criteria andBilluseridIsNull() {
            addCriterion("billuserid is null");
            return (Criteria) this;
        }

        public Criteria andBilluseridIsNotNull() {
            addCriterion("billuserid is not null");
            return (Criteria) this;
        }

        public Criteria andBilluseridEqualTo(Integer value) {
            addCriterion("billuserid =", value, "billuserid");
            return (Criteria) this;
        }

        public Criteria andBilluseridNotEqualTo(Integer value) {
            addCriterion("billuserid <>", value, "billuserid");
            return (Criteria) this;
        }

        public Criteria andBilluseridGreaterThan(Integer value) {
            addCriterion("billuserid >", value, "billuserid");
            return (Criteria) this;
        }

        public Criteria andBilluseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("billuserid >=", value, "billuserid");
            return (Criteria) this;
        }

        public Criteria andBilluseridLessThan(Integer value) {
            addCriterion("billuserid <", value, "billuserid");
            return (Criteria) this;
        }

        public Criteria andBilluseridLessThanOrEqualTo(Integer value) {
            addCriterion("billuserid <=", value, "billuserid");
            return (Criteria) this;
        }

        public Criteria andBilluseridIn(List<Integer> values) {
            addCriterion("billuserid in", values, "billuserid");
            return (Criteria) this;
        }

        public Criteria andBilluseridNotIn(List<Integer> values) {
            addCriterion("billuserid not in", values, "billuserid");
            return (Criteria) this;
        }

        public Criteria andBilluseridBetween(Integer value1, Integer value2) {
            addCriterion("billuserid between", value1, value2, "billuserid");
            return (Criteria) this;
        }

        public Criteria andBilluseridNotBetween(Integer value1, Integer value2) {
            addCriterion("billuserid not between", value1, value2, "billuserid");
            return (Criteria) this;
        }

        public Criteria andBillaboutidsIsNull() {
            addCriterion("billaboutids is null");
            return (Criteria) this;
        }

        public Criteria andBillaboutidsIsNotNull() {
            addCriterion("billaboutids is not null");
            return (Criteria) this;
        }

        public Criteria andBillaboutidsEqualTo(String value) {
            addCriterion("billaboutids =", value, "billaboutids");
            return (Criteria) this;
        }

        public Criteria andBillaboutidsNotEqualTo(String value) {
            addCriterion("billaboutids <>", value, "billaboutids");
            return (Criteria) this;
        }

        public Criteria andBillaboutidsGreaterThan(String value) {
            addCriterion("billaboutids >", value, "billaboutids");
            return (Criteria) this;
        }

        public Criteria andBillaboutidsGreaterThanOrEqualTo(String value) {
            addCriterion("billaboutids >=", value, "billaboutids");
            return (Criteria) this;
        }

        public Criteria andBillaboutidsLessThan(String value) {
            addCriterion("billaboutids <", value, "billaboutids");
            return (Criteria) this;
        }

        public Criteria andBillaboutidsLessThanOrEqualTo(String value) {
            addCriterion("billaboutids <=", value, "billaboutids");
            return (Criteria) this;
        }

        public Criteria andBillaboutidsLike(String value) {
            addCriterion("billaboutids like", value, "billaboutids");
            return (Criteria) this;
        }

        public Criteria andBillaboutidsNotLike(String value) {
            addCriterion("billaboutids not like", value, "billaboutids");
            return (Criteria) this;
        }

        public Criteria andBillaboutidsIn(List<String> values) {
            addCriterion("billaboutids in", values, "billaboutids");
            return (Criteria) this;
        }

        public Criteria andBillaboutidsNotIn(List<String> values) {
            addCriterion("billaboutids not in", values, "billaboutids");
            return (Criteria) this;
        }

        public Criteria andBillaboutidsBetween(String value1, String value2) {
            addCriterion("billaboutids between", value1, value2, "billaboutids");
            return (Criteria) this;
        }

        public Criteria andBillaboutidsNotBetween(String value1, String value2) {
            addCriterion("billaboutids not between", value1, value2, "billaboutids");
            return (Criteria) this;
        }

        public Criteria andBillstatusIsNull() {
            addCriterion("billstatus is null");
            return (Criteria) this;
        }

        public Criteria andBillstatusIsNotNull() {
            addCriterion("billstatus is not null");
            return (Criteria) this;
        }

        public Criteria andBillstatusEqualTo(Integer value) {
            addCriterion("billstatus =", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusNotEqualTo(Integer value) {
            addCriterion("billstatus <>", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusGreaterThan(Integer value) {
            addCriterion("billstatus >", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("billstatus >=", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusLessThan(Integer value) {
            addCriterion("billstatus <", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusLessThanOrEqualTo(Integer value) {
            addCriterion("billstatus <=", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusIn(List<Integer> values) {
            addCriterion("billstatus in", values, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusNotIn(List<Integer> values) {
            addCriterion("billstatus not in", values, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusBetween(Integer value1, Integer value2) {
            addCriterion("billstatus between", value1, value2, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("billstatus not between", value1, value2, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillpayIsNull() {
            addCriterion("billpay is null");
            return (Criteria) this;
        }

        public Criteria andBillpayIsNotNull() {
            addCriterion("billpay is not null");
            return (Criteria) this;
        }

        public Criteria andBillpayEqualTo(Double value) {
            addCriterion("billpay =", value, "billpay");
            return (Criteria) this;
        }

        public Criteria andBillpayNotEqualTo(Double value) {
            addCriterion("billpay <>", value, "billpay");
            return (Criteria) this;
        }

        public Criteria andBillpayGreaterThan(Double value) {
            addCriterion("billpay >", value, "billpay");
            return (Criteria) this;
        }

        public Criteria andBillpayGreaterThanOrEqualTo(Double value) {
            addCriterion("billpay >=", value, "billpay");
            return (Criteria) this;
        }

        public Criteria andBillpayLessThan(Double value) {
            addCriterion("billpay <", value, "billpay");
            return (Criteria) this;
        }

        public Criteria andBillpayLessThanOrEqualTo(Double value) {
            addCriterion("billpay <=", value, "billpay");
            return (Criteria) this;
        }

        public Criteria andBillpayIn(List<Double> values) {
            addCriterion("billpay in", values, "billpay");
            return (Criteria) this;
        }

        public Criteria andBillpayNotIn(List<Double> values) {
            addCriterion("billpay not in", values, "billpay");
            return (Criteria) this;
        }

        public Criteria andBillpayBetween(Double value1, Double value2) {
            addCriterion("billpay between", value1, value2, "billpay");
            return (Criteria) this;
        }

        public Criteria andBillpayNotBetween(Double value1, Double value2) {
            addCriterion("billpay not between", value1, value2, "billpay");
            return (Criteria) this;
        }

        public Criteria andBillcauseIsNull() {
            addCriterion("billcause is null");
            return (Criteria) this;
        }

        public Criteria andBillcauseIsNotNull() {
            addCriterion("billcause is not null");
            return (Criteria) this;
        }

        public Criteria andBillcauseEqualTo(String value) {
            addCriterion("billcause =", value, "billcause");
            return (Criteria) this;
        }

        public Criteria andBillcauseNotEqualTo(String value) {
            addCriterion("billcause <>", value, "billcause");
            return (Criteria) this;
        }

        public Criteria andBillcauseGreaterThan(String value) {
            addCriterion("billcause >", value, "billcause");
            return (Criteria) this;
        }

        public Criteria andBillcauseGreaterThanOrEqualTo(String value) {
            addCriterion("billcause >=", value, "billcause");
            return (Criteria) this;
        }

        public Criteria andBillcauseLessThan(String value) {
            addCriterion("billcause <", value, "billcause");
            return (Criteria) this;
        }

        public Criteria andBillcauseLessThanOrEqualTo(String value) {
            addCriterion("billcause <=", value, "billcause");
            return (Criteria) this;
        }

        public Criteria andBillcauseLike(String value) {
            addCriterion("billcause like", value, "billcause");
            return (Criteria) this;
        }

        public Criteria andBillcauseNotLike(String value) {
            addCriterion("billcause not like", value, "billcause");
            return (Criteria) this;
        }

        public Criteria andBillcauseIn(List<String> values) {
            addCriterion("billcause in", values, "billcause");
            return (Criteria) this;
        }

        public Criteria andBillcauseNotIn(List<String> values) {
            addCriterion("billcause not in", values, "billcause");
            return (Criteria) this;
        }

        public Criteria andBillcauseBetween(String value1, String value2) {
            addCriterion("billcause between", value1, value2, "billcause");
            return (Criteria) this;
        }

        public Criteria andBillcauseNotBetween(String value1, String value2) {
            addCriterion("billcause not between", value1, value2, "billcause");
            return (Criteria) this;
        }

        public Criteria andBilltimeIsNull() {
            addCriterion("billtime is null");
            return (Criteria) this;
        }

        public Criteria andBilltimeIsNotNull() {
            addCriterion("billtime is not null");
            return (Criteria) this;
        }

        public Criteria andBilltimeEqualTo(Date value) {
            addCriterion("billtime =", value, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeNotEqualTo(Date value) {
            addCriterion("billtime <>", value, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeGreaterThan(Date value) {
            addCriterion("billtime >", value, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("billtime >=", value, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeLessThan(Date value) {
            addCriterion("billtime <", value, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeLessThanOrEqualTo(Date value) {
            addCriterion("billtime <=", value, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeIn(List<Date> values) {
            addCriterion("billtime in", values, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeNotIn(List<Date> values) {
            addCriterion("billtime not in", values, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeBetween(Date value1, Date value2) {
            addCriterion("billtime between", value1, value2, "billtime");
            return (Criteria) this;
        }

        public Criteria andBilltimeNotBetween(Date value1, Date value2) {
            addCriterion("billtime not between", value1, value2, "billtime");
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