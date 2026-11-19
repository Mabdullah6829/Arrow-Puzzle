package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class zzv extends LifecycleCallback {

    /* JADX INFO: renamed from: t */
    public final ArrayList f23269t;

    public zzv(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.f23269t = new ArrayList();
        lifecycleFragment.mo3476a("TaskOnStopCallback", this);
    }

    /* JADX INFO: renamed from: k */
    public static zzv m10783k(Activity activity) {
        zzv zzvVar;
        LifecycleFragment lifecycleFragmentM3466c = LifecycleCallback.m3466c(activity);
        synchronized (lifecycleFragmentM3466c) {
            try {
                zzvVar = (zzv) lifecycleFragmentM3466c.mo3477b(zzv.class, "TaskOnStopCallback");
                if (zzvVar == null) {
                    zzvVar = new zzv(lifecycleFragmentM3466c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzvVar;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: j */
    public final void mo3475j() {
        ArrayList arrayList = this.f23269t;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    zzq zzqVar = (zzq) ((WeakReference) obj).get();
                    if (zzqVar != null) {
                        zzqVar.zzb();
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m10784l(zzq zzqVar) {
        ArrayList arrayList = this.f23269t;
        synchronized (arrayList) {
            arrayList.add(new WeakReference(zzqVar));
        }
    }
}
