package com.anysoftkeyboard;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class InputConnectionWrapper implements InputConnection {
    private InputConnection ic;

    public InputConnectionWrapper(InputConnection ic){
        this.ic = ic;
    }

    @Nullable
    @Override
    public CharSequence getTextBeforeCursor(int n, int flags) {
        return ic.getTextBeforeCursor(n, flags);
    }

    @Nullable
    @Override
    public CharSequence getTextAfterCursor(int n, int flags) {
        return ic.getTextAfterCursor(n, flags);
    }

    @Override
    public CharSequence getSelectedText(int flags) {
        return ic.getSelectedText(flags);
    }

    @Override
    public int getCursorCapsMode(int reqModes) {
        return ic.getCursorCapsMode(reqModes);
    }

    @Override
    public ExtractedText getExtractedText(ExtractedTextRequest request, int flags) {
        return ic.getExtractedText(request, flags);
    }

    @Override
    public boolean deleteSurroundingText(int beforeLength, int afterLength) {
        return ic.deleteSurroundingText(beforeLength, afterLength);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public boolean deleteSurroundingTextInCodePoints(int beforeLength, int afterLength) {
        return ic.deleteSurroundingTextInCodePoints(beforeLength, afterLength);
    }

    @Override
    public boolean setComposingText(CharSequence text, int newCursorPosition) {
        return ic.setComposingText(text, newCursorPosition);
    }

    @Override
    public boolean setComposingRegion(int start, int end) {
        return ic.setComposingRegion(start, end);
    }

    @Override
    public boolean finishComposingText() {
        return ic.finishComposingText();
    }

    @Override
    public boolean commitText(CharSequence text, int newCursorPosition) {
        return ic.commitText(text, newCursorPosition);
    }

    @Override
    public boolean commitCompletion(CompletionInfo text) {
        return ic.commitCompletion(text);
    }

    @Override
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        return ic.commitCorrection(correctionInfo);
    }

    @Override
    public boolean setSelection(int start, int end) {
        return ic.setSelection(start, end);
    }

    @Override
    public boolean performEditorAction(int editorAction) {
        return ic.performEditorAction(editorAction);
    }

    @Override
    public boolean performContextMenuAction(int id) {
        return ic.performContextMenuAction(id);
    }

    @Override
    public boolean beginBatchEdit() {
        return ic.beginBatchEdit();
    }

    @Override
    public boolean endBatchEdit() {
        return ic.endBatchEdit();
    }

    @Override
    public boolean sendKeyEvent(KeyEvent event) {
        return ic.sendKeyEvent(event);
    }

    @Override
    public boolean clearMetaKeyStates(int states) {
        return ic.clearMetaKeyStates(states);
    }

    @Override
    public boolean reportFullscreenMode(boolean enabled) {
        return ic.reportFullscreenMode(enabled);
    }

    @Override
    public boolean performPrivateCommand(String action, Bundle data) {
        return ic.performPrivateCommand(action, data);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public boolean requestCursorUpdates(int cursorUpdateMode) {
        return ic.requestCursorUpdates(cursorUpdateMode);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public Handler getHandler() {
        return ic.getHandler();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void closeConnection() {
        ic.closeConnection();
    }

    @RequiresApi(api = Build.VERSION_CODES.N_MR1)
    @Override
    public boolean commitContent(@NonNull InputContentInfo inputContentInfo, int flags, @Nullable Bundle opts) {
        return ic.commitContent(inputContentInfo, flags, opts);
    }
}
