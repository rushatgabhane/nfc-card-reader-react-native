package com.nfccardreaderreactnative;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = NfcCardReaderReactNativeModule.NAME)
public class NfcCardReaderReactNativeModule extends NativeNfcCardReaderReactNativeSpec {
  public static final String NAME = "NfcCardReaderReactNative";

  public NfcCardReaderReactNativeModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  @NonNull
  public String getName() {
    return NAME;
  }

  static {
    System.loadLibrary("cpp");
  }

  private static native double nativeMultiply(double a, double b);

  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @Override
  public double multiply(double a, double b) {
    return nativeMultiply(a, b);
  }
}
