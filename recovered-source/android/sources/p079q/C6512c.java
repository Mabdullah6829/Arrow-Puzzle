package p079q;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.zip.Adler32;
import p011H.AbstractC0242F;
import p063h.EnumC6358d;
import p069k.AbstractC6437r;
import p069k.C6430k;
import p081r.C6530i;
import p081r.InterfaceC6525d;
import p085u.AbstractC6540a;

/* JADX INFO: renamed from: q.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6512c {

    /* JADX INFO: renamed from: a */
    public final Context f24700a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6525d f24701b;

    /* JADX INFO: renamed from: c */
    public final C6510a f24702c;

    public C6512c(Context context, InterfaceC6525d interfaceC6525d, C6510a c6510a) {
        this.f24700a = context;
        this.f24701b = interfaceC6525d;
        this.f24702c = c6510a;
    }

    /* JADX INFO: renamed from: a */
    public final void m12198a(AbstractC6437r abstractC6437r, int i2, boolean z) {
        Context context = this.f24700a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        C6430k c6430k = (C6430k) abstractC6437r;
        adler32.update(c6430k.f24598a.getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(AbstractC6540a.m12211a(c6430k.f24600c)).array());
        byte[] bArr = c6430k.f24599b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i3 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i3 < i2) {
                        break;
                    }
                    AbstractC0242F.m350f("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", abstractC6437r);
                    return;
                }
            }
        }
        Cursor cursorRawQuery = ((C6530i) this.f24701b).m12203c().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{c6430k.f24598a, String.valueOf(AbstractC6540a.m12211a(c6430k.f24600c))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            C6430k c6430k2 = (C6430k) abstractC6437r;
            EnumC6358d enumC6358d = c6430k2.f24600c;
            C6510a c6510a = this.f24702c;
            builder.setMinimumLatency(c6510a.m12197a(enumC6358d, jLongValue, i2));
            Set set = ((C6511b) c6510a.f24696b.get(enumC6358d)).f24699c;
            if (set.contains(EnumC6513d.f24703s)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(EnumC6513d.f24705u)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(EnumC6513d.f24704t)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i2);
            persistableBundle.putString("backendName", c6430k2.f24598a);
            persistableBundle.putInt("priority", AbstractC6540a.m12211a(enumC6358d));
            byte[] bArr2 = c6430k2.f24599b;
            if (bArr2 != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr2, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {abstractC6437r, Integer.valueOf(value), Long.valueOf(c6510a.m12197a(enumC6358d, jLongValue, i2)), lValueOf, Integer.valueOf(i2)};
            String strM355l = AbstractC0242F.m355l("JobInfoScheduler");
            if (Log.isLoggable(strM355l, 3)) {
                Log.d(strM355l, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }
}
