package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
final class zzbam implements zzfzg {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzfxl f7439a;

    public zzbam(zzbao zzbaoVar, zzfxl zzfxlVar) {
        this.f7439a = zzfxlVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4684a(File file) {
        try {
            return this.f7439a.m6759a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
