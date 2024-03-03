<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<div class="container">
	<div class="block-header">






		<div class="card">
			<div class="card-header">
				<h2>
					결재 요청서<small> Authorization</small>
				</h2>
			</div>

			<div class="card-body card-padding">
				<form  name="insertForm" enctype="multipart/form-data">

					<!-- 옵션 선택 문 주석 -->
					<div class="form-group fg-line">
						<label for="exampleInputEmail1">결재구분</label> <input type="text"
							class="form-control input-sm" name="authCase" id="authCase" value="휴가요청서" readonly="readonly"
							>
					</div>

					<div class="form-group fg-line">
						<label for="exampleInputEmail1">사원번호</label> <input type="text"
							class="form-control input-sm" name="authEmpNo" id="authEmpNo" value="${employee.empNo}" readonly="readonly"
							>
					</div>					

					<div class="form-group fg-line">
						<label for="exampleInputPassword1">제목</label> 
					
						<input type="text"
							class="form-control input-sm" name="authSubject" id="authSubject"
							placeholder="ex) 여름휴가 신청서">
					</div>

					<div class="form-group fg-line">
						<label for="exampleInputPassword1">내용</label> <input type="text"
							class="form-control input-sm" name="authContent" id="authContent"
							placeholder="ex) 여름휴가 3일을 신청합니다.">
					</div>
					<!-- 	
					<div class="form-group fg-line">
						<label for="exampleInputPassword1">파일 선택</label> <input type="file"
							class="form-control input-sm" name="file" id="file">
					</div>
 					 -->
					<div class="form-group fg-line">
						<label for="exampleInputPassword1">소요날짜</label> <input type="number"
							class="form-control input-sm" name="authWhile" id="authWhile"
							placeholder="일수를 숫자만 기입하시오. ex) 3 ">
					</div>
					
					<div class="form-group fg-line">
						<label for="exampleInputPassword1">휴가시작일</label> <input type="text"
							class="form-control input-sm" name="authSdate" id="authSdate"
							placeholder="ex) 2020-10-01">
					</div>
					
					<div class="form-group fg-line">
						<label for="exampleInputPassword1">휴가종료일</label> <input type="text"
							class="form-control input-sm" name="authEdate" id="authEdate"
							placeholder="ex) 2020-10-03">
					</div>
					

					<button type="submit" class="btn btn-primary btn-sm m-t-10">cancel</button>
					<button type="button" class="btn btn-primary btn-sm m-t-10"
						onclick="submitCheck();">submit</button>

				</form>
			</div>
		</div>
		
		<script type="text/javascript">
			//insertForm.no.focus();

			function submitCheck() {
				
				
				if (insertForm.authSubject.value == "") {
					alert("제목을 입력해주세요.");
					insertForm.authSubject.focus();
					return
				}
				
				if (insertForm.authContent.value == "") {
					alert("내용을 입력해주세요.");
					insertForm.authContent.focus();
					return;
				}	
				
				if (insertForm.authWhile.value == "") {
					alert("소요날짜를 입력해주세요.");
					insertForm.authWhile.focus();
					return;
				}					
				
				var whileReg=/^[0-9]*$/;
				if(!whileReg.test(insertForm.authWhile.value)) {
					alert("숫자만 입력해주세요.");
					insertForm.authWhile.focus();
					return
				}	
														
				if (insertForm.authSdate.value == "") {
					alert("휴가시작일을 입력해주세요.");
					insertForm.authSdate.focus();
					return;
				}
				
				var SdateReg=/^(19|20)\d{2}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[0-1])$/; 
				if(!SdateReg.test(insertForm.authSdate.value)) {
					alert("날짜 형식에 맞추어 입력해주세요.");
					insertForm.authSdate.focus();
					return
				}
				
				if (insertForm.authEdate.value == "") {
					alert("휴가종료을 입력해주세요.");
					insertForm.authEdate.focus();
					return;
				}
				
				var EdateReg=/^(19|20)\d{2}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[0-1])$/; 
				if(!EdateReg.test(insertForm.authEdate.value)) {
					alert("날짜 형식에 맞추어 입력해주세요.");
					insertForm.authEdate.focus();
					return
				}

				insertForm.method = "POST";
				insertForm.action = "${pageContext.request.contextPath}/insertAuth";
				insertForm.submit();
			}
		</script>

	</div>
</div>





