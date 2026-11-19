package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.util.AbstractList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaed {

    /* JADX INFO: renamed from: a */
    public static final byte[] f22038a;

    public class zza<T> extends AbstractList<T> {

        /* JADX INFO: renamed from: s */
        public final zzaeb f22039s;

        /* JADX INFO: renamed from: t */
        public final zzaec f22040t;

        public zza(zzaeb zzaebVar, zzaec zzaecVar) {
            this.f22039s = zzaebVar;
            this.f22040t = zzaecVar;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i2) {
            return this.f22040t.zza(this.f22039s.mo9578o(i2));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f22039s.size();
        }
    }

    static {
        byte[] bArr = new byte[0];
        f22038a = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new zzact(bArr).mo9399a(0);
        } catch (zzaeh e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m9595a(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }
}
