<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="container">
	<div class="block-header">
		<h2>전자결재요청</h2>

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
			<h2>전자 결재 요청 목록</h2>
		</div>
		<!-- 상세검색 -->
		<form action="auth_search" method="GET">
			<div class="container" style="margin-left: 16%;">
				<div class="row">
					<div class="col-25" style="text-align: center;">
						<label for="authNo" class="label-pre">결재번호</label>
					</div>

					<div class="col-25">

						<div class="fg-line form-group">
							<input type="text" class="form-control input-sm" id="deliNo"
								name="authNo" id="authNo" placeholder="검색할 결재번호를 입력해주세요..">

						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-25" style="text-align: center;">
						<label for="employee.empName" class="label-pre">사원이름</label>
					</div>

					<div class="col-25">

						<div class="fg-line form-group">
							<input type="text" class="form-control input-sm"
								id="employee.empName" name="employee.empName"
								placeholder="사원이름을 입력해주세요..">

						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-25" style="text-align: center;">
						<label for="empDepart" class="label-pre">사원부서</label>
					</div>

					<div class="col-25">
						<div class="form-group">
							<div class="fg-line">
								<div class="select">
									<select class="form-control" name="empDepart" id="empDepart">
										<option value="인사팀">인사팀</option>

									</select>
								</div>
							</div>
						</div>
					</div>
				</div>



				<div class="row">
					<div class="col-25" style="text-align: center;">
						<label for="authReqdate" class="label-pre">결재요청일시</label>
					</div>

					<div class="col-75">

						<div class="col-sm-4">
							<div class="input-group form-group">

								<div class="dtp-container dropdown fg-line">
									<input type="date" name="authReqdate" id="authReqdate">
								</div>
							</div>
						</div>


					</div>
				</div>

			</div>

			<button id="searchBtn" type="submit"
				class="btn btn-primary waves-effect waves-button waves-float"
				style="float: right; margin-left: 10px; margin-right: 32%">검색</button>
	
		<!-- profile끝 -->
		<!-- </form> -->
		<button id="resetBtn"
			class="btn btn-primary waves-effect waves-button waves-float"
			style="float: right;">초기화</button>
		
		<!-- 상세검색 끝 -->
		<br> <br> <br>
		<hr>
		<br>
		<!-- 상세검색 끝 -->
		</form>
		<div class="table-responsive">
			<table id="data-table-command"
				class="table table-striped table-vmiddle">
				<thead>
					<tr>
						<th data-column-id="a">결재 번호</th>
						<th data-column-id="b">이름</th>
						<th data-column-id="c">부서</th>
						<th data-column-id="d">직급</th>
						<th data-column-id="e">제목</th>
						<th data-column-id="f">결재 여부</th>
						<th data-column-id="g">휴가시작일</th>
						<th data-column-id="commands">휴가종료일</th>
						<th data-column-id="a">결재요청일</th>
					</tr>
				</thead>


				<tbody>
					<!-- 데이터 출력 -->
					<c:forEach var="authoriztion" items="${authorList }">

						<tr>
							<td class="text-left"><a
								href="${pageContext.request.contextPath}/viewAuthor?authNo=${authoriztion.authNo }">
								${authoriztion.authNo }
								</a></td>
							<td class="text-left">${authoriztion.employee.empName }</td>
							<td class="text-left">${authoriztion.employee.empDepart }</td>
							<c:if test="${authoriztion.employee.empGrade==0 }"> 
							<td class="text-left grade">사원</td>
							</c:if>	
							<c:if test="${authoriztion.employee.empGrade==8 }"> 
							<td class="text-left grade">사장</td>
							</c:if>							
							<td class="text-left">${authoriztion.authSubject }</td>
							<c:if test="${authoriztion.authYn ==0}"> 
							<td class="text-left yn">N</td>
							</c:if>
							<td class="text-left">${authoriztion.authSdate }</td>
							<td class="text-left">${authoriztion.authEdate }</td>
							<td class="text-left">${authoriztion.authReqdate }</td>
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


<script type="text/javascript">
	if ($(".yn").text() == "0") {
		$(".yn").text("N");
	} else if ($(".yn").text() == "1") {
		$(".yn").text("Y");
	}
</script>