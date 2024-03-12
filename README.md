# MVC 모델을 기반으로 Spring Framewok을 활용한 ERP 웹 사이트 제작

<img width="1393" alt="스크린샷 2024-03-12 오후 12 19 57" src="https://github.com/bbak0105/Final_Study_Project/assets/66405572/0587d837-217f-495c-9c93-d3e9830ea704">

<br/>

## 📌 Backend Skills
### Language
<a><img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/></a>
<a><img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=JavaScript&logoColor=white"/></a>

### Framework
<a><img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"/></a>

### IDE
<a><img src="https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipse&logoColor=white"/></a>

### Skills
<a><img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white"/></a>
<a><img src="https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white"/></a>

<br/>

## 📌 Descriptions
### `SalesController.java`
> ✏️ 판매 Controller 입니다.

```java
package com.itwill.controller;
...

@Controller
public class SalesController {
	private static final Logger logger = LoggerFactory.getLogger(SalesController.class);

	@Autowired
	private SalesService salesService;
	
	// 주간검색
	@RequestMapping(value = "/weekSales", method = RequestMethod.GET)
	public String displayWeek(Model model ) {
		logger.info("selectWeekList 메소드 호출");
		model.addAttribute("weekList", salesService.getWeekList());
		...
	}
}
```

---

### `SalesService.java`
> ✏️ 판매 Service Interface 입니다.

```java
package com.itwill.service;
...

public interface SalesService {
	//기간 검색
	List<Sales> getTermList(Sales sales);
	
	//주간검색
	List<Sales> getWeekList();
	...
}
```

---

### `SalesServiceImpl.java`
> ✏️ 판매 Service Interface를 구현한 구현체입니다.

```java
package com.itwill.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.itwill.dao.SalesDAO;
import com.itwill.dto.Sales;

@Service
public class SalesServiceImpl implements SalesService{
	
	@Autowired
	private SalesDAO salesDAO;
	
	@Override
	public List<Sales> getTermList(Sales sales) {
		return salesDAO.selectTermList(sales);
	}
  ...
}
```

---

### `SalesDAO.java`
> ✏️ 판매 Service DAO Interface 입니다.

```java
package com.itwill.dao;

import java.util.List;

import com.itwill.dto.Sales;

public interface SalesDAO {

	// 기간 검색
	List<Sales> selectTermList(Sales sales);

	// 주간검색
	List<Sales> selectWeekList();
  ...
}
```

---

### `SalesDAOImpl.java`
> ✏️ 판매 DAO Interface를 구현한 구현체입니다.

```java
package com.itwill.dao;
...

@Repository
public class SalaryDAOImpl implements SalaryDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insertSalary(Salary salary) {
		return sqlSession.getMapper(SalaryMapper.class).insertSalary(salary);
	}
  ...
}
```

---

### `SalesMapper.java`
> ✏️ 판매 Mapper Interface 입니다.

```java
package com.itwill.mapper;
...

public interface SalesMapper {
	
	//기간 검색
	List<Sales> selectTermList(Sales sales);
	
	//주간검색
	List<Sales> selectWeekList();
	...

}
```

---

### `SalesMapper.xml`
> ✏️ 판매 Mapper XML 입니다.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.itwill.mapper.SalesMapper">

<resultMap type="Sales" id="salesResultMap">
   <result column="raw_price" property="rawPrice"/><!-- 생산원가 -->
   <result column="total_sales" property="totalSales"/><!-- 매출액 -->
   <result column="pure_sales" property="pureSales"/><!-- 순매출액 -->
   <result column="now_month" property="nowMonth"/><!-- 현재달 -->
   <result column="maxi_sales" property="maxiSales"/> <!-- 최대/최소 -->
   <result column="entire_sales" property="entireSales"/><!-- 전체매출 -->
   <result column="avg_sales" property="avgSales"/><!-- 평균매출 -->
   <result column="total_bestworst" property="totalBestworst"/><!-- 워스트베스트 -->
   <result column="nowmonth_sales" property="nowmonthSales"/><!-- 현재월 매출 -->
   <result column="lastmonth_sales" property="lastmonthSales"/><!-- 지난월 매출 -->
   <result column="nowbun_sales" property="nowbunSales"/><!-- 현재분기 매출 -->
   <result column="lastbun_sales" property="lastbunSales"/><!-- 저번분기 매출 -->
   <result column="nowyear_sales" property="nowyearSales"/><!-- 현재년도 매출 -->
   <result column="lastyear_sales" property="lastyearSales"/><!-- 작년도 매출 -->

   <association property="relout" javaType="Relout"> <!-- 출고테이블 -->
      <id column="rel_no" property="relNo"/>
      <result column="rel_date" property="relDate"/> <!-- 출고날짜 -->
      <result column="rel_cnt" property="relCnt"/> <!-- 출고갯수 -->
      <result column="rel_price" property="relPrice"/> <!-- 출고원자재가격 -->
   </association>

   <association property="product" javaType="Product"><!-- 상품테이블 -->
      <id column="pd_no" property="pdNo"/> 
      <result column="pd_price" property="pdPrice"/> <!-- 상품가격(가격) -->
      <result column="pd_cnt" property="pdCnt"/> <!-- 상품갯수 -->
      <result column="pd_pdn_no" property="pdPdnNo"/> <!-- 조인조건 : 생산번호 -->
   </association>

   <association property="production" javaType="Production"> <!-- 생산 테이블 -->
      <id column="pdn_no" property="pdnNo"/>  <!-- 조인조건 : 생산번호 -->
      <result column="pdn_product" property="pdnProduct"/>  <!-- 상품이름 -->
   </association>
