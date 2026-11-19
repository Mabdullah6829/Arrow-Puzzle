package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.Logger;
import androidx.work.impl.Scheduler;
import androidx.work.impl.model.WorkSpec;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmScheduler implements Scheduler {
    private static final String TAG = Logger.tagWithPrefix("SystemAlarmScheduler");
    private final Context mContext;

    public SystemAlarmScheduler(Context context) {
        this.mContext = context.getApplicationContext();
    }

    private void scheduleWorkSpec(WorkSpec workSpec) {
        Logger.get().debug(TAG, AbstractC0271e0.m398f("Scheduling work with workSpecId ", workSpec.f2856id), new Throwable[0]);
        this.mContext.startService(CommandHandler.createScheduleWorkIntent(this.mContext, workSpec.f2856id));
    }

    @Override // androidx.work.impl.Scheduler
    public void cancel(String str) {
        this.mContext.startService(CommandHandler.createStopWorkIntent(this.mContext, str));
    }

    @Override // androidx.work.impl.Scheduler
    public boolean hasLimitedSchedulingSlots() {
        return true;
    }

    @Override // androidx.work.impl.Scheduler
    public void schedule(WorkSpec... workSpecArr) {
        for (WorkSpec workSpec : workSpecArr) {
            scheduleWorkSpec(workSpec);
        }
    }
}
