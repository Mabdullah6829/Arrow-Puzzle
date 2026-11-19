package com.google.firebase.firestore.local;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Consumer;
import com.google.firebase.firestore.util.Logger;
import java.util.Comparator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public class LruGarbageCollector {
    private static final long INITIAL_GC_DELAY_MS;
    private static final long REGULAR_GC_DELAY_MS;
    private final LruDelegate delegate;
    private final Params params;

    public class GCScheduler implements Scheduler {
        private final AsyncQueue asyncQueue;

        @Nullable
        private AsyncQueue.DelayedTask gcTask;
        private boolean hasRun = false;
        private final LocalStore localStore;

        public GCScheduler(AsyncQueue asyncQueue, LocalStore localStore) {
            this.asyncQueue = asyncQueue;
            this.localStore = localStore;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$scheduleGC$0() {
            this.localStore.collectGarbage(LruGarbageCollector.this);
            this.hasRun = true;
            scheduleGC();
        }

        private void scheduleGC() {
            this.gcTask = this.asyncQueue.enqueueAfterDelay(AsyncQueue.TimerId.GARBAGE_COLLECTION, this.hasRun ? LruGarbageCollector.REGULAR_GC_DELAY_MS : LruGarbageCollector.INITIAL_GC_DELAY_MS, new RunnableC5794c(this, 1));
        }

        @Override // com.google.firebase.firestore.local.Scheduler
        public void start() {
            if (LruGarbageCollector.this.params.minBytesThreshold != -1) {
                scheduleGC();
            }
        }

        @Override // com.google.firebase.firestore.local.Scheduler
        public void stop() {
            AsyncQueue.DelayedTask delayedTask = this.gcTask;
            if (delayedTask != null) {
                delayedTask.cancel();
            }
        }
    }

    public static class Params {
        private static final long COLLECTION_DISABLED = -1;
        private static final long DEFAULT_CACHE_SIZE_BYTES = 104857600;
        private static final int DEFAULT_COLLECTION_PERCENTILE = 10;
        private static final int DEFAULT_MAX_SEQUENCE_NUMBERS_TO_COLLECT = 1000;
        final int maximumSequenceNumbersToCollect;
        long minBytesThreshold;
        int percentileToCollect;

        public Params(long j2, int i2, int i3) {
            this.minBytesThreshold = j2;
            this.percentileToCollect = i2;
            this.maximumSequenceNumbersToCollect = i3;
        }

        public static Params Default() {
            return new Params(DEFAULT_CACHE_SIZE_BYTES, 10, 1000);
        }

        public static Params Disabled() {
            return new Params(-1L, 0, 0);
        }

        public static Params WithCacheSizeBytes(long j2) {
            return new Params(j2, 10, 1000);
        }
    }

    public static class Results {
        private final int documentsRemoved;
        private final boolean hasRun;
        private final int sequenceNumbersCollected;
        private final int targetsRemoved;

        public Results(boolean z, int i2, int i3, int i4) {
            this.hasRun = z;
            this.sequenceNumbersCollected = i2;
            this.targetsRemoved = i3;
            this.documentsRemoved = i4;
        }

        public static Results DidNotRun() {
            return new Results(false, 0, 0, 0);
        }

        public int getDocumentsRemoved() {
            return this.documentsRemoved;
        }

        public int getSequenceNumbersCollected() {
            return this.sequenceNumbersCollected;
        }

        public int getTargetsRemoved() {
            return this.targetsRemoved;
        }

        public boolean hasRun() {
            return this.hasRun;
        }
    }

    public static class RollingSequenceNumberBuffer {
        private static final Comparator<Long> COMPARATOR = new C5792a(2);
        private final int maxElements;
        private final PriorityQueue<Long> queue;

        public RollingSequenceNumberBuffer(int i2) {
            this.maxElements = i2;
            this.queue = new PriorityQueue<>(i2, COMPARATOR);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$static$0(Long l2, Long l3) {
            return l3.compareTo(l2);
        }

        public void addElement(Long l2) {
            if (this.queue.size() < this.maxElements) {
                this.queue.add(l2);
                return;
            }
            if (l2.longValue() < this.queue.peek().longValue()) {
                this.queue.poll();
                this.queue.add(l2);
            }
        }

        public long getMaxValue() {
            return this.queue.peek().longValue();
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        INITIAL_GC_DELAY_MS = timeUnit.toMillis(1L);
        REGULAR_GC_DELAY_MS = timeUnit.toMillis(5L);
    }

    public LruGarbageCollector(LruDelegate lruDelegate, Params params) {
        this.delegate = lruDelegate;
        this.params = params;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getNthSequenceNumber$0(RollingSequenceNumberBuffer rollingSequenceNumberBuffer, TargetData targetData) {
        rollingSequenceNumberBuffer.addElement(Long.valueOf(targetData.getSequenceNumber()));
    }

    private Results runGarbageCollection(SparseArray<?> sparseArray) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iCalculateQueryCount = calculateQueryCount(this.params.percentileToCollect);
        if (iCalculateQueryCount > this.params.maximumSequenceNumbersToCollect) {
            Logger.debug("LruGarbageCollector", "Capping sequence numbers to collect down to the maximum of " + this.params.maximumSequenceNumbersToCollect + " from " + iCalculateQueryCount, new Object[0]);
            iCalculateQueryCount = this.params.maximumSequenceNumbersToCollect;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long nthSequenceNumber = getNthSequenceNumber(iCalculateQueryCount);
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        int iRemoveTargets = removeTargets(nthSequenceNumber, sparseArray);
        long jCurrentTimeMillis4 = System.currentTimeMillis();
        int iRemoveOrphanedDocuments = removeOrphanedDocuments(nthSequenceNumber);
        long jCurrentTimeMillis5 = System.currentTimeMillis();
        if (Logger.isDebugEnabled()) {
            StringBuilder sbM408p = AbstractC0271e0.m408p("LRU Garbage Collection:\n\tCounted targets in " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + "ms\n");
            Locale locale = Locale.ROOT;
            sbM408p.append("\tDetermined least recently used " + iCalculateQueryCount + " sequence numbers in " + (jCurrentTimeMillis3 - jCurrentTimeMillis2) + "ms\n");
            StringBuilder sbM408p2 = AbstractC0271e0.m408p(sbM408p.toString());
            sbM408p2.append("\tRemoved " + iRemoveTargets + " targets in " + (jCurrentTimeMillis4 - jCurrentTimeMillis3) + "ms\n");
            StringBuilder sbM408p3 = AbstractC0271e0.m408p(sbM408p2.toString());
            sbM408p3.append("\tRemoved " + iRemoveOrphanedDocuments + " documents in " + (jCurrentTimeMillis5 - jCurrentTimeMillis4) + "ms\n");
            StringBuilder sbM408p4 = AbstractC0271e0.m408p(sbM408p3.toString());
            StringBuilder sb = new StringBuilder("Total Duration: ");
            sb.append(jCurrentTimeMillis5 - jCurrentTimeMillis);
            sb.append("ms");
            sbM408p4.append(sb.toString());
            Logger.debug("LruGarbageCollector", sbM408p4.toString(), new Object[0]);
        }
        return new Results(true, iCalculateQueryCount, iRemoveTargets, iRemoveOrphanedDocuments);
    }

    public int calculateQueryCount(int i2) {
        return (int) ((i2 / 100.0f) * this.delegate.getSequenceNumberCount());
    }

    public Results collect(SparseArray<?> sparseArray) {
        if (this.params.minBytesThreshold == -1) {
            Logger.debug("LruGarbageCollector", "Garbage collection skipped; disabled", new Object[0]);
            return Results.DidNotRun();
        }
        long byteSize = getByteSize();
        if (byteSize >= this.params.minBytesThreshold) {
            return runGarbageCollection(sparseArray);
        }
        Logger.debug("LruGarbageCollector", "Garbage collection skipped; Cache size " + byteSize + " is lower than threshold " + this.params.minBytesThreshold, new Object[0]);
        return Results.DidNotRun();
    }

    public long getByteSize() {
        return this.delegate.getByteSize();
    }

    public long getNthSequenceNumber(int i2) {
        if (i2 == 0) {
            return -1L;
        }
        final RollingSequenceNumberBuffer rollingSequenceNumberBuffer = new RollingSequenceNumberBuffer(i2);
        final int i3 = 0;
        this.delegate.forEachTarget(new Consumer() { // from class: com.google.firebase.firestore.local.o
            @Override // com.google.firebase.firestore.util.Consumer
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        LruGarbageCollector.lambda$getNthSequenceNumber$0(rollingSequenceNumberBuffer, (TargetData) obj);
                        break;
                    default:
                        rollingSequenceNumberBuffer.addElement((Long) obj);
                        break;
                }
            }
        });
        final int i4 = 1;
        this.delegate.forEachOrphanedDocumentSequenceNumber(new Consumer() { // from class: com.google.firebase.firestore.local.o
            @Override // com.google.firebase.firestore.util.Consumer
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        LruGarbageCollector.lambda$getNthSequenceNumber$0(rollingSequenceNumberBuffer, (TargetData) obj);
                        break;
                    default:
                        rollingSequenceNumberBuffer.addElement((Long) obj);
                        break;
                }
            }
        });
        return rollingSequenceNumberBuffer.getMaxValue();
    }

    public GCScheduler newScheduler(AsyncQueue asyncQueue, LocalStore localStore) {
        return new GCScheduler(asyncQueue, localStore);
    }

    public int removeOrphanedDocuments(long j2) {
        return this.delegate.removeOrphanedDocuments(j2);
    }

    public int removeTargets(long j2, SparseArray<?> sparseArray) {
        return this.delegate.removeTargets(j2, sparseArray);
    }

    public LruGarbageCollector withNewThreshold(long j2) {
        Params params = this.params;
        params.minBytesThreshold = j2;
        params.percentileToCollect = 100;
        return this;
    }
}
