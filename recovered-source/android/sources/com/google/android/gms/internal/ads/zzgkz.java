package com.google.android.gms.internal.ads;

import androidx.core.view.PointerIconCompat;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgkz {

    /* JADX INFO: renamed from: a */
    public final zzgpe f17678a;

    /* JADX INFO: renamed from: b */
    public final zzgmp f17679b;

    /* JADX INFO: renamed from: c */
    public final zzgng f17680c;

    /* JADX INFO: renamed from: d */
    public final zzgqo f17681d;

    /* JADX INFO: renamed from: e */
    public final zzgew f17682e;

    /* JADX INFO: renamed from: f */
    public final boolean f17683f;

    /* JADX INFO: renamed from: g */
    public final long f17684g;

    /* JADX INFO: renamed from: h */
    public final long f17685h;

    public zzgkz(zzgpe zzgpeVar, zzgmp zzgmpVar, zzgng zzgngVar, zzgqo zzgqoVar, zzgew zzgewVar, boolean z, long j2, long j3) {
        this.f17678a = zzgpeVar;
        this.f17679b = zzgmpVar;
        this.f17680c = zzgngVar;
        this.f17681d = zzgqoVar;
        this.f17682e = zzgewVar;
        this.f17683f = z;
        this.f17684g = j2;
        this.f17685h = j3;
    }

    /* JADX INFO: renamed from: a */
    public final zzhbx m7019a() {
        zzhbx zzhbxVarM7360q = zzhbx.m7360q(this.f17680c.zzb());
        zzgko zzgkoVar = new zzgti() { // from class: com.google.android.gms.internal.ads.zzgko
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return null;
            }
        };
        zzhbu zzhbuVar = zzhbu.f18506s;
        zzhbx zzhbxVar = (zzhbx) zzhcf.m7371e(zzhbxVarM7360q, Throwable.class, zzgkoVar, zzhbuVar);
        final zzgpe zzgpeVar = this.f17678a;
        Objects.requireNonNull(zzgpeVar);
        return (zzhbx) zzhcf.m7374h((zzhbx) zzhcf.m7375i(zzhbxVar, new zzgti() { // from class: com.google.android.gms.internal.ads.zzgkn
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return new Boolean(zzgpeVar.mo7045b((zzggb) obj));
            }
        }, zzhbuVar), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzgkp
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                zzgkz zzgkzVar = this.f17660a;
                if (zBooleanValue) {
                    return zzgkzVar.m7020b(0);
                }
                zzgkzVar.f17681d.m7061b(PointerIconCompat.TYPE_HELP);
                return zzhcf.m7367a(zzgky.f17672t);
            }
        }, zzhbuVar);
    }

    /* JADX INFO: renamed from: b */
    public final zzhbx m7020b(final int i2) {
        zzhbx zzhbxVarM7360q = zzhbx.m7360q(this.f17679b.zza());
        zzgti zzgtiVar = new zzgti() { // from class: com.google.android.gms.internal.ads.zzgkq
            @Override // com.google.android.gms.internal.ads.zzgti
            public final Object apply(Object obj) {
                zzgfz zzgfzVar = (zzgfz) obj;
                zzgqo zzgqoVar = this.f17661a.f17681d;
                int iM6984K = zzgfzVar.m6984K() - 1;
                if (iM6984K == 1 || iM6984K == 2) {
                    return zzgfzVar;
                }
                if (iM6984K == 3) {
                    int iM6984K2 = zzgfzVar.m6984K() - 1;
                    StringBuilder sb = new StringBuilder(String.valueOf(iM6984K2).length());
                    sb.append(iM6984K2);
                    zzgqoVar.m7062c(PointerIconCompat.TYPE_WAIT, sb.toString());
                    int iM6984K3 = zzgfzVar.m6984K() - 1;
                    throw new zzgkm(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(iM6984K3).length() + 3), "r: ", iM6984K3));
                }
                if (iM6984K != 12) {
                    int iM6984K4 = zzgfzVar.m6984K() - 1;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iM6984K4).length());
                    sb2.append(iM6984K4);
                    zzgqoVar.m7062c(1005, sb2.toString());
                    int iM6984K5 = zzgfzVar.m6984K() - 1;
                    throw new zzgkl(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(iM6984K5).length() + 3), "r: ", iM6984K5));
                }
                int iM6984K6 = zzgfzVar.m6984K() - 1;
                StringBuilder sb3 = new StringBuilder(String.valueOf(iM6984K6).length());
                sb3.append(iM6984K6);
                zzgqoVar.m7062c(1005, sb3.toString());
                int iM6984K7 = zzgfzVar.m6984K() - 1;
                throw new zzgkk(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(iM6984K7).length() + 3), "r: ", iM6984K7));
            }
        };
        zzhbu zzhbuVar = zzhbu.f18506s;
        zzhbx zzhbxVar = (zzhbx) zzhcf.m7371e((zzhbx) zzhcf.m7371e((zzhbx) zzhcf.m7371e((zzhbx) zzhcf.m7375i((zzhbx) zzhcf.m7374h((zzhbx) zzhcf.m7375i(zzhbxVarM7360q, zzgtiVar, zzhbuVar), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzgkr
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
                zzgfz zzgfzVar = (zzgfz) obj;
                zzgng zzgngVar = this.f17662a.f17680c;
                if (zzgfzVar.m6984K() == 2) {
                    return zzgngVar.mo7039c(zzgfzVar.m6978D(), zzgfzVar.m6979E().m8151a());
                }
                if (zzgfzVar.m6984K() == 3) {
                    return zzgngVar.mo7040d(zzgfzVar.m6978D(), zzgfzVar.m6980F().m8151a(), zzgfzVar.m6979E().m8151a());
                }
                throw new AssertionError("Unreachable");
            }
        }, zzhbuVar), new zzgti() { // from class: com.google.android.gms.internal.ads.zzgks
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return zzgky.f17673u;
            }
        }, zzhbuVar), zzgkl.class, new zzgti() { // from class: com.google.android.gms.internal.ads.zzgkt
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return zzgky.f17675w;
            }
        }, zzhbuVar), zzgkm.class, new zzgti() { // from class: com.google.android.gms.internal.ads.zzgku
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return zzgky.f17674v;
            }
        }, zzhbuVar), zzgkk.class, new zzgti() { // from class: com.google.android.gms.internal.ads.zzgkv
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                final zzgkz zzgkzVar = this.f17666a;
                if (zzgkzVar.f17683f) {
                    final int i3 = i2;
                    if (i3 < zzgkzVar.f17684g) {
                        zzgkzVar.f17682e.mo6967a(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgkw
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzgkzVar.m7020b(i3 + 1);
                            }
                        }, zzgkzVar.f17685h * ((long) Math.pow(2.0d, i3)));
                    }
                }
                return zzgky.f17676x;
            }
        }, zzhbuVar);
        this.f17681d.m7064e(1002, zzhbxVar);
        return zzhbxVar;
    }
}
