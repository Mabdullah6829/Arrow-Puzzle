package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzfsk implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzfqg f16412a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzfqq f16413b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzdfo f16414c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzfsm f16415d;

    public zzfsk(zzfsm zzfsmVar, zzfqg zzfqgVar, zzfqq zzfqqVar, zzdfo zzdfoVar) {
        this.f16412a = zzfqgVar;
        this.f16413b = zzfqqVar;
        this.f16414c = zzdfoVar;
        this.f16415d = zzfsmVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final void mo3316a(Object obj) {
        byte b;
        int i2;
        int i3;
        com.google.android.gms.ads.internal.util.client.zzt zztVar = (com.google.android.gms.ads.internal.util.client.zzt) obj;
        zzfsm zzfsmVar = this.f16415d;
        zzfqg zzfqgVar = this.f16412a;
        if (zzfqgVar != null) {
            zzfqgVar.mo6563L(zztVar == com.google.android.gms.ads.internal.util.client.zzt.f3438s);
            zzfqq zzfqqVar = this.f16413b;
            if (zzfqqVar == null) {
                zzfsmVar.f16423f.m6588b(zzfqgVar.mo6564e());
            } else {
                zzfqqVar.m6578a(zzfqgVar);
                zzfqqVar.m6585h();
            }
        }
        zzdfo zzdfoVar = this.f16414c;
        if (zzdfoVar != null) {
            String str = zzfsmVar.f16421d.f3445c;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                Parcelable.Creator<com.google.android.gms.ads.internal.client.zzt> creator = com.google.android.gms.ads.internal.client.zzt.CREATOR;
                String strOptString = jSONObject.optString("type");
                String strOptString2 = jSONObject.optString("precision");
                String strOptString3 = jSONObject.optString(FirebaseAnalytics.Param.CURRENCY);
                long jOptLong = jSONObject.optLong("value", 0L);
                int iHashCode = strOptString.hashCode();
                byte b2 = -1;
                if (iHashCode != 66934) {
                    if (iHashCode != 66944) {
                        if (iHashCode == 1349395245 && strOptString.equals("ONE_PIXEL")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                    } else if (strOptString.equals("CPM")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                } else if (strOptString.equals("CPC")) {
                    b = 1;
                } else {
                    b = -1;
                }
                if (b == 0) {
                    i2 = 1;
                } else if (b == 1) {
                    i2 = 2;
                } else if (b != 2) {
                    i2 = 0;
                } else {
                    jOptLong /= 1000;
                    i2 = 3;
                }
                int iHashCode2 = strOptString2.hashCode();
                if (iHashCode2 != -2131980260) {
                    if (iHashCode2 != 399232571) {
                        if (iHashCode2 == 1271254246 && strOptString2.equals("PUBLISHER_PROVIDED")) {
                            b2 = 1;
                        }
                    } else if (strOptString2.equals("PRECISE")) {
                        b2 = 2;
                    }
                } else if (strOptString2.equals("ESTIMATED")) {
                    b2 = 0;
                }
                if (b2 == 0) {
                    i3 = 1;
                } else if (b2 != 1) {
                    i3 = b2 != 2 ? 0 : 3;
                } else {
                    i3 = 2;
                }
                final com.google.android.gms.ads.internal.client.zzt zztVar2 = new com.google.android.gms.ads.internal.client.zzt(i2, i3, jOptLong, strOptString3);
                if ((com.google.android.gms.ads.nonagon.signalgeneration.zzv.m3349e(zzdfoVar.f12130v.f16005a.f15998a) != 1) && zzdfoVar.f12128t.f15884B0 && zzdfoVar.f12129u.compareAndSet(false, true)) {
                    zzdfoVar.m5923J0(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzdfm
                        @Override // com.google.android.gms.internal.ads.zzdiw
                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ void mo5900b(Object obj2) {
                            ((zzdfq) obj2).mo5912e(zztVar2);
                        }
                    });
                }
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("UrlPinger.pingUrl", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        zzfqg zzfqgVar = this.f16412a;
        if (zzfqgVar == null) {
            return;
        }
        zzfqgVar.mo6563L(false);
        zzfqq zzfqqVar = this.f16413b;
        if (zzfqqVar == null) {
            this.f16415d.f16423f.m6588b(zzfqgVar.mo6564e());
        } else {
            zzfqqVar.m6578a(zzfqgVar);
            zzfqqVar.m6585h();
        }
    }
}
