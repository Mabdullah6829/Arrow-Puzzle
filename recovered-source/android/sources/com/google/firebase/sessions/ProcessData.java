package com.google.firebase.sessions;

import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0271e0;
import p018K0.InterfaceC0325a;
import p021M0.InterfaceC0339d;
import p023N0.InterfaceC0455a;
import p025O0.AbstractC0486k;
import p025O0.AbstractC0491p;
import p029Q0.C0512l;

/* JADX INFO: loaded from: classes2.dex */
public final class ProcessData {
    public static final Companion Companion = new Companion(null);
    private final int pid;
    private final String uuid;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0325a serializer() {
            return ProcessData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }
    }

    public /* synthetic */ ProcessData(int i2, int i3, String str, AbstractC0491p abstractC0491p) {
        if (3 != (i2 & 3)) {
            AbstractC0486k.m1177d(i2, 3, ProcessData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.pid = i3;
        this.uuid = str;
    }

    public static /* synthetic */ ProcessData copy$default(ProcessData processData, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = processData.pid;
        }
        if ((i3 & 2) != 0) {
            str = processData.uuid;
        }
        return processData.copy(i2, str);
    }

    public static final void write$Self$com_google_firebase_firebase_sessions(ProcessData processData, InterfaceC0455a interfaceC0455a, InterfaceC0339d descriptor) {
        int i2 = processData.pid;
        C0512l c0512l = (C0512l) interfaceC0455a;
        c0512l.getClass();
        AbstractC6452k.m12181e(descriptor, "descriptor");
        c0512l.m1210l(descriptor, 0);
        c0512l.mo963i(i2);
        c0512l.m1213o(descriptor, 1, processData.uuid);
    }

    public final int component1() {
        return this.pid;
    }

    public final String component2() {
        return this.uuid;
    }

    public final ProcessData copy(int i2, String uuid) {
        AbstractC6452k.m12181e(uuid, "uuid");
        return new ProcessData(i2, uuid);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessData)) {
            return false;
        }
        ProcessData processData = (ProcessData) obj;
        return this.pid == processData.pid && AbstractC6452k.m12177a(this.uuid, processData.uuid);
    }

    public final int getPid() {
        return this.pid;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return this.uuid.hashCode() + (Integer.hashCode(this.pid) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProcessData(pid=");
        sb.append(this.pid);
        sb.append(", uuid=");
        return AbstractC0271e0.m401i(sb, this.uuid, ')');
    }

    public ProcessData(int i2, String uuid) {
        AbstractC6452k.m12181e(uuid, "uuid");
        this.pid = i2;
        this.uuid = uuid;
    }
}
