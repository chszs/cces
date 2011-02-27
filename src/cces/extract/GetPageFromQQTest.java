/**
 * 项目名称:	MyCrawler
 * 类名称:	Test   
 * 类描述:	
 * 创建人:	Li Qiang.    qiang-4.li@changhong.com
 * 创建时间:	2011-2-24 下午09:51:22
 * 修改人:	Administrator
 * 修改时间:	2011-2-24 下午09:51:22
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