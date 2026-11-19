package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zacu {

    /* JADX INFO: renamed from: a */
    public final Set f4350a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    static {
        new Status(8, "The connection to Google Play services was lost", null, null);
    }
}
