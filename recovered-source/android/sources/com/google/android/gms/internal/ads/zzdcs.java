package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdcs extends com.google.android.gms.ads.internal.client.zzdw {

    /* JADX INFO: renamed from: A */
    public final Bundle f12043A;

    /* JADX INFO: renamed from: B */
    public final double f12044B;

    /* JADX INFO: renamed from: C */
    public final int f12045C;

    /* JADX INFO: renamed from: s */
    public final String f12046s;

    /* JADX INFO: renamed from: t */
    public final String f12047t;

    /* JADX INFO: renamed from: u */
    public final String f12048u;

    /* JADX INFO: renamed from: v */
    public final String f12049v;

    /* JADX INFO: renamed from: w */
    public final List f12050w;

    /* JADX INFO: renamed from: x */
    public final long f12051x;

    /* JADX INFO: renamed from: y */
    public final String f12052y;

    /* JADX INFO: renamed from: z */
    public final zzemf f12053z;

    /* JADX WARN: Code duplicated, block: B:53:0x00ef  */
    public zzdcs(zzfkn zzfknVar, String str, zzemf zzemfVar, zzfkq zzfkqVar, String str2) {
        String str3;
        String string = null;
        this.f12047t = zzfknVar == null ? null : zzfknVar.f15919b0;
        this.f12048u = str2;
        this.f12049v = zzfkqVar == null ? null : zzfkqVar.f15973b;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && zzfknVar != null) {
            try {
                string = zzfknVar.f15958v.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.f12046s = string != null ? string : str;
        this.f12050w = zzemfVar.f14195a;
        this.f12053z = zzemfVar;
        this.f12044B = zzfknVar == null ? 0.0d : zzfknVar.f15967z0;
        this.f12045C = zzfknVar == null ? 2 : zzfknVar.f15898I0;
        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
        this.f12051x = System.currentTimeMillis() / 1000;
        zzbio zzbioVar = zzbix.f8809w;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        zzbiv zzbivVar = zzbaVar.f3098c;
        zzbiv zzbivVar2 = zzbaVar.f3098c;
        if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
            Bundle bundle = new Bundle();
            if (((Boolean) zzbivVar2.m5030a(zzbix.f8129H7)).booleanValue() && zzfkqVar != null) {
                bundle.putAll(zzfkqVar.f15982k);
            }
            if (((Boolean) zzbivVar2.m5030a(zzbix.f8146I7)).booleanValue() && zzfknVar != null) {
                bundle.putAll(zzfknVar.f15892F0);
            }
            this.f12043A = bundle;
        } else {
            if (!((Boolean) zzbivVar2.m5030a(zzbix.f8129H7)).booleanValue() || zzfkqVar == null) {
                this.f12043A = new Bundle();
            } else {
                this.f12043A = zzfkqVar.f15982k;
            }
            if (((Boolean) zzbivVar2.m5030a(zzbix.f8146I7)).booleanValue() && zzfknVar != null) {
                Bundle bundle2 = zzfknVar.f15892F0;
                Bundle bundle3 = this.f12043A;
                if (bundle3 != null) {
                    bundle3.putAll(bundle2);
                }
            }
        }
        if (((Boolean) zzbivVar2.m5030a(zzbix.f8030Ba)).booleanValue() && zzfkqVar != null) {
            str3 = zzfkqVar.f15980i;
            str3 = TextUtils.isEmpty(str3) ? "" : str3;
        }
        this.f12052y = str3;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    /* JADX INFO: renamed from: a */
    public final String mo2917a() {
        return this.f12046s;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    /* JADX INFO: renamed from: b */
    public final String mo2918b() {
        return this.f12047t;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    /* JADX INFO: renamed from: c */
    public final List mo2919c() {
        return this.f12050w;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final com.google.android.gms.ads.internal.client.zzv zzh() {
        zzemf zzemfVar = this.f12053z;
        if (zzemfVar != null) {
            return zzemfVar.f14200f;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final Bundle zzi() {
        return this.f12043A;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zzj() {
        return this.f12048u;
    }
}
