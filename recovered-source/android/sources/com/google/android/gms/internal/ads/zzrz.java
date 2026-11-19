package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzrz {

    /* JADX INFO: renamed from: a */
    public final zzv f20729a;

    /* JADX INFO: renamed from: b */
    public final zzham f20730b;

    /* JADX INFO: renamed from: c */
    public final zzbf f20731c;

    /* JADX INFO: renamed from: d */
    public final zzxl f20732d;

    public /* synthetic */ zzrz(zzry zzryVar) {
        this.f20729a = zzryVar.f20725a;
        this.f20730b = zzryVar.f20726b;
        this.f20731c = zzryVar.f20727c;
        this.f20732d = zzryVar.f20728d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzrz)) {
            return false;
        }
        zzrz zzrzVar = (zzrz) obj;
        zzrzVar.getClass();
        return this.f20729a.equals(zzrzVar.f20729a) && Objects.equals(this.f20730b, zzrzVar.f20730b) && this.f20731c.equals(zzrzVar.f20731c) && Objects.equals(this.f20732d, zzrzVar.f20732d);
    }

    public final int hashCode() {
        int iHashCode = this.f20729a.hashCode() * 961;
        zzham zzhamVar = this.f20730b;
        int iHashCode2 = this.f20731c.hashCode() + ((iHashCode + (zzhamVar == null ? 0 : zzhamVar.hashCode())) * 31);
        zzxl zzxlVar = this.f20732d;
        return (iHashCode2 * 31) + (zzxlVar != null ? zzxlVar.hashCode() : 0);
    }
}
