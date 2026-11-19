package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgjp {

    /* JADX INFO: renamed from: a */
    public final Context f17624a;

    /* JADX INFO: renamed from: b */
    public final zzgqo f17625b;

    /* JADX INFO: renamed from: c */
    public final zzghl f17626c;

    /* JADX INFO: renamed from: d */
    public final String f17627d;

    /* JADX INFO: renamed from: e */
    public final boolean f17628e;

    public zzgjp(Context context, zzgqo zzgqoVar, zzghl zzghlVar, zzgdq zzgdqVar) {
        this.f17624a = context;
        this.f17625b = zzgqoVar;
        this.f17626c = zzghlVar;
        this.f17627d = zzgdqVar.m6921U();
        this.f17628e = zzgdqVar.m6939m0();
    }

    /* JADX INFO: renamed from: a */
    public final String m7018a(long j2) {
        boolean z;
        String strEncodeToString = "E";
        Context context = this.f17624a;
        zzgqm zzgqmVarM7060a = this.f17625b.m7060a(55);
        try {
            zzgqmVarM7060a.m7057a();
            zzaze zzazeVarM4657D = zzazf.m4657D();
            String str = this.f17627d;
            zzazeVarM4657D.m8326l();
            ((zzazf) zzazeVarM4657D.f19780t).m4659F(str);
            zzazeVarM4657D.m8326l();
            ((zzazf) zzazeVarM4657D.f19780t).m4658E("0.893135394");
            String packageName = context.getPackageName();
            zzazeVarM4657D.m8326l();
            ((zzazf) zzazeVarM4657D.f19780t).m4661H(packageName);
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            zzazeVarM4657D.m8326l();
            ((zzazf) zzazeVarM4657D.f19780t).m4660G(jCurrentTimeMillis);
            long jCurrentTimeMillis2 = (System.currentTimeMillis() - j2) / 1000;
            zzazeVarM4657D.m8326l();
            ((zzazf) zzazeVarM4657D.f19780t).m4663J(jCurrentTimeMillis2);
            if (this.f17628e) {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        byte[] bArrDigest = MessageDigest.getInstance("SHA-1").digest(signatureArr[0].toByteArray());
                        StringBuilder sb = new StringBuilder();
                        for (byte b : bArrDigest) {
                            String hexString = Integer.toHexString(b & 255);
                            if (hexString.length() == 1) {
                                sb.append('0');
                            }
                            sb.append(hexString);
                        }
                        strEncodeToString = Base64.encodeToString(sb.toString().getBytes(StandardCharsets.UTF_8), 11);
                    }
                } catch (Exception unused) {
                }
                zzazeVarM4657D.m8326l();
                ((zzazf) zzazeVarM4657D.f19780t).m4664K(strEncodeToString);
            }
            try {
                long j3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                zzazeVarM4657D.m8326l();
                ((zzazf) zzazeVarM4657D.f19780t).m4662I(j3);
            } catch (PackageManager.NameNotFoundException unused2) {
                zzazeVarM4657D.m8326l();
                ((zzazf) zzazeVarM4657D.f19780t).m4662I(-1L);
            }
            zzghl zzghlVar = this.f17626c;
            synchronized (zzghlVar) {
                z = zzghlVar.f17281d;
            }
            if (!z) {
                zzghlVar.m7005a();
            }
            zzazl zzazlVarM7008d = zzghlVar.m7008d(null, ((zzazf) zzazeVarM4657D.m8328o()).m8099h());
            zzazlVarM7008d.m8326l();
            ((zzazm) zzazlVarM7008d.f19780t).m4673G(5);
            zzazlVarM7008d.m8326l();
            ((zzazm) zzazlVarM7008d.f19780t).m4674H(2);
            byte[] bArrM8099h = ((zzazm) zzazlVarM7008d.m8328o()).m8099h();
            zzgzn zzgznVar = (zzgzn) zzgzo.f18402b;
            String strM7282g = (zzgznVar.f18399e == null ? zzgznVar : zzgznVar.mo7276i(zzgznVar.f18398d, null)).m7282g(bArrM8099h.length, bArrM8099h);
            zzgqmVarM7060a.m7059c();
            return strM7282g;
        } catch (Throwable th) {
            try {
                zzgqmVarM7060a.m7058b(th);
                throw th;
            } catch (Throwable th2) {
                zzgqmVarM7060a.m7059c();
                throw th2;
            }
        }
    }
}
