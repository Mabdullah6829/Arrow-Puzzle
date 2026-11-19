package com.google.android.gms.internal.consent_sdk;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.internal.ads.AbstractC5152f;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzqh extends zzpb implements RandomAccess, zzqr {

    /* JADX INFO: renamed from: v */
    public static final float[] f21737v;

    /* JADX INFO: renamed from: t */
    public float[] f21738t;

    /* JADX INFO: renamed from: u */
    public int f21739u;

    static {
        float[] fArr = new float[0];
        f21737v = fArr;
        new zzqh(fArr, 0, false);
    }

    public zzqh() {
        this(f21737v, 0, true);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        float fFloatValue = ((Float) obj).floatValue();
        m9145a();
        if (i2 < 0 || i2 > (i3 = this.f21739u)) {
            throw new IndexOutOfBoundsException(AbstractC1456a.m2443j(i2, this.f21739u, "Index:", ", Size:"));
        }
        int i4 = i2 + 1;
        float[] fArr = this.f21738t;
        int length = fArr.length;
        if (i3 < length) {
            System.arraycopy(fArr, i2, fArr, i4, i3 - i2);
        } else {
            float[] fArr2 = new float[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f21738t, 0, fArr2, 0, i2);
            System.arraycopy(this.f21738t, i2, fArr2, i4, this.f21739u - i2);
            this.f21738t = fArr2;
        }
        this.f21738t[i2] = fFloatValue;
        this.f21739u++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m9145a();
        Charset charset = zzqs.f21747a;
        collection.getClass();
        if (!(collection instanceof zzqh)) {
            return super.addAll(collection);
        }
        zzqh zzqhVar = (zzqh) collection;
        int i2 = zzqhVar.f21739u;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f21739u;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        float[] fArr = this.f21738t;
        if (i4 > fArr.length) {
            this.f21738t = Arrays.copyOf(fArr, i4);
        }
        System.arraycopy(zzqhVar.f21738t, 0, this.f21738t, this.f21739u, zzqhVar.f21739u);
        this.f21739u = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m9214b(int i2) {
        if (i2 < 0 || i2 >= this.f21739u) {
            throw new IndexOutOfBoundsException(AbstractC1456a.m2443j(i2, this.f21739u, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzqh)) {
            return super.equals(obj);
        }
        zzqh zzqhVar = (zzqh) obj;
        if (this.f21739u != zzqhVar.f21739u) {
            return false;
        }
        float[] fArr = zzqhVar.f21738t;
        for (int i2 = 0; i2 < this.f21739u; i2++) {
            if (Float.floatToIntBits(this.f21738t[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        m9214b(i2);
        return Float.valueOf(this.f21738t[i2]);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i2 = 0; i2 < this.f21739u; i2++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f21738t[i2]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i2 = this.f21739u;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f21738t[i3] == fFloatValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        m9145a();
        m9214b(i2);
        float[] fArr = this.f21738t;
        float f2 = fArr[i2];
        int i3 = this.f21739u;
        if (i2 < i3 - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (i3 - i2) - 1);
        }
        this.f21739u--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        m9145a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f21738t;
        System.arraycopy(fArr, i3, fArr, i2, this.f21739u - i3);
        this.f21739u -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m9145a();
        m9214b(i2);
        float[] fArr = this.f21738t;
        float f2 = fArr[i2];
        fArr[i2] = fFloatValue;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21739u;
    }

    public zzqh(float[] fArr, int i2, boolean z) {
        super(z);
        this.f21738t = fArr;
        this.f21739u = i2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m9145a();
        int i2 = this.f21739u;
        int length = this.f21738t.length;
        if (i2 == length) {
            float[] fArr = new float[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f21738t, 0, fArr, 0, this.f21739u);
            this.f21738t = fArr;
        }
        float[] fArr2 = this.f21738t;
        int i3 = this.f21739u;
        this.f21739u = i3 + 1;
        fArr2[i3] = fFloatValue;
        return true;
    }
}
