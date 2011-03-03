/**
 * @Author: Li.Qiang
 * @Date:   2011-3-2
 */
package myscheme;
/**
 * 定义我的任务
 */
public class MyTask {
	private int num = 0;
	public void doPrint(){
		num++;
		System.out.println("我第" + num + "次运行！");
	}
}