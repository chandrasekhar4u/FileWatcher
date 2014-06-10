
package com.file.watcher.nio;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class WatchFileOrFolder {

	private static long sleep=500;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
		ScheduledFuture<?> future = executor.scheduleWithFixedDelay(new FileWatcherService(), 0, sleep,TimeUnit.MILLISECONDS);
	}

}
