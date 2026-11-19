package com.google.android.gms.internal.ads;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgfk implements zzgfl {

    /* JADX INFO: renamed from: a */
    public final zzifz f17136a;

    public zzgfk(zzifz zzifzVar) {
        this.f17136a = zzifzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfl
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo6970a(Object obj, FileOutputStream fileOutputStream) {
        ((zzifz) obj).mo8097c(fileOutputStream);
    }

    @Override // com.google.android.gms.internal.ads.zzgfl
    /* JADX INFO: renamed from: b */
    public final Object mo6971b(FileInputStream fileInputStream) {
        try {
            zzigh zzighVarMo8341e = this.f17136a.mo8341e();
            zzidz zzidzVar = zzidz.f19758b;
            int i2 = zzicy.f19697a;
            return zzighVarMo8341e.mo8106a(fileInputStream, zzidz.f19759c);
        } catch (zzifh e) {
            throw new zzgfh("Cannot read proto.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfl
    public final /* synthetic */ Object zzc() {
        return this.f17136a;
    }
}
