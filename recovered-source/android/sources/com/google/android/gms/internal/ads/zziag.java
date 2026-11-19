package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class zziag implements zziaj {

    /* JADX INFO: renamed from: a */
    public final zzias f19569a;

    @Override // com.google.android.gms.internal.ads.zziaj
    public final Object zza(String str) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        zziak zziakVar = zziak.f19572b;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            Provider provider = Security.getProvider(strArr[i3]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        int size = arrayList.size();
        while (true) {
            zzias zziasVar = this.f19569a;
            if (i2 >= size) {
                return zziasVar.mo8038a(str, null);
            }
            Object obj = arrayList.get(i2);
            i2++;
            try {
                return zziasVar.mo8038a(str, (Provider) obj);
            } catch (Exception unused) {
            }
        }
    }
}
