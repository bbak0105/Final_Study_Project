<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>



<div class="container">
	<div class="block-header">



		<div class="block-header">
			<h2>급여 상세 목록</h2>

			<ul class="actions">
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
			</ul>
		</div>

		<div class="card">
			<div class="card-header">
				<h2>급여 대장</h2>
			</div>
			<!-- 상세검색 -->
			<form action="salary_search" method="GET">
				<div class="container" style="margin-left: 16%;">
					<div class="row">
						<div class="col-25" style="text-align: center;">
							<label for="employee.empNo" class="label-pre">사번</label>
						</div>

						<div class="col-25">

							<div class="fg-line form-group">
								<input type="text" class="form-control input-sm" id="deliNo"
									name="employee.empNo" id="employee.empNo"
									placeholder="사번을 입력해주세요..">

							</div>
						</div>
					</div>

					<div class="row">
						<div class="col-25" style="text-align: center;">
							<label for="employee.empDepart" class="label-pre">부서</label>
						</div>

						<div class="col-25">

							<div class="fg-line form-group">
								<input type="text" class="form-control input-sm"
									id="employee.empDepart" name="employee.empDepart"
									placeholder="직위를 입력해주세요..">

							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-25" style="text-align: center;">
							<label for="employee.empName" class="label-pre">이름</label>
						</div>

						<div class="col-25">

							<div class="fg-line form-group">
								<input type="text" class="form-control input-sm"
									id="employee.empName" name="employee.empName"
									placeholder="이름을 입력해주세요..">

							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-25" style="text-align: center;">
							<label for="attdDate" class="label-pre">지금 년월</label>
						</div>

						<div class="col-75">
							<!-- 달력으로 날짜 선택 -->
							<div class="col-sm-4">
								<div class="input-group form-group">

									<div class="dtp-container dropdown fg-line">
										<input type="date" name="salMonth" id="salMonth">
									</div>
								</div>
							</div>
						</div>
					</div>










				</div>

				<button id="searchBtn" type="submit"
					class="btn btn-primary waves-effect waves-button waves-float"
					style="float: right; margin-left: 10px; margin-right: 32%">검색</button>
			</form>
			<!-- profile끝 -->
			<!-- </form> -->
			<button id="resetBtn"
				class="btn btn-primary waves-effect waves-button waves-float"
				style="float: right;">초기화</button>


			<br> <br> <br>
			<hr>


			<br>
			<!-- 상세검색 끝 -->


			<div class="table-responsive">
				<table id="data-table-command"
					class="table table-striped table-vmiddle">


					<thead>
						<tr>

						</tr>
						<tr>
							<th data-column-id="id">명세서고유번호</th>
							<th data-column-id="id">사번</th>
							<th data-column-id="sender">직급</th>
							<th data-column-id="sender">부서</th>
							<th data-column-id="2">이름</th>
							<th data-column-id="3">지급 총액</th>
							<th data-column-id="3">공제 총액</th>
							<th data-column-id="3">실지급액</th>


						</tr>
					</thead>
					<tbody>
						<c:forEach var="salary" items="${salaryList }">

							<tr>
								<td class="text-left"><a
									href="${pageContext.request.contextPath}/viewSalary?salNo=${salary.salNo}">
										${salary.salNo} </a></td>
								<td class="text-left">${salary.employee.empNo }</td>
								<c:if test="${salary.employee.empGrade==0}">
								<td class="text-left grade">사원</td>
								</c:if>
								<c:if test="${salary.employee.empGrade==8}">
								<td class="text-left grade">사장</td>
								</c:if>
								<td class="text-left">${salary.employee.empDepart }</td>
								<td class="text-left">${salary.employee.empName }</td>
								<td class="text-left salPsum">${salary.salPsum }원</td>
								<td class="text-left salMsum">${salary.salMsum }원</td>
								<td class="text-left salPay">${salary.salPay }원</td>




							</tr>
						</c:forEach>
					</tbody>
				</table>
					<div id="data-table-command-footer"
					class="bootgrid-footer container-fluid">
					<div class="row">
						<div class="col-sm-6">
							<ul class="pagination">
								<li class="first disabled" aria-disabled="true"><a
									href="#first" class="button"><i class="md md-more-horiz"></i></a></li>
								<li class="prev disabled" aria-disabled="true"><a href="#prev"
									class="button"><i class="md md-chevron-left"></i></a></li>
								<li class="page-1 active" aria-disabled="false"
									aria-selected="true"><a href="#1" class="button">1</a></li>
							
								<li class="next" aria-disabled="false"><a href="#next"
									class="button"><i class="md md-chevron-right"></i></a></li>
								<li class="last" aria-disabled="false"><a href="#last"
									class="button"><i class="md md-more-horiz"><i></i></i></a></li>
							</ul>
						</div>
						<div class="col-sm-6 infoBar">
							<div class="infos">Showing 1 to 10 of 20 entries</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- Javascript Libraries -->

		<!-- Data Table -->
		<script type="text/javascript">
		
			if ($(".grade").text() == "0") {
				$(".grade").text("사원");
			} else if ($(".grade").text() == "8") {
				$(".grade").text("사장");
			}
			
			function addComma(num) {
				var regexp = /\B(?=(\d{3})+(?!\d))/g;
				return num.toString().replace(regexp, ',');
			}

		
			/*
			$(document).ready(function() {
				var salPsum = addComma($(".salPsum").text());
				$(".salPsum").text(salPsum);
				$(".salPsum").val(salPsum);
			});

			$(document).ready(function() {
				var salMsum = addComma($(".salMsum").text());
				$(".salMsum").text(salMsum);
				$(".salMsum").val(salMsum);
			});

			$(document).ready(function() {
				var salPay = addComma($(".salPay").text());
				$(".salPay").text(salPay);
				$(".salPay").val(salPay);
			});
			*/
		</script>

	</div>
</div>