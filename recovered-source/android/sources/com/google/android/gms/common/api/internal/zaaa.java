package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zaaa {

    /* JADX INFO: renamed from: a */
    public final Map f4281a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    public final Map f4282b = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: a */
    public final void m3488a(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        Map map3 = this.f4281a;
        synchronized (map3) {
            map = new HashMap(map3);
        }
        Map map4 = this.f4282b;
        synchronized (map4) {
            map2 = new HashMap(map4);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).m3451b(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).m10769c(new ApiException(status));
            }
        }
    }
}
