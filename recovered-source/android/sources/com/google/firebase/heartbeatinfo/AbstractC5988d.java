package com.google.firebase.heartbeatinfo;

import android.app.NotificationChannel;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import com.google.firebase.messaging.CommonNotificationBuilder;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;

/* JADX INFO: renamed from: com.google.firebase.heartbeatinfo.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5988d {
    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ Class m11558B() {
        return LocalTime.class;
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ Class m11559C() {
        return ZoneOffset.class;
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ Class m11560D() {
        return ZoneId.class;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ NotificationChannel m11567g(String str) {
        return new NotificationChannel(CommonNotificationBuilder.FCM_FALLBACK_NOTIFICATION_CHANNEL, str, 3);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ Class m11568h() {
        return LocalDate.class;
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ Duration m11572l(Object obj) {
        return (Duration) obj;
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ Year m11576p(Object obj) {
        return (Year) obj;
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ YearMonth m11578r(Object obj) {
        return (YearMonth) obj;
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ ZoneOffset m11582v(Object obj) {
        return (ZoneOffset) obj;
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m11585y(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m11586z(Object obj) {
        return obj instanceof ZoneOffset;
    }
}
