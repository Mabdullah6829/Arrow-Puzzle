package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public class BaseImplementation {

    public static abstract class ApiMethodImpl<R extends Result, A extends Api.AnyClient> extends BasePendingResult<R> implements ResultHolder<R> {
        /* JADX INFO: renamed from: g */
        public abstract void mo3448g(Api.AnyClient anyClient);

        /* JADX INFO: renamed from: h */
        public final void m3449h(Status status) {
            Preconditions.m3538b(!status.m3433w(), "Failed result must not be success");
            m3453d(mo3423a(status));
        }
    }

    public interface ResultHolder<R> {
    }
}
