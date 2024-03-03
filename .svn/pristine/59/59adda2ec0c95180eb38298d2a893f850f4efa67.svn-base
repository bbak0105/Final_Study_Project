<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/4.7.6/handlebars.min.js"></script>

<div class="container">
	<div class="block-header">
		<h2>운송업체관리</h2>
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
							aria-expanded="true">운송업체 목록</a></li>
						<li class=""><a href="#profile11" aria-controls="profile11"
							role="tab" data-toggle="tab" aria-expanded="false">운송업체 등록</a></li>
					</ul>

					<div class="tab-content">
						<!-- 상품목록 -->
						<div role="tabpanel" class="tab-pane active" id="messages11">

							<!-- 상세검색 -->
							<!-- 상세검색 -->
							<!-- <form action="transport_search" method="GET"> -->
								<div class="container" style="margin-left: 16%;">
									<div class="row">
										<div class="col-25" style="text-align: center;">
											<label for="tpNo" class="label-pre">운송업체 코드</label>
										</div>

										<div class="col-25">

											<div class="fg-line form-group">
												<input type="text" class="form-control input-sm" id="tpNo"
													name="tpNo" id="tpNo" numberOnly placeholder="검색할 운송업체코드를 입력해주세요..">

											</div>
										</div>
									</div>


									<div class="row">
										<div class="col-25" style="text-align: center;">
											<label for="tpName" class="label-pre">운송업체명</label>
										</div>

										<div class="col-25">
											<div class="form-group">
												<div class="fg-line">
													<div class="select">
														<select class="form-control" name="tpName" id="tpName">
															<option value="">전체</option>
															<c:forEach var="transport" items="${transportList }">
																<option value="${transport.tpName }">${transport.tpName }</option>

															</c:forEach>

														</select>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
								
								<button id="allBtn"
								class="btn btn-primary waves-effect waves-button waves-float"
								style="float: right;margin-right: 32%; margin-left: 10px;">전체보기</button>
								
								<button id="searchBtn" type="submit"
									class="btn btn-primary waves-effect waves-button waves-float"
									style="float: right; margin-left: 10px;">검색</button>
							<!-- </form> -->
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
							<!-- 데이터테이블 시작 -->
							<div id="data-table-command-header"
								class="bootgrid-header container-fluid">
								<div class="row">
									<div class="col-sm-12 actionBar">
										<div class="search form-group">
											<div class="input-group">
												<span class="md icon input-group-addon glyphicon-search"></span>
												<input type="text" class="search-field form-control"
													placeholder="Search">
											</div>
										</div>
										<div class="actions btn-group">
											<div class="dropdown btn-group">
												<button class="btn btn-default dropdown-toggle"
													type="button" data-toggle="dropdown">
													<span class="dropdown-text">10</span> <span class="caret"></span>
												</button>
												<ul class="dropdown-menu pull-right" role="menu">
													<li class="active" aria-selected="true"><a href="#10"
														class="dropdown-item dropdown-item-button">10</a></li>
													<li aria-selected="false"><a href="#25"
														class="dropdown-item dropdown-item-button">25</a></li>
													<li aria-selected="false"><a href="#50"
														class="dropdown-item dropdown-item-button">50</a></li>
													<li aria-selected="false"><a href="#-1"
														class="dropdown-item dropdown-item-button">All</a></li>
												</ul>
											</div>
											<div class="dropdown btn-group">
												<button class="btn btn-default dropdown-toggle"
													type="button" data-toggle="dropdown">
													<span class="dropdown-text"><span
														class="md icon md-view-module"></span></span> <span class="caret"></span>
												</button>
												<ul class="dropdown-menu pull-right" role="menu">
													<li><div class="checkbox">
															<label class="dropdown-item"><input name="id"
																type="checkbox" value="1" class="dropdown-item-checkbox"
																checked="checked"><i class="input-helper"></i>
																ID</label>
														</div></li>
													<li><div class="checkbox">
															<label class="dropdown-item"><input name="sender"
																type="checkbox" value="1" class="dropdown-item-checkbox"
																checked="checked"><i class="input-helper"></i>
																Sender</label>
														</div></li>
													<li><div class="checkbox">
															<label class="dropdown-item"><input
																name="received" type="checkbox" value="1"
																class="dropdown-item-checkbox" checked="checked"><i
																class="input-helper"></i> Received</label>
														</div></li>
													<li><div class="checkbox">
															<label class="dropdown-item"><input
																name="commands" type="checkbox" value="1"
																class="dropdown-item-checkbox" checked="checked"><i
																class="input-helper"></i> Commands</label>
														</div></li>
												</ul>
											</div>
										</div>
									</div>
								</div>
							</div>

							<!-- 테이블 -->
							<table id="data-table-command"
								class="table table-striped table-vmiddle bootgrid-table"
								aria-busy="false">
								<thead>
									<tr>
										<th data-column-id="id" class="text-left"><a
											href="javascript:void(0);"
											class="column-header-anchor sortable"><span class="text">운송업체코드</span><span
												class="md icon "></span></a></th>

										<th data-column-id="sender" class="text-left"><a
											href="javascript:void(0);"
											class="column-header-anchor sortable"><span class="text">운송업체명</span><span
												class="md icon "></span></a></th>

										<th data-column-id="sender" class="text-left"><a
											href="javascript:void(0);"
											class="column-header-anchor sortable"><span class="text">운송업체
													번호</span><span class="md icon "></span></a></th>

									</tr>
								</thead>

								<tbody id="display">
									<%-- <c:forEach var="transport" items="${transportList }">

										<tr data-row-id="0">
											<td class="text-left">${transport.tpNo }</td>
											<td class="text-left">${transport.tpName }</td>
											<td class="text-left">${transport.tpPhone }</td>

											<td class="text-left">
												<button type="button" class="btn btn-icon command-edit"
													data-row-id="10253">
													<span class="md md-edit"></span>
												</button>
											</td>
										</tr>
									</c:forEach> --%>
								</tbody>
							</table>
							<div id="data-table-command-footer"
								class="bootgrid-footer container-fluid">
								<div class="row">
									<div class="col-sm-6">
										<ul class="pagination">
											<li class="first disabled" aria-disabled="true"><a
												href="#first" class="button"><i class="md md-more-horiz"></i></a></li>
											<li class="prev disabled" aria-disabled="true"><a
												href="#prev" class="button"><i
													class="md md-chevron-left"></i></a></li>
											<li class="page-1 active" aria-disabled="false"
												aria-selected="true"><a href="#1" class="button">1</a></li>
											<li class="page-2" aria-disabled="false"
												aria-selected="false"><a href="#2" class="button">2</a></li>
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
							<!-- 데이터테이블 끝 -->
						</div>


