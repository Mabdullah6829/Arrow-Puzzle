package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class zzauo extends zzatl {

    /* JADX INFO: renamed from: E */
    public final Object f6955E;

    /* JADX INFO: renamed from: F */
    public final zzatq f6956F;

    public zzauo(int i2, String str, zzatq zzatqVar, zzatp zzatpVar) {
        super(i2, str, zzatpVar);
        this.f6955E = new Object();
        this.f6956F = zzatqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatl
    /* JADX INFO: renamed from: j */
    public final zzatr mo3115j(zzath zzathVar) {
        String str;
        String str2;
        byte[] bArr = zzathVar.f6880b;
        try {
            Map map = zzathVar.f6881c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                for (int i2 = 1; i2 < strArrSplit.length; i2++) {
                    String[] strArrSplit2 = strArrSplit[i2].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(bArr);
        }
        return new zzatr(str, zzaui.m4422a(zzathVar));
    }

    @Override // com.google.android.gms.internal.ads.zzatl
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo3113k(String str) {
        zzatq zzatqVar;
        synchronized (this.f6955E) {
            zzatqVar = this.f6956F;
        }
        zzatqVar.zza(str);
    }
}
