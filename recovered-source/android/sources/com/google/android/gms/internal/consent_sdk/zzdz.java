package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzdz extends zzdw {

    /* JADX INFO: renamed from: A */
    public static final zzdz f21644A;

    /* JADX INFO: renamed from: z */
    public static final Object[] f21645z;

    /* JADX INFO: renamed from: u */
    public final transient Object[] f21646u;

    /* JADX INFO: renamed from: v */
    public final transient int f21647v;

    /* JADX INFO: renamed from: w */
    public final transient Object[] f21648w;

    /* JADX INFO: renamed from: x */
    public final transient int f21649x;

    /* JADX INFO: renamed from: y */
    public final transient int f21650y;

    static {
        Object[] objArr = new Object[0];
        f21645z = objArr;
        f21644A = new zzdz(0, 0, 0, objArr, objArr);
    }

    public zzdz(int i2, int i3, int i4, Object[] objArr, Object[] objArr2) {
        this.f21646u = objArr;
        this.f21647v = i2;
        this.f21648w = objArr2;
        this.f21649x = i3;
        this.f21650y = i4;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    /* JADX INFO: renamed from: a */
    public final void mo9132a(Object[] objArr) {
        System.arraycopy(this.f21646u, 0, objArr, 0, this.f21650y);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    /* JADX INFO: renamed from: b */
    public final int mo9133b() {
        return this.f21650y;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.f21648w;
        if (objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
        while (true) {
            int i2 = iRotateLeft & this.f21649x;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i2 + 1;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    /* JADX INFO: renamed from: d */
    public final int mo9134d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    /* JADX INFO: renamed from: g */
    public final zzeb iterator() {
        zzdv zzdyVar = this.f21638t;
        if (zzdyVar == null) {
            zzec zzecVar = zzdv.f21637t;
            int i2 = this.f21650y;
            zzdyVar = i2 == 0 ? zzdy.f21641w : new zzdy(i2, this.f21646u);
            this.f21638t = zzdyVar;
        }
        return zzdyVar.listIterator(0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    /* JADX INFO: renamed from: h */
    public final Object[] mo9136h() {
        return this.f21646u;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdw, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f21647v;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdw, com.google.android.gms.internal.consent_sdk.zzds, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzdv zzdyVar = this.f21638t;
        if (zzdyVar == null) {
            zzec zzecVar = zzdv.f21637t;
            int i2 = this.f21650y;
            zzdyVar = i2 == 0 ? zzdy.f21641w : new zzdy(i2, this.f21646u);
            this.f21638t = zzdyVar;
        }
        return zzdyVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f21650y;
    }
}
