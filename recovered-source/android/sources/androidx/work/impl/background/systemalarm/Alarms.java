package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.work.Logger;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.utils.IdGenerator;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes.dex */
class Alarms {
    private static final String TAG = Logger.tagWithPrefix("Alarms");

    private Alarms() {
    }

    public static void cancelAlarm(Context context, WorkManagerImpl workManagerImpl, String str) {
        SystemIdInfoDao systemIdInfoDao = workManagerImpl.getWorkDatabase().systemIdInfoDao();
        SystemIdInfo systemIdInfo = systemIdInfoDao.getSystemIdInfo(str);
        if (systemIdInfo != null) {
            cancelExactAlarm(context, str, systemIdInfo.systemId);
            Logger.get().debug(TAG, AbstractC0271e0.m399g("Removing SystemIdInfo for workSpecId (", str, ")"), new Throwable[0]);
            systemIdInfoDao.removeSystemIdInfo(str);
        }
    }

    private static void cancelExactAlarm(Context context, String str, int i2) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service = PendingIntent.getService(context, i2, CommandHandler.createDelayMetIntent(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        Logger.get().debug(TAG, "Cancelling existing alarm with (workSpecId, systemId) (" + str + ", " + i2 + ")", new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void setAlarm(Context context, WorkManagerImpl workManagerImpl, String str, long j2) {
        WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        SystemIdInfoDao systemIdInfoDao = workDatabase.systemIdInfoDao();
        SystemIdInfo systemIdInfo = systemIdInfoDao.getSystemIdInfo(str);
        if (systemIdInfo != null) {
            cancelExactAlarm(context, str, systemIdInfo.systemId);
            setExactAlarm(context, str, systemIdInfo.systemId, j2);
        } else {
            int iNextAlarmManagerId = new IdGenerator(workDatabase).nextAlarmManagerId();
            systemIdInfoDao.insertSystemIdInfo(new SystemIdInfo(str, iNextAlarmManagerId));
            setExactAlarm(context, str, iNextAlarmManagerId, j2);
        }
    }

    private static void setExactAlarm(Context context, String str, int i2, long j2) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service = PendingIntent.getService(context, i2, CommandHandler.createDelayMetIntent(context, str), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j2, service);
        }
    }
}
