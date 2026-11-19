package com.google.android.gms.internal.ads;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgfg implements zzgfl {

    /* JADX INFO: renamed from: a */
    public final byte[] f17132a;

    public zzgfg(byte[] bArr) {
        this.f17132a = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgfl
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo6970a(Object obj, FileOutputStream fileOutputStream) throws IOException {
        fileOutputStream.write((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgfl
    /* JADX INFO: renamed from: b */
    public final Object mo6971b(FileInputStream fileInputStream) {
        try {
            return zzgzt.m7284a(fileInputStream);
        } catch (IOException e) {
            throw new zzgfh("Cannot read bytes.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfl
    public final /* synthetic */ Object zzc() {
        return this.f17132a;
    }
}
