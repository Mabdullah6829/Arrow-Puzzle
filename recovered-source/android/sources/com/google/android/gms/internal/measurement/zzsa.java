package com.google.android.gms.internal.measurement;

import android.accounts.Account;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzsa {

    /* JADX INFO: renamed from: a */
    public static final Pattern f22856a = Pattern.compile("[a-z]+(_[a-z]+)*");

    /* JADX INFO: renamed from: b */
    public static final Account f22857b = zzrv.f22841a;

    /* JADX INFO: renamed from: c */
    public static final Set f22858c = Collections.unmodifiableSet(new HashSet(Arrays.asList("default", "unused", "special", "reserved", "shared", "virtual", "managed")));

    /* JADX INFO: renamed from: d */
    public static final Set f22859d = Collections.unmodifiableSet(new HashSet(Arrays.asList("files", "cache", "managed", "directboot-files", "directboot-cache", "external")));
}
