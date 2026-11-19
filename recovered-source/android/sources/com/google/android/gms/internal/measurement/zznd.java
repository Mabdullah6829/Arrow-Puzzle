package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class zznd {

    /* JADX INFO: renamed from: c */
    public static final zznd f22673c = new zznd(zzmw.f22661b, zzmq.m10520H());

    /* JADX INFO: renamed from: a */
    public final zzmw f22674a;

    /* JADX INFO: renamed from: b */
    public final zzmq f22675b;

    public zznd(zzmw zzmwVar, zzmq zzmqVar) {
        zzmwVar.getClass();
        this.f22674a = zzmwVar;
        this.f22675b = zzmqVar;
    }

    /* JADX INFO: renamed from: a */
    public static zznd m10532a(zzacv zzacvVar, boolean z) throws zzaeh {
        zzmw zzmwVarM10529a;
        int iMo9386C = zzacvVar.mo9386C();
        if (iMo9386C > 1) {
            throw new zzaeh(AbstractC1456a.m2448o(new StringBuilder(String.valueOf(iMo9386C).length() + 44), "Unsupported version: ", iMo9386C, ". Current version is: 1"));
        }
        zzacvVar.mo9386C();
        int iMo9399a = zzacvVar.mo9399a(zzacvVar.mo9384A());
        zzadf zzadfVar = zzadf.f22012b;
        int i2 = zzacf.f21956a;
        zzmq zzmqVarM10519G = zzmq.m10519G(zzacvVar, zzadf.f22013c);
        zzacvVar.mo9400b(iMo9399a);
        zzmu zzmuVarM10527c = zzmu.m10527c();
        Inflater inflater = zzmuVarM10527c.f22654s;
        try {
            if (z) {
                int iMo9399a2 = zzacvVar.mo9399a(zzacvVar.mo9384A());
                int i3 = zznb.f22671a;
                int iMo9401c = zzacvVar.mo9401c();
                try {
                    zzmwVarM10529a = zzmw.m10529a(zzacv.m9430h(4096, new InflaterInputStream(new zzms(zzmuVarM10527c, zzacvVar), inflater, iMo9401c < 0 ? 4096 : Math.min(iMo9401c, 4096))));
                    inflater.reset();
                    if (zzacvVar.mo9401c() != 0) {
                        throw new zzaeh("Unexpected bytes remaining after FlagsBlob parsing.");
                    }
                    zzacvVar.mo9400b(iMo9399a2);
                } catch (Throwable th) {
                    inflater.reset();
                    throw th;
                }
            } else {
                byte[] bArrMo9420z = zzacvVar.mo9420z();
                int i4 = zznc.f22672a;
                inflater.setInput(bArrMo9420z);
                try {
                    zzmwVarM10529a = zzmw.m10529a(zzacv.m9430h(4096, new zzmr(zzmuVarM10527c)));
                    inflater.reset();
                } catch (Throwable th2) {
                    inflater.reset();
                    throw th2;
                }
            }
            zzmuVarM10527c.close();
            return new zznd(zzmwVarM10529a, zzmqVarM10519G);
        } catch (Throwable th3) {
            try {
                zzmuVarM10527c.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
