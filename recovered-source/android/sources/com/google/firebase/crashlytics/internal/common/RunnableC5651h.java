package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.LoadBundleTask;
import com.google.firebase.firestore.PipelineResultObserver;
import com.google.firebase.firestore.bundle.BundleReader;
import com.google.firebase.firestore.core.AsyncEventListener;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.util.AsyncQueue;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import p022N.C0349D;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.h */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5651h implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23604s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f23605t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f23606u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f23607v;

    public /* synthetic */ RunnableC5651h(Object obj, Object obj2, Object obj3, int i2) {
        this.f23604s = i2;
        this.f23605t = obj;
        this.f23606u = obj2;
        this.f23607v = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23604s) {
            case 0:
                ((CrashlyticsCore) this.f23605t).lambda$logException$1((Throwable) this.f23606u, (Map) this.f23607v);
                break;
            case 1:
                ((AsyncEventListener) this.f23605t).lambda$onEvent$0(this.f23606u, (FirebaseFirestoreException) this.f23607v);
                break;
            case 2:
                ((FirestoreClient) this.f23605t).lambda$write$12((List) this.f23606u, (TaskCompletionSource) this.f23607v);
                break;
            case 3:
                ((FirestoreClient) this.f23605t).lambda$loadBundle$20((BundleReader) this.f23606u, (LoadBundleTask) this.f23607v);
                break;
            case 4:
                ((FirestoreClient) this.f23605t).lambda$executePipeline$17((C0349D) this.f23606u, (PipelineResultObserver) this.f23607v);
                break;
            case 5:
                ((FirestoreClient) this.f23605t).lambda$getNamedQuery$21((String) this.f23606u, (TaskCompletionSource) this.f23607v);
                break;
            case 6:
                AsyncQueue.lambda$runSync$4((Runnable) this.f23605t, (Throwable[]) this.f23606u, (Semaphore) this.f23607v);
                break;
            default:
                AsyncQueue.lambda$callTask$1((Callable) this.f23605t, (Executor) this.f23606u, (TaskCompletionSource) this.f23607v);
                break;
        }
    }
}
