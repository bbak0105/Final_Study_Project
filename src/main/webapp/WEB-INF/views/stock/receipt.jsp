<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<div class="container">
<div class="block-header">

<h2>입고관리</h2>
<hr>

<div class="card">
    <div class="card-header">
    
    	<div role="tabpanel">
			<ul class="tab-nav" role="tablist" tabindex="1" style="overflow: hidden; outline: none;">
			      <li class="active"><a href="#receiptList" aria-controls="receiptList" role="tab" data-toggle="tab" aria-expanded="true">입고 목록</a></li>
			      <li class=""><a href="#receiptUpdate" aria-controls="receiptUpdate" role="tab" data-toggle="tab" aria-expanded="false">입고 수정</a></li>
			      <li class=""><a href="#receiptInsert" aria-controls="receiptInsert" role="tab" data-toggle="tab" aria-expanded="false">입고 등록</a></li>
			</ul>
		</div>
		
		
		<div class="tab-content">
			<div role="tabpanel" class="tab-pane active" id="receiptList">
				
				<div class="row">
					
					<div class="row">
						<div class="col-25">
							<label for="rcp_name" class="label-pre">입고상품명</label>
						</div>
	
						<div class="col-75">
							<div class="fg-line form-group">
								<input type="text" class="form-control input-sm" placeholder="입고상품명으로 검색가능합니다">
							</div>
						</div>
					</div>
				
					<div class="row">
					
						<div class="col-25">
							<label for="status_date" class="label-pre">입고일짜</label>
						</div>
	
						<div class="col-75">
							<div class="fg-line form-group">
								<input type="text" class="form-control input-sm" placeholder="입고일짜로 검색가능합니다">
							</div>
						</div>
					</div>
				</div>
				
				<div class="table-responsive">
					<table id="data-table-basic" class="table table-striped" aria-busy="false">
					    <thead>
					        <tr>
					            <th data-column-id="id" data-type="numeric">입고번호</th>
					            <th data-column-id="sender">입고상품명</th>
					            <th data-column-id="sender1">입고일짜</th>
					            <th data-column-id="sender2">입고갯수</th>
					            <th data-column-id="sender3">입고단가</th>
					            <th data-column-id="sender4">비고</th>
					        </tr>
					    </thead>
					    
					    <tbody>
					    
					    	<c:choose>
								<c:when test="${empty(rcpList)}">
									<tr align="center">
										<td colspan="6">검색된 거래처 정보가 없습니다.</td>				
									</tr>
								</c:when>
								
								<c:otherwise>
							    	<c:forEach var="rcp" items="${rcpList}">
							    		<tr>
							    			<td>${rcp.rcpNo}</td>
							    			<td>${rcp.rcpProduct}</td>
							    			<td>${rcp.rcpDate}</td>
							    			<td>${rcp.rcpCnt}</td>
							    			<td>${rcp.rcpPrice}</td>
							    			<td>${rcp.rcpMemo}</td>
							    		</tr>
							    	</c:forEach>
							    </c:otherwise>
							</c:choose>
					    </tbody>
					</table>
				</div>
			</div>
			
			
			<div role="tabpanel" class="tab-pane" id="receiptUpdate">
				
				<div class="table-responsive">
					<table id="data-table-command" class="table table-striped table-vmiddle" aria-busy="false">
					    <thead>
					        <tr>
					            <th data-column-id="id" data-type="numeric">입고번호</th>
					            <th data-column-id="sender">입고상품명</th>
					            <th data-column-id="sender1">입고일짜</th>
					            <th data-column-id="sender2">입고갯수</th>
					            <th data-column-id="sender3">입고단가</th>
					            <th data-column-id="sender4">비고</th>
					            <th data-column-id="commands" data-formatter="commands" data-sortable="false">수정</th>
					        </tr>
					    </thead>
					    
					    <tbody>
					    
					    	<c:choose>
								<c:when test="${empty(rcpList)}">
									<tr align="center">
										<td colspan="6">검색된 거래처 정보가 없습니다.</td>				
									</tr>
								</c:when>
								
								<c:otherwise>
							    	<c:forEach var="rcp" items="${rcpList}">
							    		<tr>
							    			<td>${rcp.rcpNo}</td>
							    			<td>${rcp.rcpProduct}</td>
							    			<td>${rcp.rcpDate}</td>
							    			<td>${rcp.rcpCnt}</td>
							    			<td>${rcp.rcpPrice}</td>
							    			<td>${rcp.rcpMemo}</td>
							    			<td>
								    			<button type="button" 
								    				class="btn btn-icon command-edit" 
								    				data-row-id="1000" 
								    				name="cltNo" 
								    				value="${rcp.rcpNo}" 
								    				onclick="location.href='${pageContext.request.contextPath}/stock/receipt_update?rcpNo=${rcp.rcpNo}';">
								    				<span class="md md-edit"></span>
								    			</button>
								    		</td>
							    		</tr>
							    	</c:forEach>
							    </c:otherwise>
							</c:choose>
					    </tbody>
					</table>
				</div>
			</div>
			
			
			<div role="tabpanel" class="tab-pane" id="receiptInsert">
				
				
				<div class="container1">
					<form action="receipt" method="post">
					
					<div class="row">
						<div class="col-xs-6 col-md-4" align="center">
							<label for="rcp_phone" class="label-pre">발주번호</label>
						</div>
	
						<div class="col-xs-6 col-md-4">
							<div class="fg-line form-group">
								<input type="text" class="form-control input-sm" placeholder="발주번호를 입력해주세요" name="rcpPoNo" id="rcpPoNo" required>
							</div>
						</div>
						
						<div class="col-xs-6 col-md-4">
							<div class="fg-line form-group">
								<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModalPo" id="rcpModalBtn">발주검색</button>
							</div>
						</div>
					</div>
				
					<div class="row">
					
						<div class="col-xs-6 col-md-4"  align="center">
							<label for="rcp_cnt" class="label-pre">입고갯수</label>
						</div>
	
						<div class="col-xs-6 col-md-4">
							<div class="fg-line form-group">
								<input type="text" class="form-control input-sm" placeholder="입고갯수를 입력해주세요" name="rcpCnt" id="rcpCnt">
							</div>
						</div>
					</div>
				
					<div class="row">
					
						<div class="col-xs-6 col-md-4"  align="center">
							<label for="rcp_price" class="label-pre">입고가격</label>
						</div>
	
						<div class="col-xs-6 col-md-4">
							<div class="fg-line form-group">
								<input type="text" class="form-control input-sm" placeholder="입고가격 입력해주세요" name="rcpPrice" id="rcpPrice">
							</div>
						</div>
					</div>
				
					<div class="row">
					
						<div class="col-xs-6 col-md-4"  align="center">
							<label for="rcp_product" class="label-pre">입고상품</label>
						</div>
	
						<div class="col-xs-6 col-md-4">
							<div class="fg-line form-group">
								<input type="text" class="form-control input-sm" placeholder="입고상품을 입력해주세요" name="rcpProduct" id="rcpProduct">
							</div>
						</div>
					</div>
				
					<div class="row">
					
						<div class="col-xs-6 col-md-4"  align="center">
							<label for="rcp_memo" class="label-pre">비고</label>
						</div>
	
						<div class="col-xs-6 col-md-4">
							<div class="fg-line form-group">
								<textarea rows="4" cols="60" name="rcpMemo"></textarea>
								<%-- <input type="text" class="form-control input-sm" placeholder="비고를 입력해주세요" name="rcpMemo"> --%>
							</div>
						</div>
					</div>
					
					
					<!-- The Modal 발주정보 -->
					<div class="modal" id="myModalPo">
					  <div class="modal-dialog modal-lg">
					    <div class="modal-content">
					
					      <!-- Modal Header -->
					      <div class="modal-header">
					        <h4 class="modal-title">발주 선택</h4>
					      </div>
					
					      <!-- Modal body -->
					      <div class="modal-body">
						      <table id="po-table-modal" class="table table-bordered table-hover text-center">
							      <tr>
							      	<th>발주번호</th>
							      	<th>발주상품</th>
							      	<th>발주수량</th>
							      	<th>발주가격</th>
							      </tr>
							      
							      <c:choose>
										<c:when test="${empty(poList)}">
											<tr align="center">
												<td colspan="4">검색된 발주 정보가 없습니다.</td>				
											</tr>
										</c:when>
										
										<c:otherwise>
									    	<c:forEach var="po" items="${poList}">
									    		<tr>
									    			<td>${po.poNo}</td>
									    			<td>${po.poProduct}</td>
									    			<td>${po.poCnt}</td>
									    			<td>${po.poPrice}</td>
									    		</tr>
									    	</c:forEach>
									    </c:otherwise>
									</c:choose>
							      
						      </table>
					      </div>
					
					      <!-- Modal footer -->
					      <div class="modal-footer">
					        <button type="button" class="btn btn-danger" data-dismiss="modal" id="modalClose">Close</button>
					      </div>
					
					    </div>
					  </div>
					</div>
					
					
					<%-- 출고 테이블에 데이터 전송 --%>
					<input type="hidden" name="relPrice" id="relPrice">
					<input type="hidden" name="relCnt" id="relCnt">
					
					
					<%-- 재고 테이블에 데이터 전송 --%>
					<%-- <input type="hidden" name="stockRcpNo" id="stockRcpNo"> --%>
					<%-- <input type="hidden" name="stockRelNo" id="stockRelNo"> --%>
					<input type="hidden" name="stockName" id="stockName">
					<input type="hidden" name="stockCnt" id="stockCnt">
					<input type="hidden" name="stockPrice" id="stockPrice">
					<input type="hidden" name="stockSalePrice" id="stockSalePrice">
					
				
					<button type="submit" class="btn btn-primary waves-effect waves-button waves-float" style="float : right">등록</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>
