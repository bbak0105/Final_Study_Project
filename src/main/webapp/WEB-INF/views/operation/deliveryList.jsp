<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<div class="container">
	<div class="block-header">

		<h2>배송관리</h2>
		<br>

		<!-- ----- -->
		<div class="card">
			<div class="card-header">

				<!-- tab부분 -->
				<div role="tabpanel">
					<ul class="tab-nav" role="tablist" tabindex="1"
						style="overflow: hidden; outline: none;">
						<li class="active"><a href="#messages11"
							aria-controls="messages11" role="tab" data-toggle="tab"
							aria-expanded="true">배송 목록</a></li>
					</ul>

					<div class="tab-content">
						<!-- 상품목록 -->
						<div role="tabpanel" class="tab-pane active" id="messages11">
							<!-- 상세검색 -->
		<form action="delivery_search" method="GET">
							<div class="container" style="margin-left: 16%;">
								<div class="row">
									<div class="col-25" style="text-align: center;">
										<label for="orderNo" class="label-pre">배송번호</label>
									</div>

									<div class="col-25">

										<div class="fg-line form-group">
											<input type="text" class="form-control input-sm" id="deliNo"
												name="deliNo" id="deliNo" placeholder="검색할 배송번호를 입력해주세요..">

										</div>
									</div>
								</div>

								<div class="row">
									<div class="col-25" style="text-align: center;">
										<label for="tpName" class="label-pre">배송업체명</label>
									</div>

									<div class="col-25">

										<div class="fg-line form-group">
											<input type="text" class="form-control input-sm" id="tpName"
												name="transport.tpName"
												placeholder="배송업체명을 입력해주세요..">

										</div>
									</div>
								</div>

								<div class="row">
									<div class="col-25" style="text-align: center;">
										<label for="deliArea" class="label-pre">배송지역</label>
									</div>

									<div class="col-25">
										<div class="form-group">
											<div class="fg-line">
												<div class="select">
													<select class="form-control" name="deliArea" id="deliArea">
														<option value="">전체</option>
														<option value="서울특별시">서울특별시</option>
														<option value="경기도">경기도</option>
														<option value="인천광역시">인천광역시</option>
														<option value="대전광역시">대전광역시</option>
														<option value="광주광역시">광주광역시</option>
														<option value="대구광역시">대구광역시</option>
														<option value="울산광역시">울산광역시</option>
														<option value="부산광역시">부산광역시시</option>
														<option value="충청북도">충청북도</option>
														<option value="충청남도">충청남도</option>
														<option value="강원도">강원도</option>
														<option value="경상북도">경상북도</option>
														<option value="경상남도">경상남도</option>
														<option value="전라남도">전라남도</option>
														<option value="전라북도">전라북도</option>
													</select>
												</div>
											</div>
										</div>
									</div>
								</div>
								
								<div class="row">
									<div class="col-25" style="text-align: center;">
										<label for="deliStatus" class="label-pre">배송상태</label>
									</div>

									<div class="col-25">
										<div class="form-group">
											<div class="fg-line">
												<div class="select">
													<select class="form-control" name="deliStatus" id="deliStatus">
														<option value="">전체</option>
														<option value="1">생산중</option>
														<option value="2">배송중</option>
														<option value="3">출하완료</option>
													</select>
												</div>
											</div>
										</div>
									</div>
								</div>

								<div class="row">
									<div class="col-25" style="text-align: center;">
										<label for="deliDate" class="label-pre">배송날짜</label>
									</div>

									<div class="col-75">
										<!-- 달력으로 날짜 선택 -->
										<div class="col-sm-4">
											<div class="input-group form-group">
												
												<div class="dtp-container dropdown fg-line">
													<input type="date" name="deliDate" id="deliDate">
												</div>
											</div>
										</div>
										<!-- 날짜 선택 끝 -->

									</div>
								</div>

							</div>
								 
								
							<button id="searchBtn" type="submit"
								class="btn btn-primary waves-effect waves-button waves-float"
								style="float: right;margin-right: 32%; margin-left: 10px;" >검색</button>
	</form>
							<button id="allBtn"
								class="btn btn-primary waves-effect waves-button waves-float"
								style="float: right; margin-left: 10px;" onclick="location.href='${pageContext.request.contextPath}/deliveryList'">전체보기</button>
							<!-- profile끝 -->
							<!-- </form> -->
							<button id="resetBtn"
								class="btn btn-primary waves-effect waves-button waves-float"
								style="float: right;">초기화</button>
							<!-- 상세검색 끝 -->
							<br>
							<br>
							<br>
							<hr>
							<br>
							<!-- 상세검색 끝 -->

							<!-- 데이터테이블 시작 -->
							<!-- 테이블 -->
							<table id="data-table-command"
								class="table table-striped table-vmiddle bootgrid-table"
								aria-busy="false">
								<thead>
									<tr>
										<th data-column-id="a">배송번호</th>

										<th data-column-id="b">담당배송업체명</th>

										<th data-column-id="c">배송상품</th>

										<th data-column-id="d">배송지역</th>

										<th data-column-id="e">배송주소</th>
										<th data-column-id="f">배송상태</th>
										<th data-column-id="g">배송날짜</th>

										<th data-column-id="commands" data-formatter="commands">상품변경</th>
									</tr>
								</thead>

								<tbody>
									<!-- 데이터 출력 -->
									<c:forEach var="delivery" items="${deliveryList }">
									<c:choose>
										<c:when test="${empty(deliveryList)}">
											<tr align="center">
												<td colspan="8">검색된 배송 정보가 없습니다.</td>				
											</tr>
										</c:when>
										<c:otherwise>
										
										<tr data-row-id="0">
											<td data-column-id="a">${delivery.deliNo }</td>
											<td>${delivery.transport.tpName }</td>
											<td>${delivery.production.pdnProduct }</td>
											<td>${delivery.deliArea }</td>
											<td>${delivery.deliAddr }</td>
											<c:if test="${delivery.deliStatus==1 }">
												<td class="status1">생산중</td>
											</c:if>
											<c:if test="${delivery.deliStatus==2 }">
												<td class="status1">배송중</td>
											</c:if>
											<c:if test="${delivery.deliStatus==3}">
												<td class="status1">출하완료</td>
											</c:if>
											
											<td>${delivery.deliDate }</td>

										</tr>
									</c:otherwise>	
									</c:choose>								
									</c:forEach>
								</tbody>
							</table>
							
							<!-- 데이터테이블 끝 -->
						</div>

					</div>
				</div>
				<br> <br> <br>

			</div>
		</div>
	</div>

