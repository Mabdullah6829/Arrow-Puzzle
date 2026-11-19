package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.wrappers.Wrappers;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcok implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzcnz f10641a;

    /* JADX INFO: renamed from: b */
    public final zzini f10642b;

    public zzcok(zzcnz zzcnzVar, zzimy zzimyVar) {
        this.f10641a = zzcnzVar;
        this.f10642b = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return Wrappers.m3665a(this.f10641a.m5709a()).m3663b(0, ((ApplicationInfo) this.f10642b.zzb()).packageName);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
