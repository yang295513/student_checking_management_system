package com.qs304.student_checking_management_system.entity;

import java.util.ArrayList;
import java.util.List;

public class StuInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StuInfoExample() {
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

        public Criteria andStuNameIsNull() {
            addCriterion("stu_name is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("stu_name =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("stu_name <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("stu_name >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_name >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("stu_name <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("stu_name <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("stu_name like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("stu_name not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("stu_name in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("stu_name not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("stu_name between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("stu_name not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNull() {
            addCriterion("stu_sex is null");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNotNull() {
            addCriterion("stu_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStuSexEqualTo(String value) {
            addCriterion("stu_sex =", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotEqualTo(String value) {
            addCriterion("stu_sex <>", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThan(String value) {
            addCriterion("stu_sex >", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThanOrEqualTo(String value) {
            addCriterion("stu_sex >=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThan(String value) {
            addCriterion("stu_sex <", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThanOrEqualTo(String value) {
            addCriterion("stu_sex <=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLike(String value) {
            addCriterion("stu_sex like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotLike(String value) {
            addCriterion("stu_sex not like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexIn(List<String> values) {
            addCriterion("stu_sex in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotIn(List<String> values) {
            addCriterion("stu_sex not in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexBetween(String value1, String value2) {
            addCriterion("stu_sex between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotBetween(String value1, String value2) {
            addCriterion("stu_sex not between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSchoolIsNull() {
            addCriterion("stu_school is null");
            return (Criteria) this;
        }

        public Criteria andStuSchoolIsNotNull() {
            addCriterion("stu_school is not null");
            return (Criteria) this;
        }

        public Criteria andStuSchoolEqualTo(String value) {
            addCriterion("stu_school =", value, "stuSchool");
            return (Criteria) this;
        }

        public Criteria andStuSchoolNotEqualTo(String value) {
            addCriterion("stu_school <>", value, "stuSchool");
            return (Criteria) this;
        }

        public Criteria andStuSchoolGreaterThan(String value) {
            addCriterion("stu_school >", value, "stuSchool");
            return (Criteria) this;
        }

        public Criteria andStuSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("stu_school >=", value, "stuSchool");
            return (Criteria) this;
        }

        public Criteria andStuSchoolLessThan(String value) {
            addCriterion("stu_school <", value, "stuSchool");
            return (Criteria) this;
        }

        public Criteria andStuSchoolLessThanOrEqualTo(String value) {
            addCriterion("stu_school <=", value, "stuSchool");
            return (Criteria) this;
        }

        public Criteria andStuSchoolLike(String value) {
            addCriterion("stu_school like", value, "stuSchool");
            return (Criteria) this;
        }

        public Criteria andStuSchoolNotLike(String value) {
            addCriterion("stu_school not like", value, "stuSchool");
            return (Criteria) this;
        }

        public Criteria andStuSchoolIn(List<String> values) {
            addCriterion("stu_school in", values, "stuSchool");
            return (Criteria) this;
        }

        public Criteria andStuSchoolNotIn(List<String> values) {
            addCriterion("stu_school not in", values, "stuSchool");
            return (Criteria) this;
        }

        public Criteria andStuSchoolBetween(String value1, String value2) {
            addCriterion("stu_school between", value1, value2, "stuSchool");
            return (Criteria) this;
        }

        public Criteria andStuSchoolNotBetween(String value1, String value2) {
            addCriterion("stu_school not between", value1, value2, "stuSchool");
            return (Criteria) this;
        }

        public Criteria andStuClassidIsNull() {
            addCriterion("stu_classId is null");
            return (Criteria) this;
        }

        public Criteria andStuClassidIsNotNull() {
            addCriterion("stu_classId is not null");
            return (Criteria) this;
        }

        public Criteria andStuClassidEqualTo(Integer value) {
            addCriterion("stu_classId =", value, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuClassidNotEqualTo(Integer value) {
            addCriterion("stu_classId <>", value, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuClassidGreaterThan(Integer value) {
            addCriterion("stu_classId >", value, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuClassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_classId >=", value, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuClassidLessThan(Integer value) {
            addCriterion("stu_classId <", value, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuClassidLessThanOrEqualTo(Integer value) {
            addCriterion("stu_classId <=", value, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuClassidIn(List<Integer> values) {
            addCriterion("stu_classId in", values, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuClassidNotIn(List<Integer> values) {
            addCriterion("stu_classId not in", values, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuClassidBetween(Integer value1, Integer value2) {
            addCriterion("stu_classId between", value1, value2, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuClassidNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_classId not between", value1, value2, "stuClassid");
            return (Criteria) this;
        }

        public Criteria andStuPhonenumberIsNull() {
            addCriterion("stu_phoneNumber is null");
            return (Criteria) this;
        }

        public Criteria andStuPhonenumberIsNotNull() {
            addCriterion("stu_phoneNumber is not null");
            return (Criteria) this;
        }

        public Criteria andStuPhonenumberEqualTo(String value) {
            addCriterion("stu_phoneNumber =", value, "stuPhonenumber");
            return (Criteria) this;
        }

        public Criteria andStuPhonenumberNotEqualTo(String value) {
            addCriterion("stu_phoneNumber <>", value, "stuPhonenumber");
            return (Criteria) this;
        }

        public Criteria andStuPhonenumberGreaterThan(String value) {
            addCriterion("stu_phoneNumber >", value, "stuPhonenumber");
            return (Criteria) this;
        }

        public Criteria andStuPhonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("stu_phoneNumber >=", value, "stuPhonenumber");
            return (Criteria) this;
        }

        public Criteria andStuPhonenumberLessThan(String value) {
            addCriterion("stu_phoneNumber <", value, "stuPhonenumber");
            return (Criteria) this;
        }

        public Criteria andStuPhonenumberLessThanOrEqualTo(String value) {
            addCriterion("stu_phoneNumber <=", value, "stuPhonenumber");
            return (Criteria) this;
        }

        public Criteria andStuPhonenumberLike(String value) {
            addCriterion("stu_phoneNumber like", value, "stuPhonenumber");
            return (Criteria) this;
        }

        public Criteria andStuPhonenumberNotLike(String value) {
            addCriterion("stu_phoneNumber not like", value, "stuPhonenumber");
            return (Criteria) this;
        }

        public Criteria andStuPhonenumberIn(List<String> values) {
            addCriterion("stu_phoneNumber in", values, "stuPhonenumber");
            return (Criteria) this;
        }

        public Criteria andStuPhonenumberNotIn(List<String> values) {
            addCriterion("stu_phoneNumber not in", values, "stuPhonenumber");
            return (Criteria) this;
        }

        public Criteria andStuPhonenumberBetween(String value1, String value2) {
            addCriterion("stu_phoneNumber between", value1, value2, "stuPhonenumber");
            return (Criteria) this;
        }

        public Criteria andStuPhonenumberNotBetween(String value1, String value2) {
            addCriterion("stu_phoneNumber not between", value1, value2, "stuPhonenumber");
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