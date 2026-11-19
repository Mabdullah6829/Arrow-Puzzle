package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public class SupportErrorDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: s */
    public Dialog f4172s;

    /* JADX INFO: renamed from: t */
    public DialogInterface.OnCancelListener f4173t;

    /* JADX INFO: renamed from: u */
    public AlertDialog f4174u;

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f4173t;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f4172s;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f4174u == null) {
            Context context = getContext();
            Preconditions.m3544h(context);
            this.f4174u = new AlertDialog.Builder(context).create();
        }
        return this.f4174u;
    }
}
