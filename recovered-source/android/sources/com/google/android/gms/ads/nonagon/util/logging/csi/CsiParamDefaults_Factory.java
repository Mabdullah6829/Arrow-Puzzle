package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import com.google.android.gms.internal.ads.zzcnz;
import com.google.android.gms.internal.ads.zzcop;
import com.google.android.gms.internal.ads.zzimy;
import com.google.android.gms.internal.ads.zzimz;
import com.google.android.gms.internal.ads.zzini;

/* JADX INFO: loaded from: classes.dex */
public final class CsiParamDefaults_Factory implements zzimz<CsiParamDefaults> {

    /* JADX INFO: renamed from: a */
    public final zzcnz f4003a;

    /* JADX INFO: renamed from: b */
    public final zzcop f4004b;

    /* JADX INFO: renamed from: c */
    public final zzini f4005c;

    /* JADX INFO: renamed from: d */
    public final zzini f4006d;

    /* JADX INFO: renamed from: e */
    public final zzini f4007e;

    public CsiParamDefaults_Factory(zzcnz zzcnzVar, zzcop zzcopVar, zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3) {
        this.f4003a = zzcnzVar;
        this.f4004b = zzcopVar;
        this.f4005c = zzimyVar;
        this.f4006d = zzimyVar2;
        this.f4007e = zzimyVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CsiParamDefaults zzb() {
        return new CsiParamDefaults((Context) this.f4003a.zzb(), (VersionInfoParcel) this.f4004b.zzb(), (PackageInfo) this.f4005c.zzb(), (String) this.f4006d.zzb(), (DeviceTierManager) this.f4007e.zzb());
    }
}
