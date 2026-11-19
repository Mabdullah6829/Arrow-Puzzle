package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.collection.ArrayMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcmh extends com.google.android.gms.ads.internal.client.zzdz {

    /* JADX INFO: renamed from: A */
    public float f10558A;

    /* JADX INFO: renamed from: B */
    public float f10559B;

    /* JADX INFO: renamed from: C */
    public float f10560C;

    /* JADX INFO: renamed from: D */
    public boolean f10561D;

    /* JADX INFO: renamed from: E */
    public boolean f10562E;

    /* JADX INFO: renamed from: F */
    public zzbnq f10563F;

    /* JADX INFO: renamed from: s */
    public final zzchu f10564s;

    /* JADX INFO: renamed from: u */
    public final boolean f10566u;

    /* JADX INFO: renamed from: v */
    public final boolean f10567v;

    /* JADX INFO: renamed from: w */
    public int f10568w;

    /* JADX INFO: renamed from: x */
    public com.google.android.gms.ads.internal.client.zzed f10569x;

    /* JADX INFO: renamed from: y */
    public boolean f10570y;

    /* JADX INFO: renamed from: t */
    public final Object f10565t = new Object();

    /* JADX INFO: renamed from: z */
    public boolean f10571z = true;

    public zzcmh(zzchu zzchuVar, float f2, boolean z, boolean z2) {
        this.f10564s = zzchuVar;
        this.f10558A = f2;
        this.f10566u = z;
        this.f10567v = z2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    /* JADX INFO: renamed from: F */
    public final void mo2927F() {
        m5671n4("stop", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    /* JADX INFO: renamed from: K2 */
    public final void mo2921K2(com.google.android.gms.ads.internal.client.zzed zzedVar) {
        synchronized (this.f10565t) {
            this.f10569x = zzedVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    /* JADX INFO: renamed from: a */
    public final void mo2928a() {
        m5671n4("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    /* JADX INFO: renamed from: b */
    public final void mo2929b() {
        m5671n4("pause", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    /* JADX INFO: renamed from: e */
    public final float mo2922e() {
        float f2;
        synchronized (this.f10565t) {
            f2 = this.f10560C;
        }
        return f2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    /* JADX INFO: renamed from: g */
    public final boolean mo2930g() {
        boolean z;
        synchronized (this.f10565t) {
            try {
                z = false;
                if (this.f10566u && this.f10561D) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    /* JADX INFO: renamed from: i */
    public final boolean mo2931i() {
        boolean z;
        Object obj = this.f10565t;
        boolean zMo2930g = mo2930g();
        synchronized (obj) {
            z = false;
            if (!zMo2930g) {
                try {
                    if (this.f10562E && this.f10567v) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    /* JADX INFO: renamed from: j */
    public final com.google.android.gms.ads.internal.client.zzed mo2923j() {
        com.google.android.gms.ads.internal.client.zzed zzedVar;
        synchronized (this.f10565t) {
            zzedVar = this.f10569x;
        }
        return zzedVar;
    }

    /* JADX INFO: renamed from: l4 */
    public final void m5669l4(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
        Object obj = this.f10565t;
        boolean z = zzfwVar.f3199t;
        boolean z2 = zzfwVar.f3200u;
        synchronized (obj) {
            this.f10561D = z;
            this.f10562E = z2;
        }
        boolean z3 = zzfwVar.f3198s;
        String str = true != z ? "0" : "1";
        String str2 = true != z2 ? "0" : "1";
        String str3 = true != z3 ? "0" : "1";
        ArrayMap arrayMap = new ArrayMap(3);
        arrayMap.put("muteStart", str3);
        arrayMap.put("customControlsRequested", str);
        arrayMap.put("clickToExpandRequested", str2);
        m5671n4("initialState", Collections.unmodifiableMap(arrayMap));
    }

    /* JADX INFO: renamed from: m4 */
    public final void m5670m4(float f2, float f3, float f4, int i2, boolean z) {
        boolean z2;
        boolean z3;
        int i3;
        synchronized (this.f10565t) {
            try {
                z2 = true;
                if (f3 == this.f10558A && f4 == this.f10560C) {
                    z2 = false;
                }
                this.f10558A = f3;
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8637le)).booleanValue()) {
                    this.f10559B = f2;
                }
                z3 = this.f10571z;
                this.f10571z = z;
                i3 = this.f10568w;
                this.f10568w = i2;
                float f5 = this.f10560C;
                this.f10560C = f4;
                if (Math.abs(f4 - f5) > 1.0E-4f) {
                    this.f10564s.mo5577H().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            try {
                zzbnq zzbnqVar = this.f10563F;
                if (zzbnqVar != null) {
                    zzbnqVar.m4811u0(2, zzbnqVar.m4810u());
                }
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
            }
        }
        ((zzcfx) zzcfy.f9951f).execute(new zzcmf(this, i3, i2, z3, z));
    }

    /* JADX INFO: renamed from: n4 */
    public final void m5671n4(String str, Map map) {
        final HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        ((zzcfx) zzcfy.f9951f).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f10556s.f10564s.mo5129b("pubVideoCmd", map2);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    /* JADX INFO: renamed from: o0 */
    public final void mo2932o0(boolean z) {
        m5671n4(true != z ? "unmute" : "mute", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzh() {
        boolean z;
        synchronized (this.f10565t) {
            z = this.f10571z;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final int zzi() {
        int i2;
        synchronized (this.f10565t) {
            i2 = this.f10568w;
        }
        return i2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzj() {
        float f2;
        synchronized (this.f10565t) {
            f2 = this.f10558A;
        }
        return f2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzk() {
        float f2;
        synchronized (this.f10565t) {
            f2 = this.f10559B;
        }
        return f2;
    }
}
