package com.itwill.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.servlet.view.AbstractView;

//파일 다운로드 기능을 제공하는 클래스
// => Bean Configuration File의 bean 엘리먼트 또는 @Component 어노테이션을 이용하여 Spring Bean으로 등록
//BeanNameViewResolver에 의해 실행되는 Spring Bean의 클래스는 반드시 AbstractView 클래스를 상속받아 작성
// => renderMergedOutputModel() 메소드 오버라이드 선언
public class FileDownload extends AbstractView {
	//클라이언트에 응답할 파일형식(MimeType) 변경 - 파일 다운로드 가능
	public FileDownload() {
		//AbstractView.setContentType(String mimeType) : 응답 파일형식을 변경하는 메소드 
		setContentType("application/download; UTF-8");
	}
	
	//BeanNameViewResolver에 의해 자동 호출되는 메소드
	// => model 매개변수(Map 객체)에는 요청 처리 메소드에서 Model에 의해 제공되는 정보 저장
	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//요청 처리 메소드에서 제공된 다운로드 파일정보를 반환받아 저장
		@SuppressWarnings("unchecked")
		Map<String, String> fileInfo=(Map<String, String>)model.get("downloadFile");
		
		//다운로드 파일정보를 반환받아 저장
		String uploadDir=fileInfo.get("uploadDir");
		String uploadFilename=fileInfo.get("uploadFilename");
		String originFilename=fileInfo.get("originFilename");
		
		//다운로드 파일정보를 이용하여 File 객체 생성
		File downloadFile=new File(uploadDir, uploadFilename);
		
		//클라이언트에 파일을 전달하기 위한 응답정보 변경
		response.setContentType(getContentType());
		response.setContentLength((int)downloadFile.length());
		
		originFilename = URLEncoder.encode(originFilename, "UTF-8");

		//클라이언트에게 다운로드 파일명 전달
		response.setHeader("Content-Disposition", "attachment; filename=\""+originFilename+"\";");
		
		//클라이언트에게 원시데이타를 전달하기 위한 출력스트림을 반환받아 저장
		OutputStream out=response.getOutputStream();
		
		FileInputStream in=null;
		try {
			//다운로드 파일을 원시데이타로 읽기 위한 입력스트림 생성하여 저장
			in=new FileInputStream(downloadFile);
			
			/*
			//입력스트림에서 원시데이타를 읽어 출력스트림으로 전달 - 다운로드
			while(true) {
				int readByte=in.read();
				if(readByte==-1) break;
				out.write(readByte);
			}
			*/
			
			//Spring에서 제공하는 FileCopyUtils 클래스의 copy() 메소드를 호출하여 파일 복사 - 다운로드
			FileCopyUtils.copy(in, out);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (Exception e) {}
		}
	}
}