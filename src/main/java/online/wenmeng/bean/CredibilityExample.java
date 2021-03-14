package online.wenmeng.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CredibilityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CredibilityExample() {
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

        public Criteria andCredibilityidIsNull() {
            addCriterion("credibilityid is null");
            return (Criteria) this;
        }

        public Criteria andCredibilityidIsNotNull() {
            addCriterion("credibilityid is not null");
            return (Criteria) this;
        }

        public Criteria andCredibilityidEqualTo(Integer value) {
            addCriterion("credibilityid =", value, "credibilityid");
            return (Criteria) this;
        }

        public Criteria andCredibilityidNotEqualTo(Integer value) {
            addCriterion("credibilityid <>", value, "credibilityid");
            return (Criteria) this;
        }

        public Criteria andCredibilityidGreaterThan(Integer value) {
            addCriterion("credibilityid >", value, "credibilityid");
            return (Criteria) this;
        }

        public Criteria andCredibilityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("credibilityid >=", value, "credibilityid");
            return (Criteria) this;
        }

        public Criteria andCredibilityidLessThan(Integer value) {
            addCriterion("credibilityid <", value, "credibilityid");
            return (Criteria) this;
        }

        public Criteria andCredibilityidLessThanOrEqualTo(Integer value) {
            addCriterion("credibilityid <=", value, "credibilityid");
            return (Criteria) this;
        }

        public Criteria andCredibilityidIn(List<Integer> values) {
            addCriterion("credibilityid in", values, "credibilityid");
            return (Criteria) this;
        }

        public Criteria andCredibilityidNotIn(List<Integer> values) {
            addCriterion("credibilityid not in", values, "credibilityid");
            return (Criteria) this;
        }

        public Criteria andCredibilityidBetween(Integer value1, Integer value2) {
            addCriterion("credibilityid between", value1, value2, "credibilityid");
            return (Criteria) this;
        }

        public Criteria andCredibilityidNotBetween(Integer value1, Integer value2) {
            addCriterion("credibilityid not between", value1, value2, "credibilityid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andChangestatusIsNull() {
            addCriterion("changestatus is null");
            return (Criteria) this;
        }

        public Criteria andChangestatusIsNotNull() {
            addCriterion("changestatus is not null");
            return (Criteria) this;
        }

        public Criteria andChangestatusEqualTo(Integer value) {
            addCriterion("changestatus =", value, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusNotEqualTo(Integer value) {
            addCriterion("changestatus <>", value, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusGreaterThan(Integer value) {
            addCriterion("changestatus >", value, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("changestatus >=", value, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusLessThan(Integer value) {
            addCriterion("changestatus <", value, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusLessThanOrEqualTo(Integer value) {
            addCriterion("changestatus <=", value, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusIn(List<Integer> values) {
            addCriterion("changestatus in", values, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusNotIn(List<Integer> values) {
            addCriterion("changestatus not in", values, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusBetween(Integer value1, Integer value2) {
            addCriterion("changestatus between", value1, value2, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("changestatus not between", value1, value2, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangenumIsNull() {
            addCriterion("changenum is null");
            return (Criteria) this;
        }

        public Criteria andChangenumIsNotNull() {
            addCriterion("changenum is not null");
            return (Criteria) this;
        }

        public Criteria andChangenumEqualTo(Integer value) {
            addCriterion("changenum =", value, "changenum");
            return (Criteria) this;
        }

        public Criteria andChangenumNotEqualTo(Integer value) {
            addCriterion("changenum <>", value, "changenum");
            return (Criteria) this;
        }

        public Criteria andChangenumGreaterThan(Integer value) {
            addCriterion("changenum >", value, "changenum");
            return (Criteria) this;
        }

        public Criteria andChangenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("changenum >=", value, "changenum");
            return (Criteria) this;
        }

        public Criteria andChangenumLessThan(Integer value) {
            addCriterion("changenum <", value, "changenum");
            return (Criteria) this;
        }

        public Criteria andChangenumLessThanOrEqualTo(Integer value) {
            addCriterion("changenum <=", value, "changenum");
            return (Criteria) this;
        }

        public Criteria andChangenumIn(List<Integer> values) {
            addCriterion("changenum in", values, "changenum");
            return (Criteria) this;
        }

        public Criteria andChangenumNotIn(List<Integer> values) {
            addCriterion("changenum not in", values, "changenum");
            return (Criteria) this;
        }

        public Criteria andChangenumBetween(Integer value1, Integer value2) {
            addCriterion("changenum between", value1, value2, "changenum");
            return (Criteria) this;
        }

        public Criteria andChangenumNotBetween(Integer value1, Integer value2) {
            addCriterion("changenum not between", value1, value2, "changenum");
            return (Criteria) this;
        }

        public Criteria andChangecauseIsNull() {
            addCriterion("changecause is null");
            return (Criteria) this;
        }

        public Criteria andChangecauseIsNotNull() {
            addCriterion("changecause is not null");
            return (Criteria) this;
        }

        public Criteria andChangecauseEqualTo(String value) {
            addCriterion("changecause =", value, "changecause");
            return (Criteria) this;
        }

        public Criteria andChangecauseNotEqualTo(String value) {
            addCriterion("changecause <>", value, "changecause");
            return (Criteria) this;
        }

        public Criteria andChangecauseGreaterThan(String value) {
            addCriterion("changecause >", value, "changecause");
            return (Criteria) this;
        }

        public Criteria andChangecauseGreaterThanOrEqualTo(String value) {
            addCriterion("changecause >=", value, "changecause");
            return (Criteria) this;
        }

        public Criteria andChangecauseLessThan(String value) {
            addCriterion("changecause <", value, "changecause");
            return (Criteria) this;
        }

        public Criteria andChangecauseLessThanOrEqualTo(String value) {
            addCriterion("changecause <=", value, "changecause");
            return (Criteria) this;
        }

        public Criteria andChangecauseLike(String value) {
            addCriterion("changecause like", value, "changecause");
            return (Criteria) this;
        }

        public Criteria andChangecauseNotLike(String value) {
            addCriterion("changecause not like", value, "changecause");
            return (Criteria) this;
        }

        public Criteria andChangecauseIn(List<String> values) {
            addCriterion("changecause in", values, "changecause");
            return (Criteria) this;
        }

        public Criteria andChangecauseNotIn(List<String> values) {
            addCriterion("changecause not in", values, "changecause");
            return (Criteria) this;
        }

        public Criteria andChangecauseBetween(String value1, String value2) {
            addCriterion("changecause between", value1, value2, "changecause");
            return (Criteria) this;
        }

        public Criteria andChangecauseNotBetween(String value1, String value2) {
            addCriterion("changecause not between", value1, value2, "changecause");
            return (Criteria) this;
        }

        public Criteria andAboutidsIsNull() {
            addCriterion("aboutids is null");
            return (Criteria) this;
        }

        public Criteria andAboutidsIsNotNull() {
            addCriterion("aboutids is not null");
            return (Criteria) this;
        }

        public Criteria andAboutidsEqualTo(String value) {
            addCriterion("aboutids =", value, "aboutids");
            return (Criteria) this;
        }

        public Criteria andAboutidsNotEqualTo(String value) {
            addCriterion("aboutids <>", value, "aboutids");
            return (Criteria) this;
        }

        public Criteria andAboutidsGreaterThan(String value) {
            addCriterion("aboutids >", value, "aboutids");
            return (Criteria) this;
        }

        public Criteria andAboutidsGreaterThanOrEqualTo(String value) {
            addCriterion("aboutids >=", value, "aboutids");
            return (Criteria) this;
        }

        public Criteria andAboutidsLessThan(String value) {
            addCriterion("aboutids <", value, "aboutids");
            return (Criteria) this;
        }

        public Criteria andAboutidsLessThanOrEqualTo(String value) {
            addCriterion("aboutids <=", value, "aboutids");
            return (Criteria) this;
        }

        public Criteria andAboutidsLike(String value) {
            addCriterion("aboutids like", value, "aboutids");
            return (Criteria) this;
        }

        public Criteria andAboutidsNotLike(String value) {
            addCriterion("aboutids not like", value, "aboutids");
            return (Criteria) this;
        }

        public Criteria andAboutidsIn(List<String> values) {
            addCriterion("aboutids in", values, "aboutids");
            return (Criteria) this;
        }

        public Criteria andAboutidsNotIn(List<String> values) {
            addCriterion("aboutids not in", values, "aboutids");
            return (Criteria) this;
        }

        public Criteria andAboutidsBetween(String value1, String value2) {
            addCriterion("aboutids between", value1, value2, "aboutids");
            return (Criteria) this;
        }

        public Criteria andAboutidsNotBetween(String value1, String value2) {
            addCriterion("aboutids not between", value1, value2, "aboutids");
            return (Criteria) this;
        }

        public Criteria andAbouttimeIsNull() {
            addCriterion("abouttime is null");
            return (Criteria) this;
        }

        public Criteria andAbouttimeIsNotNull() {
            addCriterion("abouttime is not null");
            return (Criteria) this;
        }

        public Criteria andAbouttimeEqualTo(Date value) {
            addCriterion("abouttime =", value, "abouttime");
            return (Criteria) this;
        }

        public Criteria andAbouttimeNotEqualTo(Date value) {
            addCriterion("abouttime <>", value, "abouttime");
            return (Criteria) this;
        }

        public Criteria andAbouttimeGreaterThan(Date value) {
            addCriterion("abouttime >", value, "abouttime");
            return (Criteria) this;
        }

        public Criteria andAbouttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("abouttime >=", value, "abouttime");
            return (Criteria) this;
        }

        public Criteria andAbouttimeLessThan(Date value) {
            addCriterion("abouttime <", value, "abouttime");
            return (Criteria) this;
        }

        public Criteria andAbouttimeLessThanOrEqualTo(Date value) {
            addCriterion("abouttime <=", value, "abouttime");
            return (Criteria) this;
        }

        public Criteria andAbouttimeIn(List<Date> values) {
            addCriterion("abouttime in", values, "abouttime");
            return (Criteria) this;
        }

        public Criteria andAbouttimeNotIn(List<Date> values) {
            addCriterion("abouttime not in", values, "abouttime");
            return (Criteria) this;
        }

        public Criteria andAbouttimeBetween(Date value1, Date value2) {
            addCriterion("abouttime between", value1, value2, "abouttime");
            return (Criteria) this;
        }

        public Criteria andAbouttimeNotBetween(Date value1, Date value2) {
            addCriterion("abouttime not between", value1, value2, "abouttime");
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