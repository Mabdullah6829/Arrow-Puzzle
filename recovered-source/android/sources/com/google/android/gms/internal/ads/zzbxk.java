package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.SystemClock;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbxk extends zzbem implements zzbxl {
    public zzbxk() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            String string = parcel.readString();
            zzben.m4818f(parcel);
            zzesh zzeshVar = (zzesh) this;
            synchronized (zzeshVar) {
                if (!zzeshVar.f14778w) {
                    if (string == null) {
                        synchronized (zzeshVar) {
                            zzeshVar.m6333k4(2, "Adapter returned null signals");
                        }
                    } else {
                        try {
                            JSONObject jSONObject = zzeshVar.f14776u;
                            jSONObject.put("signals", string);
                            zzbio zzbioVar = zzbix.f8575i2;
                            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                            if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                                com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                                jSONObject.put("latency", SystemClock.elapsedRealtime() - zzeshVar.f14777v);
                            }
                            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8558h2)).booleanValue()) {
                                jSONObject.put("signal_error_code", 0);
                            }
                        } catch (JSONException unused) {
                        }
                        zzeshVar.f14775t.m5397a(zzeshVar.f14776u);
                        zzeshVar.f14778w = true;
                    }
                }
            }
        } else if (i2 == 2) {
            String string2 = parcel.readString();
            zzben.m4818f(parcel);
            zzesh zzeshVar2 = (zzesh) this;
            synchronized (zzeshVar2) {
                zzeshVar2.m6333k4(2, string2);
            }
        } else {
            if (i2 != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzben.m4818f(parcel);
            zzesh zzeshVar3 = (zzesh) this;
            synchronized (zzeshVar3) {
                zzeshVar3.m6333k4(2, zzeVar.f3107t);
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
