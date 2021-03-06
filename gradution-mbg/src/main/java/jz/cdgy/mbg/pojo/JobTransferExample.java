package jz.cdgy.mbg.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JobTransferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobTransferExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSourceDepartmentIsNull() {
            addCriterion("source_department is null");
            return (Criteria) this;
        }

        public Criteria andSourceDepartmentIsNotNull() {
            addCriterion("source_department is not null");
            return (Criteria) this;
        }

        public Criteria andSourceDepartmentEqualTo(Integer value) {
            addCriterion("source_department =", value, "sourceDepartment");
            return (Criteria) this;
        }

        public Criteria andSourceDepartmentNotEqualTo(Integer value) {
            addCriterion("source_department <>", value, "sourceDepartment");
            return (Criteria) this;
        }

        public Criteria andSourceDepartmentGreaterThan(Integer value) {
            addCriterion("source_department >", value, "sourceDepartment");
            return (Criteria) this;
        }

        public Criteria andSourceDepartmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("source_department >=", value, "sourceDepartment");
            return (Criteria) this;
        }

        public Criteria andSourceDepartmentLessThan(Integer value) {
            addCriterion("source_department <", value, "sourceDepartment");
            return (Criteria) this;
        }

        public Criteria andSourceDepartmentLessThanOrEqualTo(Integer value) {
            addCriterion("source_department <=", value, "sourceDepartment");
            return (Criteria) this;
        }

        public Criteria andSourceDepartmentIn(List<Integer> values) {
            addCriterion("source_department in", values, "sourceDepartment");
            return (Criteria) this;
        }

        public Criteria andSourceDepartmentNotIn(List<Integer> values) {
            addCriterion("source_department not in", values, "sourceDepartment");
            return (Criteria) this;
        }

        public Criteria andSourceDepartmentBetween(Integer value1, Integer value2) {
            addCriterion("source_department between", value1, value2, "sourceDepartment");
            return (Criteria) this;
        }

        public Criteria andSourceDepartmentNotBetween(Integer value1, Integer value2) {
            addCriterion("source_department not between", value1, value2, "sourceDepartment");
            return (Criteria) this;
        }

        public Criteria andDestineDepartmentIsNull() {
            addCriterion("destine_department is null");
            return (Criteria) this;
        }

        public Criteria andDestineDepartmentIsNotNull() {
            addCriterion("destine_department is not null");
            return (Criteria) this;
        }

        public Criteria andDestineDepartmentEqualTo(Integer value) {
            addCriterion("destine_department =", value, "destineDepartment");
            return (Criteria) this;
        }

        public Criteria andDestineDepartmentNotEqualTo(Integer value) {
            addCriterion("destine_department <>", value, "destineDepartment");
            return (Criteria) this;
        }

        public Criteria andDestineDepartmentGreaterThan(Integer value) {
            addCriterion("destine_department >", value, "destineDepartment");
            return (Criteria) this;
        }

        public Criteria andDestineDepartmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("destine_department >=", value, "destineDepartment");
            return (Criteria) this;
        }

        public Criteria andDestineDepartmentLessThan(Integer value) {
            addCriterion("destine_department <", value, "destineDepartment");
            return (Criteria) this;
        }

        public Criteria andDestineDepartmentLessThanOrEqualTo(Integer value) {
            addCriterion("destine_department <=", value, "destineDepartment");
            return (Criteria) this;
        }

        public Criteria andDestineDepartmentIn(List<Integer> values) {
            addCriterion("destine_department in", values, "destineDepartment");
            return (Criteria) this;
        }

        public Criteria andDestineDepartmentNotIn(List<Integer> values) {
            addCriterion("destine_department not in", values, "destineDepartment");
            return (Criteria) this;
        }

        public Criteria andDestineDepartmentBetween(Integer value1, Integer value2) {
            addCriterion("destine_department between", value1, value2, "destineDepartment");
            return (Criteria) this;
        }

        public Criteria andDestineDepartmentNotBetween(Integer value1, Integer value2) {
            addCriterion("destine_department not between", value1, value2, "destineDepartment");
            return (Criteria) this;
        }

        public Criteria andTransferTimeIsNull() {
            addCriterion("transfer_time is null");
            return (Criteria) this;
        }

        public Criteria andTransferTimeIsNotNull() {
            addCriterion("transfer_time is not null");
            return (Criteria) this;
        }

        public Criteria andTransferTimeEqualTo(Date value) {
            addCriterion("transfer_time =", value, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeNotEqualTo(Date value) {
            addCriterion("transfer_time <>", value, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeGreaterThan(Date value) {
            addCriterion("transfer_time >", value, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("transfer_time >=", value, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeLessThan(Date value) {
            addCriterion("transfer_time <", value, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeLessThanOrEqualTo(Date value) {
            addCriterion("transfer_time <=", value, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeIn(List<Date> values) {
            addCriterion("transfer_time in", values, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeNotIn(List<Date> values) {
            addCriterion("transfer_time not in", values, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeBetween(Date value1, Date value2) {
            addCriterion("transfer_time between", value1, value2, "transferTime");
            return (Criteria) this;
        }

        public Criteria andTransferTimeNotBetween(Date value1, Date value2) {
            addCriterion("transfer_time not between", value1, value2, "transferTime");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(Integer value) {
            addCriterion("emp_id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(Integer value) {
            addCriterion("emp_id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(Integer value) {
            addCriterion("emp_id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(Integer value) {
            addCriterion("emp_id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("emp_id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<Integer> values) {
            addCriterion("emp_id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<Integer> values) {
            addCriterion("emp_id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("emp_id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_id not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNull() {
            addCriterion("status_id is null");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNotNull() {
            addCriterion("status_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatusIdEqualTo(Integer value) {
            addCriterion("status_id =", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotEqualTo(Integer value) {
            addCriterion("status_id <>", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThan(Integer value) {
            addCriterion("status_id >", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("status_id >=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThan(Integer value) {
            addCriterion("status_id <", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("status_id <=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdIn(List<Integer> values) {
            addCriterion("status_id in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotIn(List<Integer> values) {
            addCriterion("status_id not in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("status_id between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("status_id not between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andTransferReasonIsNull() {
            addCriterion("transfer_reason is null");
            return (Criteria) this;
        }

        public Criteria andTransferReasonIsNotNull() {
            addCriterion("transfer_reason is not null");
            return (Criteria) this;
        }

        public Criteria andTransferReasonEqualTo(String value) {
            addCriterion("transfer_reason =", value, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonNotEqualTo(String value) {
            addCriterion("transfer_reason <>", value, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonGreaterThan(String value) {
            addCriterion("transfer_reason >", value, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_reason >=", value, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonLessThan(String value) {
            addCriterion("transfer_reason <", value, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonLessThanOrEqualTo(String value) {
            addCriterion("transfer_reason <=", value, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonLike(String value) {
            addCriterion("transfer_reason like", value, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonNotLike(String value) {
            addCriterion("transfer_reason not like", value, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonIn(List<String> values) {
            addCriterion("transfer_reason in", values, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonNotIn(List<String> values) {
            addCriterion("transfer_reason not in", values, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonBetween(String value1, String value2) {
            addCriterion("transfer_reason between", value1, value2, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonNotBetween(String value1, String value2) {
            addCriterion("transfer_reason not between", value1, value2, "transferReason");
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