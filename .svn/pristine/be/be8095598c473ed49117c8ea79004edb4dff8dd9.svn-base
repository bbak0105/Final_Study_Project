<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<div class="container">
<div class="block-header">


	<div class="card">
		<div class="card-header">
			<h2>
				발주 결재 요청서<small> Authorization</small>
			</h2>
		</div>

		<div class="card-body card-padding">
			<form  name="updateForm" action="authorization_po" method="post">
				<div role="tabpanel" class="tab-pane" id="placerorderdata">
		
					<div class="table-responsive">
						<table id="data-table-command" class="table table-striped table-vmiddle" aria-busy="false">
						    <thead>
						        <tr>
						            <th data-column-id="id" data-type="numeric">발주번호</th>
						            <th data-column-id="sender">주문번호</th>
						            <th data-column-id="sender1">사원번호</th>
						            <th data-column-id="sender2">거래처번호</th>
						            <th data-column-id="sender3">발주상품</th>
						            <th data-column-id="sender4">발주수량</th>
						            <th data-column-id="sender5">발주단가</th>
						            <th data-column-id="sender6">발주날짜</th>
						            <th data-column-id="sender7">발주상태</th>
						            <th data-column-id="sender8">결제처리여부</th>
						            <th data-column-id="commands" data-formatter="commands" data-sortable="false">승인</th>
						        </tr>
						    </thead>
						    
						    <tbody>
						    	<c:choose>
									<c:when test="${empty(placeorderList)}">
										<tr align="center">
											<td colspan="11">승인 요청중인 발주 정보가 없습니다.</td>				
										</tr>
									</c:when>
									
									<c:otherwise>
								    	<c:forEach var="placeorder" items="${placeorderList}">
								    		<tr>
								    			<td>${placeorder.poNo}</td>
								    			<td>${placeorder.poOrderNo}</td>
								    			<td>${placeorder.poEmpNo}</td>
								    			<td>${placeorder.poCltNo}</td>
								    			<td>${placeorder.poProduct}</td>
								    			<td>${placeorder.poCnt}</td>
								    			<td>${placeorder.poPrice}</td>
								    			<td>${placeorder.poDate}</td>
								    			<td>${placeorder.poStatus}</td>
								    			<td>${placeorder.poPermit}</td>
								    			<td>
									    			<%-- <button type="button" class="btn btn-icon command-edit" data-row-id="${placeorder.poNo}" onclick="location.href='${pageContext.request.contextPath}/placeorder/ploUpdate?poNo=${placeorder.poNo}';"><span class="md md-edit"></span></button> --%>
									    			<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModalAut" id="cltModalBtn" value="${placeorder.poNo}"><span class="md md-edit"></span></button>
									    		</td>
								    		</tr>
								    	</c:forEach>
								    </c:otherwise>
								</c:choose>
						    </tbody>
						</table>
					</div>
				</div>
				
				<!-- The Modal 발주 정보 승인 처리 확인 모달 -->
				<div class="modal" id="myModalAut">
				  <div class="modal-dialog modal-lg">
				    <div class="modal-content">
				
				      <!-- Modal Header -->
				      <div class="modal-header">
				        <h4 class="modal-title">발주 확인</h4>
				      </div>
				
				      <!-- Modal body -->
				      <div class="modal-body">
				      	
				      	<h3>승인 처리하시겠습니까?</h3>
				      	<hr>
				      	
				      	<button type="button" class="btn btn-danger" id="autBtn">승인</button><button type="button" class="btn btn-danger" data-dismiss="modal" id="autModalClose">취소</button>
				      	
				      </div>
				    </div>
				  </div>
				</div>
				
				<div style="display: none;">
					<input type="hidden" id="poNo" name="poNo" value="">
					<button type="button" id="submitBtn">전송</button>
				</div>
			</form>
		</div>
	</div>
		
<script type="text/javascript">

	$(document).ready(function(){
		
		$("#data-table-basic").bootgrid();
		/*
		$("#data-table-command").bootgrid({
			formatters: {
                "commands": function(column, row) {
                    return "<button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#myModalAut\" id=\"cltModalBtn\" data-row-id=\"" + row.id + "\" value=\"" + row.id + "\"><span class=\"md md-edit\"></span></button>"; 
                }
            }
		});
		*/
		
		$(".btn-primary").click(function() {
			
			var poNo = $(this).val();
			// alert(poNo);
			
			$("#poNo").val(poNo);
			$("#poNo").text(poNo);
		});
		
		
		$("#autBtn").click(function() {
			// alert("작동확인");
			/*
			*/
			// alert($("#poNo").val());
			$("#autModalClose").trigger("click");
//			$("#submitBtn").trigger("click");
			updateForm.method = "POST";
			updateForm.action = "${pageContext.request.contextPath}/authorization_po";
			updateForm.submit();
		});
	});
</script>

</div>
</div>
