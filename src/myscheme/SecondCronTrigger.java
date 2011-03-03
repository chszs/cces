/**
 * @Author: Li.Qiang
 * @Date:   2011-3-2
 */
package myscheme;

import java.util.Map;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.impl.StdSchedulerFactory;
/**
 * 定义另一个触发器，触发调度器，执行作业
 */
public class SecondCronTrigger {
	public static void main(String[] args) throws Exception{
		MyTask task = new MyTask();
		
		// 指定调度器的作业细节
		JobDetail job = new JobDetail();
		job.setName("myJob");
		job.setJobClass(MyJob.class);
		
		Map dataMap = job.getJobDataMap();
		dataMap.put("myTask", task);
		
		// 配置触发器的触发时间
		CronTrigger trigger = new CronTrigger();
		trigger.setName("myTrigger2");
		trigger.setCronExpression("0/4 * * * * ?");
		
		// 调度器调度作业执行
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();
		scheduler.start();
		scheduler.scheduleJob(job, trigger);
	}
}