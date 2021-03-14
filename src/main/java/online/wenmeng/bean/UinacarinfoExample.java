package online.wenmeng.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UinacarinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UinacarinfoExample() {
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

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andChatheadIsNull() {
            addCriterion("chathead is null");
            return (Criteria) this;
        }

        public Criteria andChatheadIsNotNull() {
            addCriterion("chathead is not null");
            return (Criteria) this;
        }

        public Criteria andChatheadEqualTo(String value) {
            addCriterion("chathead =", value, "chathead");
            return (Criteria) this;
        }

        public Criteria andChatheadNotEqualTo(String value) {
            addCriterion("chathead <>", value, "chathead");
            return (Criteria) this;
        }

        public Criteria andChatheadGreaterThan(String value) {
            addCriterion("chathead >", value, "chathead");
            return (Criteria) this;
        }

        public Criteria andChatheadGreaterThanOrEqualTo(String value) {
            addCriterion("chathead >=", value, "chathead");
            return (Criteria) this;
        }

        public Criteria andChatheadLessThan(String value) {
            addCriterion("chathead <", value, "chathead");
            return (Criteria) this;
        }

        public Criteria andChatheadLessThanOrEqualTo(String value) {
            addCriterion("chathead <=", value, "chathead");
            return (Criteria) this;
        }

        public Criteria andChatheadLike(String value) {
            addCriterion("chathead like", value, "chathead");
            return (Criteria) this;
        }

        public Criteria andChatheadNotLike(String value) {
            addCriterion("chathead not like", value, "chathead");
            return (Criteria) this;
        }

        public Criteria andChatheadIn(List<String> values) {
            addCriterion("chathead in", values, "chathead");
            return (Criteria) this;
        }

        public Criteria andChatheadNotIn(List<String> values) {
            addCriterion("chathead not in", values, "chathead");
            return (Criteria) this;
        }

        public Criteria andChatheadBetween(String value1, String value2) {
            addCriterion("chathead between", value1, value2, "chathead");
            return (Criteria) this;
        }

        public Criteria andChatheadNotBetween(String value1, String value2) {
            addCriterion("chathead not between", value1, value2, "chathead");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andIncarmsgIsNull() {
            addCriterion("incarmsg is null");
            return (Criteria) this;
        }

        public Criteria andIncarmsgIsNotNull() {
            addCriterion("incarmsg is not null");
            return (Criteria) this;
        }

        public Criteria andIncarmsgEqualTo(String value) {
            addCriterion("incarmsg =", value, "incarmsg");
            return (Criteria) this;
        }

        public Criteria andIncarmsgNotEqualTo(String value) {
            addCriterion("incarmsg <>", value, "incarmsg");
            return (Criteria) this;
        }

        public Criteria andIncarmsgGreaterThan(String value) {
            addCriterion("incarmsg >", value, "incarmsg");
            return (Criteria) this;
        }

        public Criteria andIncarmsgGreaterThanOrEqualTo(String value) {
            addCriterion("incarmsg >=", value, "incarmsg");
            return (Criteria) this;
        }

        public Criteria andIncarmsgLessThan(String value) {
            addCriterion("incarmsg <", value, "incarmsg");
            return (Criteria) this;
        }

        public Criteria andIncarmsgLessThanOrEqualTo(String value) {
            addCriterion("incarmsg <=", value, "incarmsg");
            return (Criteria) this;
        }

        public Criteria andIncarmsgLike(String value) {
            addCriterion("incarmsg like", value, "incarmsg");
            return (Criteria) this;
        }

        public Criteria andIncarmsgNotLike(String value) {
            addCriterion("incarmsg not like", value, "incarmsg");
            return (Criteria) this;
        }

        public Criteria andIncarmsgIn(List<String> values) {
            addCriterion("incarmsg in", values, "incarmsg");
            return (Criteria) this;
        }

        public Criteria andIncarmsgNotIn(List<String> values) {
            addCriterion("incarmsg not in", values, "incarmsg");
            return (Criteria) this;
        }

        public Criteria andIncarmsgBetween(String value1, String value2) {
            addCriterion("incarmsg between", value1, value2, "incarmsg");
            return (Criteria) this;
        }

        public Criteria andIncarmsgNotBetween(String value1, String value2) {
            addCriterion("incarmsg not between", value1, value2, "incarmsg");
            return (Criteria) this;
        }

        public Criteria andJointimeIsNull() {
            addCriterion("jointime is null");
            return (Criteria) this;
        }

        public Criteria andJointimeIsNotNull() {
            addCriterion("jointime is not null");
            return (Criteria) this;
        }

        public Criteria andJointimeEqualTo(Date value) {
            addCriterion("jointime =", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeNotEqualTo(Date value) {
            addCriterion("jointime <>", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeGreaterThan(Date value) {
            addCriterion("jointime >", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeGreaterThanOrEqualTo(Date value) {
            addCriterion("jointime >=", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeLessThan(Date value) {
            addCriterion("jointime <", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeLessThanOrEqualTo(Date value) {
            addCriterion("jointime <=", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeIn(List<Date> values) {
            addCriterion("jointime in", values, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeNotIn(List<Date> values) {
            addCriterion("jointime not in", values, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeBetween(Date value1, Date value2) {
            addCriterion("jointime between", value1, value2, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeNotBetween(Date value1, Date value2) {
            addCriterion("jointime not between", value1, value2, "jointime");
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

        public Criteria andInstatusIsNull() {
            addCriterion("instatus is null");
            return (Criteria) this;
        }

        public Criteria andInstatusIsNotNull() {
            addCriterion("instatus is not null");
            return (Criteria) this;
        }

        public Criteria andInstatusEqualTo(Integer value) {
            addCriterion("instatus =", value, "instatus");
            return (Criteria) this;
        }

        public Criteria andInstatusNotEqualTo(Integer value) {
            addCriterion("instatus <>", value, "instatus");
            return (Criteria) this;
        }

        public Criteria andInstatusGreaterThan(Integer value) {
            addCriterion("instatus >", value, "instatus");
            return (Criteria) this;
        }

        public Criteria andInstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("instatus >=", value, "instatus");
            return (Criteria) this;
        }

        public Criteria andInstatusLessThan(Integer value) {
            addCriterion("instatus <", value, "instatus");
            return (Criteria) this;
        }

        public Criteria andInstatusLessThanOrEqualTo(Integer value) {
            addCriterion("instatus <=", value, "instatus");
            return (Criteria) this;
        }

        public Criteria andInstatusIn(List<Integer> values) {
            addCriterion("instatus in", values, "instatus");
            return (Criteria) this;
        }

        public Criteria andInstatusNotIn(List<Integer> values) {
            addCriterion("instatus not in", values, "instatus");
            return (Criteria) this;
        }

        public Criteria andInstatusBetween(Integer value1, Integer value2) {
            addCriterion("instatus between", value1, value2, "instatus");
            return (Criteria) this;
        }

        public Criteria andInstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("instatus not between", value1, value2, "instatus");
            return (Criteria) this;
        }

        public Criteria andOutinfoIsNull() {
            addCriterion("outinfo is null");
            return (Criteria) this;
        }

        public Criteria andOutinfoIsNotNull() {
            addCriterion("outinfo is not null");
            return (Criteria) this;
        }

        public Criteria andOutinfoEqualTo(Integer value) {
            addCriterion("outinfo =", value, "outinfo");
            return (Criteria) this;
        }

        public Criteria andOutinfoNotEqualTo(Integer value) {
            addCriterion("outinfo <>", value, "outinfo");
            return (Criteria) this;
        }

        public Criteria andOutinfoGreaterThan(Integer value) {
            addCriterion("outinfo >", value, "outinfo");
            return (Criteria) this;
        }

        public Criteria andOutinfoGreaterThanOrEqualTo(Integer value) {
            addCriterion("outinfo >=", value, "outinfo");
            return (Criteria) this;
        }

        public Criteria andOutinfoLessThan(Integer value) {
            addCriterion("outinfo <", value, "outinfo");
            return (Criteria) this;
        }

        public Criteria andOutinfoLessThanOrEqualTo(Integer value) {
            addCriterion("outinfo <=", value, "outinfo");
            return (Criteria) this;
        }

        public Criteria andOutinfoIn(List<Integer> values) {
            addCriterion("outinfo in", values, "outinfo");
            return (Criteria) this;
        }

        public Criteria andOutinfoNotIn(List<Integer> values) {
            addCriterion("outinfo not in", values, "outinfo");
            return (Criteria) this;
        }

        public Criteria andOutinfoBetween(Integer value1, Integer value2) {
            addCriterion("outinfo between", value1, value2, "outinfo");
            return (Criteria) this;
        }

        public Criteria andOutinfoNotBetween(Integer value1, Integer value2) {
            addCriterion("outinfo not between", value1, value2, "outinfo");
            return (Criteria) this;
        }

        public Criteria andQqnumIsNull() {
            addCriterion("qqnum is null");
            return (Criteria) this;
        }

        public Criteria andQqnumIsNotNull() {
            addCriterion("qqnum is not null");
            return (Criteria) this;
        }

        public Criteria andQqnumEqualTo(String value) {
            addCriterion("qqnum =", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumNotEqualTo(String value) {
            addCriterion("qqnum <>", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumGreaterThan(String value) {
            addCriterion("qqnum >", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumGreaterThanOrEqualTo(String value) {
            addCriterion("qqnum >=", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumLessThan(String value) {
            addCriterion("qqnum <", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumLessThanOrEqualTo(String value) {
            addCriterion("qqnum <=", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumLike(String value) {
            addCriterion("qqnum like", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumNotLike(String value) {
            addCriterion("qqnum not like", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumIn(List<String> values) {
            addCriterion("qqnum in", values, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumNotIn(List<String> values) {
            addCriterion("qqnum not in", values, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumBetween(String value1, String value2) {
            addCriterion("qqnum between", value1, value2, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumNotBetween(String value1, String value2) {
            addCriterion("qqnum not between", value1, value2, "qqnum");
            return (Criteria) this;
        }

        public Criteria andWxnumIsNull() {
            addCriterion("wxnum is null");
            return (Criteria) this;
        }

        public Criteria andWxnumIsNotNull() {
            addCriterion("wxnum is not null");
            return (Criteria) this;
        }

        public Criteria andWxnumEqualTo(String value) {
            addCriterion("wxnum =", value, "wxnum");
            return (Criteria) this;
        }

        public Criteria andWxnumNotEqualTo(String value) {
            addCriterion("wxnum <>", value, "wxnum");
            return (Criteria) this;
        }

        public Criteria andWxnumGreaterThan(String value) {
            addCriterion("wxnum >", value, "wxnum");
            return (Criteria) this;
        }

        public Criteria andWxnumGreaterThanOrEqualTo(String value) {
            addCriterion("wxnum >=", value, "wxnum");
            return (Criteria) this;
        }

        public Criteria andWxnumLessThan(String value) {
            addCriterion("wxnum <", value, "wxnum");
            return (Criteria) this;
        }

        public Criteria andWxnumLessThanOrEqualTo(String value) {
            addCriterion("wxnum <=", value, "wxnum");
            return (Criteria) this;
        }

        public Criteria andWxnumLike(String value) {
            addCriterion("wxnum like", value, "wxnum");
            return (Criteria) this;
        }

        public Criteria andWxnumNotLike(String value) {
            addCriterion("wxnum not like", value, "wxnum");
            return (Criteria) this;
        }

        public Criteria andWxnumIn(List<String> values) {
            addCriterion("wxnum in", values, "wxnum");
            return (Criteria) this;
        }

        public Criteria andWxnumNotIn(List<String> values) {
            addCriterion("wxnum not in", values, "wxnum");
            return (Criteria) this;
        }

        public Criteria andWxnumBetween(String value1, String value2) {
            addCriterion("wxnum between", value1, value2, "wxnum");
            return (Criteria) this;
        }

        public Criteria andWxnumNotBetween(String value1, String value2) {
            addCriterion("wxnum not between", value1, value2, "wxnum");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(Long value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(Long value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(Long value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(Long value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(Long value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(Long value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<Long> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<Long> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(Long value1, Long value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(Long value1, Long value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
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