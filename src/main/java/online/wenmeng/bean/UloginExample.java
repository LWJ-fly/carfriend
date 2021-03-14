package online.wenmeng.bean;

import java.util.ArrayList;
import java.util.List;

public class UloginExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UloginExample() {
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

        public Criteria andQqloginIsNull() {
            addCriterion("qqlogin is null");
            return (Criteria) this;
        }

        public Criteria andQqloginIsNotNull() {
            addCriterion("qqlogin is not null");
            return (Criteria) this;
        }

        public Criteria andQqloginEqualTo(String value) {
            addCriterion("qqlogin =", value, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginNotEqualTo(String value) {
            addCriterion("qqlogin <>", value, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginGreaterThan(String value) {
            addCriterion("qqlogin >", value, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginGreaterThanOrEqualTo(String value) {
            addCriterion("qqlogin >=", value, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginLessThan(String value) {
            addCriterion("qqlogin <", value, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginLessThanOrEqualTo(String value) {
            addCriterion("qqlogin <=", value, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginLike(String value) {
            addCriterion("qqlogin like", value, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginNotLike(String value) {
            addCriterion("qqlogin not like", value, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginIn(List<String> values) {
            addCriterion("qqlogin in", values, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginNotIn(List<String> values) {
            addCriterion("qqlogin not in", values, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginBetween(String value1, String value2) {
            addCriterion("qqlogin between", value1, value2, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginNotBetween(String value1, String value2) {
            addCriterion("qqlogin not between", value1, value2, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andWxloginIsNull() {
            addCriterion("wxlogin is null");
            return (Criteria) this;
        }

        public Criteria andWxloginIsNotNull() {
            addCriterion("wxlogin is not null");
            return (Criteria) this;
        }

        public Criteria andWxloginEqualTo(String value) {
            addCriterion("wxlogin =", value, "wxlogin");
            return (Criteria) this;
        }

        public Criteria andWxloginNotEqualTo(String value) {
            addCriterion("wxlogin <>", value, "wxlogin");
            return (Criteria) this;
        }

        public Criteria andWxloginGreaterThan(String value) {
            addCriterion("wxlogin >", value, "wxlogin");
            return (Criteria) this;
        }

        public Criteria andWxloginGreaterThanOrEqualTo(String value) {
            addCriterion("wxlogin >=", value, "wxlogin");
            return (Criteria) this;
        }

        public Criteria andWxloginLessThan(String value) {
            addCriterion("wxlogin <", value, "wxlogin");
            return (Criteria) this;
        }

        public Criteria andWxloginLessThanOrEqualTo(String value) {
            addCriterion("wxlogin <=", value, "wxlogin");
            return (Criteria) this;
        }

        public Criteria andWxloginLike(String value) {
            addCriterion("wxlogin like", value, "wxlogin");
            return (Criteria) this;
        }

        public Criteria andWxloginNotLike(String value) {
            addCriterion("wxlogin not like", value, "wxlogin");
            return (Criteria) this;
        }

        public Criteria andWxloginIn(List<String> values) {
            addCriterion("wxlogin in", values, "wxlogin");
            return (Criteria) this;
        }

        public Criteria andWxloginNotIn(List<String> values) {
            addCriterion("wxlogin not in", values, "wxlogin");
            return (Criteria) this;
        }

        public Criteria andWxloginBetween(String value1, String value2) {
            addCriterion("wxlogin between", value1, value2, "wxlogin");
            return (Criteria) this;
        }

        public Criteria andWxloginNotBetween(String value1, String value2) {
            addCriterion("wxlogin not between", value1, value2, "wxlogin");
            return (Criteria) this;
        }

        public Criteria andZfbloginIsNull() {
            addCriterion("zfblogin is null");
            return (Criteria) this;
        }

        public Criteria andZfbloginIsNotNull() {
            addCriterion("zfblogin is not null");
            return (Criteria) this;
        }

        public Criteria andZfbloginEqualTo(String value) {
            addCriterion("zfblogin =", value, "zfblogin");
            return (Criteria) this;
        }

        public Criteria andZfbloginNotEqualTo(String value) {
            addCriterion("zfblogin <>", value, "zfblogin");
            return (Criteria) this;
        }

        public Criteria andZfbloginGreaterThan(String value) {
            addCriterion("zfblogin >", value, "zfblogin");
            return (Criteria) this;
        }

        public Criteria andZfbloginGreaterThanOrEqualTo(String value) {
            addCriterion("zfblogin >=", value, "zfblogin");
            return (Criteria) this;
        }

        public Criteria andZfbloginLessThan(String value) {
            addCriterion("zfblogin <", value, "zfblogin");
            return (Criteria) this;
        }

        public Criteria andZfbloginLessThanOrEqualTo(String value) {
            addCriterion("zfblogin <=", value, "zfblogin");
            return (Criteria) this;
        }

        public Criteria andZfbloginLike(String value) {
            addCriterion("zfblogin like", value, "zfblogin");
            return (Criteria) this;
        }

        public Criteria andZfbloginNotLike(String value) {
            addCriterion("zfblogin not like", value, "zfblogin");
            return (Criteria) this;
        }

        public Criteria andZfbloginIn(List<String> values) {
            addCriterion("zfblogin in", values, "zfblogin");
            return (Criteria) this;
        }

        public Criteria andZfbloginNotIn(List<String> values) {
            addCriterion("zfblogin not in", values, "zfblogin");
            return (Criteria) this;
        }

        public Criteria andZfbloginBetween(String value1, String value2) {
            addCriterion("zfblogin between", value1, value2, "zfblogin");
            return (Criteria) this;
        }

        public Criteria andZfbloginNotBetween(String value1, String value2) {
            addCriterion("zfblogin not between", value1, value2, "zfblogin");
            return (Criteria) this;
        }

        public Criteria andTbloginIsNull() {
            addCriterion("tblogin is null");
            return (Criteria) this;
        }

        public Criteria andTbloginIsNotNull() {
            addCriterion("tblogin is not null");
            return (Criteria) this;
        }

        public Criteria andTbloginEqualTo(String value) {
            addCriterion("tblogin =", value, "tblogin");
            return (Criteria) this;
        }

        public Criteria andTbloginNotEqualTo(String value) {
            addCriterion("tblogin <>", value, "tblogin");
            return (Criteria) this;
        }

        public Criteria andTbloginGreaterThan(String value) {
            addCriterion("tblogin >", value, "tblogin");
            return (Criteria) this;
        }

        public Criteria andTbloginGreaterThanOrEqualTo(String value) {
            addCriterion("tblogin >=", value, "tblogin");
            return (Criteria) this;
        }

        public Criteria andTbloginLessThan(String value) {
            addCriterion("tblogin <", value, "tblogin");
            return (Criteria) this;
        }

        public Criteria andTbloginLessThanOrEqualTo(String value) {
            addCriterion("tblogin <=", value, "tblogin");
            return (Criteria) this;
        }

        public Criteria andTbloginLike(String value) {
            addCriterion("tblogin like", value, "tblogin");
            return (Criteria) this;
        }

        public Criteria andTbloginNotLike(String value) {
            addCriterion("tblogin not like", value, "tblogin");
            return (Criteria) this;
        }

        public Criteria andTbloginIn(List<String> values) {
            addCriterion("tblogin in", values, "tblogin");
            return (Criteria) this;
        }

        public Criteria andTbloginNotIn(List<String> values) {
            addCriterion("tblogin not in", values, "tblogin");
            return (Criteria) this;
        }

        public Criteria andTbloginBetween(String value1, String value2) {
            addCriterion("tblogin between", value1, value2, "tblogin");
            return (Criteria) this;
        }

        public Criteria andTbloginNotBetween(String value1, String value2) {
            addCriterion("tblogin not between", value1, value2, "tblogin");
            return (Criteria) this;
        }

        public Criteria andUserloginIsNull() {
            addCriterion("userlogin is null");
            return (Criteria) this;
        }

        public Criteria andUserloginIsNotNull() {
            addCriterion("userlogin is not null");
            return (Criteria) this;
        }

        public Criteria andUserloginEqualTo(String value) {
            addCriterion("userlogin =", value, "userlogin");
            return (Criteria) this;
        }

        public Criteria andUserloginNotEqualTo(String value) {
            addCriterion("userlogin <>", value, "userlogin");
            return (Criteria) this;
        }

        public Criteria andUserloginGreaterThan(String value) {
            addCriterion("userlogin >", value, "userlogin");
            return (Criteria) this;
        }

        public Criteria andUserloginGreaterThanOrEqualTo(String value) {
            addCriterion("userlogin >=", value, "userlogin");
            return (Criteria) this;
        }

        public Criteria andUserloginLessThan(String value) {
            addCriterion("userlogin <", value, "userlogin");
            return (Criteria) this;
        }

        public Criteria andUserloginLessThanOrEqualTo(String value) {
            addCriterion("userlogin <=", value, "userlogin");
            return (Criteria) this;
        }

        public Criteria andUserloginLike(String value) {
            addCriterion("userlogin like", value, "userlogin");
            return (Criteria) this;
        }

        public Criteria andUserloginNotLike(String value) {
            addCriterion("userlogin not like", value, "userlogin");
            return (Criteria) this;
        }

        public Criteria andUserloginIn(List<String> values) {
            addCriterion("userlogin in", values, "userlogin");
            return (Criteria) this;
        }

        public Criteria andUserloginNotIn(List<String> values) {
            addCriterion("userlogin not in", values, "userlogin");
            return (Criteria) this;
        }

        public Criteria andUserloginBetween(String value1, String value2) {
            addCriterion("userlogin between", value1, value2, "userlogin");
            return (Criteria) this;
        }

        public Criteria andUserloginNotBetween(String value1, String value2) {
            addCriterion("userlogin not between", value1, value2, "userlogin");
            return (Criteria) this;
        }

        public Criteria andUserpwdIsNull() {
            addCriterion("userpwd is null");
            return (Criteria) this;
        }

        public Criteria andUserpwdIsNotNull() {
            addCriterion("userpwd is not null");
            return (Criteria) this;
        }

        public Criteria andUserpwdEqualTo(String value) {
            addCriterion("userpwd =", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotEqualTo(String value) {
            addCriterion("userpwd <>", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdGreaterThan(String value) {
            addCriterion("userpwd >", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdGreaterThanOrEqualTo(String value) {
            addCriterion("userpwd >=", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdLessThan(String value) {
            addCriterion("userpwd <", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdLessThanOrEqualTo(String value) {
            addCriterion("userpwd <=", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdLike(String value) {
            addCriterion("userpwd like", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotLike(String value) {
            addCriterion("userpwd not like", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdIn(List<String> values) {
            addCriterion("userpwd in", values, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotIn(List<String> values) {
            addCriterion("userpwd not in", values, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdBetween(String value1, String value2) {
            addCriterion("userpwd between", value1, value2, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotBetween(String value1, String value2) {
            addCriterion("userpwd not between", value1, value2, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUsableIsNull() {
            addCriterion("usable is null");
            return (Criteria) this;
        }

        public Criteria andUsableIsNotNull() {
            addCriterion("usable is not null");
            return (Criteria) this;
        }

        public Criteria andUsableEqualTo(Integer value) {
            addCriterion("usable =", value, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableNotEqualTo(Integer value) {
            addCriterion("usable <>", value, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableGreaterThan(Integer value) {
            addCriterion("usable >", value, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableGreaterThanOrEqualTo(Integer value) {
            addCriterion("usable >=", value, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableLessThan(Integer value) {
            addCriterion("usable <", value, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableLessThanOrEqualTo(Integer value) {
            addCriterion("usable <=", value, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableIn(List<Integer> values) {
            addCriterion("usable in", values, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableNotIn(List<Integer> values) {
            addCriterion("usable not in", values, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableBetween(Integer value1, Integer value2) {
            addCriterion("usable between", value1, value2, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableNotBetween(Integer value1, Integer value2) {
            addCriterion("usable not between", value1, value2, "usable");
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