package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhdt implements zzhem {

    /* JADX INFO: renamed from: a */
    public final ByteArrayInputStream f18543a;

    public zzhdt(ByteArrayInputStream byteArrayInputStream) {
        this.f18543a = byteArrayInputStream;
    }

    /* JADX INFO: renamed from: a */
    public final zzhtk m7401a() throws IOException {
        ByteArrayInputStream byteArrayInputStream = this.f18543a;
        try {
            zzidz zzidzVar = zzidz.f19758b;
            int i2 = zzicy.f19697a;
            return zzhtk.m7820I(byteArrayInputStream, zzidz.f19759c);
        } finally {
            byteArrayInputStream.close();
        }
    }
}
