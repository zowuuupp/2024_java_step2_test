package chapter11;

public class HttpServletMain {

	public static void main(String[] args) {
		//HttpServletMain http=new LoginService();
		method(new LoginService());
		//HttpServletMain http=new FileDownloadService();
		method(new FileDownloadService());

	}
	
	//�޼ҵ� Ȱ��
	public static void method(HttpsServlet http) {
		http.service();
	}

}
