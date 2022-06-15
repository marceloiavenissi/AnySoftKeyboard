package com.anysoftkeyboard;

import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;

public class SubmitTextApiService {
    private InputConnection ic;
    private ProjectAPIService projectAPIService;

    public SubmitTextApiService(InputConnection ic){
        this.ic = ic;
        this.projectAPIService = new ProjectAPIService();
    }

    private String getTypedText(){
        ExtractedText extractedText = ic.getExtractedText(new ExtractedTextRequest(), 0);
        if(extractedText == null) {
            return null;
        }
        CharSequence text = extractedText.text;
        return text.toString();
    }

    private void submitToApi(String text){
        projectAPIService.submit(text);
    }

    private boolean verifyThreeWords(String text){
        return text.split(" ").length >= 3;
    }

    public void submitText() {

        System.out.println("============================ submit ================");
        String text = getTypedText();
        if(text != null && verifyThreeWords(text)){
            submitToApi(text);
        }
    }
}