</div>
</div>


<script type="text/javascript">
	
	$(document).ready(function(){
		
		$("#data-table-basic").bootgrid();

		$("#data-table-command").bootgrid({
			formatters: {
                "commands": function(column, row) {
                    return "<button type=\"button\" class=\"btn btn-icon command-edit\" data-row-id=\"" + row.id + "\" onclick=\"location.href='${pageContext.request.contextPath}/receipt_update?rcpNo=" + row.id + "';\"><span class=\"md md-edit\"></span></button>"; 
                    
                }
            }
		});
		
		
		$("#po-table-modal tr").click(function() {
			
			var tr = $(this);
			var td = tr.children();
			
			var poNo = td.eq(0).text();
			var poProduct = td.eq(1).text();
			var poCnt = td.eq(2).text();
			var poPrice = td.eq(3).text();
			
			// 모달을 이용해서 값 전달 주문 PK
			$("#rcpPoNo").val(poNo);
			$("#rcpPoNo").text(poNo);
			// $("#rcpPoNo").html(poNo);
			
			// 발주 상품
			$("#rcpProduct").val(poProduct);
			$("#rcpProduct").text(poProduct);
			// $("#rcpProduct").html(poProduct);
			// 재고에 상품 이름 전달
			$("#stockName").val(poProduct);
			$("#stockName").text(poProduct);
			
			
			// 발주 수량
			$("#rcpCnt").val(poCnt);
			$("#rcpCnt").text(poCnt);
			// $("#rcpCnt").html(poCnt);
			// 출고에 수량 전달
			$("#relCnt").val(poCnt);
			$("#relCnt").text(poCnt);
			
			// 재고에 수량 전달
			$("#stockCnt").val(poCnt);
			$("#stockCnt").text(poCnt);
			
			
			// 발주 가격
			$("#rcpPrice").val(poPrice);
			$("#rcpPrice").text(poPrice);
			// $("#rcpPrice").html(poPrice);
			// 출고 테이블에 원자재 가격 전달
			$("#relPrice").val(poPrice);
			$("#relPrice").text(poPrice);
			// 재고 테이블에 원자재 가격 전달
			$("#stockPrice").val(poPrice);
			$("#stockPrice").text(poPrice);
			// 재고 테이블에 판매가격 전달
			$("#stockSalePrice").val(poPrice * 1.2);
			$("#stockSalePrice").text(poPrice * 1.2);
			
			
			
			$("#modalClose").trigger("click");
		});
	});
	
</script>