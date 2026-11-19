package com.google.android.gms.internal.ads;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgsq {

    /* JADX INFO: renamed from: a */
    public final String f18156a;

    public zzgsq(String str) {
        int iMyUid = Process.myUid();
        int iMyPid = Process.myPid();
        StringBuilder sb = new StringBuilder(String.valueOf(iMyUid).length() + 15 + String.valueOf(iMyPid).length() + 2);
        AbstractC1456a.m2455v(sb, "UID: [", iMyUid, "]  PID: [", iMyPid);
        sb.append("] ");
        this.f18156a = sb.toString().concat(str);
    }

    /* JADX INFO: renamed from: e */
    public static String m7109e(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                String strJoin = TextUtils.join(", ", objArr);
                int length = str2.length();
                str2 = AbstractC1456a.m2451r(new StringBuilder(String.valueOf(strJoin).length() + length + 2 + 1), str2, " [", strJoin, "]");
            }
        }
        return AbstractC1456a.m2450q(new StringBuilder(str.length() + 3 + String.valueOf(str2).length()), str, " : ", str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m7110a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", m7109e(this.f18156a, str, objArr));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7111b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", m7109e(this.f18156a, str, objArr));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7112c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", m7109e(this.f18156a, str, objArr));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m7113d(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", m7109e(this.f18156a, str, objArr), remoteException);
        }
    }
}
