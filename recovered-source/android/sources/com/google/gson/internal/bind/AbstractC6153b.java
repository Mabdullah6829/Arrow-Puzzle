package com.google.gson.internal.bind;

import android.app.NotificationChannel;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;

/* JADX INFO: renamed from: com.google.gson.internal.bind.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC6153b {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ NotificationChannel m11684c() {
        return new NotificationChannel("com.arrow.puzzle.escape.maze.free.game", "Notification", 4);
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ MonthDay m11687f(Object obj) {
        return (MonthDay) obj;
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ OffsetDateTime m11688g(Object obj) {
        return (OffsetDateTime) obj;
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ OffsetTime m11690i(Object obj) {
        return (OffsetTime) obj;
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ Period m11693l(Object obj) {
        return (Period) obj;
    }
}
