package com.test.eap.statistics;

public class Summary {

	private long ActiveCount;
	private long AvailableCount;
	private long AverageBlockingTime;
	private long AverageCreationTime;
	private long CreatedCount;
	private long DestroyedCount;
	private long InUseCount;
	private long MaxCreationTime;
	private long MaxUsedCount;
	private long MaxWaitCount;
	private long MaxWaitTime;
	private long TimedOut;
	private long TotalBlockingTime;
	private long TotalCreationTime;

	public long getActiveCount() {
		return ActiveCount;
	}

	public void setActiveCount(long activeCount) {
		ActiveCount = activeCount;
	}

	public long getAvailableCount() {
		return AvailableCount;
	}

	public void setAvailableCount(long availableCount) {
		AvailableCount = availableCount;
	}

	public long getAverageBlockingTime() {
		return AverageBlockingTime;
	}

	public void setAverageBlockingTime(long averageBlockingTime) {
		AverageBlockingTime = averageBlockingTime;
	}

	public long getAverageCreationTime() {
		return AverageCreationTime;
	}

	public void setAverageCreationTime(long averageCreationTime) {
		AverageCreationTime = averageCreationTime;
	}

	public long getCreatedCount() {
		return CreatedCount;
	}

	public void setCreatedCount(long createdCount) {
		CreatedCount = createdCount;
	}

	public long getDestroyedCount() {
		return DestroyedCount;
	}

	public void setDestroyedCount(long destroyedCount) {
		DestroyedCount = destroyedCount;
	}

	public long getInUseCount() {
		return InUseCount;
	}

	public void setInUseCount(long inUseCount) {
		InUseCount = inUseCount;
	}

	public long getMaxCreationTime() {
		return MaxCreationTime;
	}

	public void setMaxCreationTime(long maxCreationTime) {
		MaxCreationTime = maxCreationTime;
	}

	public long getMaxUsedCount() {
		return MaxUsedCount;
	}

	public void setMaxUsedCount(long maxUsedCount) {
		MaxUsedCount = maxUsedCount;
	}

	public long getMaxWaitCount() {
		return MaxWaitCount;
	}

	public void setMaxWaitCount(long maxWaitCount) {
		MaxWaitCount = maxWaitCount;
	}

	public long getMaxWaitTime() {
		return MaxWaitTime;
	}

	public void setMaxWaitTime(long maxWaitTime) {
		MaxWaitTime = maxWaitTime;
	}

	public long getTimedOut() {
		return TimedOut;
	}

	public void setTimedOut(long timedOut) {
		TimedOut = timedOut;
	}

	public long getTotalBlockingTime() {
		return TotalBlockingTime;
	}

	public void setTotalBlockingTime(long totalBlockingTime) {
		TotalBlockingTime = totalBlockingTime;
	}

	public long getTotalCreationTime() {
		return TotalCreationTime;
	}

	public void setTotalCreationTime(long totalCreationTime) {
		TotalCreationTime = totalCreationTime;
	}

	@Override
	public String toString() {
		return "Summary [ActiveCount=" + ActiveCount + ", AvailableCount=" + AvailableCount + ", AverageBlockingTime="
				+ AverageBlockingTime + ", AverageCreationTime=" + AverageCreationTime + ", CreatedCount="
				+ CreatedCount + ", DestroyedCount=" + DestroyedCount + ", InUseCount=" + InUseCount
				+ ", MaxCreationTime=" + MaxCreationTime + ", MaxUsedCount=" + MaxUsedCount + ", MaxWaitCount="
				+ MaxWaitCount + ", MaxWaitTime=" + MaxWaitTime + ", TimedOut=" + TimedOut + ", TotalBlockingTime="
				+ TotalBlockingTime + ", TotalCreationTime=" + TotalCreationTime + "]";
	}

}
