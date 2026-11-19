package com.google.firebase.crashlytics.internal.metadata;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.metadata.b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5662b implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23624s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f23625t;

    public /* synthetic */ RunnableC5662b(Object obj, int i2) {
        this.f23624s = i2;
        this.f23625t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23624s) {
            case 0:
                ((UserMetadata.SerializeableKeysMap) this.f23625t).lambda$scheduleSerializationTaskIfNeeded$0();
                break;
            default:
                ((UserMetadata) this.f23625t).serializeUserDataIfNeeded();
                break;
        }
    }
}
