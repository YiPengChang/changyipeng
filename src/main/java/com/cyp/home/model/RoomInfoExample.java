package com.cyp.home.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoomInfoExample extends Page{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomInfoExample() {
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

        public Criteria andEstateNameIsNull() {
            addCriterion("estate_Name is null");
            return (Criteria) this;
        }

        public Criteria andEstateNameIsNotNull() {
            addCriterion("estate_Name is not null");
            return (Criteria) this;
        }

        public Criteria andEstateNameEqualTo(String value) {
            addCriterion("estate_Name =", value, "estateName");
            return (Criteria) this;
        }

        public Criteria andEstateNameNotEqualTo(String value) {
            addCriterion("estate_Name <>", value, "estateName");
            return (Criteria) this;
        }

        public Criteria andEstateNameGreaterThan(String value) {
            addCriterion("estate_Name >", value, "estateName");
            return (Criteria) this;
        }

        public Criteria andEstateNameGreaterThanOrEqualTo(String value) {
            addCriterion("estate_Name >=", value, "estateName");
            return (Criteria) this;
        }

        public Criteria andEstateNameLessThan(String value) {
            addCriterion("estate_Name <", value, "estateName");
            return (Criteria) this;
        }

        public Criteria andEstateNameLessThanOrEqualTo(String value) {
            addCriterion("estate_Name <=", value, "estateName");
            return (Criteria) this;
        }

        public Criteria andEstateNameLike(String value) {
            addCriterion("estate_Name like", value, "estateName");
            return (Criteria) this;
        }

        public Criteria andEstateNameNotLike(String value) {
            addCriterion("estate_Name not like", value, "estateName");
            return (Criteria) this;
        }

        public Criteria andEstateNameIn(List<String> values) {
            addCriterion("estate_Name in", values, "estateName");
            return (Criteria) this;
        }

        public Criteria andEstateNameNotIn(List<String> values) {
            addCriterion("estate_Name not in", values, "estateName");
            return (Criteria) this;
        }

        public Criteria andEstateNameBetween(String value1, String value2) {
            addCriterion("estate_Name between", value1, value2, "estateName");
            return (Criteria) this;
        }

        public Criteria andEstateNameNotBetween(String value1, String value2) {
            addCriterion("estate_Name not between", value1, value2, "estateName");
            return (Criteria) this;
        }

        public Criteria andHomeStatusIsNull() {
            addCriterion("home_Status is null");
            return (Criteria) this;
        }

        public Criteria andHomeStatusIsNotNull() {
            addCriterion("home_Status is not null");
            return (Criteria) this;
        }

        public Criteria andHomeStatusEqualTo(String value) {
            addCriterion("home_Status =", value, "homeStatus");
            return (Criteria) this;
        }

        public Criteria andHomeStatusNotEqualTo(String value) {
            addCriterion("home_Status <>", value, "homeStatus");
            return (Criteria) this;
        }

        public Criteria andHomeStatusGreaterThan(String value) {
            addCriterion("home_Status >", value, "homeStatus");
            return (Criteria) this;
        }

        public Criteria andHomeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("home_Status >=", value, "homeStatus");
            return (Criteria) this;
        }

        public Criteria andHomeStatusLessThan(String value) {
            addCriterion("home_Status <", value, "homeStatus");
            return (Criteria) this;
        }

        public Criteria andHomeStatusLessThanOrEqualTo(String value) {
            addCriterion("home_Status <=", value, "homeStatus");
            return (Criteria) this;
        }

        public Criteria andHomeStatusLike(String value) {
            addCriterion("home_Status like", value, "homeStatus");
            return (Criteria) this;
        }

        public Criteria andHomeStatusNotLike(String value) {
            addCriterion("home_Status not like", value, "homeStatus");
            return (Criteria) this;
        }

        public Criteria andHomeStatusIn(List<String> values) {
            addCriterion("home_Status in", values, "homeStatus");
            return (Criteria) this;
        }

        public Criteria andHomeStatusNotIn(List<String> values) {
            addCriterion("home_Status not in", values, "homeStatus");
            return (Criteria) this;
        }

        public Criteria andHomeStatusBetween(String value1, String value2) {
            addCriterion("home_Status between", value1, value2, "homeStatus");
            return (Criteria) this;
        }

        public Criteria andHomeStatusNotBetween(String value1, String value2) {
            addCriterion("home_Status not between", value1, value2, "homeStatus");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
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

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andOrientedIsNull() {
            addCriterion("oriented is null");
            return (Criteria) this;
        }

        public Criteria andOrientedIsNotNull() {
            addCriterion("oriented is not null");
            return (Criteria) this;
        }

        public Criteria andOrientedEqualTo(String value) {
            addCriterion("oriented =", value, "oriented");
            return (Criteria) this;
        }

        public Criteria andOrientedNotEqualTo(String value) {
            addCriterion("oriented <>", value, "oriented");
            return (Criteria) this;
        }

        public Criteria andOrientedGreaterThan(String value) {
            addCriterion("oriented >", value, "oriented");
            return (Criteria) this;
        }

        public Criteria andOrientedGreaterThanOrEqualTo(String value) {
            addCriterion("oriented >=", value, "oriented");
            return (Criteria) this;
        }

        public Criteria andOrientedLessThan(String value) {
            addCriterion("oriented <", value, "oriented");
            return (Criteria) this;
        }

        public Criteria andOrientedLessThanOrEqualTo(String value) {
            addCriterion("oriented <=", value, "oriented");
            return (Criteria) this;
        }

        public Criteria andOrientedLike(String value) {
            addCriterion("oriented like", value, "oriented");
            return (Criteria) this;
        }

        public Criteria andOrientedNotLike(String value) {
            addCriterion("oriented not like", value, "oriented");
            return (Criteria) this;
        }

        public Criteria andOrientedIn(List<String> values) {
            addCriterion("oriented in", values, "oriented");
            return (Criteria) this;
        }

        public Criteria andOrientedNotIn(List<String> values) {
            addCriterion("oriented not in", values, "oriented");
            return (Criteria) this;
        }

        public Criteria andOrientedBetween(String value1, String value2) {
            addCriterion("oriented between", value1, value2, "oriented");
            return (Criteria) this;
        }

        public Criteria andOrientedNotBetween(String value1, String value2) {
            addCriterion("oriented not between", value1, value2, "oriented");
            return (Criteria) this;
        }

        public Criteria andHomeUseIsNull() {
            addCriterion("home_Use is null");
            return (Criteria) this;
        }

        public Criteria andHomeUseIsNotNull() {
            addCriterion("home_Use is not null");
            return (Criteria) this;
        }

        public Criteria andHomeUseEqualTo(String value) {
            addCriterion("home_Use =", value, "homeUse");
            return (Criteria) this;
        }

        public Criteria andHomeUseNotEqualTo(String value) {
            addCriterion("home_Use <>", value, "homeUse");
            return (Criteria) this;
        }

        public Criteria andHomeUseGreaterThan(String value) {
            addCriterion("home_Use >", value, "homeUse");
            return (Criteria) this;
        }

        public Criteria andHomeUseGreaterThanOrEqualTo(String value) {
            addCriterion("home_Use >=", value, "homeUse");
            return (Criteria) this;
        }

        public Criteria andHomeUseLessThan(String value) {
            addCriterion("home_Use <", value, "homeUse");
            return (Criteria) this;
        }

        public Criteria andHomeUseLessThanOrEqualTo(String value) {
            addCriterion("home_Use <=", value, "homeUse");
            return (Criteria) this;
        }

        public Criteria andHomeUseLike(String value) {
            addCriterion("home_Use like", value, "homeUse");
            return (Criteria) this;
        }

        public Criteria andHomeUseNotLike(String value) {
            addCriterion("home_Use not like", value, "homeUse");
            return (Criteria) this;
        }

        public Criteria andHomeUseIn(List<String> values) {
            addCriterion("home_Use in", values, "homeUse");
            return (Criteria) this;
        }

        public Criteria andHomeUseNotIn(List<String> values) {
            addCriterion("home_Use not in", values, "homeUse");
            return (Criteria) this;
        }

        public Criteria andHomeUseBetween(String value1, String value2) {
            addCriterion("home_Use between", value1, value2, "homeUse");
            return (Criteria) this;
        }

        public Criteria andHomeUseNotBetween(String value1, String value2) {
            addCriterion("home_Use not between", value1, value2, "homeUse");
            return (Criteria) this;
        }

        public Criteria andDecorationIsNull() {
            addCriterion("decoration is null");
            return (Criteria) this;
        }

        public Criteria andDecorationIsNotNull() {
            addCriterion("decoration is not null");
            return (Criteria) this;
        }

        public Criteria andDecorationEqualTo(String value) {
            addCriterion("decoration =", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationNotEqualTo(String value) {
            addCriterion("decoration <>", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationGreaterThan(String value) {
            addCriterion("decoration >", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationGreaterThanOrEqualTo(String value) {
            addCriterion("decoration >=", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationLessThan(String value) {
            addCriterion("decoration <", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationLessThanOrEqualTo(String value) {
            addCriterion("decoration <=", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationLike(String value) {
            addCriterion("decoration like", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationNotLike(String value) {
            addCriterion("decoration not like", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationIn(List<String> values) {
            addCriterion("decoration in", values, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationNotIn(List<String> values) {
            addCriterion("decoration not in", values, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationBetween(String value1, String value2) {
            addCriterion("decoration between", value1, value2, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationNotBetween(String value1, String value2) {
            addCriterion("decoration not between", value1, value2, "decoration");
            return (Criteria) this;
        }

        public Criteria andRoomNumberIsNull() {
            addCriterion("room_Number is null");
            return (Criteria) this;
        }

        public Criteria andRoomNumberIsNotNull() {
            addCriterion("room_Number is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNumberEqualTo(String value) {
            addCriterion("room_Number =", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotEqualTo(String value) {
            addCriterion("room_Number <>", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberGreaterThan(String value) {
            addCriterion("room_Number >", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberGreaterThanOrEqualTo(String value) {
            addCriterion("room_Number >=", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberLessThan(String value) {
            addCriterion("room_Number <", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberLessThanOrEqualTo(String value) {
            addCriterion("room_Number <=", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberLike(String value) {
            addCriterion("room_Number like", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotLike(String value) {
            addCriterion("room_Number not like", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberIn(List<String> values) {
            addCriterion("room_Number in", values, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotIn(List<String> values) {
            addCriterion("room_Number not in", values, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberBetween(String value1, String value2) {
            addCriterion("room_Number between", value1, value2, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotBetween(String value1, String value2) {
            addCriterion("room_Number not between", value1, value2, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andFloorNumIsNull() {
            addCriterion("floor_Num is null");
            return (Criteria) this;
        }

        public Criteria andFloorNumIsNotNull() {
            addCriterion("floor_Num is not null");
            return (Criteria) this;
        }

        public Criteria andFloorNumEqualTo(String value) {
            addCriterion("floor_Num =", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumNotEqualTo(String value) {
            addCriterion("floor_Num <>", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumGreaterThan(String value) {
            addCriterion("floor_Num >", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumGreaterThanOrEqualTo(String value) {
            addCriterion("floor_Num >=", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumLessThan(String value) {
            addCriterion("floor_Num <", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumLessThanOrEqualTo(String value) {
            addCriterion("floor_Num <=", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumLike(String value) {
            addCriterion("floor_Num like", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumNotLike(String value) {
            addCriterion("floor_Num not like", value, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumIn(List<String> values) {
            addCriterion("floor_Num in", values, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumNotIn(List<String> values) {
            addCriterion("floor_Num not in", values, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumBetween(String value1, String value2) {
            addCriterion("floor_Num between", value1, value2, "floorNum");
            return (Criteria) this;
        }

        public Criteria andFloorNumNotBetween(String value1, String value2) {
            addCriterion("floor_Num not between", value1, value2, "floorNum");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_Name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_Name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_Name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_Name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_Name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_Name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_Name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_Name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_Name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_Name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_Name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_Name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_Name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_Name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andMembercodeIsNull() {
            addCriterion("memberCode is null");
            return (Criteria) this;
        }

        public Criteria andMembercodeIsNotNull() {
            addCriterion("memberCode is not null");
            return (Criteria) this;
        }

        public Criteria andMembercodeEqualTo(String value) {
            addCriterion("memberCode =", value, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeNotEqualTo(String value) {
            addCriterion("memberCode <>", value, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeGreaterThan(String value) {
            addCriterion("memberCode >", value, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeGreaterThanOrEqualTo(String value) {
            addCriterion("memberCode >=", value, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeLessThan(String value) {
            addCriterion("memberCode <", value, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeLessThanOrEqualTo(String value) {
            addCriterion("memberCode <=", value, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeLike(String value) {
            addCriterion("memberCode like", value, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeNotLike(String value) {
            addCriterion("memberCode not like", value, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeIn(List<String> values) {
            addCriterion("memberCode in", values, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeNotIn(List<String> values) {
            addCriterion("memberCode not in", values, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeBetween(String value1, String value2) {
            addCriterion("memberCode between", value1, value2, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeNotBetween(String value1, String value2) {
            addCriterion("memberCode not between", value1, value2, "membercode");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_Time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_Time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_Time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_Time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_Time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_Time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_Time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_Time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_Time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_Time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_Time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_Time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_Time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_Time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_Time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_Time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_Time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_Time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_Time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_Time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_Time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_Time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_Time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_Time not between", value1, value2, "updateTime");
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