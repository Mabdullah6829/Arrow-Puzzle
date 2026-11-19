package com.pairip.application;

import android.content.Context;
import com.arrow.puzzle.escape.maze.free.game.personal.MyApplication;
import com.pairip.licensecheck.LicenseClient;

/* JADX INFO: loaded from: classes.dex */
public class Application extends MyApplication {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }
}
