package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzbqm implements zzbqn {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzcgd f9281a;

    public zzbqm(zzbqo zzbqoVar, zzcgd zzcgdVar) {
        this.f9281a = zzcgdVar;
        Objects.requireNonNull(zzbqoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    /* JADX INFO: renamed from: m */
    public final void mo5113m(String str) {
        this.f9281a.m5398b(new zzbue(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    /* JADX INFO: renamed from: n */
    public final void mo5114n(JSONObject jSONObject) {
        this.f9281a.m5397a(jSONObject);
    }
}
