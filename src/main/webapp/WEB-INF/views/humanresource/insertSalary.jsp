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
										value="${(attitude.attdNoCount)*68720+(author.authSum)*68720 }" size="12"/>원</td>
									<td><input name="salHoliday" id="salHoliday" type="text" readonly="readonly"
										value="${68720*4}" size="12"/>원</td>
									<td><input name="salPsum" id="salPsum" type="text" readonly="readonly"
										value="${((attitude.attdNoCount+author.authSum)+4)*68720 }" size="12">원</td>
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
										value="${(((attitude.attdNoCount)*68720)*0.09) }" size="12" />원</td>
									<td><input name="salHealth" id="salHealth" type="text" readonly="readonly"
										value="${14550 }" size="12" /></td>
									<td><input name="salHire" id="salHire" type="text" readonly="readonly"
										value="${(((attitude.attdNoCount)*68720)*0.0025) }" size="12">원</td>
									<td><input name="salIncome" id="salIncome" type="text" readonly="readonly"
										value="${(((attitude.attdNoCount)*68720)*0.02) }" size="12"/>원</td>
									<td><input name="salLocal" id="salLocal" type="text" readonly="readonly"
										value="${(((attitude.attdNoCount)*68720)*0.002) }" size="12"/>원</td>
									<td><input name="salMsum" id="salMsum" type="text" readonly="readonly"
										value="${(((attitude.attdNoCount)*68720)*0.1145)+14550 }" size="12"/>원</td>
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
										value="${((attitude.attdNoCount+author.authSum)+4)*68720 }" />원</td>
									<td><input name="salMsum1" id="salMsum1" type="text" readonly="readonly"
										value="${(((attitude.attdNoCount)*68720)*0.1145)+14550 }" />원</td>
									<td><input name="salPay" id="salPay" type="text"  readonly="readonly" value="" />원</td>
								</tr>
							</tbody>

						</table>
					</div>
					<div align="center">
					<button type="submit" class="btn btn-primary btn-sm m-t-10">cancel</button>
					<button type="button" class="btn btn-primary btn-sm m-t-10"
						onclick="submitCheck();">submit</button>
					</div>
				</form>
			</div>
		</div>

		<script type="text/javascript">
			$(document).ready(function() {
				var salAnnuity = Math.ceil($("#salAnnuity").val());
				$("#salAnnuity").text(salAnnuity);
				$("#salAnnuity").val(salAnnuity);
			});

			$(document).ready(function() {
				var salHire = Math.ceil($("#salHire").val());
				$("#salHire").text(salHire);
				$("#salHire").val(salHire);
			});

			$(document).ready(function() {
				var salIncome = Math.ceil($("#salIncome").val());
				$("#salIncome").text(salIncome);
				$("#salIncome").val(salIncome);
			});

			$(document).ready(function() {
				var salLocal = Math.ceil($("#salLocal").val());
				$("#salLocal").text(salLocal);
				$("#salLocal").val(salLocal);
			});

			$(document).ready(function() {
				var salMsum = Math.ceil($("#salMsum").val());
				$("#salMsum").text(salMsum);
				$("#salMsum").val(salMsum);
			});

			$(document).ready(function() {
				var salMsum1 = Math.ceil($("#salMsum1").val());
				var salPsum = $("#salPsum").val()
				$("#salMsum1").text(salMsum1);
				$("#salMsum1").val(salMsum1);
				var salPay = salPsum - salMsum1;
				$("#salPay").val(salPay);
			});
			
			
			function submitCheck() {
				insertForm.method = "POST";
				insertForm.action = "${pageContext.request.contextPath}/insertPay";
				insertForm.submit();
				
			}
	
		</script>
	</div>
</div>
