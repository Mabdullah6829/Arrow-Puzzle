package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajf {

    /* JADX INFO: renamed from: a */
    public final ByteArrayOutputStream f5510a;

    /* JADX INFO: renamed from: b */
    public final DataOutputStream f5511b;

    public zzajf() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f5510a = byteArrayOutputStream;
        this.f5511b = new DataOutputStream(byteArrayOutputStream);
    }
}
