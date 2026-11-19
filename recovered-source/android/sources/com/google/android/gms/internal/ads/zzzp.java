package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzp extends zzat {

    /* JADX INFO: renamed from: u */
    public final zzgwt f21494u;

    public zzzp(String str, List list) {
        super(str, null, false, 1);
        this.f21494u = zzgwt.m7220t(list);
    }

    @Override // com.google.android.gms.internal.ads.zzat, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        zzgwt zzgwtVar = this.f21494u;
        if (zzgwtVar.isEmpty()) {
            return message;
        }
        int length = message.length();
        String strValueOf = String.valueOf(zzgwtVar);
        return AbstractC1456a.m2450q(new StringBuilder(length + 17 + strValueOf.length()), message, "\nsniff failures: ", strValueOf);
    }
}
