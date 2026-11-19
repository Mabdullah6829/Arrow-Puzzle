package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzagt {

    /* JADX INFO: renamed from: c */
    public static final Pattern f5267c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a */
    public int f5268a = -1;

    /* JADX INFO: renamed from: b */
    public int f5269b = -1;

    /* JADX INFO: renamed from: a */
    public final void m4123a(zzap zzapVar) {
        zzgyo zzgyoVar = (zzgyo) zzapVar.m4287b(zzajm.class, new zzgts() { // from class: com.google.android.gms.internal.ads.zzags
            @Override // com.google.android.gms.internal.ads.zzgts
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ boolean mo3897b(Object obj) {
                return ((zzajm) obj).f5543c.equals("iTunSMPB");
            }
        });
        int i2 = zzgyoVar.f18357v;
        int i3 = 0;
        int i4 = 0;
        while (i4 < i2) {
            boolean zM4124b = m4124b(((zzajm) zzgyoVar.get(i4)).f5544d);
            i4++;
            if (zM4124b) {
                return;
            }
        }
        zzgyo zzgyoVar2 = (zzgyo) zzapVar.m4287b(zzaju.class, new zzgts() { // from class: com.google.android.gms.internal.ads.zzagr
            @Override // com.google.android.gms.internal.ads.zzgts
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ boolean mo3897b(Object obj) {
                zzaju zzajuVar = (zzaju) obj;
                return zzajuVar.f5556b.equals("com.apple.iTunes") && zzajuVar.f5557c.equals("iTunSMPB");
            }
        });
        int i5 = zzgyoVar2.f18357v;
        while (i3 < i5) {
            boolean zM4124b2 = m4124b(((zzaju) zzgyoVar2.get(i3)).f5558d);
            i3++;
            if (zM4124b2) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4124b(String str) {
        Matcher matcher = f5267c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = zzfm.f16091a;
            int i2 = Integer.parseInt(strGroup, 16);
            int i3 = Integer.parseInt(matcher.group(2), 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.f5268a = i2;
            this.f5269b = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
