package com.google.android.gms.tasks;

import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class NativeOnCompleteListener implements OnCompleteListener<Object> {
    @KeepForSdk
    public native void nativeOnComplete(long j2, @Nullable Object obj, boolean z, boolean z2, @Nullable String str);

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        Object result;
        String message;
        Exception exception;
        if (task.isSuccessful()) {
            result = task.getResult();
            message = null;
        } else if (task.isCanceled() || (exception = task.getException()) == null) {
            result = null;
            message = null;
        } else {
            message = exception.getMessage();
            result = null;
        }
        nativeOnComplete(0L, result, task.isSuccessful(), task.isCanceled(), message);
    }
}
