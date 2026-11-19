package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.google.firebase.firestore.local.RunnableC5811t;
import p011H.RunnableC0294w;
import p063h.EnumC6358d;
import p069k.C6430k;
import p069k.C6440u;
import p079q.C6517h;
import p085u.AbstractC6540a;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ int f2925s = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i2 = jobParameters.getExtras().getInt("priority");
        int i3 = jobParameters.getExtras().getInt("attemptNumber");
        C6440u.m12173b(getApplicationContext());
        if (string == null) {
            throw new NullPointerException("Null backendName");
        }
        EnumC6358d enumC6358dM12212b = AbstractC6540a.m12212b(i2);
        byte[] bArrDecode = string2 != null ? Base64.decode(string2, 0) : null;
        C6517h c6517h = C6440u.m12172a().f24625d;
        c6517h.f24720e.execute(new RunnableC5811t(c6517h, new C6430k(string, bArrDecode, enumC6358dM12212b), i3, new RunnableC0294w(15, this, jobParameters), 1));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
