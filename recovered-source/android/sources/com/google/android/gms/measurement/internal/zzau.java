package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzau {
    final /* synthetic */ zzaw zza;
    private final String zzb;
    private long zzc;

    public zzau(zzaw zzawVar, String str) {
        Objects.requireNonNull(zzawVar);
        this.zza = zzawVar;
        Preconditions.m3541e(str);
        this.zzb = str;
        this.zzc = -1L;
    }

    public final List zza() {
        List list;
        List list2;
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.zza.zze().query("raw_events", new String[]{"rowid", AppMeasurementSdk.ConditionalUserProperty.NAME, "timestamp", "metadata_fingerprint", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "realtime", "elapsed_time"}, "app_id = ? and rowid > ?", new String[]{this.zzb, String.valueOf(this.zzc)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j2 = cursorQuery.getLong(0);
                        long j3 = cursorQuery.getLong(3);
                        boolean z = cursorQuery.getLong(5) == 1;
                        long j4 = cursorQuery.getLong(6);
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j2 > this.zzc) {
                            this.zzc = j2;
                        }
                        try {
                            com.google.android.gms.internal.measurement.zzhr zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.m10121Q(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            zzhrVar.m10108C(string);
                            long j5 = cursorQuery.getLong(2);
                            zzhrVar.m9552o();
                            ((com.google.android.gms.internal.measurement.zzhs) zzhrVar.f22030t).m10144X(j5);
                            zzhrVar.m9552o();
                            ((com.google.android.gms.internal.measurement.zzhs) zzhrVar.f22030t).m10122A(j4);
                            arrayList.add(new zzat(j2, j3, z, (com.google.android.gms.internal.measurement.zzhs) zzhrVar.m9555r()));
                        } catch (IOException e) {
                            this.zza.zzu.zzaW().zzb().zzc("Data loss. Failed to merge raw event. appId", zzgu.zzl(this.zzb), e);
                        }
                    } while (cursorQuery.moveToNext());
                    list = arrayList;
                } else {
                    list2 = Collections.EMPTY_LIST;
                }
            } finally {
                if (0 != 0) {
                    cursorQuery.close();
                }
            }
        } catch (SQLiteException e2) {
            this.zza.zzu.zzaW().zzb().zzc("Data loss. Error querying raw events batch. appId", zzgu.zzl(this.zzb), e2);
            list = arrayList;
        }
        list = list2;
        return list;
    }

    public zzau(zzaw zzawVar, String str, long j2) {
        Objects.requireNonNull(zzawVar);
        this.zza = zzawVar;
        Preconditions.m3541e(str);
        this.zzb = str;
        this.zzc = zzawVar.zzaj("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j2)}, -1L);
    }
}
