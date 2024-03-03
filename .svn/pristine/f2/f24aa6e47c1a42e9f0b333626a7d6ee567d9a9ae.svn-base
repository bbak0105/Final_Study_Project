<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="${pageContext.request.contextPath }/vendors/bootgrid/jquery.bootgrid.min.js"></script>

<script
	src="${pageContext.request.contextPath }/vendors/sweet-alert/sweet-alert.min.js"></script>


<div class="container">
	<div class="block-header">

		<h2>상품관리</h2>
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
							aria-expanded="true">상품 목록</a></li>
					</ul>

					<div class="tab-content">
						<!-- 상품목록 -->
						<div role="tabpanel" class="tab-pane active" id="messages11">
							<!-- <form action="json_product" method="get"> -->
							<!-- 상세검색 -->
							<div class="container" style="margin-left: 16%;">
								<div class="row">
									<div class="col-25" style="text-align: center;">
										<label for="pdNo" class="label-pre">상품번호</label>
									</div>

									<div class="col-25">

										<div class="fg-line form-group">
											<input type="text" class="form-control input-sm" name="pdNo"
												id="pdNo" placeholder="검색할 상품번호를 입력해주세요..">

										</div>
									</div>
								</div>

								<div class="row">
									<div class="col-25" style="text-align: center;">
										<label for="pdnProduct" class="label-pre">상품명</label>
									</div>

									<div class="col-25">

										<div class="fg-line form-group">
											<input type="text" class="form-control input-sm"
												name="pdn.pdnProduct" id="pdnProduct"
												placeholder="주문자 이름을 입력해주세요..">

										</div>
									</div>
								</div>

							</div>
							<button
								class="btn btn-primary waves-effect waves-button waves-float"
								id="searchBtn"
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


							<!-- 데이터테이블 시작 -->
							<!-- 테이블 -->
							<table id="data-table-command"
								class="table table-striped table-vmiddle">
								<thead>
									<tr>
										<th data-column-id="a">상품번호</th>

										<th data-column-id="b">상품카테고리</th>

										<th data-column-id="c">상품이름</th>

										<th data-column-id="d">상품 출하 수량</th>

										<th data-column-id="e">상품 단일 가격</th>

										<th data-column-id="commands" data-formatter="commands">상품변경</th>
									</tr>
								</thead>

								<tbody id="display">
									<!-- 데이터 출력 -->
									<c:forEach var="product" items="${productList }">

										<tr data-row-id="0">
											<td class="pCode">${product.pdNo }</td>
											<td>${product.pcg.pcgName }</td>
											<td>${product.pdn.pdnProduct }</td>
											<td>${product.pdCnt }</td>
											<td>${product.pdPrice }</td>

											<%--수정버튼을 누르면 modal이 나와서 수정할 수 있는 팝업창 띄우기 --%>
											<td>
												<button type="button" id="updatePdBtn"
													class="btn btn-icon updatePdBtn">
													<span class="md md-edit"></span>
												</button>
											</td>

										</tr>

									</c:forEach>
								</tbody>
							</table>
							<!-- 데이터테이블 끝 -->
						</div>


						<!--★★★ 상품등록 ★★★ -->
							<!-- The Modal 주문정보 -->
					<div class="modal" id="modifyProductDiv">
					  <div class="modal-dialog modal-lg">
					    <div class="modal-content">
					
					      <!-- Modal Header -->
					      <div class="modal-header">
					        <h4 class="modal-title">주문 선택</h4>
					      </div>
					
					      <!-- Modal body -->
					      <div class="modal-body">
						      				
					
									<div class="row">
										<div class="col-25" style="text-align: center;">
											<label for="product_category" class="label-pre">상품번호</label>
										</div>

										<div class="col-25">

											<div class="fg-line form-group">
												<input type="text" class="form-control input-sm" name="pdNo"
													id="updatePdno" readonly="readonly">
											</div>
										</div>
									</div>

									<div class="row">
										<div class="col-25" style="text-align: center;">
											<label for="product_category" class="label-pre">상품이름</label>
										</div>

										<div class="col-25">

											<div class="fg-line form-group">
												<input type="text" class="form-control input-sm"
													id="updatePdnProduct" readonly="readonly">

											</div>
										</div>
									</div>

									<div class="row">
										<div class="col-25" style="text-align: center;">
											<label for="product_category" class="label-pre">상품카테고리</label>
										</div>
										<div class="col-25">
											<div class="fg-line form-group">
												<input type="text" class="form-control input-sm"
													id="updatePcgCategory" readonly="readonly">
											</div>
										</div>
									</div>


									<!-- <div class="row">
									<div class="col-25" style="text-align: center;">
										<label for="product_category" class="label-pre">생산원가</label>
									</div>

									<div class="col-25">

										<div class="fg-line form-group">
											<input type="text" class="form-control input-sm" id="updatePdnPrice">

										</div>
									</div>
								</div>
 -->
									<div class="row">
										<div class="col-25" style="text-align: center;">
											<label for="product_category" class="label-pre">판매단가</label>
										</div>

										<div class="col-25">

											<div class="fg-line form-group">
												<input type="text" class="form-control input-sm"
													name="pdPrice" id="updatePdPrice">

											</div>
										</div>
									</div>
									<button id="enrollBtn"
										class="btn btn-primary waves-effect waves-button waves-float"
										style="float: right; margin-left: 20px; margin-right: 50%"">등록</button>
									<button id="cancelBtn"
										class="btn btn-primary waves-effect waves-button waves-float"
										style="float: right;">취소</button>
								</div>

					
					      <!-- Modal footer -->
					      <div class="modal-footer">
					        <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
					      </div>
					
					      </div>
					   
					  </div>
					</div>

					

					</div>

				</div>
			</div>
			<br> <br> <br>


		</div>
	</div>
