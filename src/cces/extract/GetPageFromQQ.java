/**
 * ��Ŀ����:	MyCrawler
 * ������:	ClientWithResponseHandler   
 * ������:	
 * ������:	Li Qiang.    qiang-4.li@changhong.com
 * ����ʱ��:	2011-2-24 ����09:23:34
 * �޸���:	Administrator
 * �޸�ʱ��:	2011-2-24 ����09:23:34
 * �޸ı�ע:	
 * ��Ȩ����:	Li Qiang.(c) 2011
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