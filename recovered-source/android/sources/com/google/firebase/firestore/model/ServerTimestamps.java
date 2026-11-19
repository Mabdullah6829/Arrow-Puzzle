package com.google.firebase.firestore.model;

import androidx.annotation.Nullable;
import com.google.firebase.Timestamp;
import com.google.protobuf.C6195R0;
import com.google.protobuf.C6197S0;
import p022N.C0371O;
import p022N.C0375Q;
import p022N.C0389X0;
import p022N.C0393Z0;

/* JADX INFO: loaded from: classes2.dex */
public final class ServerTimestamps {
    private static final String LOCAL_WRITE_TIME_KEY = "__local_write_time__";
    private static final String PREVIOUS_VALUE_KEY = "__previous_value__";
    private static final String SERVER_TIMESTAMP_SENTINEL = "server_timestamp";
    private static final String TYPE_KEY = "__type__";

    private ServerTimestamps() {
    }

    public static C6197S0 getLocalWriteTime(C0393Z0 c0393z0) {
        return c0393z0.m733C().m650j(LOCAL_WRITE_TIME_KEY).m736F();
    }

    @Nullable
    public static C0393Z0 getPreviousValue(C0393Z0 c0393z0) {
        C0393Z0 c0393z0M649i = c0393z0.m733C().m649i(PREVIOUS_VALUE_KEY);
        return isServerTimestamp(c0393z0M649i) ? getPreviousValue(c0393z0M649i) : c0393z0M649i;
    }

    public static boolean isServerTimestamp(@Nullable C0393Z0 c0393z0) {
        C0393Z0 c0393z0M649i = c0393z0 == null ? null : c0393z0.m733C().m649i("__type__");
        return c0393z0M649i != null && SERVER_TIMESTAMP_SENTINEL.equals(c0393z0M649i.m735E());
    }

    public static C0393Z0 valueOf(Timestamp timestamp, @Nullable C0393Z0 c0393z0) {
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        c0389x0M714O.m701t(SERVER_TIMESTAMP_SENTINEL);
        C0393Z0 c0393z1 = (C0393Z0) c0389x0M714O.m12341build();
        C0389X0 c0389x0M714O2 = C0393Z0.m714O();
        C6195R0 c6195r0M11817j = C6197S0.m11817j();
        c6195r0M11817j.m11813c(timestamp.getSeconds());
        c6195r0M11817j.m11812b(timestamp.getNanoseconds());
        c0389x0M714O2.m702u(c6195r0M11817j);
        C0393Z0 c0393z2 = (C0393Z0) c0389x0M714O2.m12341build();
        C0371O c0371oM646k = C0375Q.m646k();
        c0371oM646k.m634d("__type__", c0393z1);
        c0371oM646k.m634d(LOCAL_WRITE_TIME_KEY, c0393z2);
        if (isServerTimestamp(c0393z0)) {
            c0393z0 = getPreviousValue(c0393z0);
        }
        if (c0393z0 != null) {
            c0371oM646k.m634d(PREVIOUS_VALUE_KEY, c0393z0);
        }
        C0389X0 c0389x0M714O3 = C0393Z0.m714O();
        c0389x0M714O3.m696o(c0371oM646k);
        return (C0393Z0) c0389x0M714O3.m12341build();
    }
}
