<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<div class="container">
	<div class="block-header">

		<div class="block-header">
			<h2>급여지급</h2>

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
				<h2>사원 검색</h2>
			</div>
			<!-- 상세검색 -->
			<form action="empoyee_search" method="GET">
				<div class="container" style="margin-left: 16%;">
					<div class="row">
						<div class="col-25" style="text-align: center;">
							<label for="empNo" class="label-pre">사번</label>
						</div>

						<div class="col-25">

							<div class="fg-line form-group">
								<input type="text" class="form-control input-sm" name="empNo"
									id="empNo" placeholder="사원번호를 입력해주세요..">

							</div>
						</div>
					</div>

					<div class="row">
						<div class="col-25" style="text-align: center;">
							<label for="tpName" class="label-pre">성명</label>
						</div>

						<div class="col-25">

							<div class="fg-line form-group">
								<input type="text" class="form-control input-sm" id="empName"
									name="empName" placeholder="성명을 입력해주세요..">

							</div>
						</div>
					</div>

					<div class="row">
						<div class="col-25" style="text-align: center;">
							<label for="tpName" class="label-pre">부서</label>
						</div>

						<div class="col-25">

							<div class="fg-line form-group">
								<input type="text" class="form-control input-sm" id="empDepart"
									name="empDepart" placeholder="부서를 입력해주세요..">

							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-25" style="text-align: center;">
							<label for="tpName" class="label-pre">직급</label>
						</div>

						<div class="col-25">

							<div class="fg-line form-group">
								<select name="empGrade" id="empGrade"
									class="form-control input-sm">
									<option value="">직급을 선택해주세요.</option>
									<option value="0">사원</option>
									<option value="8">사장</option>
								</select>
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
							<th data-column-id="a">사번</th>
							<th data-column-id="b">성명</th>
							<th data-column-id="c">주민번호</th>
							<th data-column-id="d">부서</th>
							<th data-column-id="e">직급</th>
							<th data-column-id="f">입사 일자</th>
							<th data-column-id="g">계좌 번호</th>
							<th data-column-id="h">이메일</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="employee" items="${insertSalaryList }">

							<tr>
								<td class="text-left"><a
									href="${pageContext.request.contextPath}/insertSalary?empNo=${employee.empNo }">
										${employee.empNo} </a></td>
								<td class="text-left">${employee.empName }</td>
								<td class="text-left">${employee.empRegino }</td>
								<td class="text-left">${employee.empDepart }</td>
								<c:if test="${employee.empGrade==0 }">
								<td class="text-left grade">사원</td>
								</c:if>
								<c:if test="${employee.empGrade==8 }">
								<td class="text-left grade">사장</td>
								</c:if>
								<td class="text-left">${employee.empSdate }</td>
								<td class="text-left">${employee.empAccount }</td>
								<td class="text-left">${employee.empEmail }</td>



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
	</div>
</div>

<!-- Javascript Libraries -->


<!-- Data Table -->
<script type="text/javascript">
	$(document).ready(function() {
		$("#data-table-command").bootgrid();

	});
</script>

<script type="text/javascript">
	if ($(".grade").text() == "0") {
		$(".grade").text("사원");
	} else if ($(".grade").text() == "8") {
		$(".grade").text("사장");
	}
</script>

