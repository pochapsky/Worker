package org.example;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

//    @FunctionalInterface
//    public interface OnTaskDoneListener {
//        void onDone(String result);
//    }

//    public interface OnTaskErrorListener {
//        void onError(String errorMsg);
//    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i != 33) {
                callback.onDone("Task " + i + " is done");
            } else {
                errorCallback.onError((char) 27 + "[45m" + "ERROR in " + "task " + i + (char) 27 + "[0m");
            }
        }
    }


}