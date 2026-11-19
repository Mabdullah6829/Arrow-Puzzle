package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public abstract class TaskApiCall<A extends Api.AnyClient, ResultT> {

    /* JADX INFO: renamed from: a */
    public final Feature[] f4272a;

    /* JADX INFO: renamed from: b */
    public final boolean f4273b;

    /* JADX INFO: renamed from: c */
    public final int f4274c;

    public static class Builder<A extends Api.AnyClient, ResultT> {

        /* JADX INFO: renamed from: a */
        public RemoteCall f4275a;

        /* JADX INFO: renamed from: c */
        public Feature[] f4277c;

        /* JADX INFO: renamed from: b */
        public boolean f4276b = true;

        /* JADX INFO: renamed from: d */
        public int f4278d = 0;

        private Builder() {
        }

        /* JADX INFO: renamed from: a */
        public final TaskApiCall m3485a() {
            Preconditions.m3538b(this.f4275a != null, "execute parameter required");
            return new zacn(this, this.f4277c, this.f4276b, this.f4278d);
        }
    }

    @Deprecated
    public TaskApiCall() {
        this.f4272a = null;
        this.f4273b = false;
        this.f4274c = 0;
    }

    /* JADX INFO: renamed from: a */
    public static Builder m3484a() {
        Builder builder = new Builder();
        builder.f4276b = true;
        builder.f4278d = 0;
        return builder;
    }

    public TaskApiCall(Feature[] featureArr, boolean z, int i2) {
        this.f4272a = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.f4273b = z2;
        this.f4274c = i2;
    }
}
