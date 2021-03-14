package online.wenmeng.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DrivervieExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrivervieExample() {
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

        public Criteria andVieidIsNull() {
            addCriterion("vieid is null");
            return (Criteria) this;
        }

        public Criteria andVieidIsNotNull() {
            addCriterion("vieid is not null");
            return (Criteria) this;
        }

        public Criteria andVieidEqualTo(Integer value) {
            addCriterion("vieid =", value, "vieid");
            return (Criteria) this;
        }

        public Criteria andVieidNotEqualTo(Integer value) {
            addCriterion("vieid <>", value, "vieid");
            return (Criteria) this;
        }

        public Criteria andVieidGreaterThan(Integer value) {
            addCriterion("vieid >", value, "vieid");
            return (Criteria) this;
        }

        public Criteria andVieidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vieid >=", value, "vieid");
            return (Criteria) this;
        }

        public Criteria andVieidLessThan(Integer value) {
            addCriterion("vieid <", value, "vieid");
            return (Criteria) this;
        }

        public Criteria andVieidLessThanOrEqualTo(Integer value) {
            addCriterion("vieid <=", value, "vieid");
            return (Criteria) this;
        }

        public Criteria andVieidIn(List<Integer> values) {
            addCriterion("vieid in", values, "vieid");
            return (Criteria) this;
        }

        public Criteria andVieidNotIn(List<Integer> values) {
            addCriterion("vieid not in", values, "vieid");
            return (Criteria) this;
        }

        public Criteria andVieidBetween(Integer value1, Integer value2) {
            addCriterion("vieid between", value1, value2, "vieid");
            return (Criteria) this;
        }

        public Criteria andVieidNotBetween(Integer value1, Integer value2) {
            addCriterion("vieid not between", value1, value2, "vieid");
            return (Criteria) this;
        }

        public Criteria andDriveridIsNull() {
            addCriterion("driverid is null");
            return (Criteria) this;
        }

        public Criteria andDriveridIsNotNull() {
            addCriterion("driverid is not null");
            return (Criteria) this;
        }

        public Criteria andDriveridEqualTo(Integer value) {
            addCriterion("driverid =", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridNotEqualTo(Integer value) {
            addCriterion("driverid <>", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridGreaterThan(Integer value) {
            addCriterion("driverid >", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridGreaterThanOrEqualTo(Integer value) {
            addCriterion("driverid >=", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridLessThan(Integer value) {
            addCriterion("driverid <", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridLessThanOrEqualTo(Integer value) {
            addCriterion("driverid <=", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridIn(List<Integer> values) {
            addCriterion("driverid in", values, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridNotIn(List<Integer> values) {
            addCriterion("driverid not in", values, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridBetween(Integer value1, Integer value2) {
            addCriterion("driverid between", value1, value2, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridNotBetween(Integer value1, Integer value2) {
            addCriterion("driverid not between", value1, value2, "driverid");
            return (Criteria) this;
        }

        public Criteria andPoolingcaridIsNull() {
            addCriterion("poolingcarid is null");
            return (Criteria) this;
        }

        public Criteria andPoolingcaridIsNotNull() {
            addCriterion("poolingcarid is not null");
            return (Criteria) this;
        }

        public Criteria andPoolingcaridEqualTo(Integer value) {
            addCriterion("poolingcarid =", value, "poolingcarid");
            return (Criteria) this;
        }

        public Criteria andPoolingcaridNotEqualTo(Integer value) {
            addCriterion("poolingcarid <>", value, "poolingcarid");
            return (Criteria) this;
        }

        public Criteria andPoolingcaridGreaterThan(Integer value) {
            addCriterion("poolingcarid >", value, "poolingcarid");
            return (Criteria) this;
        }

        public Criteria andPoolingcaridGreaterThanOrEqualTo(Integer value) {
            addCriterion("poolingcarid >=", value, "poolingcarid");
            return (Criteria) this;
        }

        public Criteria andPoolingcaridLessThan(Integer value) {
            addCriterion("poolingcarid <", value, "poolingcarid");
            return (Criteria) this;
        }

        public Criteria andPoolingcaridLessThanOrEqualTo(Integer value) {
            addCriterion("poolingcarid <=", value, "poolingcarid");
            return (Criteria) this;
        }

        public Criteria andPoolingcaridIn(List<Integer> values) {
            addCriterion("poolingcarid in", values, "poolingcarid");
            return (Criteria) this;
        }

        public Criteria andPoolingcaridNotIn(List<Integer> values) {
            addCriterion("poolingcarid not in", values, "poolingcarid");
            return (Criteria) this;
        }

        public Criteria andPoolingcaridBetween(Integer value1, Integer value2) {
            addCriterion("poolingcarid between", value1, value2, "poolingcarid");
            return (Criteria) this;
        }

        public Criteria andPoolingcaridNotBetween(Integer value1, Integer value2) {
            addCriterion("poolingcarid not between", value1, value2, "poolingcarid");
            return (Criteria) this;
        }

        public Criteria andTotalpayIsNull() {
            addCriterion("totalpay is null");
            return (Criteria) this;
        }

        public Criteria andTotalpayIsNotNull() {
            addCriterion("totalpay is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpayEqualTo(Double value) {
            addCriterion("totalpay =", value, "totalpay");
            return (Criteria) this;
        }

        public Criteria andTotalpayNotEqualTo(Double value) {
            addCriterion("totalpay <>", value, "totalpay");
            return (Criteria) this;
        }

        public Criteria andTotalpayGreaterThan(Double value) {
            addCriterion("totalpay >", value, "totalpay");
            return (Criteria) this;
        }

        public Criteria andTotalpayGreaterThanOrEqualTo(Double value) {
            addCriterion("totalpay >=", value, "totalpay");
            return (Criteria) this;
        }

        public Criteria andTotalpayLessThan(Double value) {
            addCriterion("totalpay <", value, "totalpay");
            return (Criteria) this;
        }

        public Criteria andTotalpayLessThanOrEqualTo(Double value) {
            addCriterion("totalpay <=", value, "totalpay");
            return (Criteria) this;
        }

        public Criteria andTotalpayIn(List<Double> values) {
            addCriterion("totalpay in", values, "totalpay");
            return (Criteria) this;
        }

        public Criteria andTotalpayNotIn(List<Double> values) {
            addCriterion("totalpay not in", values, "totalpay");
            return (Criteria) this;
        }

        public Criteria andTotalpayBetween(Double value1, Double value2) {
            addCriterion("totalpay between", value1, value2, "totalpay");
            return (Criteria) this;
        }

        public Criteria andTotalpayNotBetween(Double value1, Double value2) {
            addCriterion("totalpay not between", value1, value2, "totalpay");
            return (Criteria) this;
        }

        public Criteria andVietimeIsNull() {
            addCriterion("vietime is null");
            return (Criteria) this;
        }

        public Criteria andVietimeIsNotNull() {
            addCriterion("vietime is not null");
            return (Criteria) this;
        }

        public Criteria andVietimeEqualTo(Date value) {
            addCriterion("vietime =", value, "vietime");
            return (Criteria) this;
        }

        public Criteria andVietimeNotEqualTo(Date value) {
            addCriterion("vietime <>", value, "vietime");
            return (Criteria) this;
        }

        public Criteria andVietimeGreaterThan(Date value) {
            addCriterion("vietime >", value, "vietime");
            return (Criteria) this;
        }

        public Criteria andVietimeGreaterThanOrEqualTo(Date value) {
            addCriterion("vietime >=", value, "vietime");
            return (Criteria) this;
        }

        public Criteria andVietimeLessThan(Date value) {
            addCriterion("vietime <", value, "vietime");
            return (Criteria) this;
        }

        public Criteria andVietimeLessThanOrEqualTo(Date value) {
            addCriterion("vietime <=", value, "vietime");
            return (Criteria) this;
        }

        public Criteria andVietimeIn(List<Date> values) {
            addCriterion("vietime in", values, "vietime");
            return (Criteria) this;
        }

        public Criteria andVietimeNotIn(List<Date> values) {
            addCriterion("vietime not in", values, "vietime");
            return (Criteria) this;
        }

        public Criteria andVietimeBetween(Date value1, Date value2) {
            addCriterion("vietime between", value1, value2, "vietime");
            return (Criteria) this;
        }

        public Criteria andVietimeNotBetween(Date value1, Date value2) {
            addCriterion("vietime not between", value1, value2, "vietime");
            return (Criteria) this;
        }

        public Criteria andViemsgIsNull() {
            addCriterion("viemsg is null");
            return (Criteria) this;
        }

        public Criteria andViemsgIsNotNull() {
            addCriterion("viemsg is not null");
            return (Criteria) this;
        }

        public Criteria andViemsgEqualTo(String value) {
            addCriterion("viemsg =", value, "viemsg");
            return (Criteria) this;
        }

        public Criteria andViemsgNotEqualTo(String value) {
            addCriterion("viemsg <>", value, "viemsg");
            return (Criteria) this;
        }

        public Criteria andViemsgGreaterThan(String value) {
            addCriterion("viemsg >", value, "viemsg");
            return (Criteria) this;
        }

        public Criteria andViemsgGreaterThanOrEqualTo(String value) {
            addCriterion("viemsg >=", value, "viemsg");
            return (Criteria) this;
        }

        public Criteria andViemsgLessThan(String value) {
            addCriterion("viemsg <", value, "viemsg");
            return (Criteria) this;
        }

        public Criteria andViemsgLessThanOrEqualTo(String value) {
            addCriterion("viemsg <=", value, "viemsg");
            return (Criteria) this;
        }

        public Criteria andViemsgLike(String value) {
            addCriterion("viemsg like", value, "viemsg");
            return (Criteria) this;
        }

        public Criteria andViemsgNotLike(String value) {
            addCriterion("viemsg not like", value, "viemsg");
            return (Criteria) this;
        }

        public Criteria andViemsgIn(List<String> values) {
            addCriterion("viemsg in", values, "viemsg");
            return (Criteria) this;
        }

        public Criteria andViemsgNotIn(List<String> values) {
            addCriterion("viemsg not in", values, "viemsg");
            return (Criteria) this;
        }

        public Criteria andViemsgBetween(String value1, String value2) {
            addCriterion("viemsg between", value1, value2, "viemsg");
            return (Criteria) this;
        }

        public Criteria andViemsgNotBetween(String value1, String value2) {
            addCriterion("viemsg not between", value1, value2, "viemsg");
            return (Criteria) this;
        }

        public Criteria andViestatusIsNull() {
            addCriterion("viestatus is null");
            return (Criteria) this;
        }

        public Criteria andViestatusIsNotNull() {
            addCriterion("viestatus is not null");
            return (Criteria) this;
        }

        public Criteria andViestatusEqualTo(Integer value) {
            addCriterion("viestatus =", value, "viestatus");
            return (Criteria) this;
        }

        public Criteria andViestatusNotEqualTo(Integer value) {
            addCriterion("viestatus <>", value, "viestatus");
            return (Criteria) this;
        }

        public Criteria andViestatusGreaterThan(Integer value) {
            addCriterion("viestatus >", value, "viestatus");
            return (Criteria) this;
        }

        public Criteria andViestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("viestatus >=", value, "viestatus");
            return (Criteria) this;
        }

        public Criteria andViestatusLessThan(Integer value) {
            addCriterion("viestatus <", value, "viestatus");
            return (Criteria) this;
        }

        public Criteria andViestatusLessThanOrEqualTo(Integer value) {
            addCriterion("viestatus <=", value, "viestatus");
            return (Criteria) this;
        }

        public Criteria andViestatusIn(List<Integer> values) {
            addCriterion("viestatus in", values, "viestatus");
            return (Criteria) this;
        }

        public Criteria andViestatusNotIn(List<Integer> values) {
            addCriterion("viestatus not in", values, "viestatus");
            return (Criteria) this;
        }

        public Criteria andViestatusBetween(Integer value1, Integer value2) {
            addCriterion("viestatus between", value1, value2, "viestatus");
            return (Criteria) this;
        }

        public Criteria andViestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("viestatus not between", value1, value2, "viestatus");
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