</resultMap>

<!-- 기간검색 (OK) -->
<select id="selectTermList" resultMap="salesResultMap" parameterType="Sales">
   select 
   rel_date,
   pdn_product,
   pd_cnt,
   rel_price*rel_cnt as raw_price,
   pd_price*pd_cnt as total_sales,
   (pd_price*pd_cnt)-(rel_price*rel_cnt) as pure_sales
   from Production inner join Product on pdn_no = pd_pdn_no inner join Relout on pdn_rel_no = rel_no
   where rel_date between to_char(#{startDate}) and to_char(#{endDate})
   order by rel_date
</select>

...
<!-- 주간매출 -->
<select id="selectWeekList" resultMap="salesResultMap" parameterType="Sales">
   select 
   rel_date,
   pdn_product,
   pd_cnt, 
   rel_price*rel_cnt as raw_price,
   pd_price*pd_cnt as total_sales, 
   (pd_price*pd_cnt)-(rel_price*rel_cnt) as pure_sales 
   from Production inner join Product on pdn_no = pd_pdn_no inner join Relout on pdn_rel_no = rel_no
   where rel_date between to_char(sysdate-7,'yyyy-MM-dd') and to_char(sysdate,'yyyy-MM-dd')
   order by rel_date
</select>

<!-- 주간매출 -->
<!-- 주간매출 : 주간최대매출 -->
<select id="selectWeekMax" resultMap="salesResultMap">
    select * from(select 
    rel_date,
    pdn_product,
    pd_price*pd_cnt as total_sales,
    sum(pd_price*pd_cnt) over(partition by rel_date) maxi_sales
    from Production inner join Product on pdn_no = pd_pdn_no inner join Relout on pdn_rel_no = rel_no
    where rel_date between to_char(sysdate-7,'yyyy-MM-dd') and to_char(sysdate,'yyyy-MM-dd')
    order by maxi_sales desc)
  <![CDATA[where rownum<=1]]>
</select>

<!-- 주간매출 : 주간총매출 -->
<select id="selectWeekEntire" resultMap="salesResultMap">
    select sum(total_sales)entire_sales from
    (select 
    rel_date,
    pdn_product,
    pd_price*pd_cnt as total_sales
    from Production inner join Product on pdn_no = pd_pdn_no inner join Relout on pdn_rel_no = rel_no
    where rel_date between to_char(sysdate-7,'yyyy-MM-dd') and to_char(sysdate,'yyyy-MM-dd')
    order by rel_date desc)
</select>

<!-- 주간매출 : 주간평균매출 -->
<select id="selectWeekAvg" resultMap="salesResultMap">
	select round(avg(total_sales))avg_sales from
    (select 
    rel_date,
    pdn_product,
    pd_price*pd_cnt as total_sales
    from Production inner join Product on pdn_no = pd_pdn_no inner join Relout on pdn_rel_no = rel_no
    where rel_date between to_char(sysdate-7,'yyyy-MM-dd') and to_char(sysdate,'yyyy-MM-dd')
    order by rel_date desc)
</select>
...

<!-- 한달 간 총 주문수 -->
<select id="selectTotalOrder" resultMap="salesResultMap">
 	select count(*) as total_sales
    from relout
     where rel_date IN (SELECT TRUNC (SYSDATE, 'MM') + LEV - 1 AS THIS_MONTH FROM 
     (SELECT LEVEL AS LEV FROM DUAL
     <![CDATA[CONNECT BY LEVEL <= TO_CHAR (LAST_DAY (SYSDATE), 'DD')]]>))
</select>

<!-- 한달 간 총 발주량 -->
<select id="selectTotalRelout" resultMap="salesResultMap">
	select 
    sum(pd_cnt) as total_sales
    from Production inner join Product on pdn_no = pd_pdn_no inner join Relout on pdn_rel_no = rel_no
     where rel_date IN (SELECT TRUNC (SYSDATE, 'MM') + LEV - 1 AS THIS_MONTH FROM 
     (SELECT LEVEL AS LEV FROM DUAL
     <![CDATA[CONNECT BY LEVEL <= TO_CHAR (LAST_DAY (SYSDATE), 'DD')]]>))
</select>

<!-- 이번달 매출 -->
<select id="selectNowmonthSales" resultMap="salesResultMap">
  select sum(total_sales)nowmonth_sales from
    (select 
    rel_date,
    pdn_product,
    pd_price*pd_cnt as total_sales
    from Production inner join Product on pdn_no = pd_pdn_no inner join Relout on pdn_rel_no = rel_no
    where rel_date IN (SELECT TRUNC (SYSDATE, 'MM') + LEV - 1 AS THIS_MONTH FROM 
    (SELECT LEVEL AS LEV FROM DUAL
    <![CDATA[CONNECT BY LEVEL <= TO_CHAR (LAST_DAY (SYSDATE), 'DD')]]>))
    order by rel_date desc)
</select>
...

<!-- 이번분기 매출 -->
<select id="selectNowbunSales" resultMap="salesResultMap">
	select sum(total_sales)nowbun_sales from
    (select 
    rel_date,
    pdn_product,
    pd_price*pd_cnt as total_sales
    from Production inner join Product on pdn_no = pd_pdn_no inner join Relout on pdn_rel_no = rel_no
    where rel_date between 
    (select to_char(add_months(sysdate,-6),'yyyy-MM-dd') last_year from dual)
    and
    (select to_char(add_months(sysdate,0),'yyyy-MM-dd') now_month from dual))
</select>
...
</mapper>
```
