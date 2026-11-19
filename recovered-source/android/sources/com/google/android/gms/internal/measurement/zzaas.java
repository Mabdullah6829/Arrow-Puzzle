package com.google.android.gms.internal.measurement;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaas extends zzaag {

    /* JADX INFO: renamed from: f */
    public static final Set f21880f;

    /* JADX INFO: renamed from: g */
    public static final zzzq f21881g;

    /* JADX INFO: renamed from: h */
    public static final zzaaq f21882h;

    /* JADX INFO: renamed from: b */
    public final String f21883b;

    /* JADX INFO: renamed from: c */
    public final Level f21884c;

    /* JADX INFO: renamed from: d */
    public final Set f21885d;

    /* JADX INFO: renamed from: e */
    public final zzzq f21886e;

    static {
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(zzxx.f23070a, zzyw.f23117a, zzyx.f23118a)));
        f21880f = setUnmodifiableSet;
        zzzn zzznVar = new zzzn(zzzt.m10753a(setUnmodifiableSet));
        f21881g = zzznVar;
        f21882h = new zzaaq(Level.ALL, setUnmodifiableSet, zzznVar);
    }

    public /* synthetic */ zzaas(String str, Level level, Set set, zzzq zzzqVar) {
        super(str);
        this.f21883b = zzaal.m9311a(str);
        this.f21884c = level;
        this.f21885d = set;
        this.f21886e = zzzqVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:52:0x0114  */
    /* JADX INFO: renamed from: e */
    public static void m9319e(zzxz zzxzVar, String str, Level level, Set set, zzzq zzzqVar) {
        zzaaa zzzyVar;
        StringBuilder sb;
        zzaaf zzaafVar;
        zzzc zzzcVar;
        int i2;
        String string;
        Level level2 = zzxzVar.f23082a;
        Boolean bool = (Boolean) zzxzVar.m10725k().mo10716d(zzyx.f23118a);
        if (bool == null || !bool.booleanValue()) {
            zzzj zzzjVarMo9318c = zzaab.f21854a.mo9307c().mo9318c();
            zzzj zzzjVarM10725k = zzxzVar.m10725k();
            zzaaa zzaaaVar = zzaaa.f21853a;
            int iMo10713a = zzzjVarM10725k.mo10713a();
            if (iMo10713a == 0) {
                zzzyVar = zzaaa.f21853a;
            } else {
                zzzyVar = iMo10713a <= 28 ? new zzzy(zzzjVarMo9318c, zzzjVarM10725k) : new zzzz(zzzjVarMo9318c, zzzjVarM10725k);
            }
            boolean z = level2.intValue() < level.intValue();
            if (z) {
                sb = new StringBuilder();
                if (zzze.m10745a(2, zzxzVar.m10722h(), sb)) {
                    sb.append(" ");
                }
                if (z) {
                    zzaafVar = zzxzVar.f23087f;
                    if (zzaafVar != null) {
                        zzyy zzyyVar = new zzyy(zzaafVar, zzxzVar.m10723i(), sb);
                        zzaaf zzaafVar2 = zzyyVar.f21918a;
                        zzaafVar2.f21857a.mo9328a(zzyyVar);
                        i2 = zzyyVar.f21919b;
                        if (((i2 + 1) & i2) == 0) {
                        }
                        throw new zzabo(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i2))));
                    }
                    sb.append(zzzh.m10746a(zzxzVar.m10724j()));
                    int i3 = zzaae.f21856a;
                    zzzcVar = new zzzc(sb);
                    zzzyVar.mo9302a(zzzqVar, zzzcVar);
                    if (zzzcVar.f23145b) {
                        sb.append(" ]");
                    }
                } else {
                    zzaafVar = zzxzVar.f23087f;
                    if (zzaafVar != null) {
                        zzyy zzyyVar2 = new zzyy(zzaafVar, zzxzVar.m10723i(), sb);
                        zzaaf zzaafVar3 = zzyyVar2.f21918a;
                        zzaafVar3.f21857a.mo9328a(zzyyVar2);
                        i2 = zzyyVar2.f21919b;
                        if (((i2 + 1) & i2) == 0) {
                        }
                        throw new zzabo(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i2))));
                    }
                    sb.append(zzzh.m10746a(zzxzVar.m10724j()));
                    int i4 = zzaae.f21856a;
                    zzzcVar = new zzzc(sb);
                    zzzyVar.mo9302a(zzzqVar, zzzcVar);
                    if (zzzcVar.f23145b) {
                        sb.append(" ]");
                    }
                }
                string = sb.toString();
            } else {
                int i5 = zzaae.f21856a;
                if (zzxzVar.f23087f == null && zzzyVar.mo9303b() <= set.size() && set.containsAll(zzzyVar.mo9304c())) {
                    string = zzzh.m10746a(zzxzVar.m10724j());
                } else {
                    sb = new StringBuilder();
                    if (zzze.m10745a(2, zzxzVar.m10722h(), sb)) {
                        sb.append(" ");
                    }
                    if (z || zzxzVar.f23087f == null) {
                        zzaafVar = zzxzVar.f23087f;
                        if (zzaafVar != null) {
                            zzyy zzyyVar3 = new zzyy(zzaafVar, zzxzVar.m10723i(), sb);
                            zzaaf zzaafVar4 = zzyyVar3.f21918a;
                            zzaafVar4.f21857a.mo9328a(zzyyVar3);
                            i2 = zzyyVar3.f21919b;
                            if (((i2 + 1) & i2) == 0 || (zzyyVar3.f21920c > 31 && i2 != -1)) {
                                throw new zzabo(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i2))));
                            }
                            zzabn zzabnVar = zzaafVar4.f21857a;
                            String str2 = zzaafVar4.f21858b;
                            int i6 = zzyyVar3.f23121f;
                            int length = str2.length();
                            StringBuilder sb2 = zzyyVar3.f23120e;
                            zzabnVar.mo9329b(sb2, str2, i6, length);
                            if (zzxzVar.m10723i().length > zzyyVar3.f21920c + 1) {
                                sb2.append(" [ERROR: UNUSED LOG ARGUMENTS]");
                            }
                        } else {
                            sb.append(zzzh.m10746a(zzxzVar.m10724j()));
                        }
                        int i7 = zzaae.f21856a;
                        zzzcVar = new zzzc(sb);
                        zzzyVar.mo9302a(zzzqVar, zzzcVar);
                        if (zzzcVar.f23145b) {
                            sb.append(" ]");
                        }
                    } else {
                        sb.append("(REDACTED) ");
                        sb.append(zzxzVar.f23087f.f21858b);
                    }
                    string = sb.toString();
                }
            }
            Throwable th = (Throwable) zzxzVar.m10725k().mo10716d(zzxx.f23070a);
            int iM9312b = zzaal.m9312b(level2);
            if (iM9312b == 2) {
                Log.v(str, string, th);
                return;
            }
            if (iM9312b == 3) {
                Log.d(str, string, th);
                return;
            }
            if (iM9312b == 4) {
                Log.i(str, string, th);
            } else if (iM9312b != 5) {
                Log.e(str, string, th);
            } else {
                Log.w(str, string, th);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzzf
    /* JADX INFO: renamed from: b */
    public final boolean mo9314b(Level level) {
        int iM9312b = zzaal.m9312b(level);
        return Log.isLoggable(this.f21883b, iM9312b) || Log.isLoggable("all", iM9312b);
    }

    @Override // com.google.android.gms.internal.measurement.zzzf
    /* JADX INFO: renamed from: c */
    public final void mo9315c(zzxz zzxzVar) {
        m9319e(zzxzVar, this.f21883b, this.f21884c, this.f21885d, this.f21886e);
    }
}
