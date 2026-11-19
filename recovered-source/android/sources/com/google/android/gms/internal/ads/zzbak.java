package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbak {
    /* JADX INFO: renamed from: a */
    public static final String m4683a(Context context, String str, long j2) {
        try {
            zzaze zzazeVarM4657D = zzazf.m4657D();
            zzazeVarM4657D.m8326l();
            ((zzazf) zzazeVarM4657D.f19780t).m4659F(str);
            zzazeVarM4657D.m8326l();
            ((zzazf) zzazeVarM4657D.f19780t).m4658E("0.828153725");
            String packageName = context.getPackageName();
            zzazeVarM4657D.m8326l();
            ((zzazf) zzazeVarM4657D.f19780t).m4661H(packageName);
            long jCurrentTimeMillis = (System.currentTimeMillis() - j2) / 1000;
            zzazeVarM4657D.m8326l();
            ((zzazf) zzazeVarM4657D.f19780t).m4663J(jCurrentTimeMillis);
            long jCurrentTimeMillis2 = System.currentTimeMillis() / 1000;
            zzazeVarM4657D.m8326l();
            ((zzazf) zzazeVarM4657D.f19780t).m4660G(jCurrentTimeMillis2);
            try {
                long j3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                zzazeVarM4657D.m8326l();
                ((zzazf) zzazeVarM4657D.f19780t).m4662I(j3);
            } catch (PackageManager.NameNotFoundException unused) {
                zzazeVarM4657D.m8326l();
                ((zzazf) zzazeVarM4657D.f19780t).m4662I(-1L);
            }
            zzazl zzazlVarM4679b = zzazv.m4679b(null, ((zzazf) zzazeVarM4657D.m8328o()).m8099h());
            zzazlVarM4679b.m8326l();
            ((zzazm) zzazlVarM4679b.f19780t).m4673G(5);
            zzazlVarM4679b.m8326l();
            ((zzazm) zzazlVarM4679b.f19780t).m4674H(2);
            return Base64.encodeToString(((zzazm) zzazlVarM4679b.m8328o()).m8099h(), 11);
        } catch (UnsupportedEncodingException | GeneralSecurityException unused2) {
            return Integer.toString(7);
        }
    }
}
