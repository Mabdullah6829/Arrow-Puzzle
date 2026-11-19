package com.google.firebase.firestore.local;

/* JADX INFO: renamed from: com.google.firebase.firestore.local.H */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5779H implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23732s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ SQLiteSchema f23733t;

    public /* synthetic */ RunnableC5779H(SQLiteSchema sQLiteSchema, int i2) {
        this.f23732s = i2;
        this.f23733t = sQLiteSchema;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23732s) {
            case 0:
                this.f23733t.lambda$createV8CollectionParentsIndex$9();
                break;
            case 1:
                this.f23733t.lambda$createBundleCache$15();
                break;
            case 2:
                this.f23733t.lambda$createOverlays$16();
                break;
            case 3:
                this.f23733t.lambda$createV1MutationQueue$0();
                break;
            case 4:
                this.f23733t.lambda$createFieldIndex$5();
                break;
            case 5:
                this.f23733t.lambda$createV1TargetCache$3();
                break;
            case 6:
                this.f23733t.lambda$createDataMigrationTable$17();
                break;
            case 7:
                this.f23733t.lambda$createGlobalsTable$18();
                break;
            default:
                this.f23733t.lambda$createV1RemoteDocumentCache$4();
                break;
        }
    }
}
