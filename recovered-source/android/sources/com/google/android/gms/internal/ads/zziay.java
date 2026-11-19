package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
final class zziay extends ThreadLocal {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zziaz f19585a;

    public zziay(zziaz zziazVar) {
        this.f19585a = zziazVar;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        try {
            zziak zziakVar = zziak.f19573c;
            zziaz zziazVar = this.f19585a;
            Mac mac = (Mac) zziakVar.f19578a.zza(zziazVar.f19587b);
            mac.init(zziazVar.f19588c);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
