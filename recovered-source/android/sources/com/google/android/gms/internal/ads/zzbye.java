package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbye extends zzbyn {

    /* JADX INFO: renamed from: c */
    public final Map f9503c;

    /* JADX INFO: renamed from: d */
    public final Activity f9504d;

    /* JADX INFO: renamed from: e */
    public final String f9505e;

    /* JADX INFO: renamed from: f */
    public final long f9506f;

    /* JADX INFO: renamed from: g */
    public final long f9507g;

    /* JADX INFO: renamed from: h */
    public final String f9508h;

    /* JADX INFO: renamed from: i */
    public final String f9509i;

    public zzbye(zzclb zzclbVar, Map map) {
        long j2;
        super(zzclbVar, "createCalendarEvent");
        this.f9503c = map;
        this.f9504d = zzclbVar.zzj();
        this.f9505e = m5258f("description");
        this.f9508h = m5258f("summary");
        String str = (String) map.get("start_ticks");
        long j3 = -1;
        if (str == null) {
            j2 = -1;
        } else {
            try {
                j2 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                j2 = -1;
            }
        }
        this.f9506f = j2;
        String str2 = (String) this.f9503c.get("end_ticks");
        if (str2 != null) {
            try {
                j3 = Long.parseLong(str2);
            } catch (NumberFormatException unused2) {
            }
        }
        this.f9507g = j3;
        this.f9509i = m5258f(FirebaseAnalytics.Param.LOCATION);
    }

    /* JADX INFO: renamed from: f */
    public final String m5258f(String str) {
        Map map = this.f9503c;
        return TextUtils.isEmpty((CharSequence) map.get(str)) ? "" : (String) map.get(str);
    }
}
