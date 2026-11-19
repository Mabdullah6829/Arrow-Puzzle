package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.customtabs.AbstractBinderC0914k;
import android.support.customtabs.InterfaceC0906c;
import android.support.customtabs.InterfaceC0915l;

/* JADX INFO: loaded from: classes.dex */
public class PostMessageService extends Service {
    private AbstractBinderC0914k mBinder = new AbstractBinderC0914k() { // from class: androidx.browser.customtabs.PostMessageService.1
        {
            attachInterface(this, InterfaceC0915l.f2551e);
        }

        @Override // android.support.customtabs.InterfaceC0915l
        public void onMessageChannelReady(InterfaceC0906c interfaceC0906c, Bundle bundle) {
            interfaceC0906c.onMessageChannelReady(bundle);
        }

        @Override // android.support.customtabs.InterfaceC0915l
        public void onPostMessage(InterfaceC0906c interfaceC0906c, String str, Bundle bundle) {
            interfaceC0906c.onPostMessage(str, bundle);
        }
    };

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.mBinder;
    }
}
