package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class zziai implements zziaj {

    /* JADX INFO: renamed from: a */
    public final zzias f19571a;

    @Override // com.google.android.gms.internal.ads.zziaj
    public final Object zza(String str) throws GeneralSecurityException {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        zziak zziakVar = zziak.f19572b;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            Provider provider = Security.getProvider(strArr[i3]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        int size = arrayList.size();
        Exception exc = null;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            try {
                return this.f19571a.mo8038a(str, (Provider) obj);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
