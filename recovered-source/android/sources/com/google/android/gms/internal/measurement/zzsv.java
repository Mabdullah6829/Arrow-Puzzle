package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.os.Process;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class zzsv implements zzrt {

    /* JADX INFO: renamed from: a */
    public final zzafc f22873a;

    /* JADX INFO: renamed from: b */
    public zzro[] f22874b;

    public zzsv(zzafc zzafcVar) {
        this.f22873a = zzafcVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzrt
    /* JADX INFO: renamed from: a */
    public final Object mo10531a(zzrs zzrsVar) throws IOException {
        Uri uri = zzrsVar.f22837d;
        AtomicLong atomicLong = zzsu.f22872a;
        int iMyPid = Process.myPid();
        long id = Thread.currentThread().getId();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long andIncrement = zzsu.f22872a.getAndIncrement();
        int length = String.valueOf(iMyPid).length();
        StringBuilder sb = new StringBuilder(AbstractC1456a.m2437d(length + 15 + String.valueOf(id).length(), 1, String.valueOf(jCurrentTimeMillis).length(), 1, String.valueOf(andIncrement).length()));
        sb.append(".mobstore_tmp-");
        sb.append(iMyPid);
        sb.append("-");
        sb.append(id);
        AbstractC1456a.m2456w(sb, "-", jCurrentTimeMillis, "-");
        sb.append(andIncrement);
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(sb.toString())).build();
        zzsx zzsxVar = zzrsVar.f22834a;
        ArrayList arrayListM10628a = zzrsVar.m10628a(zzsxVar.mo10642d(uriBuild));
        zzro[] zzroVarArr = this.f22874b;
        if (zzroVarArr != null) {
            zzroVarArr[0].mo10627a(arrayListM10628a);
        }
        try {
            OutputStream outputStream = (OutputStream) arrayListM10628a.get(0);
            try {
                this.f22873a.mo9345e(outputStream);
                zzro[] zzroVarArr2 = this.f22874b;
                if (zzroVarArr2 != null) {
                    zzroVarArr2[0].zzb();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                zzsxVar.mo10644f(uriBuild, uri);
                return null;
            } catch (Throwable th) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            try {
                zzsxVar.mo10643e(uriBuild);
            } catch (FileNotFoundException unused) {
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e);
        }
    }
}
