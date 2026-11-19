package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.Looper;
import androidx.collection.ArrayMap;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.internal.common.zzg;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzc {

    /* JADX INFO: renamed from: a */
    public final Map f4375a = Collections.synchronizedMap(new ArrayMap());

    /* JADX INFO: renamed from: b */
    public int f4376b = 0;

    /* JADX INFO: renamed from: c */
    public Bundle f4377c;

    /* JADX INFO: renamed from: a */
    public final void m3523a(String str, LifecycleCallback lifecycleCallback) {
        Map map = this.f4375a;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(AbstractC1456a.m2450q(new StringBuilder(str.length() + 59), "LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, lifecycleCallback);
        if (this.f4376b > 0) {
            new zzg(Looper.getMainLooper()).post(new zzb(this, lifecycleCallback, str));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3524b(Bundle bundle) {
        this.f4376b = 1;
        this.f4377c = bundle;
        for (Map.Entry entry : this.f4375a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo3470e(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3525c(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f4375a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).mo3473h(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }
}
