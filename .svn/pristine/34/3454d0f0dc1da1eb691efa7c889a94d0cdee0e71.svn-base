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
					${employee.empName}의 인사카드 <small>  EMPLOYEE DISPLAY</small>
				</h2>
			</div>

			<div class="card-body card-padding">
				<form name="updateForm">

					<!-- 옵션 선택 문 주석 -->

					<!-- 일반 인서트 문 시작 -->
					<div class="form-group fg-line">
						 <img src="${pageContext.request.contextPath}/resources/images/${employee.empPhoto}" width="150">
					</div>

					<div class="form-group fg-line">
						<label for="exampleInputEmail1">사번</label> <input type="text"
							class="form-control input-sm" name="empNo" id="empNo"
							value="${employee.empNo}" readonly="readonly">
					</div>

					<div class="form-group fg-line">
						<label for="exampleInputEmail1">소속</label> <input type="text"
							class="form-control input-sm" name="empDepart" id="empDepart"
							value="${employee.empDepart} ">
					</div>

					<div class="form-group">
						<div class="fg-line">
							<div class="select">
								<label for="exampleInputPassword1">직급</label>
								<c:if test="${employee.empGrade=='0'}">
									<input class="form-control input-sm" name="empGrade"
										id="empGrade" value="사원" readonly="readonly">
								</c:if>
								<c:if test="${employee.empGrade=='8'}">
									<input class="form-control input-sm" name="empGrade"
										id="empGrade" value="사장" readonly="readonly">
								</c:if>
							</div>
						</div>
					</div>


					<div class="form-group fg-line">
						<label for="exampleInputPassword1">비밀번호</label> <input
							type="password" class="form-control input-sm" name="empPasswd"
							id="empPasswd">
					</div>

					<div class="form-group fg-line">
						<label for="exampleInputPassword1">이름</label> <input type="text"
							class="form-control input-sm" name="empName" id="empName"
							value="${employee.empName} ">
					</div>

					<div class="form-group fg-line">
						<label for="exampleInputPassword1">주민등록번호</label> <input
							type="text" class="form-control input-sm" name="empRegino"
							id="empRegino" value="${employee.empRegino}" readonly="readonly">
					</div>

					<div class="form-group fg-line">
						<label for="exampleInputPassword1">이메일</label> <input type="text"
							class="form-control input-sm" name="empEmail" id="empEmail"
							value="${employee.empEmail} ">
					</div>

					<div class="form-group fg-line">
						<label for="exampleInputEmail1">생년월일</label>

						<div class="input-group form-group">
							<span class="input-group-addon"><i class="md md-event"></i></span>
							<div class="dtp-container dropdown fg-line">
								<input type='text' class="form-control date-picker"
									data-toggle="dropdown" name="empBirth" id="empBirth"
									value="${employee.empBirth }">
							</div>
						</div>
					</div>

					<div class="form-group fg-line">
						<label for="exampleInputPassword1">연착처</label> <input type="text"
							class="form-control input-sm" name="empPhone" id="empPhone"
							value="${employee.empPhone }">
					</div>

					<div class="form-group fg-line">
						<label for="exampleInputPassword1">주소</label> <input type="text"
							class="form-control input-sm" name="empAddr" id="empAddr"
							value="${employee.empAddr }">
					</div>

					<div class="form-group fg-line">
						<label for="exampleInputPassword1">주소</label> <input type="text"
							class="form-control input-sm" name="empSdate" id="empSdate"
							value="${employee.empSdate }" readonly="readonly">
					</div>


					<div class="form-group fg-line">
						<label for="exampleInputEmail1">퇴사일자</label>

						<div class="input-group form-group">
							<span class="input-group-addon"><i class="md md-event"></i></span>
							<div class="dtp-container dropdown fg-line">
								<input type='text' class="form-control date-picker"
									data-toggle="dropdown" name="empEdate" id="empEdate"
									value="${employee.empEdate }">
							</div>
						</div>
					</div>

					<div class="form-group fg-line">
						<label for="exampleInputPassword1">계좌번호</label> <input type="text"
							class="form-control input-sm" name="empAccount" id="empAccount"
							value="${employee.empAccount }">
					</div>

					<div class="form-group fg-line">
						<label for="exampleInputPassword1">최종학력</label> <input type="text"
							class="form-control input-sm" name="empSchool" id="empSchool"
							value="${employee.empSchool }"> <label
							for="exampleInputPassword1">전공</label> <input type="text"
							class="form-control input-sm" name="empMajor" id="empMajor"
							value="${employee.empMajor }">
					</div>

					<button type="submit" class="btn btn-primary btn-sm m-t-10">cancel</button>
					<button type="button" onclick="removeProduct();" class="btn btn-primary btn-sm m-t-10">delete</button>
					<button type="button" class="btn btn-primary btn-sm m-t-10"
						onclick="submitCheck();">submit</button>

				</form>
			</div>
		</div>

		<div align="center" style="color: red;">${message }</div>

		<script type="text/javascript">
			//insertForm.no.focus();
			function removeProduct() {

				if (confirm("정말로 삭제 하겠습니까?")) {

					updateForm.method = "POST";
					updateForm.action = "${pageContext.request.contextPath}/deleteEmp";
					updateForm.submit();

				}				
			};

			function submitCheck() {

				if (updateForm.empDepart.value == "") {
					alert("소속을 입력해주세요.");
					updateForm.empDepart.focus();
					return
				}																	
				
				if (updateForm.empPasswd.value == "") {
					alert("비밀번호를 입력해주세요..");
					updateForm.empPasswd.focus();
					return;
				}	
				/*
				var passwdReg=/^(?=.*[a-z])(?=.*[0-9])(?=.*[~!@#$%^&*_-]).{10,20}$/g;
				if(!passwdReg.test(updateForm.empPasswd.value)) {
					alert("비밀번호는 영문자,숫자,특수문자가 포함된 [10~20] 범위로 작성 가능합니다.");
					updateForm.empPasswd.focus();
					return
				}								
				*/
				if (updateForm.empName.value == "") {
					alert("이름을 입력해주세요..");
					updateForm.empName.focus();
					return;
				}
				
				if (updateForm.empRegino.value == "") {
					alert("주민등록번호를 입력해주세요..");
					updateForm.empRegino.focus();
					return;
				}
				
				var reginoReg = /\d{6}-\d{7}/g;
				if (!reginoReg.test(updateForm.empRegino.value)) {
					alert("주민등록번호를 형식에 맞게 입력해주세요.");
					updateForm.empRegino.focus();
					return;
				}					
				
				if (updateForm.empEmail.value == "") {
					alert("이메일을 입력해주세요..");
					updateForm.empEmail.focus();
					return;
				}
				/*
				var emailReg=/^([a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+(\.[-a-zA-Z0-9]+)+)*$/g;
				if (!emailReg.test(updateForm.empEmail.value)) {
					alert("이메일을 형식에 맞게 입력해주세요.");
					updateForm.empEmail.focus();
					return;
				}
				*/				
				if (updateForm.empBirth.value == "") {
					alert("생년월일을 입력해 주세요.");
					updateForm.empBirth.focus();
					return;
				}				
				
				if (updateForm.empPhone.value == "") {
					alert("전화번호를 입력해 주세요.");
					updateForm.empPhone.focus();
					return;
				}
				
				var phoneReg = /(01[016789])-\d{3,4}-\d{4}/g;
				if (!phoneReg.test(updateForm.empPhone.value)) {
					alert("전화번호를 형식에 맞게 입력해주세요.");
					updateForm.empPhone.focus();
					return;
				}
				
				if (updateForm.empAddr.value == "") {
					alert("주소를 입력해 주세요.");
					updateForm.empAddr.focus();
					return;
				}								
				
				if (updateForm.empSdate.value == "") {
					alert("계좌번호를 입력해주세요.");
					updateForm.empSdate.focus();
					return;
				}
				
				if (updateForm.empSchool.value == "") {
					alert("최종학력을 입력해주세요.");
					updateForm.empSchool.focus();
					return;
				}
				
				if (updateForm.empMajor.value == "") {
					alert("전공을 입력해주세요.");
					updateForm.empMajor.focus();
					return;
				}

				updateForm.method = "POST";
				updateForm.action = "${pageContext.request.contextPath}/updateEmp";
				updateForm.submit();
			}
		</script>
	</div>
</div>

</html>


