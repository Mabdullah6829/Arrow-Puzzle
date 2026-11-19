package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public interface zzfqg {
    /* JADX INFO: renamed from: k */
    static zzfqg m6561k(Context context, int i2, int i3, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        boolean zMatches;
        zzfqg zzfqgVarM6562l = m6562l(context, i2);
        if (zzfqgVarM6562l instanceof zzfqi) {
            zzfqgVarM6562l.zza();
            zzfqgVarM6562l.mo6570n(i3);
            zzfqgVarM6562l.mo6569m(com.google.android.gms.ads.nonagon.signalgeneration.zzv.m3347c(zzmVar.f3210E));
            String str = zzmVar.f3213H;
            if (TextUtils.isEmpty(str)) {
                zMatches = false;
            } else {
                zMatches = Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8398X9), str);
            }
            if (zMatches) {
                zzfqgVarM6562l.mo6572y(str);
            }
        }
        return zzfqgVarM6562l;
    }

    /* JADX INFO: renamed from: l */
    static zzfqg m6562l(Context context, int i2) {
        boolean zBooleanValue;
        if (zzfqt.m6587a()) {
            int i3 = i2 - 2;
            if (i3 == 20 || i3 == 21) {
                zBooleanValue = ((Boolean) zzbkq.f9011e.m5057c()).booleanValue();
            } else if (i3 != 110) {
                switch (i3) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((Boolean) zzbkq.f9009c.m5057c()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((Boolean) zzbkq.f9010d.m5057c()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((Boolean) zzbkq.f9008b.m5057c()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8532fa)).booleanValue();
            }
            if (zBooleanValue) {
                return new zzfqi(context, i2);
            }
        }
        return new zzfrj();
    }

    /* JADX INFO: renamed from: L */
    zzfqg mo6563L(boolean z);

    /* JADX INFO: renamed from: e */
    zzfqj mo6564e();

    /* JADX INFO: renamed from: g */
    zzfqg mo6565g(String str);

    /* JADX INFO: renamed from: h */
    zzfqg mo6566h(Throwable th);

    /* JADX INFO: renamed from: i */
    zzfqg mo6567i(zzfkx zzfkxVar);

    /* JADX INFO: renamed from: j */
    zzfqg mo6568j(com.google.android.gms.ads.internal.client.zze zzeVar);

    /* JADX INFO: renamed from: m */
    zzfqg mo6569m(zzfqv zzfqvVar);

    /* JADX INFO: renamed from: n */
    zzfqg mo6570n(int i2);

    /* JADX INFO: renamed from: p0 */
    zzfqg mo6571p0(String str);

    /* JADX INFO: renamed from: y */
    zzfqg mo6572y(String str);

    zzfqg zza();

    boolean zzb();

    zzfqg zzc();

    boolean zzl();
}
