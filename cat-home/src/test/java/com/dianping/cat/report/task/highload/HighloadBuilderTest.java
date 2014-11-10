package com.dianping.cat.report.task.highload;

import org.unidal.lookup.ComponentTestCase;

import com.dianping.cat.Constants;
import com.dianping.cat.helper.TimeHelper;
import com.dianping.cat.report.task.spi.ReportTaskBuilder;

public class HighloadBuilderTest extends ComponentTestCase {

	// @Test
	public void testHighloadBuilder() {
		long time = System.currentTimeMillis();
		ReportTaskBuilder updater = lookup(ReportTaskBuilder.class, HighLoadReportBuilder.ID);

		updater.buildDailyTask(Constants.HIGH_LOAD_REPORT, "", TimeHelper.addDays(TimeHelper.getYesterday(), -2));
		System.out.println("done: " + Long.toString(System.currentTimeMillis() - time));
	}

}
