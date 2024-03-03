<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="container">
	<div class="block-header">

		<c:forEach var="sales" items="${nowMonth}">
			<h2>${sales.nowMonth}월매출</h2>
		</c:forEach>
	</div>

	<!-- mini chart -->
	<div class="mini-charts">
		<div class="row">
			<div class="col-sm-6 col-md-3">
				<div class="mini-charts-item bgm-cyan">
					<div class="clearfix">
						<div class="chart stats-bar"></div>
						<div class="count">
							<small>최고 매출</small>
							<c:forEach var="sales" items="${monthMax}">
								<small>(${sales.relout.relDate}일)</small>
								<h2>
									<fmt:formatNumber type="number" maxFractionDigits="3"
										value="${sales.maxiSales}" />
								</h2>
							</c:forEach>
						</div>
					</div>
				</div>
			</div>

			<div class="col-sm-6 col-md-3">
				<div class="mini-charts-item bgm-lightgreen">
					<div class="clearfix">
						<div class="chart stats-bar-2"></div>
						<div class="count">
							<small>최저 매출</small>
							<c:forEach var="sales" items="${monthMin}">
								<small>(${sales.relout.relDate}일)</small>
								<h2>
									<fmt:formatNumber type="number" maxFractionDigits="3"
										value="${sales.maxiSales}" />
								</h2>
							</c:forEach>
						</div>
					</div>
				</div>
			</div>

			<div class="col-sm-6 col-md-3">
				<div class="mini-charts-item bgm-orange">
					<div class="clearfix">
						<div class="chart stats-line"></div>
						<div class="count">
							<small>총 매출</small> <small>(당월기준)</small>
							<c:forEach var="sales" items="${monthEntire}">
								<h2>
									<fmt:formatNumber type="number" maxFractionDigits="3"
										value="${sales.entireSales}" />
								</h2>
							</c:forEach>
						</div>
					</div>
				</div>
			</div>

			<div class="col-sm-6 col-md-3">
				<div class="mini-charts-item bgm-red">
					<div class="clearfix">
						<div class="chart stats-line-2"></div>
						<div class="count">
							<small>평균 매출</small> <small>(당월기준)</small>
							<c:forEach var="sales" items="${monthAvg}">
								<h2>
									<fmt:formatNumber type="number" maxFractionDigits="3"
										value="${sales.avgSales}" />
								</h2>
							</c:forEach>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- for the past 30 days -->
	<div class="dash-widgets">
		<div class="row">
			<div class="col-md-3 col-sm-6">
				<div id="site-visits" class="dash-widget-item bgm-deeporange">
					<div class="dash-widget-header">
						<div class="p-20">
							<div class="dash-widget-visits"></div>
						</div>

						<div class="dash-widget-title">For the past 30 days</div>
					</div>

					<!-- 안에 내용들 -->
					<div class="p-20">

						<small>베스트 TOP 1</small>
						<c:forEach var="sales" items="${monthBest}" begin="0" end="0">
						<h2 class="m-0 f-400" style="color: white;">${sales.production.pdnProduct} <small style="color: white;">${sales.totalBestworst }개</small></h2>
						</c:forEach>

						<br /> <small>총 주문수</small>
						<c:forEach var="sales" items="${totalOrder}">
						<h3 class="m-0 f-400">${sales.totalSales} <small style="color: white;">bills</small></h3>
						</c:forEach>

						<br /> <small>총 발주량</small>
						<c:forEach var="sales" items="${totalRelout}">
						<h3 class="m-0 f-400">${sales.totalSales}<small style="color: white;">count</small></h3>
						</c:forEach>
					</div>
				</div>
			</div>

			<!-- 파이차트 -->
			<div class="col-md-3 col-sm-6">
				<div id="pie-charts" class="dash-widget-item">
					<div class="bgm-green">
						<div class="dash-widget-header">
							<div class="dash-widget-title">Sales Analysis</div>
						</div>

						<div class="clearfix"></div>

						<!-- 파이차트 1 -->
						<div class="text-center p-20 m-t-25">
						<c:forEach var="sales" items="monthInc">
							<div class="easy-pie main-pie" data-percent="${monthInc}">
								<div class="percent">${monthInc}</div>
						</c:forEach>
								<div class="pie-title">전월 대비</div>
							</div>
						</div>
					</div>

					<!-- 파이차트 2 -->
					<div class="p-t-20 p-b-20 text-center">
					<c:forEach var="sales" items="yearInc">
						<div class="easy-pie sub-pie-1" data-percent="${yearInc}">
							<div class="percent">${yearInc}</div>
					</c:forEach>
							<div class="pie-title">전년 대비</div>
						</div>
						<!-- 파이차트 3 -->
						<c:forEach var="sales" items="bungiInc">
						<div class="easy-pie sub-pie-2" data-percent="${bungiInc}">
							<div class="percent">${bungiInc}</div>
						</c:forEach>
							<div class="pie-title">분기 대비</div>
						</div>
					</div>
				</div>
			</div>

			<!-- 연두색 화면 -->
			<div class="col-md-3 col-sm-6">
				<div class="dash-widget-item bgm-lime">
					<div id="weather-widget"></div>
				</div>
			</div>

			<!-- 베스트셀러 1 -->
			<div class="col-md-3 col-sm-6">
				<div id="best-selling" class="dash-widget-item">
					<div class="dash-widget-header">
						<div class="dash-widget-title">Best Sellings</div>
						<!-- 꽃 사진 1 -->
						<img src="img/widgets/best_1.png" alt="">
							<div class="main-item">
								<small>베스트 아이템</small>
								<h2>TOP2 ~ TOP4</h2>
							</div>
					</div>

					<!-- 베스트셀러 2 -->
					<div class="listview p-t-5">
					<c:forEach var="sales" items="${monthBest}" begin="1" end="4" varStatus="status">
						<a class="lv-item" href="">
							<div class="media">
								<div class="pull-left">
									<!-- 꽃 사진 2 -->
								<c:choose>
								
								<c:when test="${status.first }">
									<img class="lv-img-sm" src="img/widgets/best_2.png" >
								</c:when>
								
								<c:when test="${status.last }">
									<img class="lv-img-sm" src="img/widgets/best_4.png" >
								</c:when>
								
								<c:when test="${status.count == 3 }">
									<img class="lv-img-sm" src="img/widgets/best_1.png" >
								</c:when>
								
								<c:otherwise>
									<img class="lv-img-sm" src="img/widgets/best_3.png" >
								</c:otherwise>
								
								</c:choose>
								</div>
								<div class="media-body">
									<div class="lv-title">${sales.production.pdnProduct} (${sales.totalBestworst }개)</div>
									<small class="lv-small">
									<fmt:formatNumber type="number" maxFractionDigits="3" value="${sales.product.pdPrice}" />
									원
									</small>
								</div>
							</div>
						</a> 
						</c:forEach>
						
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- 위젯 끝 -->
</div>