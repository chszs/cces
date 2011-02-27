/**
 * @Author: Li.Qiang
 * @Date:   2011-2-24
 */
package cces.extract;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
/**
 * 抓取网页
 */
public class GetPageFromHao123 {
	/**
	 * 抓取网页
	 * @param url 给定URL地址
	 * @return 把整个网页的内容作为字符串返回
	 * @throws UnsupportedEncodingException 不支持的编码异常
	 * @throws Exception 其它异常
	 */
	public String getPageFromHttpGet(String url) throws UnsupportedEncodingException{
		String htmlDoc = "";
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet();
		HttpResponse response;
		BufferedReader reader;
		String tmp = null;
		try {
			request.setURI(new URI(url));
			response = client.execute(request);
			reader = new BufferedReader(
					new InputStreamReader(response.getEntity().getContent(),"ISO-8859-1"));
			while((tmp=reader.readLine())!=null){
				htmlDoc += tmp + "\r\n";
			}
		} catch (URISyntaxException e) {
			// request.setURI(new URI(url));
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			// response = client.execute(request);
			e.printStackTrace();
		} catch (IOException e) {
			// response = client.execute(request);
			// reader = new BufferedReader...
			e.printStackTrace();
		} catch (IllegalStateException e) {
			// reader = new BufferedReader...
			// reader.readLine()
			e.printStackTrace();
		}finally{
			// When HttpClient instance is no longer needed,
            // shut down the connection manager to ensure
            // immediate deallocation of all system resources
			client.getConnectionManager().shutdown();
		}
		return new String(htmlDoc.getBytes("ISO-8859-1"), "GBK");
	}
}