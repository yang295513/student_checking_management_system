package com.qs304.student_checking_management_system.entity;

import java.util.ArrayList;
import java.util.List;

public class ScoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScoreExample() {
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

        public Criteria andUsuScoreIsNull() {
            addCriterion("usu_score is null");
            return (Criteria) this;
        }

        public Criteria andUsuScoreIsNotNull() {
            addCriterion("usu_score is not null");
            return (Criteria) this;
        }

        public Criteria andUsuScoreEqualTo(Double value) {
            addCriterion("usu_score =", value, "usuScore");
            return (Criteria) this;
        }

        public Criteria andUsuScoreNotEqualTo(Double value) {
            addCriterion("usu_score <>", value, "usuScore");
            return (Criteria) this;
        }

        public Criteria andUsuScoreGreaterThan(Double value) {
            addCriterion("usu_score >", value, "usuScore");
            return (Criteria) this;
        }

        public Criteria andUsuScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("usu_score >=", value, "usuScore");
            return (Criteria) this;
        }

        public Criteria andUsuScoreLessThan(Double value) {
            addCriterion("usu_score <", value, "usuScore");
            return (Criteria) this;
        }

        public Criteria andUsuScoreLessThanOrEqualTo(Double value) {
            addCriterion("usu_score <=", value, "usuScore");
            return (Criteria) this;
        }

        public Criteria andUsuScoreIn(List<Double> values) {
            addCriterion("usu_score in", values, "usuScore");
            return (Criteria) this;
        }

        public Criteria andUsuScoreNotIn(List<Double> values) {
            addCriterion("usu_score not in", values, "usuScore");
            return (Criteria) this;
        }

        public Criteria andUsuScoreBetween(Double value1, Double value2) {
            addCriterion("usu_score between", value1, value2, "usuScore");
            return (Criteria) this;
        }

        public Criteria andUsuScoreNotBetween(Double value1, Double value2) {
            addCriterion("usu_score not between", value1, value2, "usuScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreIsNull() {
            addCriterion("test_score is null");
            return (Criteria) this;
        }

        public Criteria andTestScoreIsNotNull() {
            addCriterion("test_score is not null");
            return (Criteria) this;
        }

        public Criteria andTestScoreEqualTo(Double value) {
            addCriterion("test_score =", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreNotEqualTo(Double value) {
            addCriterion("test_score <>", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreGreaterThan(Double value) {
            addCriterion("test_score >", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("test_score >=", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreLessThan(Double value) {
            addCriterion("test_score <", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreLessThanOrEqualTo(Double value) {
            addCriterion("test_score <=", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreIn(List<Double> values) {
            addCriterion("test_score in", values, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreNotIn(List<Double> values) {
            addCriterion("test_score not in", values, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreBetween(Double value1, Double value2) {
            addCriterion("test_score between", value1, value2, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreNotBetween(Double value1, Double value2) {
            addCriterion("test_score not between", value1, value2, "testScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreIsNull() {
            addCriterion("final_score is null");
            return (Criteria) this;
        }

        public Criteria andFinalScoreIsNotNull() {
            addCriterion("final_score is not null");
            return (Criteria) this;
        }

        public Criteria andFinalScoreEqualTo(Double value) {
            addCriterion("final_score =", value, "finalScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreNotEqualTo(Double value) {
            addCriterion("final_score <>", value, "finalScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreGreaterThan(Double value) {
            addCriterion("final_score >", value, "finalScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("final_score >=", value, "finalScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreLessThan(Double value) {
            addCriterion("final_score <", value, "finalScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreLessThanOrEqualTo(Double value) {
            addCriterion("final_score <=", value, "finalScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreIn(List<Double> values) {
            addCriterion("final_score in", values, "finalScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreNotIn(List<Double> values) {
            addCriterion("final_score not in", values, "finalScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreBetween(Double value1, Double value2) {
            addCriterion("final_score between", value1, value2, "finalScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreNotBetween(Double value1, Double value2) {
            addCriterion("final_score not between", value1, value2, "finalScore");
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