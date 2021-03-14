package online.wenmeng.bean;

import java.util.ArrayList;
import java.util.List;

public class DrivercarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrivercarExample() {
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

        public Criteria andOrdernumIsNull() {
            addCriterion("ordernum is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNotNull() {
            addCriterion("ordernum is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumEqualTo(Integer value) {
            addCriterion("ordernum =", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotEqualTo(Integer value) {
            addCriterion("ordernum <>", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThan(Integer value) {
            addCriterion("ordernum >", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ordernum >=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThan(Integer value) {
            addCriterion("ordernum <", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThanOrEqualTo(Integer value) {
            addCriterion("ordernum <=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumIn(List<Integer> values) {
            addCriterion("ordernum in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotIn(List<Integer> values) {
            addCriterion("ordernum not in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumBetween(Integer value1, Integer value2) {
            addCriterion("ordernum between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotBetween(Integer value1, Integer value2) {
            addCriterion("ordernum not between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andCarlicenceIsNull() {
            addCriterion("carlicence is null");
            return (Criteria) this;
        }

        public Criteria andCarlicenceIsNotNull() {
            addCriterion("carlicence is not null");
            return (Criteria) this;
        }

        public Criteria andCarlicenceEqualTo(String value) {
            addCriterion("carlicence =", value, "carlicence");
            return (Criteria) this;
        }

        public Criteria andCarlicenceNotEqualTo(String value) {
            addCriterion("carlicence <>", value, "carlicence");
            return (Criteria) this;
        }

        public Criteria andCarlicenceGreaterThan(String value) {
            addCriterion("carlicence >", value, "carlicence");
            return (Criteria) this;
        }

        public Criteria andCarlicenceGreaterThanOrEqualTo(String value) {
            addCriterion("carlicence >=", value, "carlicence");
            return (Criteria) this;
        }

        public Criteria andCarlicenceLessThan(String value) {
            addCriterion("carlicence <", value, "carlicence");
            return (Criteria) this;
        }

        public Criteria andCarlicenceLessThanOrEqualTo(String value) {
            addCriterion("carlicence <=", value, "carlicence");
            return (Criteria) this;
        }

        public Criteria andCarlicenceLike(String value) {
            addCriterion("carlicence like", value, "carlicence");
            return (Criteria) this;
        }

        public Criteria andCarlicenceNotLike(String value) {
            addCriterion("carlicence not like", value, "carlicence");
            return (Criteria) this;
        }

        public Criteria andCarlicenceIn(List<String> values) {
            addCriterion("carlicence in", values, "carlicence");
            return (Criteria) this;
        }

        public Criteria andCarlicenceNotIn(List<String> values) {
            addCriterion("carlicence not in", values, "carlicence");
            return (Criteria) this;
        }

        public Criteria andCarlicenceBetween(String value1, String value2) {
            addCriterion("carlicence between", value1, value2, "carlicence");
            return (Criteria) this;
        }

        public Criteria andCarlicenceNotBetween(String value1, String value2) {
            addCriterion("carlicence not between", value1, value2, "carlicence");
            return (Criteria) this;
        }

        public Criteria andCarcolorIsNull() {
            addCriterion("carcolor is null");
            return (Criteria) this;
        }

        public Criteria andCarcolorIsNotNull() {
            addCriterion("carcolor is not null");
            return (Criteria) this;
        }

        public Criteria andCarcolorEqualTo(String value) {
            addCriterion("carcolor =", value, "carcolor");
            return (Criteria) this;
        }

        public Criteria andCarcolorNotEqualTo(String value) {
            addCriterion("carcolor <>", value, "carcolor");
            return (Criteria) this;
        }

        public Criteria andCarcolorGreaterThan(String value) {
            addCriterion("carcolor >", value, "carcolor");
            return (Criteria) this;
        }

        public Criteria andCarcolorGreaterThanOrEqualTo(String value) {
            addCriterion("carcolor >=", value, "carcolor");
            return (Criteria) this;
        }

        public Criteria andCarcolorLessThan(String value) {
            addCriterion("carcolor <", value, "carcolor");
            return (Criteria) this;
        }

        public Criteria andCarcolorLessThanOrEqualTo(String value) {
            addCriterion("carcolor <=", value, "carcolor");
            return (Criteria) this;
        }

        public Criteria andCarcolorLike(String value) {
            addCriterion("carcolor like", value, "carcolor");
            return (Criteria) this;
        }

        public Criteria andCarcolorNotLike(String value) {
            addCriterion("carcolor not like", value, "carcolor");
            return (Criteria) this;
        }

        public Criteria andCarcolorIn(List<String> values) {
            addCriterion("carcolor in", values, "carcolor");
            return (Criteria) this;
        }

        public Criteria andCarcolorNotIn(List<String> values) {
            addCriterion("carcolor not in", values, "carcolor");
            return (Criteria) this;
        }

        public Criteria andCarcolorBetween(String value1, String value2) {
            addCriterion("carcolor between", value1, value2, "carcolor");
            return (Criteria) this;
        }

        public Criteria andCarcolorNotBetween(String value1, String value2) {
            addCriterion("carcolor not between", value1, value2, "carcolor");
            return (Criteria) this;
        }

        public Criteria andCarseatIsNull() {
            addCriterion("carseat is null");
            return (Criteria) this;
        }

        public Criteria andCarseatIsNotNull() {
            addCriterion("carseat is not null");
            return (Criteria) this;
        }

        public Criteria andCarseatEqualTo(Integer value) {
            addCriterion("carseat =", value, "carseat");
            return (Criteria) this;
        }

        public Criteria andCarseatNotEqualTo(Integer value) {
            addCriterion("carseat <>", value, "carseat");
            return (Criteria) this;
        }

        public Criteria andCarseatGreaterThan(Integer value) {
            addCriterion("carseat >", value, "carseat");
            return (Criteria) this;
        }

        public Criteria andCarseatGreaterThanOrEqualTo(Integer value) {
            addCriterion("carseat >=", value, "carseat");
            return (Criteria) this;
        }

        public Criteria andCarseatLessThan(Integer value) {
            addCriterion("carseat <", value, "carseat");
            return (Criteria) this;
        }

        public Criteria andCarseatLessThanOrEqualTo(Integer value) {
            addCriterion("carseat <=", value, "carseat");
            return (Criteria) this;
        }

        public Criteria andCarseatIn(List<Integer> values) {
            addCriterion("carseat in", values, "carseat");
            return (Criteria) this;
        }

        public Criteria andCarseatNotIn(List<Integer> values) {
            addCriterion("carseat not in", values, "carseat");
            return (Criteria) this;
        }

        public Criteria andCarseatBetween(Integer value1, Integer value2) {
            addCriterion("carseat between", value1, value2, "carseat");
            return (Criteria) this;
        }

        public Criteria andCarseatNotBetween(Integer value1, Integer value2) {
            addCriterion("carseat not between", value1, value2, "carseat");
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