package com.google.gson.internal.bind;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/* JADX INFO: renamed from: com.google.gson.internal.bind.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC6152a {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ Class m11652A() {
        return OffsetDateTime.class;
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ Class m11653B() {
        return OffsetTime.class;
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ Class m11654C() {
        return Period.class;
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ Class m11655D() {
        return Year.class;
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ Class m11658c() {
        return Duration.class;
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ LocalDate m11660e(Object obj) {
        return (LocalDate) obj;
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ LocalDateTime m11662g(Object obj) {
        return (LocalDateTime) obj;
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ LocalTime m11666k(Object obj) {
        return (LocalTime) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ ZoneId m11668m(Object obj) {
        return (ZoneId) obj;
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ ZonedDateTime m11671p(Object obj) {
        return (ZonedDateTime) obj;
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ Class m11675t() {
        return YearMonth.class;
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ Class m11678w() {
        return ZonedDateTime.class;
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ Class m11680y() {
        return LocalDateTime.class;
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ Class m11681z() {
        return MonthDay.class;
    }
}
