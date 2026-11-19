package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class zzok extends zzos {
    private final AlarmManager zza;
    private zzaz zzb;
    private Integer zzc;

    public zzok(zzpg zzpgVar) {
        super(zzpgVar);
        this.zza = (AlarmManager) this.zzu.zzaZ().getSystemService(NotificationCompat.CATEGORY_ALARM);
    }

    private final void zzh() {
        JobScheduler jobScheduler = (JobScheduler) this.zzu.zzaZ().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(zzi());
        }
    }

    private final int zzi() {
        if (this.zzc == null) {
            this.zzc = Integer.valueOf("measurement".concat(String.valueOf(this.zzu.zzaZ().getPackageName())).hashCode());
        }
        return this.zzc.intValue();
    }

    private final PendingIntent zzj() {
        Context contextZzaZ = this.zzu.zzaZ();
        return PendingIntent.getBroadcast(contextZzaZ, 0, new Intent().setClassName(contextZzaZ, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.zzce.f22346a);
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final boolean zzbc() {
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzj());
        }
        zzh();
        return false;
    }

    public final zzaz zzc() {
        if (this.zzb == null) {
            this.zzb = new zzoj(this, this.zzg.zzah());
        }
        return this.zzb;
    }

    public final void zzd(long j2) {
        zzay();
        zzic zzicVar = this.zzu;
        zzicVar.zzaV();
        Context contextZzaZ = zzicVar.zzaZ();
        if (!zzpp.zzax(contextZzaZ)) {
            zzicVar.zzaW().zzj().zza("Receiver not registered/enabled");
        }
        int iIntValue = 0;
        if (!zzpp.zzS(contextZzaZ, false)) {
            zzicVar.zzaW().zzj().zza("Service not registered/enabled");
        }
        zzf();
        zzicVar.zzaW().zzk().zzb("Scheduling upload, millis", Long.valueOf(j2));
        zzicVar.zzba().mo3639a();
        zzicVar.zzc();
        if (j2 < Math.max(0L, ((Long) zzfy.zzL.zzb(null)).longValue()) && !zzc().zzc()) {
            zzc().zzb(j2);
        }
        zzicVar.zzaV();
        Context contextZzaZ2 = zzicVar.zzaZ();
        ComponentName componentName = new ComponentName(contextZzaZ2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iZzi = zzi();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder(iZzi, componentName).setMinimumLatency(j2).setOverrideDeadline(j2 + j2).setExtras(persistableBundle).build();
        Method method = com.google.android.gms.internal.measurement.zzcf.f22347a;
        JobScheduler jobScheduler = (JobScheduler) contextZzaZ2.getSystemService("jobscheduler");
        jobScheduler.getClass();
        Method method2 = com.google.android.gms.internal.measurement.zzcf.f22347a;
        if (method2 == null || contextZzaZ2.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
            jobScheduler.schedule(jobInfoBuild);
            return;
        }
        Method method3 = com.google.android.gms.internal.measurement.zzcf.f22348b;
        if (method3 != null) {
            try {
                Integer num = (Integer) method3.invoke(UserHandle.class, null);
                if (num != null) {
                    iIntValue = num.intValue();
                }
            } catch (IllegalAccessException | InvocationTargetException e) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                }
            }
        }
        try {
        } catch (IllegalAccessException | InvocationTargetException e2) {
            Log.e("UploadAlarm", "error calling scheduleAsPackage", e2);
            jobScheduler.schedule(jobInfoBuild);
        }
    }

    public final void zzf() {
        zzay();
        this.zzu.zzaW().zzk().zza("Unscheduling upload");
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzj());
        }
        zzc().zzd();
        zzh();
    }
}
