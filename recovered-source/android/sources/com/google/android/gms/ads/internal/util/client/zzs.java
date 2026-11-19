package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class zzs {
    /* JADX INFO: renamed from: a */
    public static Object m3079a(Context context, String str, zzq zzqVar) throws zzr {
        try {
            return zzqVar.mo2799a(m3080b(context).m3706b(str));
        } catch (Exception e) {
            throw new zzr(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static DynamiteModule m3080b(Context context) throws zzr {
        try {
            return DynamiteModule.m3700c(context, DynamiteModule.f4717b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new zzr(e);
        }
    }
}
