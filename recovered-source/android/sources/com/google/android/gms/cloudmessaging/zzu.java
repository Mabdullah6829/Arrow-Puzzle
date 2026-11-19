package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes.dex */
final class zzu extends zzs {
    @Override // com.google.android.gms.cloudmessaging.zzs
    /* JADX INFO: renamed from: a */
    public final void mo3381a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        m3384d(bundle2);
    }

    @Override // com.google.android.gms.cloudmessaging.zzs
    /* JADX INFO: renamed from: b */
    public final boolean mo3382b() {
        return false;
    }
}
