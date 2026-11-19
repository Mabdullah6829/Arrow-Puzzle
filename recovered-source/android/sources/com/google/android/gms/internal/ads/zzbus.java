package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzbus implements zzbqn {

    /* JADX INFO: renamed from: a */
    public final zzbtv f9409a;

    /* JADX INFO: renamed from: b */
    public final zzcgd f9410b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzbut f9411c;

    public zzbus(zzbtv zzbtvVar, zzbut zzbutVar, zzcgd zzcgdVar) {
        Objects.requireNonNull(zzbutVar);
        this.f9411c = zzbutVar;
        this.f9409a = zzbtvVar;
        this.f9410b = zzcgdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    /* JADX INFO: renamed from: m */
    public final void mo5113m(String str) {
        zzbtv zzbtvVar = this.f9409a;
        zzcgd zzcgdVar = this.f9410b;
        try {
            if (str == null) {
                zzcgdVar.m5398b(new zzbue());
            } else {
                zzcgdVar.m5398b(new zzbue(str));
            }
        } catch (IllegalStateException unused) {
        } finally {
            zzbtvVar.m5136d();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    /* JADX INFO: renamed from: n */
    public final void mo5114n(JSONObject jSONObject) {
        zzbtv zzbtvVar = this.f9409a;
        zzcgd zzcgdVar = this.f9410b;
        try {
            try {
                zzcgdVar.m5397a(this.f9411c.f9412a.mo5146n(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e) {
                zzcgdVar.m5398b(e);
            }
        } finally {
            zzbtvVar.m5136d();
        }
    }
}