</div>

<!--★★★ 상품등록 ★★★ -->
<div class="modal" id="modifyDeliDiv">
	 <div class="modal-dialog modal-lg">
		<div class="container modal-content" >
		
		<div class="modal-header">
	        <h4 class="modal-title">운송업체 변경</h4>
	    </div>
	     
	     <div class="container modal-body">
			<div class="row">
				<div class="col-25" style="text-align: center;">
					<label for="" class="label-pre">배송번호</label>
				</div>

				<div class="col-xs-6">

					<div class="fg-line form-group">
						<input type="text" class="form-control input-sm" name="deliNo"
							id="updateDeliNo" readonly="readonly">
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-25" style="text-align: center;">
					<label for="product_category" class="label-pre">담당배송업체명</label>
				</div>
			<div class="col-xs-6">
				<select class="form-control" name="tpName" id="updatetpName">
					<option value="">전체</option>
					<c:forEach var="transport" items="${transportList }">
						<option value="${transport.tpNo }">${transport.tpName }</option>
	
					</c:forEach>

				</select>
			</div>
			</div>
			
			<div>
				<button id="enrollBtn"
					class="btn btn-primary waves-effect waves-button waves-float"
					style="float: right; margin-left: 20px; margin-right: 50%"">등록</button>
				<button id="cancelBtn"
					class="btn btn-primary waves-effect waves-button waves-float"
					style="float: right;">취소</button>
			</div>
		</div>
		</div>

	</div>
</div>
<!-- ========================상품등록 끝========================== -->

<script type="text/javascript">
$("#modifyDeliDiv").hide();

//업데이트 버튼을 눌렀을ㄸㅐ 실행되는 함수
function update(deliNo) {
$("#modifyDeliDiv").show();
	
	//var pdNo=$(".pCode").text();//사용자가 누른 text값 가져온다
	//var pdNo = $(this).attr("id");
	//alert(pdNo);
	
	$.ajax({
		type: "GET",
		url: "deli_no",
		dataType: "json",
		data:{"deliNo" : deliNo},//쿼리문을 진행해야 하므로 값을 전달
		success: function(json){//json객체로 가져온다
			$("#updateDeliNo").val(json.deliNo);
			//$("#updateDeliTransport").attr("value",json.tpName);
		},
		error : {
			
		}
	});
}

//취소버튼 눌렀을때
$("#cancelBtn").click(function() {
	$("#modifyDeliDiv").hide();
});

//등록버튼 눌렀을때
$("#enrollBtn").click(function() {
	var deliNo=$("#updateDeliNo").val();//사용자가 누른 text값 가져온다
	var deliTpNo=$("#updatetpName").val();
	
	alert(deliTpNo);
	$.ajax({
		type: "PUT",
		url: "deli_update",
		headers: {"content-type":"application/json","X-HTTP-Method-override":"PUT"},
		data: JSON.stringify({"deliNo":deliNo, "deliTpNo" : deliTpNo}),
		dataType: "text",
		success: function(text) {
			if(text=="success") {
				alert("업데이트 성공!");
				$("#modifyDeliDiv").hide();
				//location.href='${pageContext.request.contextPath}/deliveryList'
			}
		}, 
		error: function(xhr) {
			alert("에러코드 = "+xhr.status);
		}
	}); 
	
});
	
	
</script>

<script type="text/javascript">
 $(document).ready(function(){
     var grid= $("#data-table-command").bootgrid({
    	 
    	  formatters: {
    	        "commands": function(column, row)
    	        {
    	            return "<button type='button' class='btn btn-icon command-edit' data-row-id='" + row.a +"'><span class=\"md md-edit\"></span></button> " ;
    	                
    	        },
    	  }
      }).on("loaded.rs.jquery.bootgrid", function(){
		  
	    /* Executes after data is loaded and rendered */
	    grid.find(".command-edit").on("click", function(e)
	    {
	        update($(this).attr("data-row-id"));
	    	//$("#modifyDeliDiv").show();
	    });
	    
	    
	});
});
  
</script> 


 