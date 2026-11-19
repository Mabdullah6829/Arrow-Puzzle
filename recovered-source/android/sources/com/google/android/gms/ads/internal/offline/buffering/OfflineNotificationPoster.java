package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzbzb;

/* JADX INFO: loaded from: classes.dex */
public class OfflineNotificationPoster extends Worker {

    /* JADX INFO: renamed from: s */
    public final zzbzb f3280s;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f3280s = zzay.f3085g.f3087b.m2810j(context, new zzbvf());
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.Result doWork() {
        try {
            this.f3280s.mo5274X3(new ObjectWrapper(getApplicationContext()), new zza(getInputData().getString("uri"), getInputData().getString("gws_query_id"), getInputData().getString("image_url")));
            return ListenableWorker.Result.success();
        } catch (RemoteException unused) {
            return ListenableWorker.Result.failure();
        }
    }
}
