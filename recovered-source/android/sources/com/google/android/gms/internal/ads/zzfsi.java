package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfsi {

    /* JADX INFO: renamed from: a */
    public final zzepl f16394a;

    /* JADX INFO: renamed from: b */
    public final String f16395b;

    /* JADX INFO: renamed from: c */
    public final String f16396c;

    /* JADX INFO: renamed from: d */
    public final String f16397d;

    /* JADX INFO: renamed from: e */
    public final Context f16398e;

    /* JADX INFO: renamed from: f */
    public final zzfkz f16399f;

    /* JADX INFO: renamed from: g */
    public final zzfla f16400g;

    /* JADX INFO: renamed from: h */
    public final Clock f16401h;

    /* JADX INFO: renamed from: i */
    public final zzbaw f16402i;

    public zzfsi(zzepl zzeplVar, VersionInfoParcel versionInfoParcel, String str, String str2, Context context, zzfkz zzfkzVar, zzfla zzflaVar, Clock clock, zzbaw zzbawVar) {
        this.f16394a = zzeplVar;
        this.f16395b = versionInfoParcel.f3396s;
        this.f16396c = str;
        this.f16397d = str2;
        this.f16398e = context;
        this.f16399f = zzfkzVar;
        this.f16400g = zzflaVar;
        this.f16401h = clock;
        this.f16402i = zzbawVar;
    }

    /* JADX INFO: renamed from: c */
    public static String m6639c(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m6640a(zzfky zzfkyVar, zzfkn zzfknVar, List list) {
        return m6641b(zzfkyVar, zzfknVar, false, "", "", list, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x013d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0165  */
    /* JADX WARN: Code duplicated, block: B:61:0x0176  */
    /* JADX WARN: Code duplicated, block: B:63:0x0180  */
    /* JADX WARN: Code duplicated, block: B:64:0x0189  */
    /* JADX WARN: Code duplicated, block: B:66:0x018d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0196  */
    /* JADX INFO: renamed from: b */
    public final ArrayList m6641b(zzfky zzfkyVar, zzfkn zzfknVar, boolean z, String str, String str2, List list, zzdbv zzdbvVar, zzcfl zzcflVar) {
        String str3;
        long j2;
        Uri.Builder builderBuildUpon;
        String str4 = "1";
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strM6639c = m6639c(m6639c(m6639c((String) it.next(), "@gw_adlocid@", zzfkyVar.f16005a.f15998a.f16043g), "@gw_adnetrefresh@", true != z ? "0" : str4), "@gw_sdkver@", this.f16395b);
            if (zzfknVar != null) {
                String strM6639c2 = m6639c(m6639c(m6639c(strM6639c, "@gw_qdata@", zzfknVar.f15964y), "@gw_adnetid@", zzfknVar.f15962x), "@gw_allocid@", zzfknVar.f15960w);
                Context context = this.f16398e;
                strM6639c = zzcei.m5373a(strM6639c2, context, zzfknVar.f15912W, zzfknVar.f15961w0);
                zzbio zzbioVar = zzbix.f8419Ye;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                str3 = str4;
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() && zzfknVar.f15924e == 4) {
                    com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                    strM6639c = m6639c(strM6639c, "@gw_aps@", true != com.google.android.gms.ads.internal.util.zzs.m3208g(context) ? "0" : str3);
                }
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8621kf)).booleanValue() && zzcflVar != 0) {
                    int i2 = zzcflVar.f9906a;
                    String strM6639c3 = m6639c(strM6639c, "@gw_is@", i2 >= 0 ? Integer.toString(i2) : "");
                    int i3 = zzcflVar.f9907b;
                    String strM6639c4 = m6639c(strM6639c3, "@gw_fis@", i3 >= 0 ? Integer.toString(i3) : "");
                    int i4 = zzcflVar.f9908c;
                    strM6639c = m6639c(strM6639c4, "@gw_sfis@", i4 >= 0 ? Integer.toString(i4) : "");
                }
            } else {
                str3 = str4;
            }
            zzepl zzeplVar = this.f16394a;
            String strM6639c5 = m6639c(strM6639c, "@gw_adnetstatus@", zzeplVar.m6310d());
            synchronized (zzeplVar) {
                j2 = zzeplVar.f14541h;
            }
            String strM6639c6 = m6639c(m6639c(m6639c(strM6639c5, "@gw_ttr@", Long.toString(j2, 10)), "@gw_seqnum@", this.f16396c), "@gw_sessid@", this.f16397d);
            zzbio zzbioVar2 = zzbix.f8571hf;
            com.google.android.gms.ads.internal.client.zzba zzbaVar2 = com.google.android.gms.ads.internal.client.zzba.f3095e;
            if (((Boolean) zzbaVar2.f3098c.m5030a(zzbioVar2)).booleanValue()) {
                if (zzdbvVar != 0) {
                    AtomicLong atomicLong = zzdbvVar.f11972a;
                    if (atomicLong.get() > 0) {
                        strM6639c6 = m6639c(strM6639c6, "@gw_placement_id@", Long.toString(atomicLong.get(), 10));
                    } else {
                        strM6639c6 = m6639c(strM6639c6, "@gw_placement_id@", "");
                    }
                } else {
                    strM6639c6 = m6639c(strM6639c6, "@gw_placement_id@", "");
                }
            }
            boolean z2 = false;
            if (((Boolean) zzbaVar2.f3098c.m5030a(zzbix.f8746s4)).booleanValue() && !TextUtils.isEmpty(str)) {
                z2 = true;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean z3 = !zIsEmpty;
            if (z2) {
                if (this.f16402i.m4704a(Uri.parse(strM6639c6))) {
                    builderBuildUpon = Uri.parse(strM6639c6).buildUpon();
                    if (z2) {
                        builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                    }
                    if (z3) {
                        builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                    }
                    strM6639c6 = builderBuildUpon.build().toString();
                }
            } else if (!zIsEmpty) {
                z3 = true;
                if (this.f16402i.m4704a(Uri.parse(strM6639c6))) {
                    builderBuildUpon = Uri.parse(strM6639c6).buildUpon();
                    if (z2) {
                        builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                    }
                    if (z3) {
                        builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                    }
                    strM6639c6 = builderBuildUpon.build().toString();
                }
            }
            arrayList.add(strM6639c6);
            str4 = str3;
        }
        return arrayList;
    }
}
