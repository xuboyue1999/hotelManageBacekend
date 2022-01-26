package com.hotelmanage.hm.po;

import java.util.ArrayList;
import java.util.List;

public class RoomPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomPOExample() {
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

    public RoomPOExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public RoomPOExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public static Criteria newAndCreateCriteria() {
        RoomPOExample example = new RoomPOExample();
        return example.createCriteria();
    }

    public RoomPOExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public RoomPOExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
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

        public Criteria andIdEqualToColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("id <= ").append(column.getEscapedColumnName()).toString());
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

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameEqualToColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("`name` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualToColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("`name` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("`name` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualToColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("`name` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("`name` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualToColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("`name` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSquareIsNull() {
            addCriterion("square is null");
            return (Criteria) this;
        }

        public Criteria andSquareIsNotNull() {
            addCriterion("square is not null");
            return (Criteria) this;
        }

        public Criteria andSquareEqualTo(Integer value) {
            addCriterion("square =", value, "square");
            return (Criteria) this;
        }

        public Criteria andSquareEqualToColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("square = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSquareNotEqualTo(Integer value) {
            addCriterion("square <>", value, "square");
            return (Criteria) this;
        }

        public Criteria andSquareNotEqualToColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("square <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSquareGreaterThan(Integer value) {
            addCriterion("square >", value, "square");
            return (Criteria) this;
        }

        public Criteria andSquareGreaterThanColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("square > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSquareGreaterThanOrEqualTo(Integer value) {
            addCriterion("square >=", value, "square");
            return (Criteria) this;
        }

        public Criteria andSquareGreaterThanOrEqualToColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("square >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSquareLessThan(Integer value) {
            addCriterion("square <", value, "square");
            return (Criteria) this;
        }

        public Criteria andSquareLessThanColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("square < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSquareLessThanOrEqualTo(Integer value) {
            addCriterion("square <=", value, "square");
            return (Criteria) this;
        }

        public Criteria andSquareLessThanOrEqualToColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("square <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSquareIn(List<Integer> values) {
            addCriterion("square in", values, "square");
            return (Criteria) this;
        }

        public Criteria andSquareNotIn(List<Integer> values) {
            addCriterion("square not in", values, "square");
            return (Criteria) this;
        }

        public Criteria andSquareBetween(Integer value1, Integer value2) {
            addCriterion("square between", value1, value2, "square");
            return (Criteria) this;
        }

        public Criteria andSquareNotBetween(Integer value1, Integer value2) {
            addCriterion("square not between", value1, value2, "square");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceEqualToColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("price = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualToColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("price <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("price > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualToColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("price >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("price < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualToColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("price <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andHotelidIsNull() {
            addCriterion("hotelid is null");
            return (Criteria) this;
        }

        public Criteria andHotelidIsNotNull() {
            addCriterion("hotelid is not null");
            return (Criteria) this;
        }

        public Criteria andHotelidEqualTo(Integer value) {
            addCriterion("hotelid =", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidEqualToColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("hotelid = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHotelidNotEqualTo(Integer value) {
            addCriterion("hotelid <>", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidNotEqualToColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("hotelid <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHotelidGreaterThan(Integer value) {
            addCriterion("hotelid >", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidGreaterThanColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("hotelid > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHotelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotelid >=", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidGreaterThanOrEqualToColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("hotelid >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHotelidLessThan(Integer value) {
            addCriterion("hotelid <", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidLessThanColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("hotelid < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHotelidLessThanOrEqualTo(Integer value) {
            addCriterion("hotelid <=", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidLessThanOrEqualToColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("hotelid <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHotelidIn(List<Integer> values) {
            addCriterion("hotelid in", values, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidNotIn(List<Integer> values) {
            addCriterion("hotelid not in", values, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidBetween(Integer value1, Integer value2) {
            addCriterion("hotelid between", value1, value2, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidNotBetween(Integer value1, Integer value2) {
            addCriterion("hotelid not between", value1, value2, "hotelid");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumEqualToColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("num = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualToColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("num <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("num > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualToColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("num >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("num < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualToColumn(RoomPO.Column column) {
            addCriterion(new StringBuilder("num <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private RoomPOExample example;

        protected Criteria(RoomPOExample example) {
            super();
            this.example = example;
        }

        public RoomPOExample example() {
            return this.example;
        }

        @Deprecated
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then) {
            if (condition) {
                then.criteria(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then, ICriteriaWhen otherwise) {
            if (condition) {
                then.criteria(this);
            } else {
                otherwise.criteria(this);
            }
            return this;
        }

        @Deprecated
        public interface ICriteriaAdd {
            Criteria add(Criteria add);
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

    public interface ICriteriaWhen {
        void criteria(Criteria criteria);
    }

    public interface IExampleWhen {
        void example(com.hotelmanage.hm.po.RoomPOExample example);
    }
}