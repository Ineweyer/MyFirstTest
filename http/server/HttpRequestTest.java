package http.server;

public class HttpRequestTest {
	 public static void main(String[] args) {
	        //发送 GET 请求
	        String s=HttpRequest.sendGet("https://pic123.duapp.com/player.html?url=http://check.tuifeiapi.com/init/mill/gjsdqyzqgi3tgojwfy4winzvgvrdkzryhe.m3u8" ,"");
	        
//	        //发送 POST 请求
//	        String sr=HttpRequest.sendPost("http://ipgw.neu.edu.cn/ipgw/ipgw.ipgw", "uid=stu_20133954&password=SHdeyilu37BP&operation=connect&range=2&timeout=1");
//	        System.out.println(sr);
	    }
}
