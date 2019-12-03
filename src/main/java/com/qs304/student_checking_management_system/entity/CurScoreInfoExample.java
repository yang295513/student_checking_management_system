package com.qs304.student_checking_management_system.entity;

import java.util.ArrayList;
import java.util.List;

public class CurScoreInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CurScoreInfoExample() {
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

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(Integer value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(Integer value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(Integer value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(Integer value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(Integer value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<Integer> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<Integer> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(Integer value1, Integer value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
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

        public Criteria andCurUsuscoreIsNull() {
            addCriterion("cur_usuScore is null");
            return (Criteria) this;
        }

        public Criteria andCurUsuscoreIsNotNull() {
            addCriterion("cur_usuScore is not null");
            return (Criteria) this;
        }

        public Criteria andCurUsuscoreEqualTo(Double value) {
            addCriterion("cur_usuScore =", value, "curUsuscore");
            return (Criteria) this;
        }

        public Criteria andCurUsuscoreNotEqualTo(Double value) {
            addCriterion("cur_usuScore <>", value, "curUsuscore");
            return (Criteria) this;
        }

        public Criteria andCurUsuscoreGreaterThan(Double value) {
            addCriterion("cur_usuScore >", value, "curUsuscore");
            return (Criteria) this;
        }

        public Criteria andCurUsuscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("cur_usuScore >=", value, "curUsuscore");
            return (Criteria) this;
        }

        public Criteria andCurUsuscoreLessThan(Double value) {
            addCriterion("cur_usuScore <", value, "curUsuscore");
            return (Criteria) this;
        }

        public Criteria andCurUsuscoreLessThanOrEqualTo(Double value) {
            addCriterion("cur_usuScore <=", value, "curUsuscore");
            return (Criteria) this;
        }

        public Criteria andCurUsuscoreIn(List<Double> values) {
            addCriterion("cur_usuScore in", values, "curUsuscore");
            return (Criteria) this;
        }

        public Criteria andCurUsuscoreNotIn(List<Double> values) {
            addCriterion("cur_usuScore not in", values, "curUsuscore");
            return (Criteria) this;
        }

        public Criteria andCurUsuscoreBetween(Double value1, Double value2) {
            addCriterion("cur_usuScore between", value1, value2, "curUsuscore");
            return (Criteria) this;
        }

        public Criteria andCurUsuscoreNotBetween(Double value1, Double value2) {
            addCriterion("cur_usuScore not between", value1, value2, "curUsuscore");
            return (Criteria) this;
        }

        public Criteria andCurFinalscoreIsNull() {
            addCriterion("cur_finalScore is null");
            return (Criteria) this;
        }

        public Criteria andCurFinalscoreIsNotNull() {
            addCriterion("cur_finalScore is not null");
            return (Criteria) this;
        }

        public Criteria andCurFinalscoreEqualTo(Double value) {
            addCriterion("cur_finalScore =", value, "curFinalscore");
            return (Criteria) this;
        }

        public Criteria andCurFinalscoreNotEqualTo(Double value) {
            addCriterion("cur_finalScore <>", value, "curFinalscore");
            return (Criteria) this;
        }

        public Criteria andCurFinalscoreGreaterThan(Double value) {
            addCriterion("cur_finalScore >", value, "curFinalscore");
            return (Criteria) this;
        }

        public Criteria andCurFinalscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("cur_finalScore >=", value, "curFinalscore");
            return (Criteria) this;
        }

        public Criteria andCurFinalscoreLessThan(Double value) {
            addCriterion("cur_finalScore <", value, "curFinalscore");
            return (Criteria) this;
        }

        public Criteria andCurFinalscoreLessThanOrEqualTo(Double value) {
            addCriterion("cur_finalScore <=", value, "curFinalscore");
            return (Criteria) this;
        }

        public Criteria andCurFinalscoreIn(List<Double> values) {
            addCriterion("cur_finalScore in", values, "curFinalscore");
            return (Criteria) this;
        }

        public Criteria andCurFinalscoreNotIn(List<Double> values) {
            addCriterion("cur_finalScore not in", values, "curFinalscore");
            return (Criteria) this;
        }

        public Criteria andCurFinalscoreBetween(Double value1, Double value2) {
            addCriterion("cur_finalScore between", value1, value2, "curFinalscore");
            return (Criteria) this;
        }

        public Criteria andCurFinalscoreNotBetween(Double value1, Double value2) {
            addCriterion("cur_finalScore not between", value1, value2, "curFinalscore");
            return (Criteria) this;
        }

        public Criteria andCurSumFinalscoreIsNull() {
            addCriterion("cur_sum_finalScore is null");
            return (Criteria) this;
        }

        public Criteria andCurSumFinalscoreIsNotNull() {
            addCriterion("cur_sum_finalScore is not null");
            return (Criteria) this;
        }

        public Criteria andCurSumFinalscoreEqualTo(Double value) {
            addCriterion("cur_sum_finalScore =", value, "curSumFinalscore");
            return (Criteria) this;
        }

        public Criteria andCurSumFinalscoreNotEqualTo(Double value) {
            addCriterion("cur_sum_finalScore <>", value, "curSumFinalscore");
            return (Criteria) this;
        }

        public Criteria andCurSumFinalscoreGreaterThan(Double value) {
            addCriterion("cur_sum_finalScore >", value, "curSumFinalscore");
            return (Criteria) this;
        }

        public Criteria andCurSumFinalscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("cur_sum_finalScore >=", value, "curSumFinalscore");
            return (Criteria) this;
        }

        public Criteria andCurSumFinalscoreLessThan(Double value) {
            addCriterion("cur_sum_finalScore <", value, "curSumFinalscore");
            return (Criteria) this;
        }

        public Criteria andCurSumFinalscoreLessThanOrEqualTo(Double value) {
            addCriterion("cur_sum_finalScore <=", value, "curSumFinalscore");
            return (Criteria) this;
        }

        public Criteria andCurSumFinalscoreIn(List<Double> values) {
            addCriterion("cur_sum_finalScore in", values, "curSumFinalscore");
            return (Criteria) this;
        }

        public Criteria andCurSumFinalscoreNotIn(List<Double> values) {
            addCriterion("cur_sum_finalScore not in", values, "curSumFinalscore");
            return (Criteria) this;
        }

        public Criteria andCurSumFinalscoreBetween(Double value1, Double value2) {
            addCriterion("cur_sum_finalScore between", value1, value2, "curSumFinalscore");
            return (Criteria) this;
        }

        public Criteria andCurSumFinalscoreNotBetween(Double value1, Double value2) {
            addCriterion("cur_sum_finalScore not between", value1, value2, "curSumFinalscore");
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