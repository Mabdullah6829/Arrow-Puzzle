package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class zzr extends zzs {
    @Override // com.google.android.gms.cloudmessaging.zzs
    /* JADX INFO: renamed from: a */
    public final void mo3381a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            m3384d(null);
        } else {
            m3383c(new zzt("Invalid response to one way request", null));
        }
    }

    @Override // com.google.android.gms.cloudmessaging.zzs
    /* JADX INFO: renamed from: b */
    public final boolean mo3382b() {
        return true;
    }
}
