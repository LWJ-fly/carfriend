package online.wenmeng.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CallleaveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CallleaveExample() {
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

        public Criteria andCallleaveidIsNull() {
            addCriterion("callleaveid is null");
            return (Criteria) this;
        }

        public Criteria andCallleaveidIsNotNull() {
            addCriterion("callleaveid is not null");
            return (Criteria) this;
        }

        public Criteria andCallleaveidEqualTo(Integer value) {
            addCriterion("callleaveid =", value, "callleaveid");
            return (Criteria) this;
        }

        public Criteria andCallleaveidNotEqualTo(Integer value) {
            addCriterion("callleaveid <>", value, "callleaveid");
            return (Criteria) this;
        }

        public Criteria andCallleaveidGreaterThan(Integer value) {
            addCriterion("callleaveid >", value, "callleaveid");
            return (Criteria) this;
        }

        public Criteria andCallleaveidGreaterThanOrEqualTo(Integer value) {
            addCriterion("callleaveid >=", value, "callleaveid");
            return (Criteria) this;
        }

        public Criteria andCallleaveidLessThan(Integer value) {
            addCriterion("callleaveid <", value, "callleaveid");
            return (Criteria) this;
        }

        public Criteria andCallleaveidLessThanOrEqualTo(Integer value) {
            addCriterion("callleaveid <=", value, "callleaveid");
            return (Criteria) this;
        }

        public Criteria andCallleaveidIn(List<Integer> values) {
            addCriterion("callleaveid in", values, "callleaveid");
            return (Criteria) this;
        }

        public Criteria andCallleaveidNotIn(List<Integer> values) {
            addCriterion("callleaveid not in", values, "callleaveid");
            return (Criteria) this;
        }

        public Criteria andCallleaveidBetween(Integer value1, Integer value2) {
            addCriterion("callleaveid between", value1, value2, "callleaveid");
            return (Criteria) this;
        }

        public Criteria andCallleaveidNotBetween(Integer value1, Integer value2) {
            addCriterion("callleaveid not between", value1, value2, "callleaveid");
            return (Criteria) this;
        }

        public Criteria andCalluseridIsNull() {
            addCriterion("calluserid is null");
            return (Criteria) this;
        }

        public Criteria andCalluseridIsNotNull() {
            addCriterion("calluserid is not null");
            return (Criteria) this;
        }

        public Criteria andCalluseridEqualTo(Integer value) {
            addCriterion("calluserid =", value, "calluserid");
            return (Criteria) this;
        }

        public Criteria andCalluseridNotEqualTo(Integer value) {
            addCriterion("calluserid <>", value, "calluserid");
            return (Criteria) this;
        }

        public Criteria andCalluseridGreaterThan(Integer value) {
            addCriterion("calluserid >", value, "calluserid");
            return (Criteria) this;
        }

        public Criteria andCalluseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("calluserid >=", value, "calluserid");
            return (Criteria) this;
        }

        public Criteria andCalluseridLessThan(Integer value) {
            addCriterion("calluserid <", value, "calluserid");
            return (Criteria) this;
        }

        public Criteria andCalluseridLessThanOrEqualTo(Integer value) {
            addCriterion("calluserid <=", value, "calluserid");
            return (Criteria) this;
        }

        public Criteria andCalluseridIn(List<Integer> values) {
            addCriterion("calluserid in", values, "calluserid");
            return (Criteria) this;
        }

        public Criteria andCalluseridNotIn(List<Integer> values) {
            addCriterion("calluserid not in", values, "calluserid");
            return (Criteria) this;
        }

        public Criteria andCalluseridBetween(Integer value1, Integer value2) {
            addCriterion("calluserid between", value1, value2, "calluserid");
            return (Criteria) this;
        }

        public Criteria andCalluseridNotBetween(Integer value1, Integer value2) {
            addCriterion("calluserid not between", value1, value2, "calluserid");
            return (Criteria) this;
        }

        public Criteria andPollingcaridIsNull() {
            addCriterion("pollingcarid is null");
            return (Criteria) this;
        }

        public Criteria andPollingcaridIsNotNull() {
            addCriterion("pollingcarid is not null");
            return (Criteria) this;
        }

        public Criteria andPollingcaridEqualTo(Integer value) {
            addCriterion("pollingcarid =", value, "pollingcarid");
            return (Criteria) this;
        }

        public Criteria andPollingcaridNotEqualTo(Integer value) {
            addCriterion("pollingcarid <>", value, "pollingcarid");
            return (Criteria) this;
        }

        public Criteria andPollingcaridGreaterThan(Integer value) {
            addCriterion("pollingcarid >", value, "pollingcarid");
            return (Criteria) this;
        }

        public Criteria andPollingcaridGreaterThanOrEqualTo(Integer value) {
            addCriterion("pollingcarid >=", value, "pollingcarid");
            return (Criteria) this;
        }

        public Criteria andPollingcaridLessThan(Integer value) {
            addCriterion("pollingcarid <", value, "pollingcarid");
            return (Criteria) this;
        }

        public Criteria andPollingcaridLessThanOrEqualTo(Integer value) {
            addCriterion("pollingcarid <=", value, "pollingcarid");
            return (Criteria) this;
        }

        public Criteria andPollingcaridIn(List<Integer> values) {
            addCriterion("pollingcarid in", values, "pollingcarid");
            return (Criteria) this;
        }

        public Criteria andPollingcaridNotIn(List<Integer> values) {
            addCriterion("pollingcarid not in", values, "pollingcarid");
            return (Criteria) this;
        }

        public Criteria andPollingcaridBetween(Integer value1, Integer value2) {
            addCriterion("pollingcarid between", value1, value2, "pollingcarid");
            return (Criteria) this;
        }

        public Criteria andPollingcaridNotBetween(Integer value1, Integer value2) {
            addCriterion("pollingcarid not between", value1, value2, "pollingcarid");
            return (Criteria) this;
        }

        public Criteria andToleaveidIsNull() {
            addCriterion("toleaveid is null");
            return (Criteria) this;
        }

        public Criteria andToleaveidIsNotNull() {
            addCriterion("toleaveid is not null");
            return (Criteria) this;
        }

        public Criteria andToleaveidEqualTo(Integer value) {
            addCriterion("toleaveid =", value, "toleaveid");
            return (Criteria) this;
        }

        public Criteria andToleaveidNotEqualTo(Integer value) {
            addCriterion("toleaveid <>", value, "toleaveid");
            return (Criteria) this;
        }

        public Criteria andToleaveidGreaterThan(Integer value) {
            addCriterion("toleaveid >", value, "toleaveid");
            return (Criteria) this;
        }

        public Criteria andToleaveidGreaterThanOrEqualTo(Integer value) {
            addCriterion("toleaveid >=", value, "toleaveid");
            return (Criteria) this;
        }

        public Criteria andToleaveidLessThan(Integer value) {
            addCriterion("toleaveid <", value, "toleaveid");
            return (Criteria) this;
        }

        public Criteria andToleaveidLessThanOrEqualTo(Integer value) {
            addCriterion("toleaveid <=", value, "toleaveid");
            return (Criteria) this;
        }

        public Criteria andToleaveidIn(List<Integer> values) {
            addCriterion("toleaveid in", values, "toleaveid");
            return (Criteria) this;
        }

        public Criteria andToleaveidNotIn(List<Integer> values) {
            addCriterion("toleaveid not in", values, "toleaveid");
            return (Criteria) this;
        }

        public Criteria andToleaveidBetween(Integer value1, Integer value2) {
            addCriterion("toleaveid between", value1, value2, "toleaveid");
            return (Criteria) this;
        }

        public Criteria andToleaveidNotBetween(Integer value1, Integer value2) {
            addCriterion("toleaveid not between", value1, value2, "toleaveid");
            return (Criteria) this;
        }

        public Criteria andAgreeidsIsNull() {
            addCriterion("agreeids is null");
            return (Criteria) this;
        }

        public Criteria andAgreeidsIsNotNull() {
            addCriterion("agreeids is not null");
            return (Criteria) this;
        }

        public Criteria andAgreeidsEqualTo(String value) {
            addCriterion("agreeids =", value, "agreeids");
            return (Criteria) this;
        }

        public Criteria andAgreeidsNotEqualTo(String value) {
            addCriterion("agreeids <>", value, "agreeids");
            return (Criteria) this;
        }

        public Criteria andAgreeidsGreaterThan(String value) {
            addCriterion("agreeids >", value, "agreeids");
            return (Criteria) this;
        }

        public Criteria andAgreeidsGreaterThanOrEqualTo(String value) {
            addCriterion("agreeids >=", value, "agreeids");
            return (Criteria) this;
        }

        public Criteria andAgreeidsLessThan(String value) {
            addCriterion("agreeids <", value, "agreeids");
            return (Criteria) this;
        }

        public Criteria andAgreeidsLessThanOrEqualTo(String value) {
            addCriterion("agreeids <=", value, "agreeids");
            return (Criteria) this;
        }

        public Criteria andAgreeidsLike(String value) {
            addCriterion("agreeids like", value, "agreeids");
            return (Criteria) this;
        }

        public Criteria andAgreeidsNotLike(String value) {
            addCriterion("agreeids not like", value, "agreeids");
            return (Criteria) this;
        }

        public Criteria andAgreeidsIn(List<String> values) {
            addCriterion("agreeids in", values, "agreeids");
            return (Criteria) this;
        }

        public Criteria andAgreeidsNotIn(List<String> values) {
            addCriterion("agreeids not in", values, "agreeids");
            return (Criteria) this;
        }

        public Criteria andAgreeidsBetween(String value1, String value2) {
            addCriterion("agreeids between", value1, value2, "agreeids");
            return (Criteria) this;
        }

        public Criteria andAgreeidsNotBetween(String value1, String value2) {
            addCriterion("agreeids not between", value1, value2, "agreeids");
            return (Criteria) this;
        }

        public Criteria andDisagreeidsIsNull() {
            addCriterion("disagreeids is null");
            return (Criteria) this;
        }

        public Criteria andDisagreeidsIsNotNull() {
            addCriterion("disagreeids is not null");
            return (Criteria) this;
        }

        public Criteria andDisagreeidsEqualTo(String value) {
            addCriterion("disagreeids =", value, "disagreeids");
            return (Criteria) this;
        }

        public Criteria andDisagreeidsNotEqualTo(String value) {
            addCriterion("disagreeids <>", value, "disagreeids");
            return (Criteria) this;
        }

        public Criteria andDisagreeidsGreaterThan(String value) {
            addCriterion("disagreeids >", value, "disagreeids");
            return (Criteria) this;
        }

        public Criteria andDisagreeidsGreaterThanOrEqualTo(String value) {
            addCriterion("disagreeids >=", value, "disagreeids");
            return (Criteria) this;
        }

        public Criteria andDisagreeidsLessThan(String value) {
            addCriterion("disagreeids <", value, "disagreeids");
            return (Criteria) this;
        }

        public Criteria andDisagreeidsLessThanOrEqualTo(String value) {
            addCriterion("disagreeids <=", value, "disagreeids");
            return (Criteria) this;
        }

        public Criteria andDisagreeidsLike(String value) {
            addCriterion("disagreeids like", value, "disagreeids");
            return (Criteria) this;
        }

        public Criteria andDisagreeidsNotLike(String value) {
            addCriterion("disagreeids not like", value, "disagreeids");
            return (Criteria) this;
        }

        public Criteria andDisagreeidsIn(List<String> values) {
            addCriterion("disagreeids in", values, "disagreeids");
            return (Criteria) this;
        }

        public Criteria andDisagreeidsNotIn(List<String> values) {
            addCriterion("disagreeids not in", values, "disagreeids");
            return (Criteria) this;
        }

        public Criteria andDisagreeidsBetween(String value1, String value2) {
            addCriterion("disagreeids between", value1, value2, "disagreeids");
            return (Criteria) this;
        }

        public Criteria andDisagreeidsNotBetween(String value1, String value2) {
            addCriterion("disagreeids not between", value1, value2, "disagreeids");
            return (Criteria) this;
        }

        public Criteria andLeavecauseIsNull() {
            addCriterion("leavecause is null");
            return (Criteria) this;
        }

        public Criteria andLeavecauseIsNotNull() {
            addCriterion("leavecause is not null");
            return (Criteria) this;
        }

        public Criteria andLeavecauseEqualTo(String value) {
            addCriterion("leavecause =", value, "leavecause");
            return (Criteria) this;
        }

        public Criteria andLeavecauseNotEqualTo(String value) {
            addCriterion("leavecause <>", value, "leavecause");
            return (Criteria) this;
        }

        public Criteria andLeavecauseGreaterThan(String value) {
            addCriterion("leavecause >", value, "leavecause");
            return (Criteria) this;
        }

        public Criteria andLeavecauseGreaterThanOrEqualTo(String value) {
            addCriterion("leavecause >=", value, "leavecause");
            return (Criteria) this;
        }

        public Criteria andLeavecauseLessThan(String value) {
            addCriterion("leavecause <", value, "leavecause");
            return (Criteria) this;
        }

        public Criteria andLeavecauseLessThanOrEqualTo(String value) {
            addCriterion("leavecause <=", value, "leavecause");
            return (Criteria) this;
        }

        public Criteria andLeavecauseLike(String value) {
            addCriterion("leavecause like", value, "leavecause");
            return (Criteria) this;
        }

        public Criteria andLeavecauseNotLike(String value) {
            addCriterion("leavecause not like", value, "leavecause");
            return (Criteria) this;
        }

        public Criteria andLeavecauseIn(List<String> values) {
            addCriterion("leavecause in", values, "leavecause");
            return (Criteria) this;
        }

        public Criteria andLeavecauseNotIn(List<String> values) {
            addCriterion("leavecause not in", values, "leavecause");
            return (Criteria) this;
        }

        public Criteria andLeavecauseBetween(String value1, String value2) {
            addCriterion("leavecause between", value1, value2, "leavecause");
            return (Criteria) this;
        }

        public Criteria andLeavecauseNotBetween(String value1, String value2) {
            addCriterion("leavecause not between", value1, value2, "leavecause");
            return (Criteria) this;
        }

        public Criteria andCalltimeIsNull() {
            addCriterion("calltime is null");
            return (Criteria) this;
        }

        public Criteria andCalltimeIsNotNull() {
            addCriterion("calltime is not null");
            return (Criteria) this;
        }

        public Criteria andCalltimeEqualTo(Date value) {
            addCriterion("calltime =", value, "calltime");
            return (Criteria) this;
        }

        public Criteria andCalltimeNotEqualTo(Date value) {
            addCriterion("calltime <>", value, "calltime");
            return (Criteria) this;
        }

        public Criteria andCalltimeGreaterThan(Date value) {
            addCriterion("calltime >", value, "calltime");
            return (Criteria) this;
        }

        public Criteria andCalltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("calltime >=", value, "calltime");
            return (Criteria) this;
        }

        public Criteria andCalltimeLessThan(Date value) {
            addCriterion("calltime <", value, "calltime");
            return (Criteria) this;
        }

        public Criteria andCalltimeLessThanOrEqualTo(Date value) {
            addCriterion("calltime <=", value, "calltime");
            return (Criteria) this;
        }

        public Criteria andCalltimeIn(List<Date> values) {
            addCriterion("calltime in", values, "calltime");
            return (Criteria) this;
        }

        public Criteria andCalltimeNotIn(List<Date> values) {
            addCriterion("calltime not in", values, "calltime");
            return (Criteria) this;
        }

        public Criteria andCalltimeBetween(Date value1, Date value2) {
            addCriterion("calltime between", value1, value2, "calltime");
            return (Criteria) this;
        }

        public Criteria andCalltimeNotBetween(Date value1, Date value2) {
            addCriterion("calltime not between", value1, value2, "calltime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andCallresultIsNull() {
            addCriterion("callresult is null");
            return (Criteria) this;
        }

        public Criteria andCallresultIsNotNull() {
            addCriterion("callresult is not null");
            return (Criteria) this;
        }

        public Criteria andCallresultEqualTo(Integer value) {
            addCriterion("callresult =", value, "callresult");
            return (Criteria) this;
        }

        public Criteria andCallresultNotEqualTo(Integer value) {
            addCriterion("callresult <>", value, "callresult");
            return (Criteria) this;
        }

        public Criteria andCallresultGreaterThan(Integer value) {
            addCriterion("callresult >", value, "callresult");
            return (Criteria) this;
        }

        public Criteria andCallresultGreaterThanOrEqualTo(Integer value) {
            addCriterion("callresult >=", value, "callresult");
            return (Criteria) this;
        }

        public Criteria andCallresultLessThan(Integer value) {
            addCriterion("callresult <", value, "callresult");
            return (Criteria) this;
        }

        public Criteria andCallresultLessThanOrEqualTo(Integer value) {
            addCriterion("callresult <=", value, "callresult");
            return (Criteria) this;
        }

        public Criteria andCallresultIn(List<Integer> values) {
            addCriterion("callresult in", values, "callresult");
            return (Criteria) this;
        }

        public Criteria andCallresultNotIn(List<Integer> values) {
            addCriterion("callresult not in", values, "callresult");
            return (Criteria) this;
        }

        public Criteria andCallresultBetween(Integer value1, Integer value2) {
            addCriterion("callresult between", value1, value2, "callresult");
            return (Criteria) this;
        }

        public Criteria andCallresultNotBetween(Integer value1, Integer value2) {
            addCriterion("callresult not between", value1, value2, "callresult");
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