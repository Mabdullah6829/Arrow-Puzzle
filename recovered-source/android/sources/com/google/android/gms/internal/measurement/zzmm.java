package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzmm implements Continuation {
    @Override // com.google.android.gms.tasks.Continuation
    /* JADX INFO: renamed from: a */
    public final Object mo170a(Task task) {
        zzadu zzaduVarM9555r;
        zzjh zzjhVar = (zzjh) task.getResult();
        zzmf zzmfVarM10484G = zzmg.m10484G();
        String str = zzjhVar.f22528s;
        zzmfVarM10484G.m9552o();
        ((zzmg) zzmfVarM10484G.f22030t).m10491H(str);
        String str2 = zzjhVar.f22530u;
        zzmfVarM10484G.m9552o();
        ((zzmg) zzmfVarM10484G.f22030t).m10493J(str2);
        boolean z = zzjhVar.f22533x;
        zzmfVarM10484G.m9552o();
        ((zzmg) zzmfVarM10484G.f22030t).m10496M(z);
        long j2 = zzjhVar.f22534y;
        zzmfVarM10484G.m9552o();
        ((zzmg) zzmfVarM10484G.f22030t).m10497N(j2);
        byte[] bArr = zzjhVar.f22529t;
        if (bArr != null) {
            zzacr zzacrVarM9379m = zzacr.m9379m(bArr, 0, bArr.length);
            zzmfVarM10484G.m9552o();
            ((zzmg) zzmfVarM10484G.f22030t).m10492I(zzacrVarM9379m);
        }
        for (zzjf zzjfVar : zzjhVar.f22531v) {
            for (zzjo zzjoVar : zzjfVar.f22525t) {
                int i2 = zzjoVar.f22557y;
                String str3 = zzjoVar.f22551s;
                if (i2 == 1) {
                    zzmh zzmhVarM10499G = zzmi.m10499G();
                    zzmhVarM10499G.m10498u(str3);
                    if (i2 != 1) {
                        throw new IllegalArgumentException("Not a long type");
                    }
                    long j3 = zzjoVar.f22552t;
                    zzmhVarM10499G.m9552o();
                    ((zzmi) zzmhVarM10499G.f22030t).m10508J(j3);
                    zzaduVarM9555r = zzmhVarM10499G.m9555r();
                } else if (i2 == 2) {
                    zzmh zzmhVarM10499G2 = zzmi.m10499G();
                    zzmhVarM10499G2.m10498u(str3);
                    if (i2 != 2) {
                        throw new IllegalArgumentException("Not a boolean type");
                    }
                    boolean z2 = zzjoVar.f22553u;
                    zzmhVarM10499G2.m9552o();
                    ((zzmi) zzmhVarM10499G2.f22030t).m10509K(z2);
                    zzaduVarM9555r = zzmhVarM10499G2.m9555r();
                } else if (i2 == 3) {
                    zzmh zzmhVarM10499G3 = zzmi.m10499G();
                    zzmhVarM10499G3.m10498u(str3);
                    if (i2 != 3) {
                        throw new IllegalArgumentException("Not a double type");
                    }
                    double d = zzjoVar.f22554v;
                    zzmhVarM10499G3.m9552o();
                    ((zzmi) zzmhVarM10499G3.f22030t).m10510L(d);
                    zzaduVarM9555r = zzmhVarM10499G3.m9555r();
                } else if (i2 == 4) {
                    zzmh zzmhVarM10499G4 = zzmi.m10499G();
                    zzmhVarM10499G4.m10498u(str3);
                    if (i2 != 4) {
                        throw new IllegalArgumentException("Not a String type");
                    }
                    String str4 = zzjoVar.f22555w;
                    Preconditions.m3544h(str4);
                    zzmhVarM10499G4.m9552o();
                    ((zzmi) zzmhVarM10499G4.f22030t).m10511M(str4);
                    zzaduVarM9555r = zzmhVarM10499G4.m9555r();
                } else {
                    if (i2 != 5) {
                        throw new IllegalArgumentException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 24), "Unrecognized flag type: ", i2));
                    }
                    zzmh zzmhVarM10499G5 = zzmi.m10499G();
                    zzmhVarM10499G5.m10498u(str3);
                    if (i2 != 5) {
                        throw new IllegalArgumentException("Not a bytes type");
                    }
                    byte[] bArr2 = zzjoVar.f22556x;
                    Preconditions.m3544h(bArr2);
                    zzacr zzacrVarM9379m2 = zzacr.m9379m(bArr2, 0, bArr2.length);
                    zzmhVarM10499G5.m9552o();
                    ((zzmi) zzmhVarM10499G5.f22030t).m10512N(zzacrVarM9379m2);
                    zzaduVarM9555r = zzmhVarM10499G5.m9555r();
                }
                zzmfVarM10484G.m9552o();
                ((zzmg) zzmfVarM10484G.f22030t).m10494K((zzmi) zzaduVarM9555r);
            }
            String[] strArr = zzjfVar.f22526u;
            if (strArr != null) {
                for (String str5 : strArr) {
                    zzmfVarM10484G.m9552o();
                    ((zzmg) zzmfVarM10484G.f22030t).m10495L(str5);
                }
            }
        }
        return (zzmg) zzmfVarM10484G.m9555r();
    }
}
