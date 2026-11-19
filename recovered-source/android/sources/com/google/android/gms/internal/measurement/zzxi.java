package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzyi;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class zzxi<API extends zzyi<API>> {

    /* JADX INFO: renamed from: a */
    public final zzzf f23063a;

    public zzxi(zzzf zzzfVar) {
        this.f23063a = zzzfVar;
    }

    /* JADX INFO: renamed from: a */
    public static void m10704a(String str, zzxz zzxzVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(TimeUnit.NANOSECONDS.toMillis(zzxzVar.f23083b))));
        sb.append(": logging error [");
        zzze.m10745a(1, zzxzVar.m10722h(), sb);
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }
}
