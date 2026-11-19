package com.google.android.gms.security;

import android.os.AsyncTask;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;

/* JADX INFO: loaded from: classes2.dex */
final class zza extends AsyncTask {
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        try {
            ProviderInstaller.m10756a(null);
            return 0;
        } catch (GooglePlayServicesNotAvailableException e) {
            return Integer.valueOf(e.f4158s);
        } catch (GooglePlayServicesRepairableException e2) {
            return Integer.valueOf(e2.f4159s);
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            throw null;
        }
        GoogleApiAvailabilityLight googleApiAvailabilityLight = ProviderInstaller.f23175a;
        ProviderInstaller.f23175a.m3402b(null, num.intValue(), "pi");
        throw null;
    }
}
