/**
 * @Author: Li.Qiang
 * @Date:   2011-2-24
 */
package cces.extract;

public class GetPageFromHao123Test {
	public static void main(String[] args) throws Exception{
		GetPageFromHao123 page = new GetPageFromHao123();
		System.out.println(page.getPageFromHttpGet("http://www.hao123.com/"));
	}
}