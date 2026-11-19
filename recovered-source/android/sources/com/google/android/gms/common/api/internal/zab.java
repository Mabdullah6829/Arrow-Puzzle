package com.google.android.gms.common.api.internal;

import com.google.firebase.firestore.RunnableC5969s;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class zab extends ActivityLifecycleObserver {

    /* JADX INFO: renamed from: a */
    public final WeakReference f4283a;

    public zab(zaa zaaVar) {
        this.f4283a = new WeakReference(zaaVar);
    }

    /* JADX INFO: renamed from: b */
    public final zab m3494b(RunnableC5969s runnableC5969s) {
        zaa zaaVar = (zaa) this.f4283a.get();
        if (zaaVar == null) {
            throw new IllegalStateException("The target activity has already been GC'd");
        }
        synchronized (zaaVar) {
            zaaVar.f4280t.add(runnableC5969s);
        }
        return this;
    }
}