<!-- =========================== 상품등록 ===============================-->
	<div role="tabpanel" class="tab-pane" id="profile11">
		<div style="margin-left: 20%">
			<div class="container" style="text-align: center;">
				<div class="row">
					<div class="col-25">
						<label for="product_category" class="label-pre">운송업체 코드</label>
					</div>

					<div class="col-25">

						<div class="fg-line form-group">
							<input type="text" class="form-control input-sm" id="inputTpNo" name="tpNo"
								numberOnly placeholder="운송업체코드를 입력해주세요..">

						</div>
					</div>
					<div class="col-25">
						<button
						class="btn btn-primary waves-effect waves-button waves-float" id="dbBtn"
						style="float: right; margin-right: 50%">중복검사</button>
					</div>
					
				</div>
				
				<div class="row" id="msg" style="color : red; margin-right: 20%; margin-bottom: 10px;"></div>

				<div class="row">
					<div class="col-25">
						<label for="product_category" class="label-pre">운송업체명</label>
					</div>

					<div class="col-25">

						<div class="fg-line form-group">
							<input type="text" class="form-control input-sm" id="inputTpName"
								placeholder="운송업체명을 입력해주세요..">

						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-25">
						<label for="product_category" class="label-pre">운송업체 번호</label>
					</div>

					<div class="col-25">

						<div class="fg-line form-group">
							<input type="text" class="form-control input-sm" id="inputTpPhone"
								placeholder="운송업체 번호를 입력해주세요..">

						</div>
					</div>
				</div>


				<button
					class="btn btn-primary waves-effect waves-button waves-float" id="enrollBtn"
					style="float: right; margin-right: 50%">등록</button>
			</div>
		</div>
<!-- 등록 끝 -->
</div>



			</div>
		</div>
		<br> <br> <br>

	</div>

</div>

<!--★★★ 상품등록 ★★★ -->
<!-- <div class="modal" id="modifyTransfortDiv">
	 <div class="modal-dialog modal-lg">
		<div class="container modal-content" >
		
		<div class="modal-header">
	        <h4 class="modal-title">운송업체 변경</h4>
	    </div>
	     
	     <div class="container modal-body">
			<div class="row">
				<div class="col-25" style="text-align: center;">
					<label for="" class="label-pre">운송업체 코드</label>
				</div>

				<div class="col-xs-6">

					<div class="fg-line form-group">
						<input type="text" class="form-control input-sm" name=" tpNo"
							id="updateTpNo" readonly="readonly">
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-25" style="text-align: center;">
					<label for="product_category" class="label-pre">운송업체명</label>
				</div>
			<div class="col-xs-6">
					<div class="fg-line form-group">
						<input type="text" class="form-control input-sm" name="TpName"
							id="updateTpName" >
					</div>
			</div>
			</div>
			
			<div class="row">
				<div class="col-25" style="text-align: center;">
					<label for="product_category" class="label-pre">운송업체 번호</label>
				</div>
			<div class="col-xs-6">
				<div class="fg-line form-group">
						<input type="text" class="form-control input-sm" name="TpPhone"
							id="updateTpPhone" >
					</div>
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
</div> -->
<!-- ========================상품등록 끝========================== -->


