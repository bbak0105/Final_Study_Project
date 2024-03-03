<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>


<div class="container">
	<div class="block-header">






		<div class="card">
			<div class="card-header">
				<h2>
					결재 요청서<small> Authorization</small>
				</h2>
			</div>

			<div class="card-body card-padding">
				<form name="updateForm">

					<!-- 옵션 선택 문 주석 -->




					<div class="form-group fg-line">
						<input type="hidden" class="form-control input-sm"
							name="apprAuthNo" id="apprAuthNo" value="${authorization.authNo}"
							readonly="readonly">
					</div>
					<input type="hidden" class="form-control input-sm" name="apprEmpNo"
						id="apprEmpNo" value="${authorization.authEmpNo}"
						readonly="readonly">
					<input type="hidden" class="form-control input-sm" name="attdEmpNo"
						id="attdEmpNo" value="${authorization.authEmpNo}"
						readonly="readonly">	

					<div class="form-group fg-line">
						<input type="hidden"
							class="form-control input-sm" name="authNo" id="authNo"
							value="${authorization.authNo}" readonly="readonly">
					</div>
					
					<div class="form-group fg-line">
						 <input type="hidden"
							class="form-control input-sm" name="attdCase" id="attdCase"
							value="휴가" readonly="readonly">
					</div>

					<div class="form-group fg-line">
						 <input type="hidden"
							class="form-control input-sm" name="authCase" id="authCase"
							value="휴가" readonly="readonly">
					</div>

					<div class="form-group fg-line">
						 <input type="hidden"
							class="form-control input-sm" name="authEmpNo" id="authEmpNo"
							value="${authorization.authEmpNo}" readonly="readonly">
					</div>

					<div class="form-group fg-line">
						<label for="exampleInputEmail1">이름</label> <input type="text"
							class="form-control input-sm" name="empName" id="empName"
							value="${authorization.employee.empName}" readonly="readonly">
					</div>

					<div class="form-group fg-line">
						<label for="exampleInputEmail1">부서</label> <input type="text"
							class="form-control input-sm" name="empdepart" id="empdepart"
							value="${authorization.employee.empDepart}" readonly="readonly">
					</div>

					<div class="form-group">
						<div class="fg-line">
							<div class="select">
								<label for="exampleInputPassword1">직급</label>
								<c:if test="${authorization.employee.empGrade==0 }">
									<input class="form-control input-sm" name="empGrade"
										id="empGrade" value="사원" readonly="readonly">
								</c:if>
								<c:if test="${authorization.employee.empGrade==8 }">
									<input class="form-control input-sm" name="empGrade"
										id="empGrade" value="사장" readonly="readonly">
								</c:if>
							</div>
						</div>
					</div>

					<div class="form-group fg-line">
						<label for="exampleInputPassword1">제목</label> <input type="text"
							class="form-control input-sm" name="authSubject" id="authSubject"
							readonly="readonly" value="${authorization.authSubject} ">
					</div>

					<div class="form-group fg-line">
						<label for="exampleInputPassword1">내용</label> <input type="text"
							class="form-control input-sm" name="authContent" id="authContent"
							readonly="readonly" value="${authorization.authContent} ">
							<input type="hidden"
							class="form-control input-sm" name="attdContent" id="attdContent"
							readonly="readonly" value="${authorization.authContent} ">
					</div>
					
					<div class="form-group fg-line">
						<label for="exampleInputPassword1">휴가 시작 날짜</label> <input
							class="form-control input-sm" name="attdStime" id="attdStime"
							readonly="readonly" value="${authorization.authSdate}">
					</div>
					
					<div class="form-group fg-line">
						<label for="exampleInputPassword1">휴가 종료 날짜</label> <input
							class="form-control input-sm" name="attdEtime" id="attdEtime"
							readonly="readonly" value="${authorization.authEdate}">
					</div>

					<div class="form-group fg-line">
						<label for="exampleInputPassword1">소요시간</label> <input
							class="form-control input-sm" name="authWhile" id="authWhile"
							readonly="readonly" value="${authorization.authWhile}">
					</div>
					<!-- 
					<div class="form-group fg-line">
						<label for="exampleInputPassword1">파일명</label> <input
							class="form-control input-sm" name="authFile" id="authFile"
							readonly="readonly" value="${authorization.authFile}">
						<button type="button"
							onclick="fileDownload(${authorization.authNo});">다운로드</button>
					</div>
					 -->
					


					

					




					<button id="canBtn" type="submit"
						class="btn btn-primary btn-sm m-t-10">cancel</button>
					<button id="delBtn" type="button"
						class="btn btn-primary btn-sm m-t-10" onclick="removeAuthor();">delete</button>
					<button id="appBtn" type="button"
						class="btn btn-primary btn-sm m-t-10" onclick="approvalAuthor();">approval</button>
				


				</form>
			</div>
		</div>
		
		<script type="text/javascript">
			
			$("#insertBtn").hide();
			
		</script>

		<script type="text/javascript">		
			
		function removeAuthor() {

				if (confirm("정말로 삭제 하겠습니까?")) {

					updateForm.method = "POST";
					updateForm.action = "${pageContext.request.contextPath}/deleteAuth";
					updateForm.submit();

				}
			};

			function approvalAuthor() {

				if (confirm("결재를 승인 하시겠습니까?")) {
					
				
					updateForm.method = "POST";
					updateForm.action = "${pageContext.request.contextPath}/insertVacation";					
					updateForm.submit();
					
				
			            
			        
				}
			};

			function submitCheck() {
				/*
				if (studentForm.no.value == "") {
					alert("학생번호를 입력해 주세요.");
					studentForm.no.focus();
					return;
				}
				
				var noReg = /\d{4}/g;
				if (!noReg.test(studentForm.no.value)) {
					alert("학생번호는 정수 4자리로 입력해주세요.");
					studentForm.no.focus();
					return;
				}
				
				if (studentForm.name.value == "") {
					alert("이름을 입력해 주세요.");
					studentForm.name.focus();
					return;
				}
				
				if (studentForm.phone.value == "") {
					alert("전화번호을 입력해 주세요.");
					studentForm.phone.focus();
					return;
				}
				
				var phoneReg = /(01[016789])-\d{3,4}-\d{4}/g;
				if (!phoneReg.test(studentForm.phone.value)) {
					alert("전화번호를 형식에 맞게 입력해주세요.");
					studentForm.phone.focus();
					return;
				}
				
				if (studentForm.address.value == "") {
					alert("주소를 입력해 주세요.");
					studentForm.address.focus();
					return;
				}
				
				if (studentForm.birthday.value == "") {
					alert("생년월일을 입력해 주세요.");
					studentForm.birthday.focus();
					return;
				}
				
				var birthdayReg = /(18|19|20)\d{2}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])/g;
				if (!birthdayReg.test(studentForm.birthday.value)) {
					alert("생년월일을 형식에 맞게 입력해주세요.");
					studentForm.birthday.focus();
					return;
				}*/

				updateForm.method = "POST";
				updateForm.action = "${pageContext.request.contextPath}/apprAuth";
				supdateForm.submit();
			}
			function fileDownload(string) {
				location.href="fileDownload/";
			}
		</script>
		
	




		
	</div>
</div>





