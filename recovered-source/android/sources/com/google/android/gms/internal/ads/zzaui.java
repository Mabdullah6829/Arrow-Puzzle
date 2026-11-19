package com.google.android.gms.internal.ads;

import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaui {
    /* JADX INFO: renamed from: a */
    public static zzasu m4422a(zzath zzathVar) {
        long j2;
        boolean z;
        long j3;
        long j4;
        long j5;
        long j6;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = zzathVar.f6881c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jM4423b = str != null ? m4423b(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i2 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z = false;
            j3 = 0;
            j4 = 0;
            while (i2 < strArrSplit.length) {
                String strTrim = strArrSplit[i2].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j4 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j3 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z = true;
                }
                i2++;
            }
            j2 = 0;
            i2 = 1;
        } else {
            j2 = 0;
            z = false;
            j3 = 0;
            j4 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jM4423b2 = str3 != null ? m4423b(str3) : j2;
        String str4 = (String) map.get("Last-Modified");
        long jM4423b3 = str4 != null ? m4423b(str4) : j2;
        String str5 = (String) map.get("ETag");
        if (i2 != 0) {
            long j7 = (j4 * 1000) + jCurrentTimeMillis;
            j6 = z ? j7 : (j3 * 1000) + j7;
            j5 = j7;
        } else {
            j5 = (jM4423b <= j2 || jM4423b2 < jM4423b) ? j2 : (jM4423b2 - jM4423b) + jCurrentTimeMillis;
            j6 = j5;
        }
        zzasu zzasuVar = new zzasu();
        zzasuVar.f6846a = zzathVar.f6880b;
        zzasuVar.f6847b = str5;
        zzasuVar.f6851f = j5;
        zzasuVar.f6850e = j6;
        zzasuVar.f6848c = jM4423b;
        zzasuVar.f6849d = jM4423b3;
        zzasuVar.f6852g = map;
        zzasuVar.f6853h = zzathVar.f6882d;
        return zzasuVar;
    }

    /* JADX INFO: renamed from: b */
    public static long m4423b(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                zzatx.m4402a("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            Log.e("Volley", zzatx.m4405d("Unable to parse dateStr: %s, falling back to 0", str), e);
            return 0L;
        }
    }
}
