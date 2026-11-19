package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
final class zzasm implements zzasl {

    /* JADX INFO: renamed from: a */
    public final FileChannel f6836a;

    /* JADX INFO: renamed from: b */
    public final long f6837b;

    /* JADX INFO: renamed from: c */
    public final long f6838c;

    public zzasm(FileChannel fileChannel, long j2, long j3) {
        this.f6836a = fileChannel;
        this.f6837b = j2;
        this.f6838c = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzasl
    /* JADX INFO: renamed from: a */
    public final void mo4366a(MessageDigest[] messageDigestArr, long j2, int i2) throws IOException {
        MappedByteBuffer map = this.f6836a.map(FileChannel.MapMode.READ_ONLY, this.f6837b + j2, i2);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasl
    public final long zza() {
        return this.f6838c;
    }
}
