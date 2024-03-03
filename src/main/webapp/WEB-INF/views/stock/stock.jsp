<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<div class="container">
<div class="block-header">

<h2>재고 확인</h2>
<hr>

<div class="card">
    <div class="card-header">
    
		<div class="tab-content">
			<div role="tabpanel" class="tab-pane active" id="receiptList">
				<%-- 
				<div class="row">
					
					<div class="row">
						<div class="col-25">
							<label for="rcp_name" class="label-pre">재고상품명</label>
						</div>
	
						<div class="col-75">
							<div class="fg-line form-group">
								<input type="text" class="form-control input-sm" placeholder="입고상품명으로 검색가능합니다">
							</div>
						</div>
					</div>
				</div>
				--%>
				<div class="table-responsive">
					<table id="data-table-basic" class="table table-striped" aria-busy="false">
					    <thead>
					        <tr>
					            <th data-column-id="id" data-type="numeric">재고번호</th>
					            <th data-column-id="sender">재고이름</th>
					            <th data-column-id="sender1">재고수량</th>
					            <th data-column-id="sender2">재고입고날짜</th>
					            <th data-column-id="sender3">재고단가</th>
					            <th data-column-id="sender4">판매가격</th>
					        </tr>
					    </thead>
					    
					    <tbody>
					    
					    	<c:choose>
								<c:when test="${empty(stockList)}">
									<tr align="center">
										<td colspan="6">검색된 재고 정보가 없습니다.</td>				
									</tr>
								</c:when>
								
								<c:otherwise>
							    	<c:forEach var="stk" items="${stockList}">
							    		<tr>
							    			<td>${stk.stockNo}</td>
							    			<td>${stk.stockName}</td>
							    			<td>${stk.stockCnt}</td>
							    			<td>${stk.stockInDate}</td>
							    			<td>${stk.stockPrice}</td>
							    			<td>${stk.stockSalePrice}</td>
							    		</tr>
							    	</c:forEach>
							    </c:otherwise>
							</c:choose>
					    </tbody>
					</table>
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
		/*
		$("#data-table-command").bootgrid({
			formatters: {
                "commands": function(column, row) {
                    return "<button type=\"button\" class=\"btn btn-icon command-edit\" data-row-id=\"" + row.id + "\" onclick=\"location.href='${pageContext.request.contextPath}/receipt_update?rcpNo=" + row.id + "';\"><span class=\"md md-edit\"></span></button>"; 
                    
                }
            }
		});
		*/
	});
</script>