package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public class ErrorDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: s */
    public Dialog f4146s;

    /* JADX INFO: renamed from: t */
    public DialogInterface.OnCancelListener f4147t;

    /* JADX INFO: renamed from: u */
    public AlertDialog f4148u;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f4147t;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f4146s;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f4148u == null) {
            Activity activity = getActivity();
            Preconditions.m3544h(activity);
            this.f4148u = new AlertDialog.Builder(activity).create();
        }
        return this.f4148u;
    }
}
