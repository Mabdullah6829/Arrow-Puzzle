package com.google.android.gms.common.api.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class zaa extends LifecycleCallback {

    /* JADX INFO: renamed from: t */
    public ArrayList f4280t;

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: j */
    public final void mo3475j() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = this.f4280t;
            this.f4280t = new ArrayList();
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((Runnable) obj).run();
        }
    }
}
