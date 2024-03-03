<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<div class="container">
	<div class="block-header">


		<div class="block-header">
			<h2>근태관리</h2>

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
				<h2>근태현황</h2>
			</div>
			<!-- 상세검색 -->
		<form action="attitude_search" method="GET">
			<div class="container" style="margin-left: 16%;">
				<div class="row">
					<div class="col-25" style="text-align: center;">
						<label for="attdContent" class="label-pre">출근/퇴근</label>
					</div>

					<div class="col-25">

						<div class="fg-line form-group">
							<input type="text" class="form-control input-sm" id="attdContent"
								name="attdContent" id="attdContent" placeholder="출퇴근 유무를 입력해주세요..">

						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-25" style="text-align: center;">
						<label for="employee.empName" class="label-pre">사원이름</label>
					</div>

					<div class="col-25">

						<div class="fg-line form-group">
							<input type="text" class="form-control input-sm" id="tpName"
								name="employee.empName" placeholder="사원이름을 입력해주세요..">

						</div>
					</div>
				</div>


					<div class="row">
					<div class="col-25" style="text-align: center;">
						<label for="employee.empDepart" class="label-pre">부서명</label>
					</div>

					<div class="col-25">

						<div class="fg-line form-group">
							<input type="text" class="form-control input-sm" id="employee.empDepart"
								name="employee.empDepart" placeholder="사원부서를 입력해주세요..">

						</div>
					</div>
				</div>
				
		

				<div class="row">
					<div class="col-25" style="text-align: center;">
						<label for="attdDate" class="label-pre">근태 날짜</label>
					</div>

					<div class="col-75">
						<!-- 달력으로 날짜 선택 -->
						<div class="col-sm-4">
							<div class="input-group form-group">

								<div class="dtp-container dropdown fg-line">
									<input type="date" name="attdDate" id="attdDate">
								</div>
							</div>
						</div>
						<!-- 날짜 선택 끝 -->

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
							<th data-column-id="a">근태날짜</th>
							<th data-column-id="b">부서명</th>
							<th data-column-id="c">직급</th>
							<th data-column-id="d">사원명</th>
							<th data-column-id="e">근태종류</th>
							<th data-column-id="f">근태적요</th>
							<th data-column-id="g">시작시간</th>
							<th data-column-id="h">종료시간</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="attitude" items="${attitudeList }">

							<tr>
								<td class="text-left">${attitude.attdDate }</td>
								<td class="text-left">${attitude.employee.empDepart }</td>
								<c:if test="${attitude.employee.empGrade==8 }">
									<td class="text-left grade">사장</td>
								</c:if>
								<c:if test="${attitude.employee.empGrade==0 }">
									<td class="text-left grade">사원</td>
								</c:if>
								
								<!--<td class="text-left grade">${attitude.employee.empGrade }</td>	-->							
								<td class="text-left">${attitude.employee.empName }</td>
								<td class="text-left">${attitude.attdCase }</td>
								<td class="text-left">${attitude.attdContent }</td>
								<td class="text-left">${attitude.attdStime }</td>
								<td class="text-left">${attitude.attdEtime }</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				
			</div>
		</div>
	</div>
</div>

<!-- Javascript Libraries -->


<!-- Data Table -->
<script type="text/javascript">
            $(document).ready(function(){
               $("#data-table-command").bootgrid();
         
            });        
</script>

<script type="text/javascript">
	if($(".grade").text() =="0"){
		$(".grade").text("사원");
	}else if($(".grade").text() =="8"){
		$(".grade").text("사장");
	}

</script>