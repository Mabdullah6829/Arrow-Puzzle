package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.graphics.Insets;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeve implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final com.google.android.gms.ads.internal.client.zzr f14956a;

    /* JADX INFO: renamed from: b */
    public final String f14957b;

    /* JADX INFO: renamed from: c */
    public final boolean f14958c;

    /* JADX INFO: renamed from: d */
    public final String f14959d;

    /* JADX INFO: renamed from: e */
    public final float f14960e;

    /* JADX INFO: renamed from: f */
    public final int f14961f;

    /* JADX INFO: renamed from: g */
    public final int f14962g;

    /* JADX INFO: renamed from: h */
    public final String f14963h;

    /* JADX INFO: renamed from: i */
    public final int f14964i;

    /* JADX INFO: renamed from: j */
    public final boolean f14965j;

    /* JADX INFO: renamed from: k */
    public final Insets f14966k;

    /* JADX INFO: renamed from: l */
    public final zzevb f14967l;

    public zzeve(com.google.android.gms.ads.internal.client.zzr zzrVar, String str, boolean z, String str2, float f2, int i2, int i3, String str3, int i4, boolean z2, Insets insets, zzevb zzevbVar) {
        Preconditions.m3545i(zzrVar, "the adSize must not be null");
        this.f14956a = zzrVar;
        this.f14957b = str;
        this.f14958c = z;
        this.f14959d = str2;
        this.f14960e = f2;
        this.f14961f = i2;
        this.f14962g = i3;
        this.f14963h = str3;
        this.f14964i = i4;
        this.f14965j = z2;
        this.f14966k = insets;
        this.f14967l = zzevbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6399b(Object obj) {
        Bundle bundle = (Bundle) obj;
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.f14956a;
        int i2 = zzrVar.f3261w;
        boolean z = zzrVar.f3255G;
        zzflv.m6494b(bundle, "smart_w", "full", i2 == -1);
        int i3 = zzrVar.f3258t;
        zzflv.m6494b(bundle, "smart_h", "auto", i3 == -2);
        zzflv.m6496d(bundle, "ene", true, zzrVar.f3250B);
        zzflv.m6494b(bundle, "rafmt", "102", zzrVar.f3253E);
        zzflv.m6494b(bundle, "rafmt", "108", zzrVar.f3256H);
        zzflv.m6494b(bundle, "rafmt", "103", zzrVar.f3254F);
        zzflv.m6494b(bundle, "rafmt", "105", z);
        zzflv.m6496d(bundle, "inline_adaptive_slot", true, this.f14965j);
        zzflv.m6496d(bundle, "interscroller_slot", true, z);
        zzflv.m6497e("format", this.f14957b, bundle);
        zzflv.m6494b(bundle, "fluid", "height", this.f14958c);
        String str = this.f14959d;
        zzflv.m6494b(bundle, "sz", str, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.f14960e);
        bundle.putInt("sw", this.f14961f);
        bundle.putInt("sh", this.f14962g);
        String str2 = this.f14963h;
        zzflv.m6494b(bundle, "sc", str2, true ^ TextUtils.isEmpty(str2));
        int i4 = this.f14964i;
        if (i4 != -1) {
            bundle.putInt("u_mso", i4);
        }
        Insets insets = this.f14966k;
        if (insets != null) {
            bundle.putInt("sam_t", insets.top);
            bundle.putInt("sam_b", insets.bottom);
            bundle.putInt("sam_l", insets.left);
            bundle.putInt("sam_r", insets.right);
        }
        zzevb zzevbVar = this.f14967l;
        if (zzevbVar != null) {
            bundle.putInt("rc_tl", zzevbVar.f14947a);
            bundle.putInt("rc_tr", zzevbVar.f14948b);
            bundle.putInt("rc_bl", zzevbVar.f14949c);
            bundle.putInt("rc_br", zzevbVar.f14950d);
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr = zzrVar.f3263y;
        if (zzrVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", i3);
            bundle2.putInt("width", i2);
            bundle2.putBoolean("is_fluid_height", zzrVar.f3249A);
            arrayList.add(bundle2);
        } else {
            for (com.google.android.gms.ads.internal.client.zzr zzrVar2 : zzrVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzrVar2.f3249A);
                bundle3.putInt("height", zzrVar2.f3258t);
                bundle3.putInt("width", zzrVar2.f3261w);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
