package androidx.browser.trusted;

import android.os.Bundle;
import android.os.IBinder;
import android.support.customtabs.trusted.AbstractBinderC0917b;
import android.support.customtabs.trusted.InterfaceC0918c;

/* JADX INFO: loaded from: classes.dex */
public class TrustedWebActivityCallbackRemote {
    private final InterfaceC0918c mCallbackBinder;

    private TrustedWebActivityCallbackRemote(InterfaceC0918c interfaceC0918c) {
        this.mCallbackBinder = interfaceC0918c;
    }

    public static TrustedWebActivityCallbackRemote fromBinder(IBinder iBinder) {
        InterfaceC0918c interfaceC0918cAsInterface = iBinder == null ? null : AbstractBinderC0917b.asInterface(iBinder);
        if (interfaceC0918cAsInterface == null) {
            return null;
        }
        return new TrustedWebActivityCallbackRemote(interfaceC0918cAsInterface);
    }

    public void runExtraCallback(String str, Bundle bundle) {
        this.mCallbackBinder.onExtraCallback(str, bundle);
    }
}
