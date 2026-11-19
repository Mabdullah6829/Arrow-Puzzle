package com.google.firebase.sessions;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.util.ProcessUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;
import p058e0.AbstractC6307o;
import p058e0.C6313u;

/* JADX INFO: loaded from: classes2.dex */
public final class ProcessDetailsProvider {
    public static final ProcessDetailsProvider INSTANCE = new ProcessDetailsProvider();

    private ProcessDetailsProvider() {
    }

    private final String getProcessName() throws Throwable {
        String processName;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 33) {
            String strMyProcessName = Process.myProcessName();
            AbstractC6452k.m12180d(strMyProcessName, "myProcessName(...)");
            return strMyProcessName;
        }
        if (i2 >= 28 && (processName = Application.getProcessName()) != null) {
            return processName;
        }
        String strM3655a = ProcessUtils.m3655a();
        return strM3655a != null ? strM3655a : "";
    }

    public final List<ProcessDetails> getAppProcessDetails(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        AbstractC6452k.m12181e(context, "context");
        int i2 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = C6313u.f24338s;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : runningAppProcesses) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            if (((ActivityManager.RunningAppProcessInfo) obj2).uid == i2) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC6307o.m12123u(arrayList2, 10));
        int size2 = arrayList2.size();
        while (i3 < size2) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj3;
            String processName = runningAppProcessInfo.processName;
            AbstractC6452k.m12180d(processName, "processName");
            arrayList3.add(new ProcessDetails(processName, runningAppProcessInfo.pid, runningAppProcessInfo.importance, AbstractC6452k.m12177a(runningAppProcessInfo.processName, str)));
        }
        return arrayList3;
    }

    public final ProcessDetails getMyProcessDetails(Context context) {
        Object next;
        AbstractC6452k.m12181e(context, "context");
        int iMyPid = Process.myPid();
        Iterator<T> it = getAppProcessDetails(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ProcessDetails) next).getPid() != iMyPid);
        ProcessDetails processDetails = (ProcessDetails) next;
        return processDetails == null ? new ProcessDetails(getProcessName(), iMyPid, 0, false) : processDetails;
    }
}
