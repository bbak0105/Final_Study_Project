<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>


<div class="container">
	<div class="block-header">


		<div class="card">
			<div class="card-header">
				<h2>
					2020년 10월 급여 명세서<small> member modify</small>
				</h2>
			</div>

			<div class="card-body card-padding">
				<form id="insertForm">

					<!-- 옵션 선택 문 주석 -->

					<!-- 일반 인서트 문 시작 -->
					<div class="table-responsive">
						<table id="data-table-basic" class="table table-striped">
							<thead>
								<tr>
									<th><h4>지급내역</h4></th>
									<th><input type="hidden" name="salEmpNo" value="${empNo}"> </th>
								</tr>
								
							</thead>

							<tbody class="table table-bordered">
								<tr>
									<th>기본급</th>
									<th>주말수당</th>
									<th>지급총액</th>
								</tr>
								<tr>
									<td><input name="salBase" id="salBase" type="text" readonly="readonly"
										value="${salary.salBase} "  size="12"/>원</td>
									<td><input name="salHoliday" id="salHoliday" type="text" readonly="readonly"
										value="${salary.salHoliday}" size="12"/>원</td>
									<td><input name="salPsum" id="salPsum" type="text" readonly="readonly"
										value="${salary.salPsum}" size="12">원</td>
								</tr>
							</tbody>
						</table>

						<table id="data-table-basic" class="table table-striped">
							<thead>
								<tr>
									<th><h4>공제내역</h4></th>
								</tr>
							</thead>
							<tbody class="table table-bordered">
								<tr>
									<th>국민연금</th>
									<th>건강보험</th>
									<th>고용보험</th>
									<th>소득세</th>
									<th>지방세</th>
									<th>공제총액</th>
								</tr>
								<tr>

									<td><input name="salAnnuity" id="salAnnuity" type="text" readonly="readonly"
										value="${salary.salAnnuity}" size="12" />원</td>
									<td><input name="salHealth" id="salHealth" type="text" readonly="readonly"
										value="${salary.salHealth }" size="12" /></td>
									<td><input name="salHire" id="salHire" type="text" readonly="readonly"
										value="${salary.salHire}" size="12">원</td>
									<td><input name="salIncome" id="salIncome" type="text" readonly="readonly"
										value="${salary.salIncome }" size="12"/>원</td>
									<td><input name="salLocal" id="salLocal" type="text" readonly="readonly"
										value="${salary.salLocal}" size="12"/>원</td>
									<td><input name="salMsum" id="salMsum" type="text" readonly="readonly"
										value="${salary.salMsum}" size="12"/>원</td>
								</tr>
							</tbody>

						</table>

						<table id="data-table-basic" class="table table-striped">
							<thead>
								<tr>
									<th><h4>합계</h4></th>
								</tr>
							</thead>
							<tbody class="table table-bordered">
								<tr>
									<th>지급총액</th>
									<th>공제총액</th>
									<th>차감지급액</th>
								</tr>
								<tr>
									<td><input name="salPsum" id="salPsum" type="text" readonly="readonly"
										value="${salary.salPsum}" />원</td>
									<td><input name="salMsum1" id="salMsum1" type="text" readonly="readonly"
										value="${salary.salMsum}" />원</td>
									<td><input name="salPay" id="salPay" type="text" value="${salary.salPay}" readonly="readonly" />원</td>
								</tr>
							</tbody>

						</table>
					</div>
					
				</form>
			</div>
		</div>

		<script type="text/javascript">
			

	
			
			
	
		</script>
	</div>
</div>
