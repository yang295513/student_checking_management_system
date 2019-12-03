package com.qs304.student_checking_management_system.entity;

import java.util.ArrayList;
import java.util.List;

public class ClassScoreInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassScoreInfoExample() {
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

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Integer value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Integer value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Integer value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Integer value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Integer> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Integer> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Integer value1, Integer value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassSumUsuscoreIsNull() {
            addCriterion("class_sum_usuScore is null");
            return (Criteria) this;
        }

        public Criteria andClassSumUsuscoreIsNotNull() {
            addCriterion("class_sum_usuScore is not null");
            return (Criteria) this;
        }

        public Criteria andClassSumUsuscoreEqualTo(Double value) {
            addCriterion("class_sum_usuScore =", value, "classSumUsuscore");
            return (Criteria) this;
        }

        public Criteria andClassSumUsuscoreNotEqualTo(Double value) {
            addCriterion("class_sum_usuScore <>", value, "classSumUsuscore");
            return (Criteria) this;
        }

        public Criteria andClassSumUsuscoreGreaterThan(Double value) {
            addCriterion("class_sum_usuScore >", value, "classSumUsuscore");
            return (Criteria) this;
        }

        public Criteria andClassSumUsuscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("class_sum_usuScore >=", value, "classSumUsuscore");
            return (Criteria) this;
        }

        public Criteria andClassSumUsuscoreLessThan(Double value) {
            addCriterion("class_sum_usuScore <", value, "classSumUsuscore");
            return (Criteria) this;
        }

        public Criteria andClassSumUsuscoreLessThanOrEqualTo(Double value) {
            addCriterion("class_sum_usuScore <=", value, "classSumUsuscore");
            return (Criteria) this;
        }

        public Criteria andClassSumUsuscoreIn(List<Double> values) {
            addCriterion("class_sum_usuScore in", values, "classSumUsuscore");
            return (Criteria) this;
        }

        public Criteria andClassSumUsuscoreNotIn(List<Double> values) {
            addCriterion("class_sum_usuScore not in", values, "classSumUsuscore");
            return (Criteria) this;
        }

        public Criteria andClassSumUsuscoreBetween(Double value1, Double value2) {
            addCriterion("class_sum_usuScore between", value1, value2, "classSumUsuscore");
            return (Criteria) this;
        }

        public Criteria andClassSumUsuscoreNotBetween(Double value1, Double value2) {
            addCriterion("class_sum_usuScore not between", value1, value2, "classSumUsuscore");
            return (Criteria) this;
        }

        public Criteria andClassAvgUsuscoreIsNull() {
            addCriterion("class_avg_usuScore is null");
            return (Criteria) this;
        }

        public Criteria andClassAvgUsuscoreIsNotNull() {
            addCriterion("class_avg_usuScore is not null");
            return (Criteria) this;
        }

        public Criteria andClassAvgUsuscoreEqualTo(Double value) {
            addCriterion("class_avg_usuScore =", value, "classAvgUsuscore");
            return (Criteria) this;
        }

        public Criteria andClassAvgUsuscoreNotEqualTo(Double value) {
            addCriterion("class_avg_usuScore <>", value, "classAvgUsuscore");
            return (Criteria) this;
        }

        public Criteria andClassAvgUsuscoreGreaterThan(Double value) {
            addCriterion("class_avg_usuScore >", value, "classAvgUsuscore");
            return (Criteria) this;
        }

        public Criteria andClassAvgUsuscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("class_avg_usuScore >=", value, "classAvgUsuscore");
            return (Criteria) this;
        }

        public Criteria andClassAvgUsuscoreLessThan(Double value) {
            addCriterion("class_avg_usuScore <", value, "classAvgUsuscore");
            return (Criteria) this;
        }

        public Criteria andClassAvgUsuscoreLessThanOrEqualTo(Double value) {
            addCriterion("class_avg_usuScore <=", value, "classAvgUsuscore");
            return (Criteria) this;
        }

        public Criteria andClassAvgUsuscoreIn(List<Double> values) {
            addCriterion("class_avg_usuScore in", values, "classAvgUsuscore");
            return (Criteria) this;
        }

        public Criteria andClassAvgUsuscoreNotIn(List<Double> values) {
            addCriterion("class_avg_usuScore not in", values, "classAvgUsuscore");
            return (Criteria) this;
        }

        public Criteria andClassAvgUsuscoreBetween(Double value1, Double value2) {
            addCriterion("class_avg_usuScore between", value1, value2, "classAvgUsuscore");
            return (Criteria) this;
        }

        public Criteria andClassAvgUsuscoreNotBetween(Double value1, Double value2) {
            addCriterion("class_avg_usuScore not between", value1, value2, "classAvgUsuscore");
            return (Criteria) this;
        }

        public Criteria andClassSumTestscoreIsNull() {
            addCriterion("class_sum_testScore is null");
            return (Criteria) this;
        }

        public Criteria andClassSumTestscoreIsNotNull() {
            addCriterion("class_sum_testScore is not null");
            return (Criteria) this;
        }

        public Criteria andClassSumTestscoreEqualTo(Double value) {
            addCriterion("class_sum_testScore =", value, "classSumTestscore");
            return (Criteria) this;
        }

        public Criteria andClassSumTestscoreNotEqualTo(Double value) {
            addCriterion("class_sum_testScore <>", value, "classSumTestscore");
            return (Criteria) this;
        }

        public Criteria andClassSumTestscoreGreaterThan(Double value) {
            addCriterion("class_sum_testScore >", value, "classSumTestscore");
            return (Criteria) this;
        }

        public Criteria andClassSumTestscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("class_sum_testScore >=", value, "classSumTestscore");
            return (Criteria) this;
        }

        public Criteria andClassSumTestscoreLessThan(Double value) {
            addCriterion("class_sum_testScore <", value, "classSumTestscore");
            return (Criteria) this;
        }

        public Criteria andClassSumTestscoreLessThanOrEqualTo(Double value) {
            addCriterion("class_sum_testScore <=", value, "classSumTestscore");
            return (Criteria) this;
        }

        public Criteria andClassSumTestscoreIn(List<Double> values) {
            addCriterion("class_sum_testScore in", values, "classSumTestscore");
            return (Criteria) this;
        }

        public Criteria andClassSumTestscoreNotIn(List<Double> values) {
            addCriterion("class_sum_testScore not in", values, "classSumTestscore");
            return (Criteria) this;
        }

        public Criteria andClassSumTestscoreBetween(Double value1, Double value2) {
            addCriterion("class_sum_testScore between", value1, value2, "classSumTestscore");
            return (Criteria) this;
        }

        public Criteria andClassSumTestscoreNotBetween(Double value1, Double value2) {
            addCriterion("class_sum_testScore not between", value1, value2, "classSumTestscore");
            return (Criteria) this;
        }

        public Criteria andClassAvgTestscoreIsNull() {
            addCriterion("class_avg_testScore is null");
            return (Criteria) this;
        }

        public Criteria andClassAvgTestscoreIsNotNull() {
            addCriterion("class_avg_testScore is not null");
            return (Criteria) this;
        }

        public Criteria andClassAvgTestscoreEqualTo(Double value) {
            addCriterion("class_avg_testScore =", value, "classAvgTestscore");
            return (Criteria) this;
        }

        public Criteria andClassAvgTestscoreNotEqualTo(Double value) {
            addCriterion("class_avg_testScore <>", value, "classAvgTestscore");
            return (Criteria) this;
        }

        public Criteria andClassAvgTestscoreGreaterThan(Double value) {
            addCriterion("class_avg_testScore >", value, "classAvgTestscore");
            return (Criteria) this;
        }

        public Criteria andClassAvgTestscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("class_avg_testScore >=", value, "classAvgTestscore");
            return (Criteria) this;
        }

        public Criteria andClassAvgTestscoreLessThan(Double value) {
            addCriterion("class_avg_testScore <", value, "classAvgTestscore");
            return (Criteria) this;
        }

        public Criteria andClassAvgTestscoreLessThanOrEqualTo(Double value) {
            addCriterion("class_avg_testScore <=", value, "classAvgTestscore");
            return (Criteria) this;
        }

        public Criteria andClassAvgTestscoreIn(List<Double> values) {
            addCriterion("class_avg_testScore in", values, "classAvgTestscore");
            return (Criteria) this;
        }

        public Criteria andClassAvgTestscoreNotIn(List<Double> values) {
            addCriterion("class_avg_testScore not in", values, "classAvgTestscore");
            return (Criteria) this;
        }

        public Criteria andClassAvgTestscoreBetween(Double value1, Double value2) {
            addCriterion("class_avg_testScore between", value1, value2, "classAvgTestscore");
            return (Criteria) this;
        }

        public Criteria andClassAvgTestscoreNotBetween(Double value1, Double value2) {
            addCriterion("class_avg_testScore not between", value1, value2, "classAvgTestscore");
            return (Criteria) this;
        }

        public Criteria andClassSumFinalscoreIsNull() {
            addCriterion("class_sum_finalScore is null");
            return (Criteria) this;
        }

        public Criteria andClassSumFinalscoreIsNotNull() {
            addCriterion("class_sum_finalScore is not null");
            return (Criteria) this;
        }

        public Criteria andClassSumFinalscoreEqualTo(Double value) {
            addCriterion("class_sum_finalScore =", value, "classSumFinalscore");
            return (Criteria) this;
        }

        public Criteria andClassSumFinalscoreNotEqualTo(Double value) {
            addCriterion("class_sum_finalScore <>", value, "classSumFinalscore");
            return (Criteria) this;
        }

        public Criteria andClassSumFinalscoreGreaterThan(Double value) {
            addCriterion("class_sum_finalScore >", value, "classSumFinalscore");
            return (Criteria) this;
        }

        public Criteria andClassSumFinalscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("class_sum_finalScore >=", value, "classSumFinalscore");
            return (Criteria) this;
        }

        public Criteria andClassSumFinalscoreLessThan(Double value) {
            addCriterion("class_sum_finalScore <", value, "classSumFinalscore");
            return (Criteria) this;
        }

        public Criteria andClassSumFinalscoreLessThanOrEqualTo(Double value) {
            addCriterion("class_sum_finalScore <=", value, "classSumFinalscore");
            return (Criteria) this;
        }

        public Criteria andClassSumFinalscoreIn(List<Double> values) {
            addCriterion("class_sum_finalScore in", values, "classSumFinalscore");
            return (Criteria) this;
        }

        public Criteria andClassSumFinalscoreNotIn(List<Double> values) {
            addCriterion("class_sum_finalScore not in", values, "classSumFinalscore");
            return (Criteria) this;
        }

        public Criteria andClassSumFinalscoreBetween(Double value1, Double value2) {
            addCriterion("class_sum_finalScore between", value1, value2, "classSumFinalscore");
            return (Criteria) this;
        }

        public Criteria andClassSumFinalscoreNotBetween(Double value1, Double value2) {
            addCriterion("class_sum_finalScore not between", value1, value2, "classSumFinalscore");
            return (Criteria) this;
        }

        public Criteria andClassAvgFinalscoreIsNull() {
            addCriterion("class_avg_finalScore is null");
            return (Criteria) this;
        }

        public Criteria andClassAvgFinalscoreIsNotNull() {
            addCriterion("class_avg_finalScore is not null");
            return (Criteria) this;
        }

        public Criteria andClassAvgFinalscoreEqualTo(Double value) {
            addCriterion("class_avg_finalScore =", value, "classAvgFinalscore");
            return (Criteria) this;
        }

        public Criteria andClassAvgFinalscoreNotEqualTo(Double value) {
            addCriterion("class_avg_finalScore <>", value, "classAvgFinalscore");
            return (Criteria) this;
        }

        public Criteria andClassAvgFinalscoreGreaterThan(Double value) {
            addCriterion("class_avg_finalScore >", value, "classAvgFinalscore");
            return (Criteria) this;
        }

        public Criteria andClassAvgFinalscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("class_avg_finalScore >=", value, "classAvgFinalscore");
            return (Criteria) this;
        }

        public Criteria andClassAvgFinalscoreLessThan(Double value) {
            addCriterion("class_avg_finalScore <", value, "classAvgFinalscore");
            return (Criteria) this;
        }

        public Criteria andClassAvgFinalscoreLessThanOrEqualTo(Double value) {
            addCriterion("class_avg_finalScore <=", value, "classAvgFinalscore");
            return (Criteria) this;
        }

        public Criteria andClassAvgFinalscoreIn(List<Double> values) {
            addCriterion("class_avg_finalScore in", values, "classAvgFinalscore");
            return (Criteria) this;
        }

        public Criteria andClassAvgFinalscoreNotIn(List<Double> values) {
            addCriterion("class_avg_finalScore not in", values, "classAvgFinalscore");
            return (Criteria) this;
        }

        public Criteria andClassAvgFinalscoreBetween(Double value1, Double value2) {
            addCriterion("class_avg_finalScore between", value1, value2, "classAvgFinalscore");
            return (Criteria) this;
        }

        public Criteria andClassAvgFinalscoreNotBetween(Double value1, Double value2) {
            addCriterion("class_avg_finalScore not between", value1, value2, "classAvgFinalscore");
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