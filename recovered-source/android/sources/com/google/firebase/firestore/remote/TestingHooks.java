package com.google.firebase.firestore.remote;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.auto.value.AutoValue;
import com.google.firebase.firestore.ListenerRegistration;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.util.Preconditions;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p022N.C0423k;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
final class TestingHooks {
    private static final TestingHooks instance = new TestingHooks();
    private final CopyOnWriteArrayList<AtomicReference<ExistenceFilterMismatchListener>> existenceFilterMismatchListeners = new CopyOnWriteArrayList<>();

    @AutoValue
    public static abstract class ExistenceFilterBloomFilterInfo {
        public static ExistenceFilterBloomFilterInfo create(@Nullable BloomFilter bloomFilter, boolean z, int i2, int i3, int i4) {
            return new AutoValue_TestingHooks_ExistenceFilterBloomFilterInfo(bloomFilter, z, i2, i3, i4);
        }

        @Nullable
        public static ExistenceFilterBloomFilterInfo from(@Nullable BloomFilter bloomFilter, WatchChangeAggregator.BloomFilterApplicationStatus bloomFilterApplicationStatus, ExistenceFilter existenceFilter) {
            C0423k unchangedNames = existenceFilter.getUnchangedNames();
            if (unchangedNames == null) {
                return null;
            }
            return create(bloomFilter, bloomFilterApplicationStatus == WatchChangeAggregator.BloomFilterApplicationStatus.SUCCESS, unchangedNames.m847g(), unchangedNames.m846e().m841e().size(), unchangedNames.m846e().m842g());
        }

        public abstract boolean applied();

        public abstract int bitmapLength();

        @Nullable
        public abstract BloomFilter bloomFilter();

        public abstract int hashCount();

        public abstract int padding();
    }

    @AutoValue
    public static abstract class ExistenceFilterMismatchInfo {
        public static ExistenceFilterMismatchInfo create(int i2, int i3, String str, String str2, @Nullable ExistenceFilterBloomFilterInfo existenceFilterBloomFilterInfo) {
            return new AutoValue_TestingHooks_ExistenceFilterMismatchInfo(i2, i3, str, str2, existenceFilterBloomFilterInfo);
        }

        public static ExistenceFilterMismatchInfo from(int i2, ExistenceFilter existenceFilter, DatabaseId databaseId, @Nullable BloomFilter bloomFilter, WatchChangeAggregator.BloomFilterApplicationStatus bloomFilterApplicationStatus) {
            return create(i2, existenceFilter.getCount(), databaseId.getProjectId(), databaseId.getDatabaseId(), ExistenceFilterBloomFilterInfo.from(bloomFilter, bloomFilterApplicationStatus, existenceFilter));
        }

        @Nullable
        public abstract ExistenceFilterBloomFilterInfo bloomFilter();

        public abstract String databaseId();

        public abstract int existenceFilterCount();

        public abstract int localCacheCount();

        public abstract String projectId();
    }

    public interface ExistenceFilterMismatchListener {
        @AnyThread
        void onExistenceFilterMismatch(@NonNull ExistenceFilterMismatchInfo existenceFilterMismatchInfo);
    }

    private TestingHooks() {
    }

    @NonNull
    public static TestingHooks getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addExistenceFilterMismatchListener$0(AtomicReference atomicReference) {
        atomicReference.set(null);
        this.existenceFilterMismatchListeners.remove(atomicReference);
    }

    public ListenerRegistration addExistenceFilterMismatchListener(@NonNull ExistenceFilterMismatchListener existenceFilterMismatchListener) {
        Preconditions.checkNotNull(existenceFilterMismatchListener, "a null listener is not allowed");
        final AtomicReference<ExistenceFilterMismatchListener> atomicReference = new AtomicReference<>(existenceFilterMismatchListener);
        this.existenceFilterMismatchListeners.add(atomicReference);
        return new ListenerRegistration() { // from class: com.google.firebase.firestore.remote.k
            @Override // com.google.firebase.firestore.ListenerRegistration
            public final void remove() {
                this.f23952a.lambda$addExistenceFilterMismatchListener$0(atomicReference);
            }
        };
    }

    public void notifyOnExistenceFilterMismatch(@NonNull ExistenceFilterMismatchInfo existenceFilterMismatchInfo) {
        Iterator<AtomicReference<ExistenceFilterMismatchListener>> it = this.existenceFilterMismatchListeners.iterator();
        while (it.hasNext()) {
            ExistenceFilterMismatchListener existenceFilterMismatchListener = it.next().get();
            if (existenceFilterMismatchListener != null) {
                existenceFilterMismatchListener.onExistenceFilterMismatch(existenceFilterMismatchInfo);
            }
        }
    }
}
