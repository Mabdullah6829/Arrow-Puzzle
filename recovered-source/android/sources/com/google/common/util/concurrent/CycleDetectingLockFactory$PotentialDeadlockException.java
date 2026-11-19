package com.google.common.util.concurrent;

import java.util.Objects;
import p003C.AbstractC0120k;
import p011H.AbstractC0242F;
import p011H.AbstractC0243G;

/* JADX INFO: loaded from: classes2.dex */
public final class CycleDetectingLockFactory$PotentialDeadlockException extends IllegalStateException {
    static {
        AbstractC0120k.m204n(3, AbstractC0243G.class.getName(), "com.google.common.util.concurrent.CycleDetectingLockFactory$PotentialDeadlockException", AbstractC0242F.class.getName());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        Objects.requireNonNull(message);
        StringBuilder sb = new StringBuilder(message);
        for (Throwable cause = null; cause != null; cause = cause.getCause()) {
            sb.append(", ");
            sb.append(cause.getMessage());
        }
        return sb.toString();
    }
}