<script id="template" type="text/x-handlebars-template">
{{#each .}}
<tr>
	<td>{{tpNo}}</td>
	<td>{{tpName}}</td>
	<td>{{tpPhone}}</td>
	
</tr>
{{/each}}
</script>

<%--<td><button type="button" id="{{tpNo}}" class="btn btn-icon command-edit"><span class="md md-edit"></span></button></td> --%>
<script type="text/javascript">
$("input:text[numberOnly]").on("keyup", function() {
    $(this).val($(this).val().replace(/[^0-9]/g,""));
});
	
	var tpNo;
	var tpName;
	var tpPhone;
	var isOk = "";

	//리셋기능
	function reset() {
		 $("#inputTpNo").val("");
		 $("#inputTpName").val("");
		 $("#inputTpPhone").val("");
	}
	
	$(document).ready(allList());
	
	//전체검색 또는 새로고침을 위한 함수
	function allList(){
		$.ajax({
			type:"GET",
			url:"transport_all",
			dataType:"json",
			success: function(json){
				var source=$("#template").html();
				var template=Handlebars.compile(source);
				$("#display").html(template(json));
				
			},
			error : function(xhr) {
				alert("중복검사 에러코드 = "+xhr.status);				
			}
		});
	}
	
	$("#allBtn").click(function(){
		allList();
	});
	
	$("#dbBtn").click(function() {
		tpNo = $("#inputTpNo").val();
		if(tpNo == null || tpNo =="") $("#msg").text("운송코드는 반드시 입력해 주시기 바랍니다.");
		//alert(tpNo);
		$.ajax({
			type:"GET",
			url:"transport_doubleCheck/"+tpNo,//text로 받을때 이렇게 줘도 되나?
			headers: {"content-type":"application/json"},
			dataType: "text",
			success: function(text){//json객체로 가져온다
				//성공하게 되면, 1)중복된 아이디면 메세지 출력
				//2)아니라면 사용할 수 있는 코드라고 출력
				if(text == "fail"){
					$("#msg").text("이미 사용중인 코드입니다.");
					isOk = "nope";
					//return;
				}else if(text == "success"){				
					$("#msg").text("사용 가능한 코드입니다.");
					isOk = "ok";
					//alert(isOk);
				}
				
			},
			error :function(xhr) {
				alert("중복검사 에러코드 = "+xhr.status);
			}
		});
	});

	$("#enrollBtn").click(function(tpNo, tpName, tpPhone) {
		//alert($("#inputTpNo").text());
		 tpNo = $("#inputTpNo").val();
		 tpName = $("#inputTpName").val();
		 tpPhone = $("#inputTpPhone").val();
		if(tpNo == null || tpNo =="") $("#msg").text("운송코드는 반드시 입력해 주시기 바랍니다.");

		//doubleCk();
		
		//등록처리를 하기 위한 에이젝스
		if(isOk == "ok" && isOk != ""){
			$.ajax({
				type:"POST",
				url:"transport_insert",
				dataType:"text",
				headers: {"content-type":"application/json"},
				data: JSON.stringify({"tpNo": tpNo, "tpName": tpName, "tpPhone" : tpPhone}),
				success: function(text) {
					if(text == "success"){//등록 성공시
						//등록성공되었다고 알려주고
						alert("등록되었습니다.");
						//화면을 다시 리스트 화면으로 전환
						reset();
						//$("#messages11").attr()
						//location
						allList();
					}
				},
				error:function(xhr){
					//alert("등록 에러코드 = "+xhr.status);
				}
			});
		}
	});
	
	$("#searchBtn").click(function() {
		tpNo = $("#tpNo").val();
		tpName = $("#tpName").val();
		//alert(tpNo);
		//상세검색을 위한 에이젝스
		$.ajax({
			type :"GET",
			url:"transport_search",
			data:{"tpNo" : tpNo, "tpName" : tpName},
			dataType:"json",
			success: function(json){
				if(json.tpList.length == 0){
					$("#display").html("검색된 결과가 없습니다.");
					return;
				}
				
				var source=$("#template").html();
				var template=Handlebars.compile(source);
				$("#display").html(template(json.tpList));
				
				var html="";
			},
			error : function(xhr){
				alert("상세검색 에러코드 = "+xhr.status);
			}
		});
	});
	
	//수정버튼 클릭시
 	/* $(".command-edit").click(function() {
		//눌린 행의 pk값을 가져와서  modal을 띄운다
		alert("di");
		alert($(this).attr("id"));
	});  */
	
</script>