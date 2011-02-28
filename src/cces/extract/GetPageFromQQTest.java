/**
 * 项目名称:	CCES
 * 类名称:	GetPageFromQQTest   
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

public class GetPageFromQQTest {
	public static void main(String[] args) throws ClientProtocolException, IOException {
		GetPageFromQQ request = new GetPageFromQQ();
		System.out.println(request.getPageFromHttpGet("http://www.qq.com/"));
	}

}