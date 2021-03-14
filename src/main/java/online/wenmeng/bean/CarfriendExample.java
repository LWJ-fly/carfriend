package online.wenmeng.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarfriendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarfriendExample() {
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

        public Criteria andPoolinguseridIsNull() {
            addCriterion("poolinguserid is null");
            return (Criteria) this;
        }

        public Criteria andPoolinguseridIsNotNull() {
            addCriterion("poolinguserid is not null");
            return (Criteria) this;
        }

        public Criteria andPoolinguseridEqualTo(Integer value) {
            addCriterion("poolinguserid =", value, "poolinguserid");
            return (Criteria) this;
        }

        public Criteria andPoolinguseridNotEqualTo(Integer value) {
            addCriterion("poolinguserid <>", value, "poolinguserid");
            return (Criteria) this;
        }

        public Criteria andPoolinguseridGreaterThan(Integer value) {
            addCriterion("poolinguserid >", value, "poolinguserid");
            return (Criteria) this;
        }

        public Criteria andPoolinguseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("poolinguserid >=", value, "poolinguserid");
            return (Criteria) this;
        }

        public Criteria andPoolinguseridLessThan(Integer value) {
            addCriterion("poolinguserid <", value, "poolinguserid");
            return (Criteria) this;
        }

        public Criteria andPoolinguseridLessThanOrEqualTo(Integer value) {
            addCriterion("poolinguserid <=", value, "poolinguserid");
            return (Criteria) this;
        }

        public Criteria andPoolinguseridIn(List<Integer> values) {
            addCriterion("poolinguserid in", values, "poolinguserid");
            return (Criteria) this;
        }

        public Criteria andPoolinguseridNotIn(List<Integer> values) {
            addCriterion("poolinguserid not in", values, "poolinguserid");
            return (Criteria) this;
        }

        public Criteria andPoolinguseridBetween(Integer value1, Integer value2) {
            addCriterion("poolinguserid between", value1, value2, "poolinguserid");
            return (Criteria) this;
        }

        public Criteria andPoolinguseridNotBetween(Integer value1, Integer value2) {
            addCriterion("poolinguserid not between", value1, value2, "poolinguserid");
            return (Criteria) this;
        }

        public Criteria andUseridsIsNull() {
            addCriterion("userids is null");
            return (Criteria) this;
        }

        public Criteria andUseridsIsNotNull() {
            addCriterion("userids is not null");
            return (Criteria) this;
        }

        public Criteria andUseridsEqualTo(String value) {
            addCriterion("userids =", value, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsNotEqualTo(String value) {
            addCriterion("userids <>", value, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsGreaterThan(String value) {
            addCriterion("userids >", value, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsGreaterThanOrEqualTo(String value) {
            addCriterion("userids >=", value, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsLessThan(String value) {
            addCriterion("userids <", value, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsLessThanOrEqualTo(String value) {
            addCriterion("userids <=", value, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsLike(String value) {
            addCriterion("userids like", value, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsNotLike(String value) {
            addCriterion("userids not like", value, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsIn(List<String> values) {
            addCriterion("userids in", values, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsNotIn(List<String> values) {
            addCriterion("userids not in", values, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsBetween(String value1, String value2) {
            addCriterion("userids between", value1, value2, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsNotBetween(String value1, String value2) {
            addCriterion("userids not between", value1, value2, "userids");
            return (Criteria) this;
        }

        public Criteria andAboutpayIsNull() {
            addCriterion("aboutpay is null");
            return (Criteria) this;
        }

        public Criteria andAboutpayIsNotNull() {
            addCriterion("aboutpay is not null");
            return (Criteria) this;
        }

        public Criteria andAboutpayEqualTo(Double value) {
            addCriterion("aboutpay =", value, "aboutpay");
            return (Criteria) this;
        }

        public Criteria andAboutpayNotEqualTo(Double value) {
            addCriterion("aboutpay <>", value, "aboutpay");
            return (Criteria) this;
        }

        public Criteria andAboutpayGreaterThan(Double value) {
            addCriterion("aboutpay >", value, "aboutpay");
            return (Criteria) this;
        }

        public Criteria andAboutpayGreaterThanOrEqualTo(Double value) {
            addCriterion("aboutpay >=", value, "aboutpay");
            return (Criteria) this;
        }

        public Criteria andAboutpayLessThan(Double value) {
            addCriterion("aboutpay <", value, "aboutpay");
            return (Criteria) this;
        }

        public Criteria andAboutpayLessThanOrEqualTo(Double value) {
            addCriterion("aboutpay <=", value, "aboutpay");
            return (Criteria) this;
        }

        public Criteria andAboutpayIn(List<Double> values) {
            addCriterion("aboutpay in", values, "aboutpay");
            return (Criteria) this;
        }

        public Criteria andAboutpayNotIn(List<Double> values) {
            addCriterion("aboutpay not in", values, "aboutpay");
            return (Criteria) this;
        }

        public Criteria andAboutpayBetween(Double value1, Double value2) {
            addCriterion("aboutpay between", value1, value2, "aboutpay");
            return (Criteria) this;
        }

        public Criteria andAboutpayNotBetween(Double value1, Double value2) {
            addCriterion("aboutpay not between", value1, value2, "aboutpay");
            return (Criteria) this;
        }

        public Criteria andTotalnumIsNull() {
            addCriterion("totalnum is null");
            return (Criteria) this;
        }

        public Criteria andTotalnumIsNotNull() {
            addCriterion("totalnum is not null");
            return (Criteria) this;
        }

        public Criteria andTotalnumEqualTo(Integer value) {
            addCriterion("totalnum =", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumNotEqualTo(Integer value) {
            addCriterion("totalnum <>", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumGreaterThan(Integer value) {
            addCriterion("totalnum >", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalnum >=", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumLessThan(Integer value) {
            addCriterion("totalnum <", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumLessThanOrEqualTo(Integer value) {
            addCriterion("totalnum <=", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumIn(List<Integer> values) {
            addCriterion("totalnum in", values, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumNotIn(List<Integer> values) {
            addCriterion("totalnum not in", values, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumBetween(Integer value1, Integer value2) {
            addCriterion("totalnum between", value1, value2, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumNotBetween(Integer value1, Integer value2) {
            addCriterion("totalnum not between", value1, value2, "totalnum");
            return (Criteria) this;
        }

        public Criteria andGetnumIsNull() {
            addCriterion("getnum is null");
            return (Criteria) this;
        }

        public Criteria andGetnumIsNotNull() {
            addCriterion("getnum is not null");
            return (Criteria) this;
        }

        public Criteria andGetnumEqualTo(Integer value) {
            addCriterion("getnum =", value, "getnum");
            return (Criteria) this;
        }

        public Criteria andGetnumNotEqualTo(Integer value) {
            addCriterion("getnum <>", value, "getnum");
            return (Criteria) this;
        }

        public Criteria andGetnumGreaterThan(Integer value) {
            addCriterion("getnum >", value, "getnum");
            return (Criteria) this;
        }

        public Criteria andGetnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("getnum >=", value, "getnum");
            return (Criteria) this;
        }

        public Criteria andGetnumLessThan(Integer value) {
            addCriterion("getnum <", value, "getnum");
            return (Criteria) this;
        }

        public Criteria andGetnumLessThanOrEqualTo(Integer value) {
            addCriterion("getnum <=", value, "getnum");
            return (Criteria) this;
        }

        public Criteria andGetnumIn(List<Integer> values) {
            addCriterion("getnum in", values, "getnum");
            return (Criteria) this;
        }

        public Criteria andGetnumNotIn(List<Integer> values) {
            addCriterion("getnum not in", values, "getnum");
            return (Criteria) this;
        }

        public Criteria andGetnumBetween(Integer value1, Integer value2) {
            addCriterion("getnum between", value1, value2, "getnum");
            return (Criteria) this;
        }

        public Criteria andGetnumNotBetween(Integer value1, Integer value2) {
            addCriterion("getnum not between", value1, value2, "getnum");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("starttime not between", value1, value2, "starttime");
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

        public Criteria andReadtimeIsNull() {
            addCriterion("readtime is null");
            return (Criteria) this;
        }

        public Criteria andReadtimeIsNotNull() {
            addCriterion("readtime is not null");
            return (Criteria) this;
        }

        public Criteria andReadtimeEqualTo(Date value) {
            addCriterion("readtime =", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeNotEqualTo(Date value) {
            addCriterion("readtime <>", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeGreaterThan(Date value) {
            addCriterion("readtime >", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("readtime >=", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeLessThan(Date value) {
            addCriterion("readtime <", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeLessThanOrEqualTo(Date value) {
            addCriterion("readtime <=", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeIn(List<Date> values) {
            addCriterion("readtime in", values, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeNotIn(List<Date> values) {
            addCriterion("readtime not in", values, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeBetween(Date value1, Date value2) {
            addCriterion("readtime between", value1, value2, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeNotBetween(Date value1, Date value2) {
            addCriterion("readtime not between", value1, value2, "readtime");
            return (Criteria) this;
        }

        public Criteria andGotimeIsNull() {
            addCriterion("gotime is null");
            return (Criteria) this;
        }

        public Criteria andGotimeIsNotNull() {
            addCriterion("gotime is not null");
            return (Criteria) this;
        }

        public Criteria andGotimeEqualTo(Date value) {
            addCriterion("gotime =", value, "gotime");
            return (Criteria) this;
        }

        public Criteria andGotimeNotEqualTo(Date value) {
            addCriterion("gotime <>", value, "gotime");
            return (Criteria) this;
        }

        public Criteria andGotimeGreaterThan(Date value) {
            addCriterion("gotime >", value, "gotime");
            return (Criteria) this;
        }

        public Criteria andGotimeGreaterThanOrEqualTo(Date value) {
            addCriterion("gotime >=", value, "gotime");
            return (Criteria) this;
        }

        public Criteria andGotimeLessThan(Date value) {
            addCriterion("gotime <", value, "gotime");
            return (Criteria) this;
        }

        public Criteria andGotimeLessThanOrEqualTo(Date value) {
            addCriterion("gotime <=", value, "gotime");
            return (Criteria) this;
        }

        public Criteria andGotimeIn(List<Date> values) {
            addCriterion("gotime in", values, "gotime");
            return (Criteria) this;
        }

        public Criteria andGotimeNotIn(List<Date> values) {
            addCriterion("gotime not in", values, "gotime");
            return (Criteria) this;
        }

        public Criteria andGotimeBetween(Date value1, Date value2) {
            addCriterion("gotime between", value1, value2, "gotime");
            return (Criteria) this;
        }

        public Criteria andGotimeNotBetween(Date value1, Date value2) {
            addCriterion("gotime not between", value1, value2, "gotime");
            return (Criteria) this;
        }

        public Criteria andReadyplaceIsNull() {
            addCriterion("readyplace is null");
            return (Criteria) this;
        }

        public Criteria andReadyplaceIsNotNull() {
            addCriterion("readyplace is not null");
            return (Criteria) this;
        }

        public Criteria andReadyplaceEqualTo(String value) {
            addCriterion("readyplace =", value, "readyplace");
            return (Criteria) this;
        }

        public Criteria andReadyplaceNotEqualTo(String value) {
            addCriterion("readyplace <>", value, "readyplace");
            return (Criteria) this;
        }

        public Criteria andReadyplaceGreaterThan(String value) {
            addCriterion("readyplace >", value, "readyplace");
            return (Criteria) this;
        }

        public Criteria andReadyplaceGreaterThanOrEqualTo(String value) {
            addCriterion("readyplace >=", value, "readyplace");
            return (Criteria) this;
        }

        public Criteria andReadyplaceLessThan(String value) {
            addCriterion("readyplace <", value, "readyplace");
            return (Criteria) this;
        }

        public Criteria andReadyplaceLessThanOrEqualTo(String value) {
            addCriterion("readyplace <=", value, "readyplace");
            return (Criteria) this;
        }

        public Criteria andReadyplaceLike(String value) {
            addCriterion("readyplace like", value, "readyplace");
            return (Criteria) this;
        }

        public Criteria andReadyplaceNotLike(String value) {
            addCriterion("readyplace not like", value, "readyplace");
            return (Criteria) this;
        }

        public Criteria andReadyplaceIn(List<String> values) {
            addCriterion("readyplace in", values, "readyplace");
            return (Criteria) this;
        }

        public Criteria andReadyplaceNotIn(List<String> values) {
            addCriterion("readyplace not in", values, "readyplace");
            return (Criteria) this;
        }

        public Criteria andReadyplaceBetween(String value1, String value2) {
            addCriterion("readyplace between", value1, value2, "readyplace");
            return (Criteria) this;
        }

        public Criteria andReadyplaceNotBetween(String value1, String value2) {
            addCriterion("readyplace not between", value1, value2, "readyplace");
            return (Criteria) this;
        }

        public Criteria andGoplaceIsNull() {
            addCriterion("goplace is null");
            return (Criteria) this;
        }

        public Criteria andGoplaceIsNotNull() {
            addCriterion("goplace is not null");
            return (Criteria) this;
        }

        public Criteria andGoplaceEqualTo(String value) {
            addCriterion("goplace =", value, "goplace");
            return (Criteria) this;
        }

        public Criteria andGoplaceNotEqualTo(String value) {
            addCriterion("goplace <>", value, "goplace");
            return (Criteria) this;
        }

        public Criteria andGoplaceGreaterThan(String value) {
            addCriterion("goplace >", value, "goplace");
            return (Criteria) this;
        }

        public Criteria andGoplaceGreaterThanOrEqualTo(String value) {
            addCriterion("goplace >=", value, "goplace");
            return (Criteria) this;
        }

        public Criteria andGoplaceLessThan(String value) {
            addCriterion("goplace <", value, "goplace");
            return (Criteria) this;
        }

        public Criteria andGoplaceLessThanOrEqualTo(String value) {
            addCriterion("goplace <=", value, "goplace");
            return (Criteria) this;
        }

        public Criteria andGoplaceLike(String value) {
            addCriterion("goplace like", value, "goplace");
            return (Criteria) this;
        }

        public Criteria andGoplaceNotLike(String value) {
            addCriterion("goplace not like", value, "goplace");
            return (Criteria) this;
        }

        public Criteria andGoplaceIn(List<String> values) {
            addCriterion("goplace in", values, "goplace");
            return (Criteria) this;
        }

        public Criteria andGoplaceNotIn(List<String> values) {
            addCriterion("goplace not in", values, "goplace");
            return (Criteria) this;
        }

        public Criteria andGoplaceBetween(String value1, String value2) {
            addCriterion("goplace between", value1, value2, "goplace");
            return (Criteria) this;
        }

        public Criteria andGoplaceNotBetween(String value1, String value2) {
            addCriterion("goplace not between", value1, value2, "goplace");
            return (Criteria) this;
        }

        public Criteria andPoolinglimitIsNull() {
            addCriterion("poolinglimit is null");
            return (Criteria) this;
        }

        public Criteria andPoolinglimitIsNotNull() {
            addCriterion("poolinglimit is not null");
            return (Criteria) this;
        }

        public Criteria andPoolinglimitEqualTo(Integer value) {
            addCriterion("poolinglimit =", value, "poolinglimit");
            return (Criteria) this;
        }

        public Criteria andPoolinglimitNotEqualTo(Integer value) {
            addCriterion("poolinglimit <>", value, "poolinglimit");
            return (Criteria) this;
        }

        public Criteria andPoolinglimitGreaterThan(Integer value) {
            addCriterion("poolinglimit >", value, "poolinglimit");
            return (Criteria) this;
        }

        public Criteria andPoolinglimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("poolinglimit >=", value, "poolinglimit");
            return (Criteria) this;
        }

        public Criteria andPoolinglimitLessThan(Integer value) {
            addCriterion("poolinglimit <", value, "poolinglimit");
            return (Criteria) this;
        }

        public Criteria andPoolinglimitLessThanOrEqualTo(Integer value) {
            addCriterion("poolinglimit <=", value, "poolinglimit");
            return (Criteria) this;
        }

        public Criteria andPoolinglimitIn(List<Integer> values) {
            addCriterion("poolinglimit in", values, "poolinglimit");
            return (Criteria) this;
        }

        public Criteria andPoolinglimitNotIn(List<Integer> values) {
            addCriterion("poolinglimit not in", values, "poolinglimit");
            return (Criteria) this;
        }

        public Criteria andPoolinglimitBetween(Integer value1, Integer value2) {
            addCriterion("poolinglimit between", value1, value2, "poolinglimit");
            return (Criteria) this;
        }

        public Criteria andPoolinglimitNotBetween(Integer value1, Integer value2) {
            addCriterion("poolinglimit not between", value1, value2, "poolinglimit");
            return (Criteria) this;
        }

        public Criteria andPoolingstatusIsNull() {
            addCriterion("poolingstatus is null");
            return (Criteria) this;
        }

        public Criteria andPoolingstatusIsNotNull() {
            addCriterion("poolingstatus is not null");
            return (Criteria) this;
        }

        public Criteria andPoolingstatusEqualTo(Integer value) {
            addCriterion("poolingstatus =", value, "poolingstatus");
            return (Criteria) this;
        }

        public Criteria andPoolingstatusNotEqualTo(Integer value) {
            addCriterion("poolingstatus <>", value, "poolingstatus");
            return (Criteria) this;
        }

        public Criteria andPoolingstatusGreaterThan(Integer value) {
            addCriterion("poolingstatus >", value, "poolingstatus");
            return (Criteria) this;
        }

        public Criteria andPoolingstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("poolingstatus >=", value, "poolingstatus");
            return (Criteria) this;
        }

        public Criteria andPoolingstatusLessThan(Integer value) {
            addCriterion("poolingstatus <", value, "poolingstatus");
            return (Criteria) this;
        }

        public Criteria andPoolingstatusLessThanOrEqualTo(Integer value) {
            addCriterion("poolingstatus <=", value, "poolingstatus");
            return (Criteria) this;
        }

        public Criteria andPoolingstatusIn(List<Integer> values) {
            addCriterion("poolingstatus in", values, "poolingstatus");
            return (Criteria) this;
        }

        public Criteria andPoolingstatusNotIn(List<Integer> values) {
            addCriterion("poolingstatus not in", values, "poolingstatus");
            return (Criteria) this;
        }

        public Criteria andPoolingstatusBetween(Integer value1, Integer value2) {
            addCriterion("poolingstatus between", value1, value2, "poolingstatus");
            return (Criteria) this;
        }

        public Criteria andPoolingstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("poolingstatus not between", value1, value2, "poolingstatus");
            return (Criteria) this;
        }

        public Criteria andLeaveidsIsNull() {
            addCriterion("leaveids is null");
            return (Criteria) this;
        }

        public Criteria andLeaveidsIsNotNull() {
            addCriterion("leaveids is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveidsEqualTo(String value) {
            addCriterion("leaveids =", value, "leaveids");
            return (Criteria) this;
        }

        public Criteria andLeaveidsNotEqualTo(String value) {
            addCriterion("leaveids <>", value, "leaveids");
            return (Criteria) this;
        }

        public Criteria andLeaveidsGreaterThan(String value) {
            addCriterion("leaveids >", value, "leaveids");
            return (Criteria) this;
        }

        public Criteria andLeaveidsGreaterThanOrEqualTo(String value) {
            addCriterion("leaveids >=", value, "leaveids");
            return (Criteria) this;
        }

        public Criteria andLeaveidsLessThan(String value) {
            addCriterion("leaveids <", value, "leaveids");
            return (Criteria) this;
        }

        public Criteria andLeaveidsLessThanOrEqualTo(String value) {
            addCriterion("leaveids <=", value, "leaveids");
            return (Criteria) this;
        }

        public Criteria andLeaveidsLike(String value) {
            addCriterion("leaveids like", value, "leaveids");
            return (Criteria) this;
        }

        public Criteria andLeaveidsNotLike(String value) {
            addCriterion("leaveids not like", value, "leaveids");
            return (Criteria) this;
        }

        public Criteria andLeaveidsIn(List<String> values) {
            addCriterion("leaveids in", values, "leaveids");
            return (Criteria) this;
        }

        public Criteria andLeaveidsNotIn(List<String> values) {
            addCriterion("leaveids not in", values, "leaveids");
            return (Criteria) this;
        }

        public Criteria andLeaveidsBetween(String value1, String value2) {
            addCriterion("leaveids between", value1, value2, "leaveids");
            return (Criteria) this;
        }

        public Criteria andLeaveidsNotBetween(String value1, String value2) {
            addCriterion("leaveids not between", value1, value2, "leaveids");
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