package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.sqlite.p048db.SupportSQLiteDatabase;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabaseMigrations;
import androidx.work.impl.model.Preference;

/* JADX INFO: loaded from: classes.dex */
public class IdGenerator {
    public static final int INITIAL_ID = 0;
    public static final String NEXT_ALARM_MANAGER_ID_KEY = "next_alarm_manager_id";
    public static final String NEXT_JOB_SCHEDULER_ID_KEY = "next_job_scheduler_id";
    public static final String PREFERENCE_FILE_KEY = "androidx.work.util.id";
    private final WorkDatabase mWorkDatabase;

    public IdGenerator(WorkDatabase workDatabase) {
        this.mWorkDatabase = workDatabase;
    }

    public static void migrateLegacyIdGenerator(Context context, SupportSQLiteDatabase supportSQLiteDatabase) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCE_FILE_KEY, 0);
        if (sharedPreferences.contains(NEXT_JOB_SCHEDULER_ID_KEY) || sharedPreferences.contains(NEXT_JOB_SCHEDULER_ID_KEY)) {
            int i2 = sharedPreferences.getInt(NEXT_JOB_SCHEDULER_ID_KEY, 0);
            int i3 = sharedPreferences.getInt(NEXT_ALARM_MANAGER_ID_KEY, 0);
            supportSQLiteDatabase.beginTransaction();
            try {
                supportSQLiteDatabase.execSQL(WorkDatabaseMigrations.INSERT_PREFERENCE, new Object[]{NEXT_JOB_SCHEDULER_ID_KEY, Integer.valueOf(i2)});
                supportSQLiteDatabase.execSQL(WorkDatabaseMigrations.INSERT_PREFERENCE, new Object[]{NEXT_ALARM_MANAGER_ID_KEY, Integer.valueOf(i3)});
                sharedPreferences.edit().clear().apply();
                supportSQLiteDatabase.setTransactionSuccessful();
            } finally {
                supportSQLiteDatabase.endTransaction();
            }
        }
    }

    private int nextId(String str) {
        this.mWorkDatabase.beginTransaction();
        try {
            Long longValue = this.mWorkDatabase.preferenceDao().getLongValue(str);
            int i2 = 0;
            int iIntValue = longValue != null ? longValue.intValue() : 0;
            if (iIntValue != Integer.MAX_VALUE) {
                i2 = iIntValue + 1;
            }
            update(str, i2);
            this.mWorkDatabase.setTransactionSuccessful();
            return iIntValue;
        } finally {
            this.mWorkDatabase.endTransaction();
        }
    }

    private void update(String str, int i2) {
        this.mWorkDatabase.preferenceDao().insertPreference(new Preference(str, i2));
    }

    public int nextAlarmManagerId() {
        int iNextId;
        synchronized (IdGenerator.class) {
            iNextId = nextId(NEXT_ALARM_MANAGER_ID_KEY);
        }
        return iNextId;
    }

    public int nextJobSchedulerIdWithRange(int i2, int i3) {
        synchronized (IdGenerator.class) {
            int iNextId = nextId(NEXT_JOB_SCHEDULER_ID_KEY);
            if (iNextId < i2 || iNextId > i3) {
                update(NEXT_JOB_SCHEDULER_ID_KEY, i2 + 1);
            } else {
                i2 = iNextId;
            }
        }
        return i2;
    }
}
