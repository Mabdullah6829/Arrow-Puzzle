package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
public final class zzfxx {
    /* JADX INFO: renamed from: a */
    public static zzayt m6773a(Context context, String str, String str2) {
        zzayt zzaytVar;
        try {
            zzaytVar = (zzayt) new zzfxw(context, str, str2).f16783v.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzaytVar = null;
        }
        return zzaytVar == null ? zzfxw.m6771b() : zzaytVar;
    }
}
