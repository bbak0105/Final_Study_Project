<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>



<div class="container">
	<div class="block-header">
		<div class="card">
			<div class="card-header">
				<h2>
					인사 카드 작성<small> member modify</small>
				</h2>
			</div>

			<div class="card-body card-padding">
				<form name="insertForm" enctype="multipart/form-data">

					<!-- 옵션 선택 문 주석 -->

					<!-- 일반 인서트 문 시작 -->




					<div class="form-group fg-line">
						<label for="exampleInputEmail1">소속</label> <input type="text"
							class="form-control input-sm" name="empDepart" id="empDepart"
							placeholder="ex) 인사팀">
					</div>
					
					<div class="form-group fg-line">
						<label for="exampleInputPassword1">사진</label> <input type="file"
							class="form-control input-sm" name="file" id="file">
					</div>

					<div class="form-group">
						<div class="fg-line">
							<div class="select">
								<label for="exampleInputPassword1">직급</label> 
								<select class="form-control" name="empGrade" id="empGrade">
									<option>직급을 선택해주세요</option>
									<option value="8">사장</option>
									<option value="0">사원</option>								
								</select>
							</div>
						</div>
					</div>
					
					<div class="form-group fg-line">
						<label for="exampleInputPassword1">비밀번호</label> <input type="password"
							class="form-control input-sm" name="empPasswd" id="empPasswd"
							placeholder="영문,숫자,특수문자  포함 8자리를 입력해주세요.">
					</div>

					<div class="form-group fg-line">
						<label for="exampleInputPassword1">이름</label> <input type="text"
							class="form-control input-sm" name="empName" id="empName"
							placeholder="ex) 홍길동">
					</div>

					<div class="form-group fg-line">
						<label for="exampleInputPassword1">주민등록번호</label> <input
							type="text" class="form-control input-sm" name="empRegino"
							id="empRegino" placeholder="ex) 870111-2111111">
					</div>

					<div class="form-group fg-line">
						<label for="exampleInputPassword1">이메일</label> <input type="text"
							class="form-control input-sm" name="empEmail" id="empEmail"
							placeholder="ex) abc123@gmail.com">
					</div>

					<div class="form-group fg-line">
						<label for="exampleInputEmail1">생년월일</label>

						<div class="input-group form-group">
							<span class="input-group-addon"><i class="md md-event"></i></span>
							<div class="dtp-container dropdown fg-line">
								<input type='text' class="form-control date-picker"
									data-toggle="dropdown" name="empBirth" id="empBirth"
									placeholder="Click here...">
							</div>
						</div>
					</div>

					<div class="form-group fg-line">
						<label for="exampleInputPassword1">연착처</label> <input type="text"
							class="form-control input-sm" name="empPhone" id="empPhone"
							placeholder="ex) 010-1234-5678">
					</div>

					<div class="form-group fg-line">
						<label for="exampleInputPassword1">주소</label> <input type="text"
							class="form-control input-sm" name="empAddr" id="empAddr"
							placeholder="ex) (12101) 서울특별시 구로구 구로동 222-14">
					</div>

					<div class="form-group fg-line">
						<label for="exampleInputEmail1">입사일자</label>

						<div class="input-group form-group">
							<span class="input-group-addon"><i class="md md-event"></i></span>
							<div class="dtp-container dropdown fg-line">
								<input type='text' class="form-control date-picker"
									data-toggle="dropdown" name="empSdate" id="empSdate"
									placeholder="Click here...">
							</div>
						</div>
					</div>
					
					<div class="form-group fg-line">
						<label for="exampleInputPassword1">계좌번호</label> <input type="text"
							class="form-control input-sm" name="empAccount" id="empAccount"
							placeholder="ex) 신한 110-278558330">
					</div>

					<div class="form-group fg-line">
						<label for="exampleInputPassword1">최종학력</label> <input type="text"
							class="form-control input-sm" name="empSchool" id="empSchool"
							placeholder="ex) 서울대학교"> <label
							for="exampleInputPassword1">전공</label> <input type="text"
							class="form-control input-sm" name="empMajor" id="empMajor"
							placeholder="ex) 경영학과">
					</div>

					<button type="submit" class="btn btn-primary btn-sm m-t-10">cancel</button>
					<button type="button" class="btn btn-primary btn-sm m-t-10"
						onclick="submitCheck();">submit</button>

				</form>
			</div>
		</div>

		<div align="center" style="color: red;">${message }</div>

		<script type="text/javascript">
			

			function submitCheck() {
				
				
				if (insertForm.empDepart.value == "") {
					alert("소속을 입력해주세요.");
					insertForm.empDepart.focus();
					return
				}
				
				if (insertForm.file.value == "") {
					alert("사진을 입력해주세요.");
					insertForm.file.focus();
					return;
				}	
				
				
				if (insertForm.empGrade.value == "직급을 선택해주세요") {
					alert("소속을 입력해주세요.");
					insertForm.empGrade.focus();
					return
				}	
				
				if (insertForm.empPasswd.value == "") {
					alert("비밀번호를 입력해주세요..");
					insertForm.empPasswd.focus();
					return;
				}	
				/*
				var passwdReg=/^(?=.*[a-z])(?=.*[0-9])(?=.*[~!@#$%^&*_-]).{10,20}$/g;
				if(!passwdReg.test(insertForm.empPasswd.value)) {
					alert("비밀번호는 영문자,숫자,특수문자가 포함된 [10~20] 범위로 작성 가능합니다.");
					return
				}								
				*/
				if (insertForm.empName.value == "") {
					alert("이름을 입력해주세요..");
					insertForm.empName.focus();
					return;
				}
				
				if (insertForm.empRegino.value == "") {
					alert("주민등록번호를 입력해주세요..");
					insertForm.empRegino.focus();
					return;
				}
				
				var reginoReg = /\d{6}-\d{7}/g;
				if (!reginoReg.test(insertForm.empRegino.value)) {
					alert("주민등록번호를 형식에 맞게 입력해주세요.");
					insertForm.empRegino.focus();
					return;
				}					
				
				if (insertForm.empEmail.value == "") {
					alert("이메일을 입력해주세요..");
					insertForm.empEmail.focus();
					return;
				}
				
				var emailReg=/^([a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+(\.[-a-zA-Z0-9]+)+)*$/g;
				if (!emailReg.test(insertForm.empEmail.value)) {
					alert("이메일을 형식에 맞게 입력해주세요.");
					insertForm.empEmail.focus();
					return;
				}
								
				if (insertForm.empBirth.value == "") {
					alert("생년월일을 입력해 주세요.");
					insertForm.empBirth.focus();
					return;
				}				
				
				if (insertForm.empPhone.value == "") {
					alert("전화번호를 입력해 주세요.");
					insertForm.empPhone.focus();
					return;
				}
				
				var phoneReg = /(01[016789])-\d{3,4}-\d{4}/g;
				if (!phoneReg.test(insertForm.empPhone.value)) {
					alert("전화번호를 형식에 맞게 입력해주세요.");
					insertForm.empPhone.focus();
					return;
				}
				
				if (insertForm.empAddr.value == "") {
					alert("주소를 입력해 주세요.");
					insertForm.empAddr.focus();
					return;
				}
				
				if (insertForm.empSdate.value == "") {
					alert("입사일자를 입력해 주세요.");
					insertForm.empSdate.focus();
					return;
				}
				
				if (insertForm.empSdate.value == "") {
					alert("계좌번호를 입력해주세요.");
					insertForm.empSdate.focus();
					return;
				}
				
				if (insertForm.empSchool.value == "") {
					alert("최종학력을 입력해주세요.");
					insertForm.empSchool.focus();
					return;
				}
				
				if (insertForm.empMajor.value == "") {
					alert("전공을 입력해주세요.");
					insertForm.empMajor.focus();
					return;
				}
				
				
				
				insertForm.method = "POST";
				insertForm.action = "${pageContext.request.contextPath}/insertEmp";
				insertForm.submit();
			}
		</script>
	</div>
</div>

</html>


