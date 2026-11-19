package com.google.firebase.firestore.local;

/* JADX INFO: renamed from: com.google.firebase.firestore.local.c */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5794c implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23759s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f23760t;

    public /* synthetic */ RunnableC5794c(Object obj, int i2) {
        this.f23759s = i2;
        this.f23760t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23759s) {
            case 0:
                ((IndexBackfiller.Scheduler) this.f23760t).lambda$scheduleBackfill$0();
                break;
            case 1:
                ((LruGarbageCollector.GCScheduler) this.f23760t).lambda$scheduleGC$0();
                break;
            default:
                ((SQLiteOverlayMigrationManager) this.f23760t).lambda$buildOverlays$0();
                break;
        }
    }
}