</div>



<script type="text/javascript">
	//초기화 버튼 누르면
	$("#resetBtn").click(function () {
		$("#pdNo").val("");
		$("#pdn.pcgName").val("");
		
	});
	
	function getList() {
		$.ajax({
			type: "GET",
			url: "json_list",
			dataType: "json",
			success: function(json) {
				var html="<tr>";
				$(json).each(function() {
					html+="<td class='text-left'>"+this.pdNo+"</td>" +
					"<td class='text-left'>"+this.pcg.pcgName+"</td>" +
					"<td class='text-left'>"+this.pdn.pdnProduct+"</td>" +
					"<td class='text-left'>"+this.pdCnt+"</td>" +
					"<td class='text-left'>"+this.pdPrice+"</td>" +
					"<td class='text-left'><button type='button' id='updatePdBtn' class='btn btn-icon updatePdBtn' ><span class='md md-edit'></span></button></td>";
						
				});
				html+="</tr>";
				
				$("#display").html(html);
			},
			error: function(xhr) {
				$("#display").text("응답오류 = "+xhr.status);
			}
		});
	} 
</script>


<script type="text/javascript">
$("#modifyProductDiv").hide();

$(".updatePdBtn").click(function() {
	$("#modifyProductDiv").show(300);
	
	var pdNo=$(".pCode").text();//사용자가 누른 text값 가져온다
	
	$.ajax({
		type: "GET",
		url: "product_no/"+pdNo,
		dataType: "json",
		data:{"pdNo" : pdNo},
		success: function(json){//json객체로 가져온다
			$("#updatePdPrice").val(json.pdPrice);
			$("#updatePdno").val(json.pdNo);
			$("#updatePdnProduct").val(json.pdn.pdnProduct);
			$("#updatePcgCategory").val(json.pcg.pcgName);
			/* $("#updatePdnPrice").val(json.pcg.pcgName); */
		},
		error : {
			
		}
	});
	
});

$("#cancelBtn").click(function() {
	$("#modifyProductDiv").hide();
});

$("#enrollBtn").click(function() {
	var pdNo=$(".pCode").text();//사용자가 누른 text값 가져온다
	var pdPrice=$("#updatePdPrice").val();
	
	$.ajax({
		type: "PUT",
		url: "product_modify",
		headers: {"content-type":"application/json","X-HTTP-Method-override":"PUT"},
		data: JSON.stringify({"pdNo":pdNo, "pdPrice": pdPrice}),
		dataType: "text",
		success: function(text) {
			if(text=="success") {
				alert("업데이트 성공!");
				$("#modifyProductDiv").hide();
				getList();
			}
		}, 
		error: function(xhr) {
			alert("에러코드 = "+xhr.status);
		}
	});
	
});

/* 
	$.ajax({
		type: "GET",
		url: "json_list",
		dataType: "json",
		success: function(json) {
			var html="<tr>";
			$(json).each(function() {
				html+="<td class='text-left'>"+this.pdNo+"</td>" +
				"<td class='text-left'>"+this.pcg.pcgName+"</td>" +
				"<td class='text-left'>"+this.pdn.pdnProduct+"</td>" +
				"<td class='text-left'>"+this.pdCnt+"</td>" +
				"<td class='text-left'>"+this.pdPrice+"</td>" +
				"<td class='text-left'><button type='button' class='btn btn-icon command-edit' data-row-id='10253'>"
					+"<span class='md md-edit'></span></button>"+
				"<button type='button' class='btn btn-icon command-delete' data-row-id='10253'>"+
					"<span class='md md-delete'></span>	</button></td>";
					
			});
			html+="</tr>";
			
			$("#display").html(html);
		},
		error: function(xhr) {
			$("#display").text("응답오류 = "+xhr.status);
		}
	});
	 */
	
	$("#searchBtn").click(function() {
	//$("#pdNo").val("");
		//alert($("#pdNo").val());
		$.ajax({
			type: "GET",
			url: "json_product",
			data: {
				pdNo: $("#pdNo").val(),
				"pdn.pdnProduct" : $("#pdnProduct").val()
			},
			dataType: "json",
			success: function(json) {
				var html="<tr>";
				$(json).each(function() {
					html+="<td class='text-left'>"+this.pdNo+"</td>" +
					"<td class='text-left'>"+this.pcg.pcgName+"</td>" +
					"<td class='text-left'>"+this.pdn.pdnProduct+"</td>" +
					"<td class='text-left'>"+this.pdCnt+"</td>" +
					"<td class='text-left'>"+this.pdPrice+"</td>" +
					"<td class='text-left'><button type='button' id='updatePdBtn' class='btn btn-icon updatePdBtn' ><span class='md md-edit'></span></button></td>";
				});
				html+="</tr>";
				
				$("#display").html(html);
				
				$("#pdNo").val("");
				$("pdnProduct").val("");
			},
			error: function(xhr) {
				$("#display").text("응답오류 = "+xhr.status);
			}
		});
	}); 

</script>


<!-- Data Table -->
<!--  <script type="text/javascript">
  $(document).ready(function(){
      $("#data-table-command").bootgrid({
    	  formatters: {
    	        "commands": function(column, row)
    	        {
    	            return "<button type=\"button\" class=\"btn btn-icon command-edit\" data-row-id=\"" + row.id + "\"><span class=\"md md-edit\"></span></button> " ;
    	                
    	        }
    	  }
      });
  }).on("loaded.rs.jquery.bootgrid", function()
		  {
	    /* Executes after data is loaded and rendered */
	    grid.find(".btn").on("click", function(e)
	    {
	        alert("You pressed edit on row: ");
	    });
	});
</script> -->
