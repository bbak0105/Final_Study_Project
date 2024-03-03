<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

			<div class="container">
				<!-- 넣어봄 -->
				<div class="block-header">
					<h2>당월 매출</h2>
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
										<h2 >
										<fmt:formatNumber type="number" maxFractionDigits="3" value="${sales.maxiSales}" />
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
										<h2 >
										<fmt:formatNumber type="number" maxFractionDigits="3" value="${sales.maxiSales}" />
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
										<small>총 매출</small>
										<small>(당월기준)</small>
										<c:forEach var="sales" items="${monthEntire}">
										<h2 >
										<fmt:formatNumber type="number" maxFractionDigits="3" value="${sales.entireSales}" />
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
										<small>평균 매출</small>
										<small>(당월기준)</small>
										<c:forEach var="sales" items="${monthAvg}">
										<h2 >
										<fmt:formatNumber type="number" maxFractionDigits="3" value="${sales.avgSales}" />
										</h2>
										</c:forEach>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- minichart 끝 -->
				
				<div class="block-header">
					<h2>Data Table</h2>

					<!--  <ul class="actions">
						<li><a href=""> <i class="md md-trending-up"></i>
						</a></li>
						<li><a href=""> <i class="md md-done-all"></i>
						</a></li>
						<li class="dropdown"><a href="" data-toggle="dropdown"> <i
								class="md md-more-vert"></i>
						</a>

							<ul class="dropdown-menu dropdown-menu-right">
								<li><a href="">Refresh</a></li>
								<li><a href="">Manage Widgets</a></li>
								<li><a href="">Widgets Settings</a></li>
							</ul></li>
					</ul>-->
				</div>

				<div class="card">
					<div class="card-header">
						<h2>
							상세 목록 검색 <small>검색하고자 하는 컬럼 값을 검색하세요.</small>
						</h2>
					</div>

					<table id="data-table-command"
						class="table table-striped table-vmiddle">
						<thead>
							<tr>
								<th data-column-id="date" data-order="desc">날짜</th>
								<th data-column-id="product">품목</th>
								<th data-column-id="number" data-type="numeric">갯수</th>
								<th data-column-id="production" data-type="numeric">생산원가</th>
								<th data-column-id="sales" data-type="numeric">매출액</th>
								<th data-column-id="pure" data-type="numeric">순 매출액</th>
								<th data-column-id="commands" data-formatter="commands"
						data-sortable="false">비고</th>
							</tr>
						</thead>
						<tbody>
						
						<!-- 데이터 출력 -->
						<c:forEach var="sales" items="${monthList}">
							<tr>
								<td class="text-left">${sales.relout.relDate} </td>
								<td class="text-left">${sales.production.pdnProduct}</td>
								<td class="text-left">${sales.product.pdCnt}</td>
								<td class="text-left">${sales.rawPrice}</td>
								<td class="text-left">${sales.totalSales}</td>
								<td class="text-left">${sales.pureSales}</td>
							</tr>
						</c:forEach>	
						</tbody>
					</table>
				</div>
			</div>

	<!-- Javascript Libraries -->
	
			<script src="${pageContext.request.contextPath }/js/jquery-2.1.1.min.js"></script>
			<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
		
			<script src="${pageContext.request.contextPath }/vendors/nicescroll/jquery.nicescroll.min.js"></script>
			<script src="${pageContext.request.contextPath }/vendors/bootgrid/jquery.bootgrid.min.js"></script>
			<script src="${pageContext.request.contextPath }/vendors/waves/waves.min.js"></script>
			<script src="${pageContext.request.contextPath }/vendors/bootstrap-growl/bootstrap-growl.min.js"></script>
			<script src="${pageContext.request.contextPath }/vendors/sweet-alert/sweet-alert.min.js"></script>
		
	<!-- Data Table -->
	<script type="text/javascript">
   
   $(document).ready(function(){
      
      // 템플릿 기능 활성화
      $("#data-table-basic").bootgrid();
      $("#data-table-command").bootgrid();
   });
   
   /*
   {
         formatters: {
                "commands": function(column, row) {
                   return "<button type=\"button\" class=\"btn btn-icon command-edit\" data-row-id=\"" + row.num + "\" onclick=\"location.href='${pageContext.request.contextPath}/placeorder/cltUpdate?cltNo=" + row.num + "';\"><span class=\"md md-edit\"></span></button>";
                }
            }
      }
   */
   </script>