package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC6452k;
import p003C.AbstractC0116g;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqn {

    /* JADX INFO: renamed from: a */
    public final boolean f22776a;

    /* JADX INFO: renamed from: b */
    public final List f22777b;

    /* JADX INFO: renamed from: c */
    public final zzacr f22778c;

    /* JADX INFO: renamed from: d */
    public final String f22779d;

    /* JADX INFO: renamed from: e */
    public final String f22780e;

    /* JADX INFO: renamed from: f */
    public final List f22781f;

    /* JADX INFO: renamed from: g */
    public final List f22782g;

    /* JADX INFO: renamed from: h */
    public final boolean f22783h;

    /* JADX INFO: renamed from: i */
    public final boolean f22784i;

    /* JADX INFO: renamed from: j */
    public final boolean f22785j;

    /* JADX INFO: renamed from: k */
    public final zznf f22786k;

    public zzqn(boolean z, AbstractC0116g enabledBackings, zzacr secret, String dirPath, String gmsCoreDirPath, AbstractC0116g includeStaticConfigPackages, AbstractC0116g excludeStaticConfigPackages, boolean z2, boolean z3, boolean z4, zznf clientFlags) {
        AbstractC6452k.m12181e(enabledBackings, "enabledBackings");
        AbstractC6452k.m12181e(secret, "secret");
        AbstractC6452k.m12181e(dirPath, "dirPath");
        AbstractC6452k.m12181e(gmsCoreDirPath, "gmsCoreDirPath");
        AbstractC6452k.m12181e(includeStaticConfigPackages, "includeStaticConfigPackages");
        AbstractC6452k.m12181e(excludeStaticConfigPackages, "excludeStaticConfigPackages");
        AbstractC6452k.m12181e(clientFlags, "clientFlags");
        this.f22776a = z;
        this.f22777b = enabledBackings;
        this.f22778c = secret;
        this.f22779d = dirPath;
        this.f22780e = gmsCoreDirPath;
        this.f22781f = includeStaticConfigPackages;
        this.f22782g = excludeStaticConfigPackages;
        this.f22783h = z2;
        this.f22784i = z3;
        this.f22785j = z4;
        this.f22786k = clientFlags;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzqn)) {
            return false;
        }
        zzqn zzqnVar = (zzqn) obj;
        return this.f22776a == zzqnVar.f22776a && AbstractC6452k.m12177a(this.f22777b, zzqnVar.f22777b) && AbstractC6452k.m12177a(this.f22778c, zzqnVar.f22778c) && AbstractC6452k.m12177a(this.f22779d, zzqnVar.f22779d) && AbstractC6452k.m12177a(this.f22780e, zzqnVar.f22780e) && AbstractC6452k.m12177a(this.f22781f, zzqnVar.f22781f) && AbstractC6452k.m12177a(this.f22782g, zzqnVar.f22782g) && this.f22783h == zzqnVar.f22783h && this.f22784i == zzqnVar.f22784i && this.f22785j == zzqnVar.f22785j && AbstractC6452k.m12177a(this.f22786k, zzqnVar.f22786k);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f22776a), this.f22777b, this.f22778c, this.f22779d, this.f22780e, this.f22781f, this.f22782g, Boolean.valueOf(this.f22783h), Boolean.valueOf(this.f22784i), Boolean.valueOf(this.f22785j));
    }

    public final String toString() {
        boolean z = this.f22776a;
        int length = String.valueOf(z).length();
        List list = this.f22777b;
        int length2 = String.valueOf(list).length();
        zzacr zzacrVar = this.f22778c;
        int length3 = String.valueOf(zzacrVar).length();
        String str = this.f22779d;
        int length4 = String.valueOf(str).length();
        String str2 = this.f22780e;
        int length5 = String.valueOf(str2).length();
        List list2 = this.f22781f;
        int length6 = String.valueOf(list2).length();
        List list3 = this.f22782g;
        int length7 = String.valueOf(list3).length();
        boolean z2 = this.f22783h;
        int length8 = String.valueOf(z2).length();
        boolean z3 = this.f22784i;
        int length9 = String.valueOf(z3).length();
        boolean z4 = this.f22785j;
        int length10 = String.valueOf(z4).length();
        zznf zznfVar = this.f22786k;
        StringBuilder sb = new StringBuilder(length + 59 + length2 + 9 + length3 + 10 + length4 + 17 + length5 + 30 + length6 + 30 + length7 + 24 + length8 + 26 + length9 + 20 + length10 + 14 + String.valueOf(zznfVar).length() + 1);
        sb.append("SharedStorageInfo(shouldUseSharedStorage=");
        sb.append(z);
        sb.append(", enabledBackings=");
        sb.append(list);
        sb.append(", secret=");
        sb.append(zzacrVar);
        sb.append(", dirPath=");
        sb.append(str);
        sb.append(", gmsCoreDirPath=");
        sb.append(str2);
        sb.append(", includeStaticConfigPackages=");
        sb.append(list2);
        sb.append(", excludeStaticConfigPackages=");
        sb.append(list3);
        sb.append(", hasStorageInfoFromGms=");
        sb.append(z2);
        sb.append(", allowEmptySnapshotToken=");
        sb.append(z3);
        sb.append(", enableCommitV2Api=");
        sb.append(z4);
        sb.append(", clientFlags=");
        sb.append(zznfVar);
        sb.append(")");
        return sb.toString();
    }
}
