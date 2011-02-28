/**
 * 项目名称:	CCES
 * 类名称:	GetPageFromHao123Test   
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

public class GetPageFromHao123Test {
	public static void main(String[] args) throws Exception{
		GetPageFromHao123 page = new GetPageFromHao123();
		System.out.println(page.getPageFromHttpGet("http://www.hao123.com/"));
	}
}