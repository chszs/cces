/**
 * ��Ŀ����:	MyCrawler
 * ������:	Test   
 * ������:	
 * ������:	Li Qiang.    qiang-4.li@changhong.com
 * ����ʱ��:	2011-2-24 ����09:51:22
 * �޸���:	Administrator
 * �޸�ʱ��:	2011-2-24 ����09:51:22
 * �޸ı�ע:	
 * ��Ȩ����:	Li Qiang.(c) 2011
 * @version	
 */
package cces.extract;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

public class GetPageFromQQTest {
	public static void main(String[] args) throws ClientProtocolException, IOException {
		GetPageFromQQ request = new GetPageFromQQ();
		System.out.println(request.getPageFromHttpGet("http://www.qq.com/"));
	}

}