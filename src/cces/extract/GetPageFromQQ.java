/**
 * 项目名称:	CCES
 * 类名称:	GetPageFromQQ   
 * 类描述:	
 * 创建人:	Li Qiang
 * 创建时间:	2011-2-24
 * 修改人:	Li Qiang
 * 修改时间:	2011-2-28
 * 修改备注:	
 * 版权所有:	Li Qiang.(c) 2011
 * @version	
 */
package cces.extract;
import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
public class GetPageFromQQ {
	public String getPageFromHttpGet(String url) throws ClientProtocolException, IOException{
		HttpClient httpClient = new DefaultHttpClient();
		try{
			HttpGet httpGet = new HttpGet(url);
			// Create a response handler
			ResponseHandler<String> responseHandler = new BasicResponseHandler();
			return httpClient.execute(httpGet, responseHandler);
		}finally{
			// When HttpClient instance is no longer needed,
            // shut down the connection manager to ensure
            // immediate deallocation of all system resources
			httpClient.getConnectionManager().shutdown();
		}
	}
}