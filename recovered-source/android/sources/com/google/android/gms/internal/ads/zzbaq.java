package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbaq {

    /* JADX INFO: renamed from: c */
    public static final ConditionVariable f7460c = new ConditionVariable();

    /* JADX INFO: renamed from: d */
    public static volatile zzfzm f7461d = null;

    /* JADX INFO: renamed from: e */
    public static volatile Random f7462e = null;

    /* JADX INFO: renamed from: a */
    public final zzbbz f7463a;

    /* JADX INFO: renamed from: b */
    public volatile Boolean f7464b;

    public zzbaq(zzbbz zzbbzVar) {
        this.f7463a = zzbbzVar;
        zzbbzVar.f7548b.execute(new zzbap(this));
    }

    /* JADX INFO: renamed from: a */
    public final void m4691a(int i2, int i3, long j2, String str, Exception exc) {
        try {
            f7460c.block();
            if (!this.f7464b.booleanValue() || f7461d == null) {
                return;
            }
            zzawz zzawzVarM4510D = zzaxd.m4510D();
            String packageName = this.f7463a.f7547a.getPackageName();
            zzawzVarM4510D.m8326l();
            ((zzaxd) zzawzVarM4510D.f19780t).m4511E(packageName);
            zzawzVarM4510D.m8326l();
            ((zzaxd) zzawzVarM4510D.f19780t).m4512F(j2);
            if (str != null) {
                zzawzVarM4510D.m8326l();
                ((zzaxd) zzawzVarM4510D.f19780t).m4515I(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                String string = stringWriter.toString();
                zzawzVarM4510D.m8326l();
                ((zzaxd) zzawzVarM4510D.f19780t).m4513G(string);
                String name = exc.getClass().getName();
                zzawzVarM4510D.m8326l();
                ((zzaxd) zzawzVarM4510D.f19780t).m4514H(name);
            }
            zzfzm zzfzmVar = f7461d;
            byte[] bArrM8099h = ((zzaxd) zzawzVarM4510D.m8328o()).m8099h();
            zzfzmVar.getClass();
            zzfzl zzfzlVar = new zzfzl(zzfzmVar, bArrM8099h);
            zzfzlVar.f16861c = i2;
            if (i3 != -1) {
                zzfzlVar.f16860b = i3;
            }
            zzfzlVar.m6821a();
        } catch (Exception unused) {
        }
    }
}
