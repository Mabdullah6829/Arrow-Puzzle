package com.google.firebase.sessions;

import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes2.dex */
public final class ProcessDetails {
    private final int importance;
    private final boolean isDefaultProcess;
    private final int pid;
    private final String processName;

    public ProcessDetails(String processName, int i2, int i3, boolean z) {
        AbstractC6452k.m12181e(processName, "processName");
        this.processName = processName;
        this.pid = i2;
        this.importance = i3;
        this.isDefaultProcess = z;
    }

    public static /* synthetic */ ProcessDetails copy$default(ProcessDetails processDetails, String str, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = processDetails.processName;
        }
        if ((i4 & 2) != 0) {
            i2 = processDetails.pid;
        }
        if ((i4 & 4) != 0) {
            i3 = processDetails.importance;
        }
        if ((i4 & 8) != 0) {
            z = processDetails.isDefaultProcess;
        }
        return processDetails.copy(str, i2, i3, z);
    }

    public final String component1() {
        return this.processName;
    }

    public final int component2() {
        return this.pid;
    }

    public final int component3() {
        return this.importance;
    }

    public final boolean component4() {
        return this.isDefaultProcess;
    }

    public final ProcessDetails copy(String processName, int i2, int i3, boolean z) {
        AbstractC6452k.m12181e(processName, "processName");
        return new ProcessDetails(processName, i2, i3, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessDetails)) {
            return false;
        }
        ProcessDetails processDetails = (ProcessDetails) obj;
        return AbstractC6452k.m12177a(this.processName, processDetails.processName) && this.pid == processDetails.pid && this.importance == processDetails.importance && this.isDefaultProcess == processDetails.isDefaultProcess;
    }

    public final int getImportance() {
        return this.importance;
    }

    public final int getPid() {
        return this.pid;
    }

    public final String getProcessName() {
        return this.processName;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isDefaultProcess) + ((Integer.hashCode(this.importance) + ((Integer.hashCode(this.pid) + (this.processName.hashCode() * 31)) * 31)) * 31);
    }

    public final boolean isDefaultProcess() {
        return this.isDefaultProcess;
    }

    public String toString() {
        return "ProcessDetails(processName=" + this.processName + ", pid=" + this.pid + ", importance=" + this.importance + ", isDefaultProcess=" + this.isDefaultProcess + ')';
    }
}
