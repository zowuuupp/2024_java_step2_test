package chapter11;

public class HttpServletMain {

	public static void main(String[] args) {
		//HttpServletMain http=new LoginService();
		method(new LoginService());
		//HttpServletMain http=new FileDownloadService();
		method(new FileDownloadService());

	}
	
	//메소드 활용
	public static void method(HttpsServlet http) {
		http.service();
	}

}
