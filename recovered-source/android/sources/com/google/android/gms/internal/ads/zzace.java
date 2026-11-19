package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzace extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzace(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String strConcat = th.getMessage() != null ? ": ".concat(String.valueOf(th.getMessage())) : "";
        super(AbstractC1456a.m2450q(new StringBuilder(strConcat.length() + simpleName.length() + 11), "Unexpected ", simpleName, strConcat), th);
    }
}
