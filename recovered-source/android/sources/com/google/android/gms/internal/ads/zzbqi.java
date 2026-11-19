package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzbqi implements com.google.android.gms.ads.internal.overlay.zzaa {

    /* JADX INFO: renamed from: a */
    public boolean f9266a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f9267b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ com.google.android.gms.ads.internal.client.zza f9268c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ HashMap f9269d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Map f9270e;

    public zzbqi(zzbqk zzbqkVar, boolean z, com.google.android.gms.ads.internal.client.zza zzaVar, HashMap map, Map map2) {
        this.f9267b = z;
        this.f9268c = zzaVar;
        this.f9269d = map;
        this.f9270e = map2;
        Objects.requireNonNull(zzbqkVar);
        this.f9266a = false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    /* JADX INFO: renamed from: b */
    public final void mo2987b(int i2) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    /* JADX INFO: renamed from: k0 */
    public final void mo2988k0(boolean z) {
        if (this.f9266a) {
            return;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = this.f9268c;
        if (z && this.f9267b) {
            ((zzdlg) zzaVar).mo5626C();
        }
        this.f9266a = true;
        String str = (String) this.f9270e.get("event_id");
        Boolean boolValueOf = Boolean.valueOf(z);
        HashMap map = this.f9269d;
        map.put(str, boolValueOf);
        ((zzbst) zzaVar).mo5129b("openIntentAsync", map);
    }
}
