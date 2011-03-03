/**
 * @Author: Li.Qiang
 * @Date:   2011-3-2
 */
package myscheme;

import java.util.Map;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
/**
 * 定义要执行的作业
 */
public class MyJob implements Job{
	public void execute(JobExecutionContext context) throws JobExecutionException {
		Map dataMap = context.getJobDetail().getJobDataMap();
		MyTask task = (MyTask)dataMap.get("myTask");
		task.doPrint();
	}
}