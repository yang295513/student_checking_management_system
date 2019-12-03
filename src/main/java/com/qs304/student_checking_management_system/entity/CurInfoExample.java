package com.qs304.student_checking_management_system.entity;

import java.util.ArrayList;
import java.util.List;

public class CurInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CurInfoExample() {
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

        public Criteria andCurIdIsNull() {
            addCriterion("cur_id is null");
            return (Criteria) this;
        }

        public Criteria andCurIdIsNotNull() {
            addCriterion("cur_id is not null");
            return (Criteria) this;
        }

        public Criteria andCurIdEqualTo(Integer value) {
            addCriterion("cur_id =", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdNotEqualTo(Integer value) {
            addCriterion("cur_id <>", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdGreaterThan(Integer value) {
            addCriterion("cur_id >", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cur_id >=", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdLessThan(Integer value) {
            addCriterion("cur_id <", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdLessThanOrEqualTo(Integer value) {
            addCriterion("cur_id <=", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdIn(List<Integer> values) {
            addCriterion("cur_id in", values, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdNotIn(List<Integer> values) {
            addCriterion("cur_id not in", values, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdBetween(Integer value1, Integer value2) {
            addCriterion("cur_id between", value1, value2, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cur_id not between", value1, value2, "curId");
            return (Criteria) this;
        }

        public Criteria andCurNameIsNull() {
            addCriterion("cur_name is null");
            return (Criteria) this;
        }

        public Criteria andCurNameIsNotNull() {
            addCriterion("cur_name is not null");
            return (Criteria) this;
        }

        public Criteria andCurNameEqualTo(String value) {
            addCriterion("cur_name =", value, "curName");
            return (Criteria) this;
        }

        public Criteria andCurNameNotEqualTo(String value) {
            addCriterion("cur_name <>", value, "curName");
            return (Criteria) this;
        }

        public Criteria andCurNameGreaterThan(String value) {
            addCriterion("cur_name >", value, "curName");
            return (Criteria) this;
        }

        public Criteria andCurNameGreaterThanOrEqualTo(String value) {
            addCriterion("cur_name >=", value, "curName");
            return (Criteria) this;
        }

        public Criteria andCurNameLessThan(String value) {
            addCriterion("cur_name <", value, "curName");
            return (Criteria) this;
        }

        public Criteria andCurNameLessThanOrEqualTo(String value) {
            addCriterion("cur_name <=", value, "curName");
            return (Criteria) this;
        }

        public Criteria andCurNameLike(String value) {
            addCriterion("cur_name like", value, "curName");
            return (Criteria) this;
        }

        public Criteria andCurNameNotLike(String value) {
            addCriterion("cur_name not like", value, "curName");
            return (Criteria) this;
        }

        public Criteria andCurNameIn(List<String> values) {
            addCriterion("cur_name in", values, "curName");
            return (Criteria) this;
        }

        public Criteria andCurNameNotIn(List<String> values) {
            addCriterion("cur_name not in", values, "curName");
            return (Criteria) this;
        }

        public Criteria andCurNameBetween(String value1, String value2) {
            addCriterion("cur_name between", value1, value2, "curName");
            return (Criteria) this;
        }

        public Criteria andCurNameNotBetween(String value1, String value2) {
            addCriterion("cur_name not between", value1, value2, "curName");
            return (Criteria) this;
        }

        public Criteria andCurLearntimeIsNull() {
            addCriterion("cur_learnTime is null");
            return (Criteria) this;
        }

        public Criteria andCurLearntimeIsNotNull() {
            addCriterion("cur_learnTime is not null");
            return (Criteria) this;
        }

        public Criteria andCurLearntimeEqualTo(Integer value) {
            addCriterion("cur_learnTime =", value, "curLearntime");
            return (Criteria) this;
        }

        public Criteria andCurLearntimeNotEqualTo(Integer value) {
            addCriterion("cur_learnTime <>", value, "curLearntime");
            return (Criteria) this;
        }

        public Criteria andCurLearntimeGreaterThan(Integer value) {
            addCriterion("cur_learnTime >", value, "curLearntime");
            return (Criteria) this;
        }

        public Criteria andCurLearntimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cur_learnTime >=", value, "curLearntime");
            return (Criteria) this;
        }

        public Criteria andCurLearntimeLessThan(Integer value) {
            addCriterion("cur_learnTime <", value, "curLearntime");
            return (Criteria) this;
        }

        public Criteria andCurLearntimeLessThanOrEqualTo(Integer value) {
            addCriterion("cur_learnTime <=", value, "curLearntime");
            return (Criteria) this;
        }

        public Criteria andCurLearntimeIn(List<Integer> values) {
            addCriterion("cur_learnTime in", values, "curLearntime");
            return (Criteria) this;
        }

        public Criteria andCurLearntimeNotIn(List<Integer> values) {
            addCriterion("cur_learnTime not in", values, "curLearntime");
            return (Criteria) this;
        }

        public Criteria andCurLearntimeBetween(Integer value1, Integer value2) {
            addCriterion("cur_learnTime between", value1, value2, "curLearntime");
            return (Criteria) this;
        }

        public Criteria andCurLearntimeNotBetween(Integer value1, Integer value2) {
            addCriterion("cur_learnTime not between", value1, value2, "curLearntime");
            return (Criteria) this;
        }

        public Criteria andCurScoreIsNull() {
            addCriterion("cur_score is null");
            return (Criteria) this;
        }

        public Criteria andCurScoreIsNotNull() {
            addCriterion("cur_score is not null");
            return (Criteria) this;
        }

        public Criteria andCurScoreEqualTo(Integer value) {
            addCriterion("cur_score =", value, "curScore");
            return (Criteria) this;
        }

        public Criteria andCurScoreNotEqualTo(Integer value) {
            addCriterion("cur_score <>", value, "curScore");
            return (Criteria) this;
        }

        public Criteria andCurScoreGreaterThan(Integer value) {
            addCriterion("cur_score >", value, "curScore");
            return (Criteria) this;
        }

        public Criteria andCurScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("cur_score >=", value, "curScore");
            return (Criteria) this;
        }

        public Criteria andCurScoreLessThan(Integer value) {
            addCriterion("cur_score <", value, "curScore");
            return (Criteria) this;
        }

        public Criteria andCurScoreLessThanOrEqualTo(Integer value) {
            addCriterion("cur_score <=", value, "curScore");
            return (Criteria) this;
        }

        public Criteria andCurScoreIn(List<Integer> values) {
            addCriterion("cur_score in", values, "curScore");
            return (Criteria) this;
        }

        public Criteria andCurScoreNotIn(List<Integer> values) {
            addCriterion("cur_score not in", values, "curScore");
            return (Criteria) this;
        }

        public Criteria andCurScoreBetween(Integer value1, Integer value2) {
            addCriterion("cur_score between", value1, value2, "curScore");
            return (Criteria) this;
        }

        public Criteria andCurScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("cur_score not between", value1, value2, "curScore");
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