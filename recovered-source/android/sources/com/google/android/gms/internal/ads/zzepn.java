package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzepn {

    /* JADX INFO: renamed from: a */
    public final zzflz f14543a;

    /* JADX INFO: renamed from: b */
    public final zzdxh f14544b;

    /* JADX INFO: renamed from: c */
    public final zzdzt f14545c;

    public zzepn(zzflz zzflzVar, zzdxh zzdxhVar, zzdzt zzdztVar) {
        this.f14543a = zzflzVar;
        this.f14544b = zzdxhVar;
        this.f14545c = zzdztVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0055  */
    /* JADX INFO: renamed from: a */
    public final void m6311a(zzfkq zzfkqVar, zzfkn zzfknVar, int i2, zzeme zzemeVar, long j2) {
        String strGroup;
        zzdzs zzdzsVarM6111a = this.f14545c.m6111a();
        zzdzsVarM6111a.m6107b("gqi", zzfkqVar.f15973b);
        zzdzsVarM6111a.m6106a(zzfknVar);
        zzdzsVarM6111a.m6107b("action", "adapter_status");
        zzdzsVarM6111a.m6107b("adapter_l", String.valueOf(j2));
        zzdzsVarM6111a.m6107b("sc", Integer.toString(i2));
        zzdxg zzdxgVar = null;
        if (zzemeVar != null) {
            zzdzsVarM6111a.m6107b("arec", Integer.toString(zzemeVar.f14194t.f3106s));
            String message = zzemeVar.getMessage();
            Pattern pattern = this.f14543a.f16090a;
            if (pattern == null || message == null) {
                strGroup = null;
            } else {
                Matcher matcher = pattern.matcher(message);
                if (matcher.find()) {
                    strGroup = matcher.group();
                } else {
                    strGroup = null;
                }
            }
            if (strGroup != null) {
                zzdzsVarM6111a.m6107b("areec", strGroup);
            }
        }
        Iterator it = zzfknVar.f15954t.iterator();
        while (it.hasNext()) {
            zzdxg zzdxgVarM6081b = this.f14544b.m6081b((String) it.next());
            if (zzdxgVarM6081b != null) {
                zzdxgVar = zzdxgVarM6081b;
                break;
            }
        }
        if (zzdxgVar != null) {
            zzdzsVarM6111a.m6107b("ancn", zzdxgVar.f13243a);
            zzbxx zzbxxVar = zzdxgVar.f13244b;
            if (zzbxxVar != null) {
                zzdzsVarM6111a.m6107b("adapter_v", zzbxxVar.toString());
            }
            zzbxx zzbxxVar2 = zzdxgVar.f13245c;
            if (zzbxxVar2 != null) {
                zzdzsVarM6111a.m6107b("adapter_sv", zzbxxVar2.toString());
            }
        }
        zzdzsVarM6111a.m6108c();
    }
}
